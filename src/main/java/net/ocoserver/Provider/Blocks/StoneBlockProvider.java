package net.ocoserver.Provider.Blocks;

import net.minecraft.world.level.block.*;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.ocoserver.blocks.ModBlocks;

public class StoneBlockProvider {

    private static BlockStateProvider provider;

    protected static void registerStatesAndModels(BlockStateProvider stateProvider) {
        provider = stateProvider;
        provider.simpleBlockWithItem(ModBlocks.ABYSS_OBSIDIAN.get(), provider.cubeAll(ModBlocks.ABYSS_OBSIDIAN.get()));

        //ABYSS_STONE
        provider.simpleBlockWithItem(ModBlocks.ABYSS_STONE.get(), provider.cubeAll(ModBlocks.ABYSS_STONE.get()));
        registerStair(ModBlocks.ABYSS_STONE_STAIR.get(), ModBlocks.ABYSS_STONE.get(), "abyss_stone_stair");
        registerSlab(ModBlocks.ABYSS_STONE_SLAB.get(), ModBlocks.ABYSS_STONE.get(), "abyss_stone_slab");
        registerPressurePlate(ModBlocks.ABYSS_STONE_PRESSURE_PLATE.get(), ModBlocks.ABYSS_STONE.get(), "abyss_stone_pressure_plate");
        registerButton(ModBlocks.ABYSS_STONE_BUTTON.get(), ModBlocks.ABYSS_STONE.get(), "abyss_stone_button");
        //ABYSS_COBLE
        provider.simpleBlock(ModBlocks.ABYSS_COBBLE_STONE.get(), provider.cubeAll(ModBlocks.ABYSS_COBBLE_STONE.get()));
        registerStair(ModBlocks.ABYSS_COBBLE_STONE_STAIR.get(), ModBlocks.ABYSS_COBBLE_STONE.get(), "abyss_cobble_stone");
        registerSlab(ModBlocks.ABYSS_COBBLE_STONE_SLAB.get(), ModBlocks.ABYSS_COBBLE_STONE.get(), "abyss_cobble_stone");
        registerWallBlock(ModBlocks.ABYSS_COBBLE_STONE_WALL_BLOCK.get(), ModBlocks.ABYSS_COBBLE_STONE.get(), "abyss_cobble_stone_wall_block");
        //FROZEN_STONE
        provider.simpleBlockWithItem(ModBlocks.FROZEN_STONE.get(), provider.cubeAll(ModBlocks.FROZEN_STONE.get()));
        registerStair(ModBlocks.FROZEN_STONE_STAIR.get(), ModBlocks.FROZEN_STONE.get(), "frozen_stone_stair");
        registerSlab(ModBlocks.FROZEN_STONE_SLAB.get(), ModBlocks.FROZEN_STONE.get(), "frozen_stone_slab");
        registerPressurePlate(ModBlocks.FROZEN_STONE_PRESSURE_PLATE.get(), ModBlocks.FROZEN_STONE.get(), "frozen_stone_pressure_plate");
        registerButton(ModBlocks.FROZEN_STONE_BUTTON.get(), ModBlocks.FROZEN_STONE.get(), "frozen_stone_button");
        //FROZEN_STONE_BRICKS
        provider.simpleBlockWithItem(ModBlocks.FROZEN_STONE_BRICKS.get(), provider.cubeAll(ModBlocks.FROZEN_STONE_BRICKS.get()));
        registerStair(ModBlocks.FROZEN_STONE_BRICKS_STAIR.get(), ModBlocks.FROZEN_STONE_BRICKS.get(), "frozen_stone_bricks_stair");
        registerSlab(ModBlocks.FROZEN_STONE_BRICKS_SLAB.get(), ModBlocks.FROZEN_STONE_BRICKS.get(), "frozen_stone_bricks_slab");
        registerWallBlock(ModBlocks.FROZEN_STONE_BRICKS_WALL_BLOCK.get(), ModBlocks.FROZEN_STONE_BRICKS.get(), "frozen_stone_bricks_wall_block");
        provider.simpleBlockWithItem(ModBlocks.FROZEN_CRACKED_STONE_BRICKS.get(), provider.cubeAll(ModBlocks.FROZEN_CRACKED_STONE_BRICKS.get()));
        provider.simpleBlockWithItem(ModBlocks.FROZEN_CHISELED_STONE_BRICKS.get(), provider.cubeAll(ModBlocks.FROZEN_CHISELED_STONE_BRICKS.get()));
    }

    private static void registerStair(StairBlock stairBlock, Block baseBlock, String name) {
        provider.stairsBlock(stairBlock, provider.blockTexture(baseBlock));
        registerBlockItem(name, stairBlock);
    }

    private static void registerSlab(SlabBlock slabBlock, Block baseBlock, String name) {
        provider.slabBlock(slabBlock, provider.blockTexture(baseBlock), provider.blockTexture(baseBlock));
        registerBlockItem(name, slabBlock);
    }

    private static void registerButton(ButtonBlock buttonBlock, Block baseBlock, String name) {
        provider.buttonBlock(buttonBlock, provider.blockTexture(baseBlock));
        provider.itemModels().buttonInventory(name, provider.blockTexture(baseBlock));
    }

    private static void registerPressurePlate(PressurePlateBlock pressurePlateBlock, Block baseBlock, String name) {
        provider.pressurePlateBlock(pressurePlateBlock, provider.blockTexture(baseBlock));
        registerBlockItem(name, pressurePlateBlock);
    }

    private static void registerWallBlock(WallBlock wallBlock, Block baseBlock, String name) {
        provider.wallBlock(wallBlock, provider.blockTexture(baseBlock));
        registerBlockItem(name, wallBlock);
    }

    private static void registerBlockItem(String name, Block block) {
        provider.itemModels().withExistingParent(name, provider.blockTexture(block));
    }


}
