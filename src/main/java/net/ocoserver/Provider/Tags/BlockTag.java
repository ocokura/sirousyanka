package net.ocoserver.Provider.Tags;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.ocoserver.Tags.ModTags;
import net.ocoserver.blocks.ModBlocks;
import net.ocoserver.main.Sirousyanka;

import java.util.concurrent.CompletableFuture;

public class BlockTag extends BlockTagsProvider {

    public BlockTag(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Sirousyanka.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        tag(ModTags.Blocks.STONES)
            //Abyss系
            .add(ModBlocks.ABYSS_STONE.get())
            .add(ModBlocks.ABYSS_STONE_STAIR.get())
            .add(ModBlocks.ABYSS_STONE_SLAB.get())
            .add(ModBlocks.ABYSS_STONE_PRESSURE_PLATE.get())
            .add(ModBlocks.ABYSS_STONE_BUTTON.get())
            //Abyss Cobble
            .add(ModBlocks.ABYSS_COBBLE_STONE.get())
            .add(ModBlocks.ABYSS_COBBLE_STONE_STAIR.get())
            .add(ModBlocks.ABYSS_COBBLE_STONE_SLAB.get())
            .add(ModBlocks.ABYSS_COBBLE_STONE_WALL_BLOCK.get())

            //Frozen系
            .add(ModBlocks.FROZEN_STONE.get())
            .add(ModBlocks.FROZEN_STONE_STAIR.get())
            .add(ModBlocks.FROZEN_STONE_SLAB.get())
            .add(ModBlocks.FROZEN_STONE_PRESSURE_PLATE.get())
            .add(ModBlocks.FROZEN_STONE_BUTTON.get())

            //FROZEN_BRICKS
            .add(ModBlocks.FROZEN_STONE_BRICKS.get())
            .add(ModBlocks.FROZEN_STONE_BRICKS_STAIR.get())
            .add(ModBlocks.FROZEN_STONE_BRICKS_SLAB.get())
            .add(ModBlocks.FROZEN_STONE_BRICKS_WALL_BLOCK.get())
            .add(ModBlocks.FROZEN_CRACKED_STONE_BRICKS.get())
            .add(ModBlocks.FROZEN_CHISELED_STONE_BRICKS.get());

        tag(BlockTags.WALLS)
            .add(ModBlocks.ABYSS_COBBLE_STONE_WALL_BLOCK.get())
            .add(ModBlocks.FROZEN_STONE_BRICKS_WALL_BLOCK.get());

        tag(ModTags.Blocks.USYALIUM)
            .add(ModBlocks.USYALIUM_ORE_BLOCK.get())
            .add(ModBlocks.DEEPSLATE_USYALIUM_ORE_BLOCK.get())
            .add(ModBlocks.USYALIUM_BLOCK.get())
            .add(ModBlocks.ADVANCED_USYALIUM_BLOCK.get());

        tag(Tags.Blocks.COBBLESTONES)
            .add(ModBlocks.ABYSS_COBBLE_STONE.get());

        tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .addTag(ModTags.Blocks.STONES)
            .addTag(ModTags.Blocks.USYALIUM)
            .add(ModBlocks.ABYSS_ICE.get())
            .add(ModBlocks.ABYSS_PACKED_ICE.get())
            .add(ModBlocks.ABYSS_OBSIDIAN.get());

        tag(BlockTags.MINEABLE_WITH_AXE)
            .add(ModBlocks.FROZEN_SPRUCE_LOG.get());

        tag(BlockTags.MINEABLE_WITH_SHOVEL)
            .add(ModBlocks.FROZEN_GRASS_BLOCK.get());

        tag(BlockTags.NEEDS_STONE_TOOL)
            .addTag(ModTags.Blocks.STONES);

        tag(BlockTags.NEEDS_IRON_TOOL)
            .addTag(ModTags.Blocks.USYALIUM);

    }

}
