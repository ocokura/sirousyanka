package net.ocoserver.datagen.Tags;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.ocoserver.datagen.ModTags;
import net.ocoserver.common.block.ModBlocks;
import net.ocoserver.Sirousyanka;

import java.util.concurrent.CompletableFuture;

public class ItemTag extends ItemTagsProvider {

    public ItemTag(
            PackOutput output,
            CompletableFuture<HolderLookup.Provider> lookupProvider,
            CompletableFuture<TagLookup<Block>> blockTags,
            ExistingFileHelper existingFileHelper
    ) {
        super(output, lookupProvider, blockTags, Sirousyanka.MODID, existingFileHelper);
    }


    @Override
    protected void addTags(HolderLookup.Provider provider) {
        //木材系

        //氷雪のカラマツが板材つくれるように
        tag(ModTags.Items.CRAFTABLE_TO_ICE_LARCH_PLANKS)
            .add(ModBlocks.ICE_LARCH_LOG.get().asItem())
            .add(ModBlocks.STRIPPED_ICE_LARCH_LOG.get().asItem())
            .add(ModBlocks.ICE_LARCH_WOOD.get().asItem())
            .add(ModBlocks.STRIPPED_ICE_LARCH_WOOD.get().asItem());

        //ケウチが板材作れるように
        tag(ModTags.Items.CRAFTABLE_TO_KEUTI_PLANKS)
                .add(ModBlocks.KEUTI_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_KEUTI_LOG.get().asItem())
                .add(ModBlocks.KEUTI_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_KEUTI_WOOD.get().asItem());

        //紅晶樹の板材が作れるように
        tag(ModTags.Items.CRAFTABLE_TO_CRIMSON_CRYSTAL_PLANKS)
                .add(ModBlocks.CRIMSON_CRYSTAL_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_CRIMSON_CRYSTAL_LOG.get().asItem())
                .add(ModBlocks.CRIMSON_CRYSTAL_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_CRIMSON_CRYSTAL_WOOD.get().asItem());

        //アイテムにもタグを紐づけ
        copy(BlockTags.PLANKS, ItemTags.PLANKS);
        copy(BlockTags.LOGS, ItemTags.LOGS);
        copy(BlockTags.STAIRS, ItemTags.STAIRS);
        copy(BlockTags.SLABS, ItemTags.SLABS);
        copy(BlockTags.BUTTONS, ItemTags.BUTTONS);
        copy(BlockTags.FENCES, ItemTags.FENCES);
        copy(BlockTags.FENCE_GATES, ItemTags.FENCE_GATES);
        copy(BlockTags.DOORS, ItemTags.DOORS);
        copy(BlockTags.TRAPDOORS, ItemTags.TRAPDOORS);
        copy(BlockTags.LEAVES, ItemTags.LEAVES);
        copy(BlockTags.SAPLINGS, ItemTags.SAPLINGS);
        copy(BlockTags.STANDING_SIGNS, ItemTags.SIGNS);
        copy(BlockTags.CEILING_HANGING_SIGNS, ItemTags.HANGING_SIGNS);

        //かまどで燃えるように指定
        copy(BlockTags.LOGS_THAT_BURN, ItemTags.LOGS_THAT_BURN);
        copy(ModTags.Blocks.BURN_IN_FURNACE_PLANKS_BLOCK, ModTags.Items.BURN_IN_FURNACE_PLANKS);
        copy(ModTags.Blocks.BURN_IN_FURNACE_SHORT_BLOCK, ModTags.Items.BURN_IN_FURNACE_SHORT);

        //石系
        copy(ModTags.Blocks.STONE_TOOL_MATERIAL, ItemTags.STONE_TOOL_MATERIALS);

        //石のツールを作れるようにするにはめんどくさいがここでcopyじゃなくてaddしないといけない
        tag(ItemTags.STONE_TOOL_MATERIALS).add(ModBlocks.ABYSS_COBBLE_STONE.asItem());

        tag(ModTags.Items.CRAFTABLE_TO_SPRUCE_PLANKS)
            .add(ModBlocks.FROZEN_SPRUCE_LOG.get().asItem());
    }

}
