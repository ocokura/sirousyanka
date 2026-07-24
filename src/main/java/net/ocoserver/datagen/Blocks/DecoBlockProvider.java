package net.ocoserver.datagen.Blocks;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoublePlantBlock;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.ocoserver.common.block.ModBlocks;

public class DecoBlockProvider {

    private static BlockStateProvider provider;

    protected static void registerStatesAndModels(BlockStateProvider blockStateProvider) {
        provider = blockStateProvider;
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

        provider.simpleBlockWithItem(ModBlocks.SNOW_PILED_STONE.get(), provider.models().cubeBottomTop("snow_piled_stone",
                provider.modLoc("block/snow_piled_stone"),
                provider.modLoc("block/snow_piled_stone_bottom"),
                provider.modLoc("block/snow_piled_stone_top")
        ));

        //植物など
        registerPlant(ModBlocks.FROZEN_GRASS.get());
        registerPlant(ModBlocks.FROZEN_POPPY.get());
        registerPlant(ModBlocks.BERRY_GRASS.get());
        registerPlant(ModBlocks.IRIS_PETAL.get());
        registerPlant(ModBlocks.FROST_FLARE.get());
        registerPlant(ModBlocks.ABYSS_STONE_GRASS.get());
        registerPlant(ModBlocks.LIT_ABYSS_STONE_GRASS.get());
        registerTallPlant(ModBlocks.ICE_BUSH.get());

    }

    private static void registerTallPlant(Block block) {
        var plantModelTop = provider.models().cross(BuiltInRegistries.BLOCK.getKey(block).getPath() + "_top", provider.modLoc("block/" + BuiltInRegistries.BLOCK.getKey(block).getPath() + "_top")
        ).renderType("minecraft:cutout");

        var plantModelBottom = provider.models().cross(BuiltInRegistries.BLOCK.getKey(block).getPath() + "_bottom", provider.modLoc("block/" + BuiltInRegistries.BLOCK.getKey(block).getPath() + "_bottom")
        ).renderType("minecraft:cutout");

        provider.getVariantBuilder(block)
                .partialState().with(DoublePlantBlock.HALF, DoubleBlockHalf.UPPER)
                .modelForState().modelFile(plantModelTop).addModel()
                .partialState().with(DoublePlantBlock.HALF, DoubleBlockHalf.LOWER)
                .modelForState().modelFile(plantModelBottom).addModel();

        provider.itemModels().basicItem(block.asItem());
    }

    private static void registerPlant(Block block) {
        var plantModel = provider.models().cross(BuiltInRegistries.BLOCK.getKey(block).getPath(), provider.modLoc("block/" + BuiltInRegistries.BLOCK.getKey(block).getPath())
        ).renderType("minecraft:cutout");
        provider.simpleBlock(block, plantModel);
        provider.itemModels().basicItem(block.asItem());
    }
}