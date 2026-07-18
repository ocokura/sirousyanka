package net.ocoserver.Provider.Blocks;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.ocoserver.blocks.ModBlocks;
import net.ocoserver.main.Sirousyanka;

public class DecoBlockProvider extends BlockStateProvider {

    public DecoBlockProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Sirousyanka.MODID, exFileHelper);
    }

    @Override
    public void registerStatesAndModels() {
        simpleBlockWithItem(ModBlocks.ABYSS_ICE.get(), cubeAll(ModBlocks.ABYSS_ICE.get()));

        simpleBlockWithItem(ModBlocks.ABYSS_PACKED_ICE.get(), cubeAll(ModBlocks.ABYSS_PACKED_ICE.get()));

        simpleBlockWithItem(ModBlocks.FROZEN_GRASS_BLOCK.get(), models().cubeBottomTop("frozen_grass_block",
                    modLoc("block/frozen_grass_block"),
                    modLoc("block/froze_dirt"),
                    modLoc("block/frozen_grass_block_top")
                ));
    }

}