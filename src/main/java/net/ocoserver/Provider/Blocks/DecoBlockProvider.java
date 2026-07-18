package net.ocoserver.Provider.Blocks;

import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.ocoserver.blocks.ModBlocks;

public class DecoBlockProvider {

    protected static void registerStatesAndModels(BlockStateProvider provider) {
        provider.simpleBlock(ModBlocks.ABYSS_ICE.get(), provider.models()
                        .cubeAll("abyss_ice", provider.modLoc("block/abyss_ice"))
                        .renderType("minecraft:translucent")
        );

        provider.simpleBlockItem(
                ModBlocks.ABYSS_ICE.get(), provider.models().cubeAll("abyss_ice", provider.modLoc("block/abyss_ice"))
        );

        provider.simpleBlockWithItem(ModBlocks.ABYSS_PACKED_ICE.get(), provider.cubeAll(ModBlocks.ABYSS_PACKED_ICE.get()));

        provider.simpleBlockWithItem(ModBlocks.FROZEN_GRASS_BLOCK.get(), provider.models().cubeBottomTop("frozen_grass_block",
                    provider.modLoc("block/frozen_grass_block"),
                    provider.modLoc("block/frozen_dirt"),
                    provider.modLoc("block/frozen_grass_block_top")
                ));
    }

}