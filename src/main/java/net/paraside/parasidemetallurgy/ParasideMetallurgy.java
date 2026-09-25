package net.paraside.parasidemetallurgy;

import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import net.paraside.parasidemetallurgy.block.ModBlocks;
import net.paraside.parasidemetallurgy.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParasideMetallurgy implements ModInitializer {
	public static final String MOD_ID = "parasidemetallurgy";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}

	public static Identifier id(String path) { return Identifier.fromNamespaceAndPath(MOD_ID, path); }
}