package net.ocoserver.Provider.Blocks;

import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.ocoserver.blocks.ModBlocks;

public class WoodBlockProvider {

    protected static void registerStatesAndModels(BlockStateProvider provider) {
        provider.logBlock(ModBlocks.FROZEN_SPRUCE_LOG.get());
        provider.simpleBlockItem(ModBlocks.FROZEN_SPRUCE_LOG.get(),
                provider.models().getExistingFile(
                        provider.modLoc("block/frozen_spruce_log")
                )
        );
    }

}