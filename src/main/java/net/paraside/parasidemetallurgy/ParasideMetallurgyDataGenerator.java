package net.paraside.parasidemetallurgy;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.paraside.parasidemetallurgy.datagen.ModBlockLootTableProvider;
import net.paraside.parasidemetallurgy.datagen.ModBlockTagsProvider;
import net.paraside.parasidemetallurgy.datagen.ModModelProvider;
import net.paraside.parasidemetallurgy.datagen.ModRecipeProvider;

public class ParasideMetallurgyDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModBlockTagsProvider::new);
		pack.addProvider(ModBlockLootTableProvider::new);
		pack.addProvider(ModRecipeProvider::new);
	}
}