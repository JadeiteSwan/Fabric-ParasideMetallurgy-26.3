package net.paraside.parasidemetallurgy.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.paraside.parasidemetallurgy.block.ModBlocks;
import net.paraside.parasidemetallurgy.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) { super(output); }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        // ORES
        blockModelGenerators.createTrivialCube(ModBlocks.TIN_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.LEAD_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.BAUXITE_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.ZINC_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.NICKEL_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.SILVER_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.PLATINUM_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.LITHIUM_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.CHROMIUM_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        // INGOTS
        itemModelGenerators.generateFlatItem(ModItems.TIN_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.LEAD_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.ALUMINUM_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.ZINC_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.NICKEL_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SILVER_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.PLATINUM_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.LITHIUM_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.CHROMIUM_INGOT, ModelTemplates.FLAT_ITEM);
    }
}