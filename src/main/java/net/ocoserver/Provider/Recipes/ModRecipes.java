package net.ocoserver.Provider.Recipes;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.*;
import net.ocoserver.blocks.ModBlocks;
import net.ocoserver.items.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModRecipes extends RecipeProvider {

    private static RecipeOutput output;

    public ModRecipes(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        output = recipeOutput;

        //ウシャリウムの塊 -> ウシャリウムインゴット
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.USYALIUM_INGOT.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.USYALIUM_NUGGET.get())
                .unlockedBy("has_nugget", has(ModItems.USYALIUM_NUGGET.get()))
                .save(output, "usyalium_ingot_from_nugget");

        //ウシャリウムインゴット -> ウシャリウムの塊
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.USYALIUM_NUGGET.get(), 9)
                .requires(ModItems.USYALIUM_INGOT.get())
                .unlockedBy("has_ingot", has(ModItems.USYALIUM_INGOT.get()))
                .save(output, "usyalium_nugget_from_ingot");

        //ウシャリウムインゴット <-> ウシャリウムブロック
        nineBlockStorageRecipes(output, RecipeCategory.MISC, ModItems.USYALIUM_INGOT.get(), RecipeCategory.MISC, ModBlocks.USYALIUM_BLOCK.get());

        //高度なウシャリウム
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ADVANCED_USYALIUM_INGOT.get())
                .pattern("DAD")
                .pattern("AUA")
                .pattern("DAD")
                .define('D', Items.DIAMOND)
                .define('A', Items.AMETHYST_SHARD)
                .define('U', ModItems.USYALIUM_INGOT.get())
                .unlockedBy("has_item", has(ModItems.USYALIUM_INGOT.get()))
                .save(output, "make_advanced_usyalium_ingot");

        //高度なウシャリウム <-> 高度なウシャリウムブロック
        nineBlockStorageRecipes(output, RecipeCategory.MISC, ModItems.ADVANCED_USYALIUM_INGOT.get(), RecipeCategory.MISC, ModBlocks.ADVANCED_USYALIUM_BLOCK.get());

        //Abyss Stone系
        registerStairRecipe(ModBlocks.ABYSS_STONE_STAIR.get(), ModBlocks.ABYSS_STONE.get(), "abyss_stone");
        slab(output, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ABYSS_STONE_SLAB.get(), ModBlocks.ABYSS_STONE.get());
        pressurePlate(output, ModBlocks.ABYSS_STONE_PRESSURE_PLATE.get(), ModBlocks.ABYSS_STONE.get());
        registerButtonRecipe(ModBlocks.ABYSS_STONE_BUTTON.get(), ModBlocks.ABYSS_STONE.get(), "abyss_stone");
        //Abyss Cobble
        registerStairRecipe(ModBlocks.ABYSS_COBBLE_STONE_STAIR.get(), ModBlocks.ABYSS_COBBLE_STONE.get(), "abyss_cobble_stone");
        slab(output, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ABYSS_COBBLE_STONE_SLAB.get(), ModBlocks.ABYSS_COBBLE_STONE.get());
        wall(output, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ABYSS_COBBLE_STONE_WALL_BLOCK.get(), ModBlocks.ABYSS_COBBLE_STONE);
        //FROZEN_STONE
        registerStairRecipe(ModBlocks.FROZEN_STONE_STAIR.get(), ModBlocks.FROZEN_STONE.get(), "frozen_stone");
        slab(output, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FROZEN_STONE_SLAB.get(), ModBlocks.FROZEN_STONE.get());
        pressurePlate(output, ModBlocks.FROZEN_STONE_PRESSURE_PLATE.get(), ModBlocks.FROZEN_STONE.get());
        registerButtonRecipe(ModBlocks.FROZEN_STONE_BUTTON.get(), ModBlocks.FROZEN_STONE.get(), "frozen_stone");
        //FROZEN_STONE_BRICKS
        registerStairRecipe(ModBlocks.FROZEN_STONE_BRICKS_STAIR.get(), ModBlocks.FROZEN_STONE_BRICKS.get(), "frozen_stone_bricks");
        slab(output, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FROZEN_STONE_BRICKS_SLAB.get(), ModBlocks.FROZEN_STONE_BRICKS.get());
        wall(output, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FROZEN_STONE_BRICKS_WALL_BLOCK.get(), ModBlocks.FROZEN_STONE_BRICKS.get());

        chiseledBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FROZEN_CHISELED_STONE_BRICKS.get(), Ingredient.of(ModBlocks.FROZEN_STONE_BRICKS_SLAB.get()))
                .unlockedBy("has_frozen_stone_bricks", has(ModBlocks.FROZEN_STONE_BRICKS.get()))
                .save(output);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.FROZEN_STONE_BRICKS.get()), RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.FROZEN_CRACKED_STONE_BRICKS.get(), 0.1f, 200)
                .unlockedBy("has_frozen_stone_bricks", has(ModBlocks.FROZEN_STONE_BRICKS.get()))
                .save(output);
    }



    private static void registerStairRecipe(StairBlock stairBlock, Block ingredientBlock, String name) {
        stairBuilder(stairBlock, Ingredient.of(ingredientBlock)).unlockedBy("has_" + name, has(ingredientBlock))
                .save(output);
    }

    private static void registerButtonRecipe(ButtonBlock buttonBlock, Block ingredientBlock, String name) {
        buttonBuilder(buttonBlock, Ingredient.of(ingredientBlock))
                .unlockedBy("has_" + name, has(ingredientBlock))
                .save(output);
    }
}
