package net.ocoserver.common.block.wood;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.ItemAbilities;
import net.neoforged.neoforge.event.BlockEntityTypeAddBlocksEvent;
import net.neoforged.neoforge.event.level.BlockEvent;
import net.ocoserver.common.init.ModBlocks;
import net.ocoserver.Sirousyanka;

import java.util.HashMap;
import java.util.Map;

@EventBusSubscriber(modid = Sirousyanka.MODID)
public class WoodEvent {

    private static final Map<Block, Block> STRIPPABLE = new HashMap<>();

    static {
        STRIPPABLE.put(ModBlocks.ICE_LARCH_LOG.get(), ModBlocks.STRIPPED_ICE_LARCH_LOG.get());
        STRIPPABLE.put(ModBlocks.ICE_LARCH_WOOD.get(), ModBlocks.STRIPPED_ICE_LARCH_WOOD.get());

        STRIPPABLE.put(ModBlocks.KEUTI_LOG.get(), ModBlocks.STRIPPED_KEUTI_LOG.get());
        STRIPPABLE.put(ModBlocks.KEUTI_WOOD.get(), ModBlocks.STRIPPED_KEUTI_WOOD.get());

        STRIPPABLE.put(ModBlocks.CRIMSON_CRYSTAL_LOG.get(), ModBlocks.STRIPPED_CRIMSON_CRYSTAL_LOG.get());
        STRIPPABLE.put(ModBlocks.CRIMSON_CRYSTAL_WOOD.get(), ModBlocks.STRIPPED_CRIMSON_CRYSTAL_WOOD.get());
    }

    @SubscribeEvent
    public static void onBlockToolModification(BlockEvent.BlockToolModificationEvent event) {
        if (!(event.getItemAbility() == ItemAbilities.AXE_STRIP)) {
            return;
        }
        BlockState originalState = event.getState();
        Block strippedBlock = STRIPPABLE.get(originalState.getBlock());
        if (strippedBlock == null) {
            return;
        }
        event.setFinalState(strippedBlock.defaultBlockState().setValue(RotatedPillarBlock.AXIS, originalState.getValue(RotatedPillarBlock.AXIS)));
    }

    @SubscribeEvent
    public static void blockEntityTypeAddBlockEvent(BlockEntityTypeAddBlocksEvent event) {
        event.modify(
                BlockEntityType.SIGN,
                ModBlocks.ICE_LARCH_PLANKS_SIGN.get(),
                ModBlocks.ICE_LARCH_PLANKS_WALL_SIGN.get(),
                ModBlocks.KEUTI_PLANKS_SIGN.get(),
                ModBlocks.KEUTI_PLANKS_WALL_SIGN.get(),
                ModBlocks.CRIMSON_CRYSTAL_PLANKS_SIGN.get(),
                ModBlocks.CRIMSON_CRYSTAL_PLANKS_WALL_SIGN.get()

        );
        event.modify(
                BlockEntityType.HANGING_SIGN,
                ModBlocks.ICE_LARCH_PLANKS_CEILING_HANGING_SIGN.get(),
                ModBlocks.ICE_LARCH_PLANKS_WALL_HANGING_SIGN.get(),
                ModBlocks.KEUTI_PLANKS_CEILING_HANGING_SIGN.get(),
                ModBlocks.KEUTI_PLANKS_WALL_HANGING_SIGN.get(),
                ModBlocks.CRIMSON_CRYSTAL_PLANKS_CEILING_HANGING_SIGN.get(),
                ModBlocks.CRIMSON_CRYSTAL_PLANKS_WALL_HANGING_SIGN.get()
        );
    }
}
