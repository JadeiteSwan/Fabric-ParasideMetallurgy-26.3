package net.paraside.parasidemetallurgy.block;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.paraside.parasidemetallurgy.ParasideMetallurgy;

import java.util.function.Function;

public class ModBlocks {

    // ORES
    public static final Block TIN_ORE = registerBlock("tin_ore",
            properties -> new Block(properties
                    .strength(10f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final Block LEAD_ORE = registerBlock("lead_ore",
            properties -> new Block(properties
                    .strength(10f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final Block BAUXITE_ORE = registerBlock("bauxite_ore",
            properties -> new Block(properties
                    .strength(10f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final Block ZINC_ORE = registerBlock("zinc_ore",
            properties -> new Block(properties
                    .strength(10f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final Block NICKEL_ORE = registerBlock("nickel_ore",
            properties -> new Block(properties
                    .strength(10f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final Block SILVER_ORE = registerBlock("silver_ore",
            properties -> new Block(properties
                    .strength(10f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final Block PLATINUM_ORE = registerBlock("platinum_ore",
            properties -> new Block(properties
                    .strength(10f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final Block LITHIUM_ORE = registerBlock("lithium_ore",
            properties -> new Block(properties
                    .strength(10f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final Block CHROMIUM_ORE = registerBlock("chromium_ore",
            properties -> new Block(properties
                    .strength(10f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    // RAW ORE BLOCKS
    public static final Block BLOCK_OF_RAW_TIN = registerBlock("block_of_raw_tin",
            properties -> new Block(properties
                    .strength(10f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final Block BLOCK_OF_RAW_LEAD = registerBlock("block_of_raw_lead",
            properties -> new Block(properties
                    .strength(10f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final Block BLOCK_OF_RAW_BAUXITE = registerBlock("block_of_raw_bauxite",
            properties -> new Block(properties
                    .strength(10f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final Block BLOCK_OF_RAW_ZINC = registerBlock("block_of_raw_zinc",
            properties -> new Block(properties
                    .strength(10f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final Block BLOCK_OF_RAW_NICKEL = registerBlock("block_of_raw_nickel",
            properties -> new Block(properties
                    .strength(10f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final Block BLOCK_OF_RAW_SILVER = registerBlock("block_of_raw_silver",
            properties -> new Block(properties
                    .strength(10f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final Block BLOCK_OF_RAW_PLATINUM = registerBlock("block_of_raw_platinum",
            properties -> new Block(properties
                    .strength(10f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final Block BLOCK_OF_RAW_LITHIUM = registerBlock("block_of_raw_lithium",
            properties -> new Block(properties
                    .strength(10f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final Block BLOCK_OF_RAW_CHROMIUM = registerBlock("block_of_raw_chromium",
            properties -> new Block(properties
                    .strength(10f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    // 3x3 METAL BLOCKS
    public static final Block BLOCK_OF_TIN = registerBlock("block_of_tin",
            properties -> new Block(properties
                    .strength(10f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.IRON)));

    public static final Block BLOCK_OF_LEAD = registerBlock("block_of_lead",
            properties -> new Block(properties
                    .strength(10f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.IRON)));

    public static final Block BLOCK_OF_ALUMINUM = registerBlock("block_of_aluminum",
            properties -> new Block(properties
                    .strength(10f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.IRON)));

    public static final Block BLOCK_OF_ZINC = registerBlock("block_of_zinc",
            properties -> new Block(properties
                    .strength(10f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.IRON)));

    public static final Block BLOCK_OF_NICKEL = registerBlock("block_of_nickel",
            properties -> new Block(properties
                    .strength(10f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.IRON)));

    public static final Block BLOCK_OF_SILVER = registerBlock("block_of_silver",
            properties -> new Block(properties
                    .strength(10f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.IRON)));

    public static final Block BLOCK_OF_PLATINUM = registerBlock("block_of_platinum",
            properties -> new Block(properties
                    .strength(10f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.IRON)));

    public static final Block BLOCK_OF_LITHIUM = registerBlock("block_of_lithium",
            properties -> new Block(properties
                    .strength(10f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.IRON)));

    public static final Block BLOCK_OF_CHROMIUM = registerBlock("block_of_chromium",
            properties -> new Block(properties
                    .strength(10f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.IRON)));

    // REGISTERING BLOCKS
    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(ParasideMetallurgy.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(ParasideMetallurgy.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(ParasideMetallurgy.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(ParasideMetallurgy.MOD_ID, name)))));
    }

    public static ResourceKey<Block> getRK(Block block) {
        return BuiltInRegistries.BLOCK.getResourceKey(block).get();
    }

    public static void registerModBlocks() {
        ParasideMetallurgy.LOGGER.info("Registering Mod Blocks for " + ParasideMetallurgy.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.NATURAL_BLOCKS).register(output -> {
            output.accept(TIN_ORE);
            output.accept(LEAD_ORE);
            output.accept(BAUXITE_ORE);
            output.accept(ZINC_ORE);
            output.accept(NICKEL_ORE);
            output.accept(SILVER_ORE);
            output.accept(PLATINUM_ORE);
            output.accept(LITHIUM_ORE);
            output.accept(CHROMIUM_ORE);

            output.accept(BLOCK_OF_RAW_TIN);
            output.accept(BLOCK_OF_RAW_LEAD);
            output.accept(BLOCK_OF_RAW_BAUXITE);
            output.accept(BLOCK_OF_RAW_ZINC);
            output.accept(BLOCK_OF_RAW_NICKEL);
            output.accept(BLOCK_OF_RAW_SILVER);
            output.accept(BLOCK_OF_RAW_PLATINUM);
            output.accept(BLOCK_OF_RAW_LITHIUM);
            output.accept(BLOCK_OF_RAW_CHROMIUM);
        });
    }
}