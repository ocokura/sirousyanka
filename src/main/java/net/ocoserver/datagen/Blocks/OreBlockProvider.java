package net.ocoserver.datagen.Blocks;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.ocoserver.common.init.ModBlocks;

public class OreBlockProvider {

    protected static void registerStatesAndModels(BlockStateProvider provider) {
        provider.simpleBlockWithItem(ModBlocks.USYALIUM_BLOCK.get(), provider.cubeAll(ModBlocks.USYALIUM_BLOCK.get()));

        provider.simpleBlockWithItem(ModBlocks.ADVANCED_USYALIUM_BLOCK.get(), provider.cubeAll(ModBlocks.ADVANCED_USYALIUM_BLOCK.get()));

        provider.simpleBlockWithItem(ModBlocks.DEEPSLATE_USYALIUM_ORE_BLOCK.get(), provider.models().cubeBottomTop(
                "deepslate_usyalium_ore_block",
                provider.modLoc("block/deepslate_usyalium_ore_block"),
                provider.modLoc("block/deepslate_usyalium_ore_block_top"),
                provider.modLoc("block/deepslate_usyalium_ore_block_top")
        ));

        provider.simpleBlockWithItem(ModBlocks.USYALIUM_ORE_BLOCK.get(), provider.cubeAll(ModBlocks.USYALIUM_ORE_BLOCK.get()));
    }

}
