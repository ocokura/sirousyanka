package net.ocoserver.Provider.Tags;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.ocoserver.Tags.ModTags;
import net.ocoserver.blocks.ModBlocks;
import net.ocoserver.main.Sirousyanka;

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
        copy(BlockTags.PLANKS, ItemTags.PLANKS);
        copy(BlockTags.LOGS_THAT_BURN, ItemTags.LOGS_THAT_BURN);

        tag(ModTags.Items.FROZEN_SPRUCE_LOG)
                .add(ModBlocks.FROZEN_SPRUCE_LOG.get().asItem());

        tag(ModTags.Items.ICE_LARCH_LOG)
                .add(ModBlocks.ICE_LARCH_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_ICE_LARCH_LOG.get().asItem())
                .add(ModBlocks.ICE_LARCH_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_ICE_LARCH_WOOD.get().asItem());
    }

}
