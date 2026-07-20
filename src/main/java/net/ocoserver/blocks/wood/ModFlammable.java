package net.ocoserver.blocks.wood;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FireBlock;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.ocoserver.blocks.ModBlocks;
import net.ocoserver.main.Sirousyanka;

@EventBusSubscriber(modid = Sirousyanka.MODID)
public class ModFlammable {

    @SubscribeEvent
    public static void setFlammable(FMLCommonSetupEvent event) {

        //氷雪のカラマツ
        setFlammable(
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
                ModBlocks.ICE_LARCH_LEAVES.get(),
                ModBlocks.ICE_LARCH_SAPLING.get()
        );

        //ケウチ
        setFlammable(
                ModBlocks.KEUTI_LOG.get(),
                ModBlocks.KEUTI_WOOD.get(),
                ModBlocks.STRIPPED_KEUTI_LOG.get(),
                ModBlocks.STRIPPED_KEUTI_WOOD.get(),
                ModBlocks.KEUTI_PLANKS.get(),
                ModBlocks.KEUTI_PLANKS_STAIR.get(),
                ModBlocks.KEUTI_PLANKS_SLAB.get(),
                ModBlocks.KEUTI_PLANKS_FENCE.get(),
                ModBlocks.KEUTI_PLANKS_FENCE_GATE.get(),
                ModBlocks.KEUTI_PLANKS_PRESSURE_PLATE.get(),
                ModBlocks.KEUTI_PLANKS_BUTTON.get(),
                ModBlocks.KEUTI_PLANKS_DOOR.get(),
                ModBlocks.KEUTI_PLANKS_TRAP_DOOR.get(),
                ModBlocks.KEUTI_SAPLING.get(),
                ModBlocks.KEUTI_LEAVES.get()
        );
    }

    private static void setFlammable(
            Block log,
            Block wood,
            Block strippedLog,
            Block strippedWood,
            Block planks,
            Block stair,
            Block slab,
            Block fence,
            Block fenceGate,
            Block pressurePlate,
            Block button,
            Block door,
            Block trapdoor,
            Block leaves,
            Block sapling
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

        // ボタン・感圧板
        fire.setFlammable(button, 5, 20);
        fire.setFlammable(pressurePlate, 5, 20);

        fire.setFlammable(door, 5, 20);
        fire.setFlammable(trapdoor, 5, 20);
        fire.setFlammable(leaves, 30, 60);

        fire.setFlammable(sapling, 60, 100);
    }


}
