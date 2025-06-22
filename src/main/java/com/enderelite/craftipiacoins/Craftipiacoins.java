package com.enderelite.craftipiacoins;

import com.mojang.logging.LogUtils;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.slf4j.Logger;

@Mod(Craftipiacoins.MODID)
public class Craftipiacoins {
    public static final String MODID = "craftipiacoins";
    private static final Logger LOGGER = LogUtils.getLogger();

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS.register("example_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.craftipiacoins"))
                    .icon(() -> ModItems.ONE_P.get().getDefaultInstance())
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.ONE_P.get());
                        output.accept(ModItems.TWO_P.get());
                        output.accept(ModItems.FIVE_P.get());
                        output.accept(ModItems.TEN_P.get());
                        output.accept(ModItems.TWENTY_P.get());
                        output.accept(ModItems.FIFTY_P.get());
                        output.accept(ModItems.ONE_POUND.get());
                        output.accept(ModItems.TWO_POUND.get());
                        output.accept(ModItems.FIVE_POUND.get());
                        output.accept(ModItems.TEN_POUND.get());
                        output.accept(ModItems.TWENTY_POUND.get());
                        output.accept(ModItems.FIFTY_POUND.get());
                    })
                    .build()
    );

    public Craftipiacoins(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);

        ModItems.ITEMS.register(modEventBus);
        CREATIVE_MODE_TABS.register(modEventBus);


        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("HELLO FROM COMMON SETUP");
    }

    @EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            LOGGER.info("HELLO FROM CLIENT SETUP");
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
    }
}