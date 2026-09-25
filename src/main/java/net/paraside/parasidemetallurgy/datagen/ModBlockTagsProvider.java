package net.paraside.parasidemetallurgy.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.paraside.parasidemetallurgy.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider{
    public ModBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) { super(output, registryLookupFuture); }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                // ORES
                .add(ModBlocks.getRK(ModBlocks.TIN_ORE))
                .add(ModBlocks.getRK(ModBlocks.LEAD_ORE))
                .add(ModBlocks.getRK(ModBlocks.BAUXITE_ORE))
                .add(ModBlocks.getRK(ModBlocks.ZINC_ORE))
                .add(ModBlocks.getRK(ModBlocks.NICKEL_ORE))
                .add(ModBlocks.getRK(ModBlocks.SILVER_ORE))
                .add(ModBlocks.getRK(ModBlocks.PLATINUM_ORE))
                .add(ModBlocks.getRK(ModBlocks.LITHIUM_ORE))
                .add(ModBlocks.getRK(ModBlocks.CHROMIUM_ORE));
    }
}