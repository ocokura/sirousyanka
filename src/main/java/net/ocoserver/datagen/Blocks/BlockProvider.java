package net.ocoserver.datagen.Blocks;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.ocoserver.common.init.Sirousyanka;

public class BlockProvider extends BlockStateProvider {

    public BlockProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Sirousyanka.MODID, exFileHelper);
    }

    @Override
    public void registerStatesAndModels() {
        StoneBlockProvider.registerStatesAndModels(this);
        WoodBlockProvider.registerStatesAndModels(this);
        DecoBlockProvider.registerStatesAndModels(this);
        OreBlockProvider.registerStatesAndModels(this);

    }

}
