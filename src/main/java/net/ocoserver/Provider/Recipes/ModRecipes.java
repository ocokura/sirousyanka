package net.ocoserver.Provider.Recipes;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.*;
import net.ocoserver.Provider.ModTags;
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

        //凍った松の原木 -> 松の板材
        planksFromLog(output, Blocks.SPRUCE_PLANKS, ModTags.Items.CRAFTABLE_TO_SPRUCE_PLANKS, 4);

        //深淵の氷 -> 深淵の氷塊
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ABYSS_PACKED_ICE.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModBlocks.ABYSS_ICE.get())
                .unlockedBy("has_abyss_ice", has(ModBlocks.ABYSS_ICE.get()))
                .save(output, "abyss_packed_ice_from_abyss_ice");

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

        //ABYSS STONE BRICKS
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ABYSS_STONE_BRICKS.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', ModBlocks.ABYSS_STONE.get())
                .unlockedBy("has_abyss_stone", has(ModBlocks.ABYSS_STONE.get()))
                .save(output, "abyss_stone_bricks_from_abyss_stone");
        registerStoneFamily(
                ModBlocks.ABYSS_STONE_BRICKS.get(),
                ModBlocks.ABYSS_STONE_BRICKS_STAIR.get(),
                ModBlocks.ABYSS_STONE_BRICKS_SLAB.get(),
                null,
                null,
                ModBlocks.ABYSS_STONE_BRICKS_WALL_BLOCK.get(),
                ModBlocks.CHISELED_ABYSS_STONE_BRICKS.get(),
                ModBlocks.CRACKED_ABYSS_STONE_BRICKS.get()
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

        //AZURE STONE
        registerStoneFamily(
                ModBlocks.AZURE_STONE.get(),
                ModBlocks.AZURE_STONE_STAIR.get(),
                ModBlocks.AZURE_STONE_SLAB.get(),
                null,
                null,
                ModBlocks.AZURE_STONE_WALL_BLOCK.get(),
                null,
                null
        );

        //POLISHED_AZURE STONE
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.POLISHED_AZURE_STONE.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', ModBlocks.AZURE_STONE.get())
                .unlockedBy("has_azure_stone", has(ModBlocks.AZURE_STONE.get()))
                .save(output, "polished_azure_stone_from_azure_stone");
        registerStoneFamily(
                ModBlocks.POLISHED_AZURE_STONE.get(),
                ModBlocks.POLISHED_AZURE_STONE_STAIR.get(),
                ModBlocks.POLISHED_AZURE_STONE_SLAB.get(),
                null,
                null,
                null,
                null,
                null
        );

        //LIME_STONE
        registerStoneFamily(
                ModBlocks.LIME_STONE.get(),
                ModBlocks.LIME_STONE_STAIR.get(),
                ModBlocks.LIME_STONE_SLAB.get(),
                null,
                null,
                ModBlocks.LIME_STONE_WALL.get(),
                null,
                null
        );

        //LIME_STONE_BRICKS
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIME_STONE_BRICKS.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', ModBlocks.LIME_STONE.get())
                .unlockedBy("has_lime_stone", has(ModBlocks.LIME_STONE.get()))
                .save(output, "lime_stone_bricks_from_lime_stone");

        registerStoneFamily(
                ModBlocks.LIME_STONE_BRICKS.get(),
                ModBlocks.LIME_STONE_BRICKS_STAIR.get(),
                ModBlocks.LIME_STONE_BRICKS_SLAB.get(),
                null,
                null,
                null,
                null,
                null
        );

        //氷雪のカラマツ
        registerWoodRecipeFamily(
                ModBlocks.ICE_LARCH_LOG.get(),
                ModBlocks.ICE_LARCH_WOOD.get(),
                ModBlocks.STRIPPED_ICE_LARCH_LOG.get(),
                ModBlocks.STRIPPED_ICE_LARCH_WOOD.get(),
                ModBlocks.ICE_LARCH_PLANKS.get(),
                ModBlocks.ICE_LARCH_PLANKS_STAIR.get(),
                ModBlocks.ICE_LARCH_PLANKS_SLAB.get(),
                ModBlocks.ICE_LARCH_PLANKS_FENCE.get(),
                ModBlocks.ICE_LARCH_PLANKS_FENCE_GATE.get(),
                ModBlocks.ICE_LARCH_PLANKS_PRESSURE_PLATE.get(),
                ModBlocks.ICE_LARCH_PLANKS_BUTTON.get(),
                ModBlocks.ICE_LARCH_PLANKS_DOOR.get(),
                ModBlocks.ICE_LARCH_PLANKS_TRAP_DOOR.get(),
                ModBlocks.ICE_LARCH_PLANKS_SIGN.get(),
                ModBlocks.ICE_LARCH_PLANKS_CEILING_HANGING_SIGN.get()
        );

        //ケウチ
        registerWoodRecipeFamily(
                ModBlocks.KEUTI_LOG.get(),
                ModBlocks.KEUTI_WOOD.get(),
                ModBlocks.STRIPPED_KEUTI_LOG.get(),
                ModBlocks.STRIPPED_KEUTI_WOOD.get(),
                ModBlocks.KEUTI_PLANKS.get(),
                ModBlocks.KEUTI_PLANKS_STAIR.get(),
                ModBlocks.KEUTI_PLANKS_SLAB.get(),
                ModBlocks.KEUTI_PLANKS_FENCE.get(),
                ModBlocks.KEUTI_PLANKS_FENCE_GATE.get(),
                ModBlocks.KEUTI_PLANKS_PRESSURE_PLATE.get(),
                ModBlocks.KEUTI_PLANKS_BUTTON.get(),
                ModBlocks.KEUTI_PLANKS_DOOR.get(),
                ModBlocks.KEUTI_PLANKS_TRAP_DOOR.get(),
                ModBlocks.KEUTI_PLANKS_SIGN.get(),
                ModBlocks.KEUTI_PLANKS_CEILING_HANGING_SIGN.get()
        );

        //紅晶樹
        registerWoodRecipeFamily(
                ModBlocks.CRIMSON_CRYSTAL_LOG.get(),
                ModBlocks.CRIMSON_CRYSTAL_WOOD.get(),
                ModBlocks.STRIPPED_CRIMSON_CRYSTAL_LOG.get(),
                ModBlocks.STRIPPED_CRIMSON_CRYSTAL_WOOD.get(),
                ModBlocks.CRIMSON_CRYSTAL_PLANKS.get(),
                ModBlocks.CRIMSON_CRYSTAL_PLANKS_STAIR.get(),
                ModBlocks.CRIMSON_CRYSTAL_PLANKS_SLAB.get(),
                ModBlocks.CRIMSON_CRYSTAL_PLANKS_FENCE.get(),
                ModBlocks.CRIMSON_CRYSTAL_PLANKS_FENCE_GATE.get(),
                ModBlocks.CRIMSON_CRYSTAL_PLANKS_PRESSURE_PLATE.get(),
                ModBlocks.CRIMSON_CRYSTAL_PLANKS_BUTTON.get(),
                ModBlocks.CRIMSON_CRYSTAL_PLANKS_DOOR.get(),
                ModBlocks.CRIMSON_CRYSTAL_PLANKS_TRAP_DOOR.get(),
                ModBlocks.CRIMSON_CRYSTAL_PLANKS_SIGN.get(),
                ModBlocks.CRIMSON_CRYSTAL_PLANKS_CEILING_HANGING_SIGN.get()
        );

        //植物
        oneToOneConversionRecipe(output, Items.LIGHT_BLUE_DYE, ModBlocks.FROZEN_POPPY.get(),"");
    }

    private static void registerWoodRecipeFamily(
            Block log,
            Block wood,
            Block strippedLog,
            Block strippedWood,
            Block planks,
            Block stair,
            Block slab,
            Block fence,
            Block fenceGate,
            Block pressurePlate,
            Block button,
            Block door,
            Block trapdoor,
            Block sign,
            Block ceilingSign
    ) {
        planksFromLog(output, planks, ModTags.Items.CRAFTABLE_TO_ICE_LARCH_PLANKS, 4);
        woodFromLogs(output, wood, log);
        woodFromLogs(output, strippedWood, strippedLog);

        var ingredient = Ingredient.of(planks);

        stairBuilder(stair, ingredient).unlockedBy("has_planks", has(planks)).save(output);
        slab(output, RecipeCategory.BUILDING_BLOCKS, slab, planks);
        fenceBuilder(fence, ingredient).unlockedBy("has_planks", has(planks)).save(output);
        fenceGateBuilder(fenceGate, ingredient).unlockedBy("has_planks", has(planks)).save(output);
        buttonBuilder(button, ingredient).unlockedBy("has_planks", has(planks)).save(output);
        pressurePlate(output, pressurePlate, planks);

        doorBuilder(door, ingredient).unlockedBy("has_planks", has(planks)).save(output);
        trapdoorBuilder(trapdoor, ingredient).unlockedBy("has_planks", has(planks)).save(output);

        signBuilder(sign, ingredient).unlockedBy("has_planks", has(planks)).save(output);
        hangingSign(output, ceilingSign, strippedLog);
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
