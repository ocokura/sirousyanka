package net.ocoserver.Provider.Blocks;

import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.ocoserver.blocks.ModBlocks;

public class StoneBlockProvider {

    protected static void registerStatesAndModels(BlockStateProvider provider) {
        provider.simpleBlockWithItem(ModBlocks.FROZEN_STONE.get(), provider.cubeAll(ModBlocks.FROZEN_STONE.get()));
        provider.simpleBlockWithItem(ModBlocks.ABYSS_STONE.get(), provider.cubeAll(ModBlocks.ABYSS_STONE.get()));
        provider.simpleBlockWithItem(ModBlocks.ABYSS_OBSIDIAN.get(), provider.cubeAll(ModBlocks.ABYSS_OBSIDIAN.get()));
        provider.simpleBlockWithItem(ModBlocks.FROZEN_STONE_BRICKS.get(), provider.cubeAll(ModBlocks.FROZEN_STONE_BRICKS.get()));
        provider.simpleBlockWithItem(ModBlocks.FROZEN_CRACKED_STONE_BRICKS.get(), provider.cubeAll(ModBlocks.FROZEN_CRACKED_STONE_BRICKS.get()));
        provider.simpleBlockWithItem(ModBlocks.FROZEN_CHISELED_STONE_BRICKS.get(), provider.cubeAll(ModBlocks.FROZEN_CHISELED_STONE_BRICKS.get()));
    }
}
