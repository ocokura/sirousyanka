package net.ocoserver.Provider.Blocks;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.ocoserver.blocks.ModBlocks;
import net.ocoserver.main.Sirousyanka;

public class StoneBlockProvider extends BlockStateProvider {

    public StoneBlockProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Sirousyanka.MODID, exFileHelper);
    }

    @Override
    public void registerStatesAndModels() {
        simpleBlockWithItem(ModBlocks.FROZEN_STONE.get(), cubeAll(ModBlocks.FROZEN_STONE.get()));
        simpleBlockWithItem(ModBlocks.ABYSS_STONE.get(), cubeAll(ModBlocks.ABYSS_STONE.get()));
        simpleBlockWithItem(ModBlocks.ABYSS_OBSIDIAN.get(), cubeAll(ModBlocks.ABYSS_OBSIDIAN.get()));
        simpleBlockWithItem(ModBlocks.FROZEN_STONE_BRICKS.get(), cubeAll(ModBlocks.FROZEN_STONE_BRICKS.get()));
        simpleBlockWithItem(ModBlocks.FROZEN_CRACKED_STONE_BRICKS.get(), cubeAll(ModBlocks.FROZEN_CRACKED_STONE_BRICKS.get()));
        simpleBlockWithItem(ModBlocks.FROZEN_CHISELED_STONE_BRICKS.get(), cubeAll(ModBlocks.FROZEN_CHISELED_STONE_BRICKS.get()));
    }

}
