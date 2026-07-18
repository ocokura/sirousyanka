package net.ocoserver.Provider.Blocks;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.ocoserver.blocks.ModBlocks;
import net.ocoserver.main.Sirousyanka;

public class WoodBlockProvider extends BlockStateProvider {

    public WoodBlockProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Sirousyanka.MODID, exFileHelper);
    }

    @Override
    public void registerStatesAndModels() {
        logBlock(ModBlocks.FROZEN_SPRUCE_LOG.get());
    }

}