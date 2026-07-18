package net.ocoserver.Provider;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.ocoserver.blocks.ModBlocks;
import net.ocoserver.items.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModRecipes extends RecipeProvider {

    public ModRecipes(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput output) {
        System.out.println("BUILD RECIPES CALLED　メソッド");

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
    }

}
