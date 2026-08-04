package net.ocoserver.datagen.Blocks;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.*;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.ocoserver.common.init.block.ModBlocks;
import org.jetbrains.annotations.Nullable;

public class StoneBlockProvider {

    private static BlockStateProvider provider;

    protected static void registerStatesAndModels(BlockStateProvider stateProvider) {
        provider = stateProvider;
        provider.simpleBlockWithItem(ModBlocks.ABYSS_OBSIDIAN.get(), provider.cubeAll(ModBlocks.ABYSS_OBSIDIAN.get()));

        //ABYSS_STONE
        registerStoneFamily(
                ModBlocks.ABYSS_STONE.get(),
                ModBlocks.ABYSS_STONE_STAIR.get(),
                ModBlocks.ABYSS_STONE_SLAB.get(),
                ModBlocks.ABYSS_STONE_PRESSURE_PLATE.get(),
                ModBlocks.ABYSS_STONE_BUTTON.get(),
                null,
                null,
                null
        );

        //ABYSS_STONE_BRICKS
        registerStoneFamily(
                ModBlocks.ABYSS_STONE_BRICKS.get(),
                ModBlocks.ABYSS_STONE_BRICKS_STAIR.get(),
                ModBlocks.ABYSS_STONE_BRICKS_SLAB.get(),
                null,
                null,
                ModBlocks.ABYSS_STONE_BRICKS_WALL_BLOCK.get(),
                ModBlocks.CHISELED_ABYSS_STONE_BRICKS.get(),
                ModBlocks.CRACKED_ABYSS_STONE_BRICKS.get()
        );

        //ABYSS_COBLE
        registerStoneFamily(
                ModBlocks.ABYSS_COBBLE_STONE.get(),
                ModBlocks.ABYSS_COBBLE_STONE_STAIR.get(),
                ModBlocks.ABYSS_COBBLE_STONE_SLAB.get(),
                null,
                null,
                ModBlocks.ABYSS_COBBLE_STONE_WALL_BLOCK.get(),
                null,
                null
        );

        //FROZEN_STONE
        registerStoneFamily(ModBlocks.FROZEN_STONE.get(),
                ModBlocks.FROZEN_STONE_STAIR.get(),
                ModBlocks.FROZEN_STONE_SLAB.get(),
                ModBlocks.FROZEN_STONE_PRESSURE_PLATE.get(),
                ModBlocks.FROZEN_STONE_BUTTON.get(),
                null,
                null,
                null
                );

        //FROZEN_STONE_BRICKS
        registerStoneFamily(
                ModBlocks.FROZEN_STONE_BRICKS.get(),
                ModBlocks.FROZEN_STONE_BRICKS_STAIR.get(),
                ModBlocks.FROZEN_STONE_BRICKS_SLAB.get(),
                null,
                null,
                ModBlocks.FROZEN_STONE_BRICKS_WALL_BLOCK.get(),
                ModBlocks.FROZEN_CHISELED_STONE_BRICKS.get(),
                ModBlocks.FROZEN_CRACKED_STONE_BRICKS.get()
                );

        //AZURE_STONE
        registerStoneFamily(
                ModBlocks.AZURE_STONE.get(),
                ModBlocks.AZURE_STONE_STAIR.get(),
                ModBlocks.AZURE_STONE_SLAB.get(),
                null,
                null,
                ModBlocks.AZURE_STONE_WALL_BLOCK.get(),
                null,
                null
        );

        //POLISHED_AZURE_STONE_BRICKS
        registerStoneFamily(
                ModBlocks.POLISHED_AZURE_STONE.get(),
                ModBlocks.POLISHED_AZURE_STONE_STAIR.get(),
                ModBlocks.POLISHED_AZURE_STONE_SLAB.get(),
                null,
                null,
                null,
                null,
                null
        );

        //LIME_STONE
        registerStoneFamily(
                ModBlocks.LIME_STONE.get(),
                ModBlocks.LIME_STONE_STAIR.get(),
                ModBlocks.LIME_STONE_SLAB.get(),
                null,
                null,
                ModBlocks.LIME_STONE_WALL.get(),
                null,
                null
        );

        //LIME_STONE_BRICKS
        registerStoneFamily(
                ModBlocks.LIME_STONE_BRICKS.get(),
                ModBlocks.LIME_STONE_BRICKS_STAIR.get(),
                ModBlocks.LIME_STONE_BRICKS_SLAB.get(),
                null,
                null,
                null,
                null,
                null
        );

        //固形窒素
        registerStoneFamily(
                ModBlocks.SOLID_NITROGEN_BLOCK.get(),
                ModBlocks.SOLID_NITROGEN_STAIR.get(),
                ModBlocks.SOLID_NITROGEN_SLAB.get(),
                null,
                null,
                null,
                null,
                null
        );

        //固形窒素レンガ
        registerStoneFamily(
                ModBlocks.SOLID_NITROGEN_BRICKS.get(),
                ModBlocks.SOLID_NITROGEN_BRICKS_STAIR.get(),
                ModBlocks.SOLID_NITROGEN_BRICKS_SLAB.get(),
                null,
                null,
                ModBlocks.SOLID_NITROGEN_BRICKS_WALL.get(),
                null,
                null
        );
    }

    private static void registerStoneFamily(
                                            Block baseBlock,
                                            StairBlock stairBlock,
                                            SlabBlock slabBlock,
                                            @Nullable PressurePlateBlock pressurePlateBlock,
                                            @Nullable ButtonBlock buttonBlock,
                                            @Nullable WallBlock wallBlock,
                                            @Nullable Block chiseledBlock,
                                            @Nullable Block crackedBlock
    ) {
        provider.simpleBlockWithItem(baseBlock, provider.cubeAll(baseBlock));
        registerStair(stairBlock, baseBlock, BuiltInRegistries.BLOCK.getKey(stairBlock).getPath());
        registerSlab(slabBlock, baseBlock, BuiltInRegistries.BLOCK.getKey(slabBlock).getPath());
        if (pressurePlateBlock != null) {
            registerPressurePlate(pressurePlateBlock, baseBlock, BuiltInRegistries.BLOCK.getKey(pressurePlateBlock).getPath());
        }
        if (buttonBlock != null) {
            registerButton(buttonBlock, baseBlock, BuiltInRegistries.BLOCK.getKey(buttonBlock).getPath());
        }
        if (wallBlock != null) {
            registerWallBlock(wallBlock, baseBlock, BuiltInRegistries.BLOCK.getKey(wallBlock).getPath());
        }
        if (chiseledBlock != null) {
            provider.simpleBlockWithItem(chiseledBlock, provider.cubeAll(chiseledBlock));
        }
        if (crackedBlock != null) {
            provider.simpleBlockWithItem(crackedBlock, provider.cubeAll(crackedBlock));
        }
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
        provider.itemModels().withExistingParent(name, "minecraft:block/wall_inventory")
                .texture("wall", provider.blockTexture(baseBlock));
    }

    private static void registerBlockItem(String name, Block block) {
        provider.itemModels().withExistingParent(name, provider.blockTexture(block));
    }


}
