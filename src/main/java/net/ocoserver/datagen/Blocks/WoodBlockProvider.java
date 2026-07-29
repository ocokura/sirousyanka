package net.ocoserver.datagen.Blocks;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.ocoserver.common.init.ModBlocks;

public class WoodBlockProvider {

    private static BlockStateProvider provider;

    protected static void registerStatesAndModels(BlockStateProvider blockStateProvider) {
        provider = blockStateProvider;
        provider.logBlock(ModBlocks.FROZEN_SPRUCE_LOG.get());
        provider.simpleBlockItem(ModBlocks.FROZEN_SPRUCE_LOG.get(),
                provider.models().getExistingFile(
                        provider.modLoc("block/frozen_spruce_log")
                )
        );

        provider.simpleBlockWithItem(ModBlocks.FROZEN_SPRUCE_LEAVES.get(), provider.cubeAll(ModBlocks.FROZEN_SPRUCE_LEAVES.get()));

        //氷雪のカラマツ
        registerWoodFamily(
                ModBlocks.ICE_LARCH_LOG.get(),
                ModBlocks.ICE_LARCH_WOOD.get(),
                ModBlocks.STRIPPED_ICE_LARCH_LOG.get(),
                ModBlocks.STRIPPED_ICE_LARCH_WOOD.get(),
                ModBlocks.ICE_LARCH_PLANKS.get(),
                ModBlocks.ICE_LARCH_STAIR.get(),
                ModBlocks.ICE_LARCH_SLAB.get(),
                ModBlocks.ICE_LARCH_FENCE.get(),
                ModBlocks.ICE_LARCH_FENCE_GATE.get(),
                ModBlocks.ICE_LARCH_PRESSURE_PLATE.get(),
                ModBlocks.ICE_LARCH_BUTTON.get(),
                ModBlocks.ICE_LARCH_DOOR.get(),
                ModBlocks.ICE_LARCH_TRAP_DOOR.get(),
                ModBlocks.ICE_LARCH_SIGN.get(),
                ModBlocks.ICE_LARCH_WALL_SIGN.get(),
                ModBlocks.ICE_LARCH_CEILING_HANGING_SIGN.get(),
                ModBlocks.ICE_LARCH_WALL_HANGING_SIGN.get(),
                ModBlocks.ICE_LARCH_SAPLING.get(),
                ModBlocks.ICE_LARCH_LEAVES.get()
        );

        //ケウチ
        registerWoodFamily(
                ModBlocks.KEUTI_LOG.get(),
                ModBlocks.KEUTI_WOOD.get(),
                ModBlocks.STRIPPED_KEUTI_LOG.get(),
                ModBlocks.STRIPPED_KEUTI_WOOD.get(),
                ModBlocks.KEUTI_PLANKS.get(),
                ModBlocks.KEUTI_STAIR.get(),
                ModBlocks.KEUTI_SLAB.get(),
                ModBlocks.KEUTI_FENCE.get(),
                ModBlocks.KEUTI_FENCE_GATE.get(),
                ModBlocks.KEUTI_PRESSURE_PLATE.get(),
                ModBlocks.KEUTI_BUTTON.get(),
                ModBlocks.KEUTI_DOOR.get(),
                ModBlocks.KEUTI_TRAP_DOOR.get(),
                ModBlocks.KEUTI_SIGN.get(),
                ModBlocks.KEUTI_WALL_SIGN.get(),
                ModBlocks.KEUTI_CEILING_HANGING_SIGN.get(),
                ModBlocks.KEUTI_WALL_HANGING_SIGN.get(),
                ModBlocks.KEUTI_SAPLING.get(),
                ModBlocks.KEUTI_LEAVES.get()
        );

        //紅晶樹
        registerWoodFamily(
                ModBlocks.CRIMSON_CRYSTAL_LOG.get(),
                ModBlocks.CRIMSON_CRYSTAL_WOOD.get(),
                ModBlocks.STRIPPED_CRIMSON_CRYSTAL_LOG.get(),
                ModBlocks.STRIPPED_CRIMSON_CRYSTAL_WOOD.get(),
                ModBlocks.CRIMSON_CRYSTAL_PLANKS.get(),
                ModBlocks.CRIMSON_CRYSTAL_STAIR.get(),
                ModBlocks.CRIMSON_CRYSTAL_SLAB.get(),
                ModBlocks.CRIMSON_CRYSTAL_FENCE.get(),
                ModBlocks.CRIMSON_CRYSTAL_FENCE_GATE.get(),
                ModBlocks.CRIMSON_CRYSTAL_PRESSURE_PLATE.get(),
                ModBlocks.CRIMSON_CRYSTAL_BUTTON.get(),
                ModBlocks.CRIMSON_CRYSTAL_DOOR.get(),
                ModBlocks.CRIMSON_CRYSTAL_TRAP_DOOR.get(),
                ModBlocks.CRIMSON_CRYSTAL_SIGN.get(),
                ModBlocks.CRIMSON_CRYSTAL_WALL_SIGN.get(),
                ModBlocks.CRIMSON_CRYSTAL_CEILING_HANGING_SIGN.get(),
                ModBlocks.CRIMSON_CRYSTAL_WALL_HANGING_SIGN.get(),
                ModBlocks.CRIMSON_CRYSTAL_SAPLING.get(),
                ModBlocks.CRIMSON_CRYSTAL_LEAVES.get()
        );

    }

    private static void registerWoodFamily(
            RotatedPillarBlock log,
            RotatedPillarBlock log_wood,
            RotatedPillarBlock stripped_log,
            RotatedPillarBlock stripped_log_wood,
            Block planks,
            StairBlock stair,
            SlabBlock slab,
            FenceBlock fence,
            FenceGateBlock fenceGate,
            PressurePlateBlock pressurePlate,
            ButtonBlock button,
            DoorBlock door,
            TrapDoorBlock trapdoor,
            StandingSignBlock sign,
            WallSignBlock wallSign,
            CeilingHangingSignBlock ceilingSign,
            WallHangingSignBlock wallSignHanging,
            SaplingBlock sapling,
            Block leaves
    ) {
        //原木登録
        provider.logBlock(log);
        provider.simpleBlockItem(log, provider.models().getExistingFile(provider.modLoc(BuiltInRegistries.BLOCK.getKey(log).getPath())));
        //木を登録
        provider.axisBlock(log_wood, provider.blockTexture(log), provider.blockTexture(log));
        provider.simpleBlockItem(log_wood, new ModelFile.UncheckedModelFile("sirousyanka:block/" + BuiltInRegistries.BLOCK.getKey(log_wood).getPath()));
        //樹皮を剥いだ原木
        provider.logBlock(stripped_log);
        provider.simpleBlockItem(stripped_log, provider.models().getExistingFile(provider.modLoc(BuiltInRegistries.BLOCK.getKey(stripped_log).getPath())));
        //樹皮を剥いだ木
        provider.axisBlock(stripped_log_wood, provider.blockTexture(stripped_log), provider.blockTexture(stripped_log));
        provider.simpleBlockItem(stripped_log_wood, new ModelFile.UncheckedModelFile("sirousyanka:block/" + BuiltInRegistries.BLOCK.getKey(stripped_log_wood).getPath()));
        //板材
        provider.simpleBlockWithItem(planks, provider.cubeAll(planks));
        //葉っぱ
        provider.simpleBlockWithItem(leaves, provider.cubeAll(leaves));

        ResourceLocation planksTex = provider.blockTexture(planks);

        //階段
        provider.stairsBlock(stair, planksTex);
        provider.itemModels().stairs(BuiltInRegistries.BLOCK.getKey(stair).getPath(), provider.blockTexture(planks), provider.blockTexture(planks), provider.blockTexture(planks));
        //ハーフブロック
        provider.slabBlock(slab, planksTex, planksTex);
        provider.itemModels().slab(BuiltInRegistries.BLOCK.getKey(slab).getPath(), provider.blockTexture(planks), provider.blockTexture(planks), provider.blockTexture(planks));
        //フェンスブロック
        provider.fenceBlock(fence, planksTex);
        provider.itemModels().fenceInventory(BuiltInRegistries.BLOCK.getKey(fence).getPath(), planksTex);
        //フェンスゲート
        provider.fenceGateBlock(fenceGate, planksTex);
        provider.itemModels().fenceGate(BuiltInRegistries.BLOCK.getKey(fenceGate).getPath(), provider.blockTexture(planks));
        //ボタン
        provider.buttonBlock(button, planksTex);
        provider.itemModels().buttonInventory(BuiltInRegistries.BLOCK.getKey(button).getPath(), planksTex);
        //感圧板
        provider.pressurePlateBlock(pressurePlate, planksTex);
        provider.itemModels().pressurePlate(BuiltInRegistries.BLOCK.getKey(pressurePlate).getPath(), provider.blockTexture(planks));
        //ドア
        provider.doorBlockWithRenderType(door,
                provider.modLoc("block/" + BuiltInRegistries.BLOCK.getKey(door).getPath() + "_bottom"),
                provider.modLoc("block/" + BuiltInRegistries.BLOCK.getKey(door).getPath() + "_top"),
                "cutout"
        );
        provider.itemModels().basicItem(door.asItem());
        //トラップドア
        provider.trapdoorBlockWithRenderType(trapdoor, provider.modLoc("block/" + BuiltInRegistries.BLOCK.getKey(trapdoor).getPath()), true, "cutout");
        provider.simpleBlockItem(trapdoor, new ModelFile.UncheckedModelFile(provider.modLoc("block/" + BuiltInRegistries.BLOCK.getKey(trapdoor).getPath() + "_bottom")));
        //看板
        provider.signBlock(sign, wallSign, planksTex);
        provider.itemModels().withExistingParent(BuiltInRegistries.BLOCK.getKey(sign).getPath(), "item/generated")
                .texture("layer0", provider.modLoc("item/" + BuiltInRegistries.BLOCK.getKey(sign).getPath()));

        // 吊り看板
        provider.hangingSignBlock(ceilingSign, wallSignHanging, planksTex);
        provider.itemModels().withExistingParent(BuiltInRegistries.BLOCK.getKey(ceilingSign).getPath(), "item/generated")
                .texture("layer0", provider.modLoc("item/" + BuiltInRegistries.BLOCK.getKey(ceilingSign).getPath()));
        //苗木
        var saplingModel = provider.models().cross(BuiltInRegistries.BLOCK.getKey(sapling).getPath(), provider.modLoc("block/" + BuiltInRegistries.BLOCK.getKey(sapling).getPath())
        ).renderType("minecraft:cutout");
        provider.simpleBlock(sapling, saplingModel);
        provider.itemModels().basicItem(sapling.asItem());
    }
}