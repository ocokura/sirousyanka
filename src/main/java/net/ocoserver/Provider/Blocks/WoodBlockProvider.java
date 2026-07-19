package net.ocoserver.Provider.Blocks;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.ocoserver.blocks.ModBlocks;

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

        //氷雪のカラマツ
        registerWoodFamily(
                ModBlocks.ICE_LARCH_LOG.get(),
                ModBlocks.ICE_LARCH_WOOD.get(),
                ModBlocks.STRIPPED_ICE_LARCH_LOG.get(),
                ModBlocks.STRIPPED_ICE_LARCH_WOOD.get(),
                ModBlocks.ICE_LARCH_PLANKS.get(),
                ModBlocks.ICE_LARCH_PLANKS_STAIR.get(),
                ModBlocks.ICE_LARCH_PLANKS_SLAB.get(),
                ModBlocks.ICE_LARCH_PLANKS_FENCE.get(),
                ModBlocks.ICE_LARCH_PLANKS_FENCE_GATE.get(),
                ModBlocks.ICE_LARCH_PLANKS_PRESSURE_PLATE.get(),
                ModBlocks.ICE_LARCH_PLANKS_BUTTON.get(),
                ModBlocks.ICE_LARCH_PLANKS_DOOR.get(),
                ModBlocks.ICE_LARCH_PLANKS_TRAP_DOOR.get(),
                ModBlocks.ICE_LARCH_PLANKS_SIGN.get(),
                ModBlocks.ICE_LARCH_PLANKS_WALL_SIGN.get(),
                ModBlocks.ICE_LARCH_PLANKS_CEILING_HANGING_SIGN.get(),
                ModBlocks.ICE_LARCH_PLANKS_WALL_HANGING_SIGN.get(),
                ModBlocks.ICE_LARCH_SAPLING.get(),
                ModBlocks.ICE_LARCH_LEAVES.get()
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
        provider.logBlock(log);
        provider.simpleBlockWithItem(log_wood, provider.cubeAll(log_wood));
        provider.logBlock(stripped_log);
        provider.simpleBlockWithItem(stripped_log_wood, provider.cubeAll(stripped_log_wood));
        provider.simpleBlockWithItem(planks, provider.cubeAll(planks));
        provider.simpleBlockWithItem(leaves, provider.cubeAll(leaves));

        ResourceLocation planksTex = provider.blockTexture(planks);

        provider.stairsBlock(stair, planksTex);
        provider.itemModels().withExistingParent(BuiltInRegistries.BLOCK.getKey(stair).getPath(), provider.blockTexture(stair));

        provider.slabBlock(slab, planksTex, planksTex);
        provider.itemModels().withExistingParent(BuiltInRegistries.BLOCK.getKey(slab).getPath(), provider.blockTexture(slab));

        provider.fenceBlock(fence, planksTex);
        provider.itemModels().withExistingParent(BuiltInRegistries.BLOCK.getKey(fence).getPath(), provider.blockTexture(fence));

        provider.fenceGateBlock(fenceGate, planksTex);
        provider.itemModels().withExistingParent(BuiltInRegistries.BLOCK.getKey(fenceGate).getPath(), provider.blockTexture(fenceGate));

        provider.buttonBlock(button, planksTex);
        provider.itemModels().buttonInventory(BuiltInRegistries.BLOCK.getKey(button).getPath(), planksTex);

        provider.pressurePlateBlock(pressurePlate, planksTex);
        provider.itemModels().withExistingParent(BuiltInRegistries.BLOCK.getKey(pressurePlate).getPath(), provider.blockTexture(pressurePlate));

        String doorPath = BuiltInRegistries.BLOCK.getKey(door).getPath();
        provider.doorBlockWithRenderType(
                door,
                provider.modLoc("block/" + doorPath + "_bottom"),
                provider.modLoc("block/" + doorPath + "_top"),
                "cutout"
        );

        String trapdoorPath = BuiltInRegistries.BLOCK.getKey(trapdoor).getPath();
        provider.trapdoorBlockWithRenderType(
                trapdoor,
                provider.modLoc("block/" + trapdoorPath),
                true,
                "cutout"
        );

        provider.signBlock(
                sign,
                wallSign,
                planksTex
        );

        String signPath = BuiltInRegistries.BLOCK.getKey(sign).getPath();
        provider.itemModels().withExistingParent(signPath, provider.mcLoc("item/generated"))
                .texture("layer0", provider.modLoc("item/" + signPath));

        provider.hangingSignBlock(
                ceilingSign,
                wallSignHanging,
                planksTex
        );

        String ceilingSignPath = BuiltInRegistries.BLOCK.getKey(ceilingSign).getPath();
        String itemSignName = ceilingSignPath.replace("_ceiling", "");
        provider.itemModels().withExistingParent(itemSignName, provider.mcLoc("item/generated"))
                .texture("layer0", provider.modLoc("item/" + itemSignName));


        var saplingModel = provider.models().cross(BuiltInRegistries.BLOCK.getKey(sapling).getPath(), provider.modLoc("block/" + BuiltInRegistries.BLOCK.getKey(sapling).getPath()));
        provider.simpleBlock(sapling, saplingModel);

        provider.itemModels().withExistingParent(BuiltInRegistries.BLOCK.getKey(sapling).getPath(), provider.mcLoc("item/generated"))
                .texture("layer0", provider.modLoc("block/" + BuiltInRegistries.BLOCK.getKey(sapling).getPath()));
    }

}