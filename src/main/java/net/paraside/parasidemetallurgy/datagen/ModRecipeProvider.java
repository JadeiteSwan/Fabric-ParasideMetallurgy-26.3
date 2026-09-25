package net.paraside.parasidemetallurgy.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancements.Advancement;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.ItemLike;
import net.paraside.parasidemetallurgy.block.ModBlocks;
import net.paraside.parasidemetallurgy.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, BootstrapContext<Recipe<?>> recipes, BootstrapContext<Advancement> advancements) {
        return new RecipeProvider(recipes, advancements) {

            @Override
            public void buildRecipes() {
                List<ItemLike> TIN_SMELTABLES = List.of(ModItems.RAW_TIN, ModBlocks.TIN_ORE);
                List<ItemLike> LEAD_SMELTABLES = List.of(ModItems.RAW_LEAD, ModBlocks.LEAD_ORE);
                List<ItemLike> ALUMINUM_SMELTABLES = List.of(ModItems.RAW_BAUXITE, ModBlocks.BAUXITE_ORE);
                List<ItemLike> ZINC_SMELTABLES = List.of(ModItems.RAW_ZINC, ModBlocks.ZINC_ORE);
                List<ItemLike> NICKEL_SMELTABLES = List.of(ModItems.RAW_NICKEL, ModBlocks.NICKEL_ORE);
                List<ItemLike> SILVER_SMELTABLES = List.of(ModItems.RAW_SILVER, ModBlocks.SILVER_ORE);
                List<ItemLike> PLATINUM_SMELTABLES = List.of(ModItems.RAW_PLATINUM, ModBlocks.PLATINUM_ORE);
                List<ItemLike> LITHIUM_SMELTABLES = List.of(ModItems.RAW_LITHIUM, ModBlocks.LITHIUM_ORE);
                List<ItemLike> CHROMIUM_SMELTABLES = List.of(ModItems.RAW_CHROMIUM, ModBlocks.CHROMIUM_ORE);

                oreSmelting(TIN_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.TIN_INGOT, 0.5f, 200, "tin");
                oreBlasting(TIN_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.TIN_INGOT, 0.5f, 100, "tin");

                oreSmelting(LEAD_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.LEAD_INGOT, 0.5f, 200, "lead");
                oreBlasting(LEAD_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.LEAD_INGOT, 0.5f, 100, "lead");

                oreSmelting(ALUMINUM_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.ALUMINUM_INGOT, 0.5f, 200, "aluminum");
                oreBlasting(ALUMINUM_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.ALUMINUM_INGOT, 0.5f, 100, "aluminum");

                oreSmelting(ZINC_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.ZINC_INGOT, 0.5f, 200, "zinc");
                oreBlasting(ZINC_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.ZINC_INGOT, 0.5f, 100, "zinc");

                oreSmelting(NICKEL_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.NICKEL_INGOT, 0.5f, 200, "nickel");
                oreBlasting(NICKEL_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.NICKEL_INGOT, 0.5f, 100, "nickel");

                oreSmelting(SILVER_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.SILVER_INGOT, 0.5f, 200, "silver");
                oreBlasting(SILVER_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.SILVER_INGOT, 0.5f, 100, "silver");

                oreSmelting(PLATINUM_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.PLATINUM_INGOT, 0.5f, 200, "platinum");
                oreBlasting(PLATINUM_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.PLATINUM_INGOT, 0.5f, 100, "platinum");

                oreSmelting(LITHIUM_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.LITHIUM_INGOT, 0.5f, 200, "lithium");
                oreBlasting(LITHIUM_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.LITHIUM_INGOT, 0.5f, 100, "lithium");

                oreSmelting(CHROMIUM_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.CHROMIUM_INGOT, 0.5f, 200, "chromium");
                oreBlasting(CHROMIUM_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.CHROMIUM_INGOT, 0.5f, 100, "chromium");

                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.RAW_TIN, RecipeCategory.DECORATIONS, ModBlocks.BLOCK_OF_RAW_TIN);
                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.RAW_LEAD, RecipeCategory.DECORATIONS, ModBlocks.BLOCK_OF_RAW_LEAD);
                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.RAW_BAUXITE, RecipeCategory.DECORATIONS, ModBlocks.BLOCK_OF_RAW_BAUXITE);
                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.RAW_ZINC, RecipeCategory.DECORATIONS, ModBlocks.BLOCK_OF_RAW_ZINC);
                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.RAW_NICKEL, RecipeCategory.DECORATIONS, ModBlocks.BLOCK_OF_RAW_NICKEL);
                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.RAW_SILVER, RecipeCategory.DECORATIONS, ModBlocks.BLOCK_OF_RAW_SILVER);
                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.RAW_PLATINUM, RecipeCategory.DECORATIONS, ModBlocks.BLOCK_OF_RAW_PLATINUM);
                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.RAW_LITHIUM, RecipeCategory.DECORATIONS, ModBlocks.BLOCK_OF_RAW_LITHIUM);
                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.RAW_CHROMIUM, RecipeCategory.DECORATIONS, ModBlocks.BLOCK_OF_RAW_CHROMIUM);

                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.TIN_INGOT, RecipeCategory.DECORATIONS, ModBlocks.BLOCK_OF_TIN);
                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.LEAD_INGOT, RecipeCategory.DECORATIONS, ModBlocks.BLOCK_OF_LEAD);
                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.ALUMINUM_INGOT, RecipeCategory.DECORATIONS, ModBlocks.BLOCK_OF_ALUMINUM);
                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.ZINC_INGOT, RecipeCategory.DECORATIONS, ModBlocks.BLOCK_OF_ZINC);
                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.NICKEL_INGOT, RecipeCategory.DECORATIONS, ModBlocks.BLOCK_OF_NICKEL);
                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.SILVER_INGOT, RecipeCategory.DECORATIONS, ModBlocks.BLOCK_OF_SILVER);
                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.PLATINUM_INGOT, RecipeCategory.DECORATIONS, ModBlocks.BLOCK_OF_PLATINUM);
                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.LITHIUM_INGOT, RecipeCategory.DECORATIONS, ModBlocks.BLOCK_OF_LITHIUM);
                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.CHROMIUM_INGOT, RecipeCategory.DECORATIONS, ModBlocks.BLOCK_OF_CHROMIUM);

                shaped(RecipeCategory.MISC, ModItems.TIN_INGOT)
                        .pattern("III")
                        .pattern("III")
                        .pattern("III")
                        .define('I', ModItems.TIN_NUGGET)
                        .unlockedBy(getHasName(ModItems.TIN_NUGGET), has(ModItems.TIN_NUGGET))
                        .save(output, "tin_ingot_from_nuggets");

                shaped(RecipeCategory.MISC, ModItems.LEAD_INGOT)
                        .pattern("III")
                        .pattern("III")
                        .pattern("III")
                        .define('I', ModItems.LEAD_NUGGET)
                        .unlockedBy(getHasName(ModItems.LEAD_NUGGET), has(ModItems.LEAD_NUGGET))
                        .save(output, "lead_ingot_from_nuggets");

                shaped(RecipeCategory.MISC, ModItems.ALUMINUM_INGOT)
                        .pattern("III")
                        .pattern("III")
                        .pattern("III")
                        .define('I', ModItems.ALUMINUM_NUGGET)
                        .unlockedBy(getHasName(ModItems.ALUMINUM_NUGGET), has(ModItems.ALUMINUM_NUGGET))
                        .save(output, "aluminum_ingot_from_nuggets");

                shaped(RecipeCategory.MISC, ModItems.ZINC_INGOT)
                        .pattern("III")
                        .pattern("III")
                        .pattern("III")
                        .define('I', ModItems.ZINC_NUGGET)
                        .unlockedBy(getHasName(ModItems.ZINC_NUGGET), has(ModItems.ZINC_NUGGET))
                        .save(output, "zinc_ingot_from_nuggets");

                shaped(RecipeCategory.MISC, ModItems.NICKEL_INGOT)
                        .pattern("III")
                        .pattern("III")
                        .pattern("III")
                        .define('I', ModItems.NICKEL_NUGGET)
                        .unlockedBy(getHasName(ModItems.NICKEL_NUGGET), has(ModItems.NICKEL_NUGGET))
                        .save(output, "nickel_ingot_from_nuggets");

                shaped(RecipeCategory.MISC, ModItems.SILVER_INGOT)
                        .pattern("III")
                        .pattern("III")
                        .pattern("III")
                        .define('I', ModItems.SILVER_NUGGET)
                        .unlockedBy(getHasName(ModItems.SILVER_NUGGET), has(ModItems.SILVER_NUGGET))
                        .save(output, "silver_ingot_from_nuggets");

                shaped(RecipeCategory.MISC, ModItems.PLATINUM_INGOT)
                        .pattern("III")
                        .pattern("III")
                        .pattern("III")
                        .define('I', ModItems.PLATINUM_NUGGET)
                        .unlockedBy(getHasName(ModItems.PLATINUM_NUGGET), has(ModItems.PLATINUM_NUGGET))
                        .save(output, "platinum_ingot_from_nuggets");

                shaped(RecipeCategory.MISC, ModItems.LITHIUM_INGOT)
                        .pattern("III")
                        .pattern("III")
                        .pattern("III")
                        .define('I', ModItems.LITHIUM_NUGGET)
                        .unlockedBy(getHasName(ModItems.LITHIUM_NUGGET), has(ModItems.LITHIUM_NUGGET))
                        .save(output, "lithium_ingot_from_nuggets");

                shaped(RecipeCategory.MISC, ModItems.CHROMIUM_INGOT)
                        .pattern("III")
                        .pattern("III")
                        .pattern("III")
                        .define('I', ModItems.CHROMIUM_NUGGET)
                        .unlockedBy(getHasName(ModItems.CHROMIUM_NUGGET), has(ModItems.CHROMIUM_NUGGET))
                        .save(output, "chromium_ingot_from_nuggets");

                shapeless(RecipeCategory.MISC, ModItems.TIN_NUGGET, 9)
                        .requires(ModItems.TIN_INGOT)
                        .unlockedBy(getHasName(ModItems.TIN_INGOT), has(ModItems.TIN_INGOT))
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.LEAD_NUGGET, 9)
                        .requires(ModItems.LEAD_INGOT)
                        .unlockedBy(getHasName(ModItems.LEAD_INGOT), has(ModItems.LEAD_INGOT))
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.ALUMINUM_NUGGET, 9)
                        .requires(ModItems.ALUMINUM_INGOT)
                        .unlockedBy(getHasName(ModItems.ALUMINUM_INGOT), has(ModItems.ALUMINUM_INGOT))
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.ZINC_NUGGET, 9)
                        .requires(ModItems.ZINC_INGOT)
                        .unlockedBy(getHasName(ModItems.ZINC_INGOT), has(ModItems.ZINC_INGOT))
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.NICKEL_NUGGET, 9)
                        .requires(ModItems.NICKEL_INGOT)
                        .unlockedBy(getHasName(ModItems.NICKEL_INGOT), has(ModItems.NICKEL_INGOT))
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.SILVER_NUGGET, 9)
                        .requires(ModItems.SILVER_INGOT)
                        .unlockedBy(getHasName(ModItems.SILVER_INGOT), has(ModItems.SILVER_INGOT))
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.PLATINUM_NUGGET, 9)
                        .requires(ModItems.PLATINUM_INGOT)
                        .unlockedBy(getHasName(ModItems.PLATINUM_INGOT), has(ModItems.PLATINUM_INGOT))
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.LITHIUM_NUGGET, 9)
                        .requires(ModItems.LITHIUM_INGOT)
                        .unlockedBy(getHasName(ModItems.LITHIUM_INGOT), has(ModItems.LITHIUM_INGOT))
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.CHROMIUM_NUGGET, 9)
                        .requires(ModItems.CHROMIUM_INGOT)
                        .unlockedBy(getHasName(ModItems.CHROMIUM_INGOT), has(ModItems.CHROMIUM_INGOT))
                        .save(output);
            }
        };
    }
}