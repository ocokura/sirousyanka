package net.ocoserver.blocks.wood;

import net.minecraft.client.renderer.Sheets;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.ItemAbilities;
import net.neoforged.neoforge.event.BlockEntityTypeAddBlocksEvent;
import net.neoforged.neoforge.event.level.BlockEvent;
import net.ocoserver.blocks.ModBlocks;
import net.ocoserver.main.Sirousyanka;

@EventBusSubscriber(modid = Sirousyanka.MODID)
public class WoodEvent {

    @SubscribeEvent
    public static void onBlockToolModification(BlockEvent.BlockToolModificationEvent event) {
        if (event.getItemAbility() == ItemAbilities.AXE_STRIP) {
            BlockState originalState = event.getState();
            BlockState strippedState = null;
            if (originalState.is(ModBlocks.ICE_LARCH_LOG.get())) {
                strippedState = ModBlocks.STRIPPED_ICE_LARCH_LOG.get().defaultBlockState()
                        .setValue(RotatedPillarBlock.AXIS, originalState.getValue(RotatedPillarBlock.AXIS));
            } else if (originalState.is(ModBlocks.ICE_LARCH_WOOD.get())) {
                strippedState = ModBlocks.STRIPPED_ICE_LARCH_WOOD.get().defaultBlockState()
                        .setValue(RotatedPillarBlock.AXIS, originalState.getValue(RotatedPillarBlock.AXIS));
            }
            event.setFinalState(strippedState);
        }
    }

    @SubscribeEvent
    public static void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            Sheets.addWoodType(ModWoodTypes.ICE_LARCH);
        });
    }

    @SubscribeEvent
    public static void blockEntityTypeAddBlockEvent(BlockEntityTypeAddBlocksEvent event) {
        event.modify(
                BlockEntityType.SIGN,
                ModBlocks.ICE_LARCH_PLANKS_SIGN.get(),
                ModBlocks.ICE_LARCH_PLANKS_WALL_SIGN.get()
        );
        event.modify(
                BlockEntityType.HANGING_SIGN,
                ModBlocks.ICE_LARCH_PLANKS_CEILING_HANGING_SIGN.get(),
                ModBlocks.ICE_LARCH_PLANKS_WALL_HANGING_SIGN.get()
        );
    }

}
