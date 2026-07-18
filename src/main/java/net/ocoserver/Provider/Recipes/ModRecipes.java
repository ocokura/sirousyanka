package net.ocoserver.Provider.Recipes;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.*;
import net.ocoserver.blocks.ModBlocks;
import net.ocoserver.items.ModItems;
import org.jetbrains.annotations.Nullable;

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
        registerStoneFamily(
                ModBlocks.ABYSS_STONE.get(),
                ModBlocks.ABYSS_STONE_STAIR.get(),
                ModBlocks.ABYSS_STONE_SLAB.get(),
                ModBlocks.ABYSS_STONE_PRESSURE_PLATE.get(),
                ModBlocks.ABYSS_STONE_BUTTON.get(),
                null,
                null,
                null
        );

        //Abyss Cobble
        registerStoneFamily(
                ModBlocks.ABYSS_COBBLE_STONE.get(),
                ModBlocks.ABYSS_COBBLE_STONE_STAIR.get(),
                ModBlocks.ABYSS_COBBLE_STONE_SLAB.get(),
                null,
                null,
                ModBlocks.ABYSS_COBBLE_STONE_WALL_BLOCK.get(),
                null,
                null
        );

        //FROZEN_STONE
        registerStoneFamily(
                ModBlocks.FROZEN_STONE.get(),
                 ModBlocks.FROZEN_STONE_STAIR.get(),
                ModBlocks.FROZEN_STONE_SLAB.get(),
                ModBlocks.FROZEN_STONE_PRESSURE_PLATE.get(),
                ModBlocks.FROZEN_STONE_BUTTON.get(),
                null,
                null,
                null
        );

        //FROZEN_STONE_BRICKS
        registerStoneFamily(
                ModBlocks.FROZEN_STONE_BRICKS.get(),
                ModBlocks.FROZEN_STONE_BRICKS_STAIR.get(),
                ModBlocks.FROZEN_STONE_BRICKS_SLAB.get(),
                null,
                null,
                ModBlocks.FROZEN_STONE_BRICKS_WALL_BLOCK.get(),
                ModBlocks.FROZEN_CHISELED_STONE_BRICKS.get(),
                ModBlocks.FROZEN_CRACKED_STONE_BRICKS.get()
        );
    }

    private static void registerStoneFamily(
            Block baseBlock,
            StairBlock stairBlock,
            SlabBlock slabBlock,
            @Nullable PressurePlateBlock pressurePlateBlock,
            @Nullable ButtonBlock buttonBlock,
            @Nullable WallBlock wallBlock,
            @Nullable Block chiseledBlock,
            @Nullable Block crackedBlock
    ) {
        registerStairRecipe(stairBlock, baseBlock, BuiltInRegistries.BLOCK.getKey(baseBlock).getPath());
        slab(output, RecipeCategory.BUILDING_BLOCKS, slabBlock, baseBlock);
        if (pressurePlateBlock != null) {
            pressurePlate(output, pressurePlateBlock, baseBlock);
        }
        if (buttonBlock != null) {
            registerButtonRecipe(buttonBlock, baseBlock, BuiltInRegistries.BLOCK.getKey(baseBlock).getPath());
        }
        if (wallBlock != null) {
            wall(output, RecipeCategory.BUILDING_BLOCKS, wallBlock, baseBlock);
        }
        if (chiseledBlock != null) {
            chiseledBuilder(RecipeCategory.BUILDING_BLOCKS, chiseledBlock, Ingredient.of(slabBlock))
                    .unlockedBy("has_" + BuiltInRegistries.BLOCK.getKey(baseBlock).getPath(), has(baseBlock))
                    .save(output);
        }
        if (crackedBlock != null) {
            SimpleCookingRecipeBuilder.smelting(Ingredient.of(baseBlock), RecipeCategory.BUILDING_BLOCKS,
                            crackedBlock, 0.1f, 200)
                    .unlockedBy("has_" + BuiltInRegistries.BLOCK.getKey(baseBlock).getPath(), has(baseBlock))
                    .save(output);
        }
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
