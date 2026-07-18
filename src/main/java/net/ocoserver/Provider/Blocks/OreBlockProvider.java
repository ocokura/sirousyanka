package net.ocoserver.Provider.Blocks;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.ocoserver.blocks.ModBlocks;
import net.ocoserver.main.Sirousyanka;

public class OreBlockProvider extends BlockStateProvider {

    public OreBlockProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Sirousyanka.MODID, exFileHelper);
    }

    @Override
    public void registerStatesAndModels() {
        simpleBlockWithItem(ModBlocks.USYALIUM_BLOCK.get(), cubeAll(ModBlocks.USYALIUM_BLOCK.get()));

        simpleBlockWithItem(ModBlocks.ADVANCED_USYALIUM_BLOCK.get(), cubeAll(ModBlocks.ADVANCED_USYALIUM_BLOCK.get()));

        simpleBlockWithItem(ModBlocks.DEEPSLATE_USYALIUM_ORE_BLOCK.get(), models().cubeBottomTop(
                "deepslate_usyalium_ore_block",
                modLoc("block/deepslate_usyalium_ore_block"),
                modLoc("block/deepslate_usyalium_ore_block_top"),
                modLoc("block/deepslate_usyalium_ore_block_top")
        ));

        simpleBlockWithItem(ModBlocks.USYALIUM_ORE_BLOCK.get(), cubeAll(ModBlocks.USYALIUM_ORE_BLOCK.get()));
    }

}
