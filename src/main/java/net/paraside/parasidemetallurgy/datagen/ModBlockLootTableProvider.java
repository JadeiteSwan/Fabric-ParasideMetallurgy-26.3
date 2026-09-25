package net.paraside.parasidemetallurgy.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;
import net.paraside.parasidemetallurgy.block.ModBlocks;
import net.paraside.parasidemetallurgy.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModBlockLootTableProvider extends FabricBlockLootSubProvider {
    public ModBlockLootTableProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) { super(packOutput, registriesFuture); }

    @Override
    public void generate() {
        // ORES
        add(ModBlocks.TIN_ORE, createOreDrop(ModBlocks.TIN_ORE, ModItems.RAW_TIN));
        add(ModBlocks.LEAD_ORE, createOreDrop(ModBlocks.LEAD_ORE, ModItems.RAW_LEAD));
        add(ModBlocks.BAUXITE_ORE, createOreDrop(ModBlocks.BAUXITE_ORE, ModItems.RAW_BAUXITE));
        add(ModBlocks.ZINC_ORE, createOreDrop(ModBlocks.ZINC_ORE, ModItems.RAW_ZINC));
        add(ModBlocks.NICKEL_ORE, createOreDrop(ModBlocks.NICKEL_ORE, ModItems.RAW_NICKEL));
        add(ModBlocks.SILVER_ORE, createOreDrop(ModBlocks.SILVER_ORE, ModItems.RAW_SILVER));
        add(ModBlocks.PLATINUM_ORE, createOreDrop(ModBlocks.PLATINUM_ORE, ModItems.RAW_PLATINUM));
        add(ModBlocks.LITHIUM_ORE, createOreDrop(ModBlocks.LITHIUM_ORE, ModItems.RAW_LITHIUM));
        add(ModBlocks.CHROMIUM_ORE, createOreDrop(ModBlocks.CHROMIUM_ORE, ModItems.RAW_CHROMIUM));

        // RAW ORE BLOCKS
        dropSelf(ModBlocks.BLOCK_OF_RAW_TIN);
        dropSelf(ModBlocks.BLOCK_OF_RAW_LEAD);
        dropSelf(ModBlocks.BLOCK_OF_RAW_BAUXITE);
        dropSelf(ModBlocks.BLOCK_OF_RAW_ZINC);
        dropSelf(ModBlocks.BLOCK_OF_RAW_NICKEL);
        dropSelf(ModBlocks.BLOCK_OF_RAW_SILVER);
        dropSelf(ModBlocks.BLOCK_OF_RAW_PLATINUM);
        dropSelf(ModBlocks.BLOCK_OF_RAW_LITHIUM);
        dropSelf(ModBlocks.BLOCK_OF_RAW_CHROMIUM);

        // 3x3 METAL BLOCKS
        dropSelf(ModBlocks.BLOCK_OF_TIN);
        dropSelf(ModBlocks.BLOCK_OF_LEAD);
        dropSelf(ModBlocks.BLOCK_OF_ALUMINUM);
        dropSelf(ModBlocks.BLOCK_OF_ZINC);
        dropSelf(ModBlocks.BLOCK_OF_NICKEL);
        dropSelf(ModBlocks.BLOCK_OF_SILVER);
        dropSelf(ModBlocks.BLOCK_OF_PLATINUM);
        dropSelf(ModBlocks.BLOCK_OF_LITHIUM);
        dropSelf(ModBlocks.BLOCK_OF_CHROMIUM);
    }
}