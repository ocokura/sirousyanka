package net.ocoserver.common.init.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FireBlock;

public class SetFlammable {

    public static void setFlammable() {

        //氷雪のカラマツ
        woodFamilySetFlammable(
                ModBlocks.ICE_LARCH_LOG.get(),
                ModBlocks.ICE_LARCH_WOOD.get(),
                ModBlocks.STRIPPED_ICE_LARCH_LOG.get(),
                ModBlocks.STRIPPED_ICE_LARCH_WOOD.get(),
                ModBlocks.ICE_LARCH_PLANKS.get(),
                ModBlocks.ICE_LARCH_STAIR.get(),
                ModBlocks.ICE_LARCH_SLAB.get(),
                ModBlocks.ICE_LARCH_FENCE.get(),
                ModBlocks.ICE_LARCH_FENCE_GATE.get(),
                ModBlocks.ICE_LARCH_LEAVES.get()
        );

        //ケウチ
        woodFamilySetFlammable(
                ModBlocks.KEUTI_LOG.get(),
                ModBlocks.KEUTI_WOOD.get(),
                ModBlocks.STRIPPED_KEUTI_LOG.get(),
                ModBlocks.STRIPPED_KEUTI_WOOD.get(),
                ModBlocks.KEUTI_PLANKS.get(),
                ModBlocks.KEUTI_STAIR.get(),
                ModBlocks.KEUTI_SLAB.get(),
                ModBlocks.KEUTI_FENCE.get(),
                ModBlocks.KEUTI_FENCE_GATE.get(),
                ModBlocks.KEUTI_LEAVES.get()
        );

        //紅晶樹
        woodFamilySetFlammable(
                ModBlocks.CRIMSON_CRYSTAL_LOG.get(),
                ModBlocks.CRIMSON_CRYSTAL_WOOD.get(),
                ModBlocks.STRIPPED_CRIMSON_CRYSTAL_LOG.get(),
                ModBlocks.STRIPPED_CRIMSON_CRYSTAL_WOOD.get(),
                ModBlocks.CRIMSON_CRYSTAL_PLANKS.get(),
                ModBlocks.CRIMSON_CRYSTAL_STAIR.get(),
                ModBlocks.CRIMSON_CRYSTAL_SLAB.get(),
                ModBlocks.CRIMSON_CRYSTAL_FENCE.get(),
                ModBlocks.CRIMSON_CRYSTAL_FENCE_GATE.get(),
                ModBlocks.CRIMSON_CRYSTAL_LEAVES.get()
        );

        //ニトロウド
        woodFamilySetFlammable(
                ModBlocks.NITROWD_LOG.get(),
                ModBlocks.NITROWD_WOOD.get(),
                ModBlocks.STRIPPED_NITROWD_LOG.get(),
                ModBlocks.STRIPPED_NITROWD_WOOD.get(),
                ModBlocks.NITROWD_PLANKS.get(),
                ModBlocks.NITROWD_STAIR.get(),
                ModBlocks.NITROWD_SLAB.get(),
                ModBlocks.NITROWD_FENCE.get(),
                ModBlocks.NITROWD_FENCE_GATE.get(),
                ModBlocks.NITROWD_LEAVES.get()
        );

        blockSetFlammable(ModBlocks.PINK_AZUSAI.get(), 30, 60);
        blockSetFlammable(ModBlocks.BLUE_AZUSAI.get(), 30, 60);
        blockSetFlammable(ModBlocks.PURPLE_AZUSAI.get(), 30, 60);
    }

    private static void blockSetFlammable(Block block, int encouragement, int flammability) {
        FireBlock fire = (FireBlock) Blocks.FIRE;
        fire.setFlammable(block, encouragement, flammability);
    }

    private static void woodFamilySetFlammable(
            Block log,
            Block wood,
            Block strippedLog,
            Block strippedWood,
            Block planks,
            Block stair,
            Block slab,
            Block fence,
            Block fenceGate,
            Block leaves
    ) {
        FireBlock fire = (FireBlock) Blocks.FIRE;
        fire.setFlammable(log, 5, 5);
        fire.setFlammable(wood, 5, 5);
        fire.setFlammable(strippedLog, 5, 5);
        fire.setFlammable(strippedWood, 5, 5);

        // 板材系
        fire.setFlammable(planks, 5, 20);

        // 階段・ハーフ・装飾
        fire.setFlammable(stair, 5, 20);
        fire.setFlammable(slab, 5, 20);

        // フェンス系
        fire.setFlammable(fence, 5, 20);
        fire.setFlammable(fenceGate, 5, 20);

        fire.setFlammable(leaves, 30, 60);
    }


}
