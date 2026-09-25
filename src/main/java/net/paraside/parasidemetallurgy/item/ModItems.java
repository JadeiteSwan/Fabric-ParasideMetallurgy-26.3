package net.paraside.parasidemetallurgy.item;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.paraside.parasidemetallurgy.ParasideMetallurgy;

import java.util.function.Function;

public class ModItems {

    // RAW ORES
    public static final Item RAW_TIN = registerItem("raw_tin", Item::new);
    public static final Item RAW_LEAD = registerItem("raw_lead", Item::new);
    public static final Item RAW_BAUXITE = registerItem("raw_bauxite", Item::new);
    public static final Item RAW_ZINC = registerItem("raw_zinc", Item::new);
    public static final Item RAW_NICKEL = registerItem("raw_nickel", Item::new);
    public static final Item RAW_SILVER = registerItem("raw_silver", Item::new);
    public static final Item RAW_PLATINUM = registerItem("raw_platinum", Item::new);
    public static final Item RAW_LITHIUM = registerItem("raw_lithium", Item::new);
    public static final Item RAW_CHROMIUM = registerItem("raw_chromium", Item::new);

    // INGOTS
    public static final Item TIN_INGOT = registerItem("tin_ingot", Item::new);
    public static final Item LEAD_INGOT = registerItem("lead_ingot", Item::new);
    public static final Item ALUMINUM_INGOT = registerItem("aluminum_ingot", Item::new);
    public static final Item ZINC_INGOT = registerItem("zinc_ingot", Item::new);
    public static final Item NICKEL_INGOT = registerItem("nickel_ingot", Item::new);
    public static final Item SILVER_INGOT = registerItem("silver_ingot", Item::new);
    public static final Item PLATINUM_INGOT = registerItem("platinum_ingot", Item::new);
    public static final Item LITHIUM_INGOT = registerItem("lithium_ingot", Item::new);
    public static final Item CHROMIUM_INGOT = registerItem("chromium_ingot", Item::new);

    // NUGGETS
    public static final Item TIN_NUGGET = registerItem("tin_nugget", Item::new);
    public static final Item LEAD_NUGGET = registerItem("lead_nugget", Item::new);
    public static final Item ALUMINUM_NUGGET = registerItem("aluminum_nugget", Item::new);
    public static final Item ZINC_NUGGET = registerItem("zinc_nugget", Item::new);
    public static final Item NICKEL_NUGGET = registerItem("nickel_nugget", Item::new);
    public static final Item SILVER_NUGGET = registerItem("silver_nugget", Item::new);
    public static final Item PLATINUM_NUGGET = registerItem("platinum_nugget", Item::new);
    public static final Item LITHIUM_NUGGET = registerItem("lithium_nugget", Item::new);
    public static final Item CHROMIUM_NUGGET = registerItem("chromium_nugget", Item::new);

    // Item registration
    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(ParasideMetallurgy.MOD_ID, name), function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(ParasideMetallurgy.MOD_ID, name)))));
    }

    public static ResourceKey<Item> getRK(Item item) {
        return BuiltInRegistries.ITEM.getResourceKey(item).get();
    }

    public static void registerModItems() {
        ParasideMetallurgy.LOGGER.info("Registering Mod Items for " + ParasideMetallurgy.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(output -> {
            output.accept(TIN_INGOT);
            output.accept(LEAD_INGOT);
            output.accept(ALUMINUM_INGOT);
            output.accept(ZINC_INGOT);
            output.accept(NICKEL_INGOT);
            output.accept(SILVER_INGOT);
            output.accept(PLATINUM_INGOT);
            output.accept(LITHIUM_INGOT);
            output.accept(CHROMIUM_INGOT);
        });
    }
}