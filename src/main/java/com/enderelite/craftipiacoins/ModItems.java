package com.enderelite.craftipiacoins;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Craftipiacoins.MODID);

    public static final DeferredItem<Item> ONE_P = ITEMS.register("1p", () -> new Item(new Properties()));
    public static final DeferredItem<Item> TWO_P = ITEMS.register("2p", () -> new Item(new Properties()));
    public static final DeferredItem<Item> FIVE_P = ITEMS.register("5p", () -> new Item(new Properties()));
    public static final DeferredItem<Item> TEN_P = ITEMS.register("10p", () -> new Item(new Properties()));
    public static final DeferredItem<Item> TWENTY_P = ITEMS.register("20p", () -> new Item(new Properties()));
    public static final DeferredItem<Item> FIFTY_P = ITEMS.register("50p", () -> new Item(new Properties()));
    public static final DeferredItem<Item> ONE_POUND = ITEMS.register("1_pound", () -> new Item(new Properties()));
    public static final DeferredItem<Item> TWO_POUND = ITEMS.register("2_pound", () -> new Item(new Properties()));
    public static final DeferredItem<Item> FIVE_POUND = ITEMS.register("5_pound", () -> new Item(new Properties()));
    public static final DeferredItem<Item> TEN_POUND = ITEMS.register("10_pound", () -> new Item(new Properties()));
    public static final DeferredItem<Item> TWENTY_POUND = ITEMS.register("20_pound", () -> new Item(new Properties()));
    public static final DeferredItem<Item> FIFTY_POUND = ITEMS.register("50_pound", () -> new Item(new Properties()));
}