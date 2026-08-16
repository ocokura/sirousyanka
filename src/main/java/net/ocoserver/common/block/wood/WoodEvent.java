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
import net.ocoserver.common.init.block.ModBlocks;
import net.ocoserver.Sirousyanka;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

@EventBusSubscriber(modid = Sirousyanka.MODID)
public class WoodEvent {

    private static final Map<Supplier<Block>, Supplier<Block>> STRIPPABLE = new HashMap<>();

    static {
        STRIPPABLE.put(ModBlocks.ICE_LARCH_LOG::get, ModBlocks.STRIPPED_ICE_LARCH_LOG::get);
        STRIPPABLE.put(ModBlocks.ICE_LARCH_WOOD::get, ModBlocks.STRIPPED_ICE_LARCH_WOOD::get);

        STRIPPABLE.put(ModBlocks.CLOWD_LOG::get, ModBlocks.STRIPPED_CLOWD_LOG::get);
        STRIPPABLE.put(ModBlocks.CLOWD_WOOD::get, ModBlocks.STRIPPED_CLOWD_WOOD::get);

        STRIPPABLE.put(ModBlocks.CRIMSON_CRYSTAL_LOG::get, ModBlocks.STRIPPED_CRIMSON_CRYSTAL_LOG::get);
        STRIPPABLE.put(ModBlocks.CRIMSON_CRYSTAL_WOOD::get, ModBlocks.STRIPPED_CRIMSON_CRYSTAL_WOOD::get);

        STRIPPABLE.put(ModBlocks.NITROWD_LOG::get, ModBlocks.STRIPPED_NITROWD_LOG::get);
        STRIPPABLE.put(ModBlocks.NITROWD_WOOD::get, ModBlocks.STRIPPED_NITROWD_WOOD::get);
    }

    @SubscribeEvent
    public static void onBlockToolModification(BlockEvent.BlockToolModificationEvent event) {
        if (!(event.getItemAbility() == ItemAbilities.AXE_STRIP)) {
            return;
        }
        BlockState originalState = event.getState();
        for (var entry : STRIPPABLE.entrySet()) {
            if (entry.getKey().get() != originalState.getBlock()) {
                continue;
            }
            event.setFinalState(entry.getValue().get().defaultBlockState().setValue(RotatedPillarBlock.AXIS, originalState.getValue(RotatedPillarBlock.AXIS)));
            return;
        }
    }

    @SubscribeEvent
    public static void blockEntityTypeAddBlockEvent(BlockEntityTypeAddBlocksEvent event) {
        event.modify(
                BlockEntityType.SIGN,
                ModBlocks.ICE_LARCH_SIGN.get(),
                ModBlocks.ICE_LARCH_WALL_SIGN.get(),
                ModBlocks.CLOWD_SIGN.get(),
                ModBlocks.CLOWD_WALL_SIGN.get(),
                ModBlocks.CRIMSON_CRYSTAL_SIGN.get(),
                ModBlocks.CRIMSON_CRYSTAL_WALL_SIGN.get(),
                ModBlocks.NITROWD_SIGN.get(),
                ModBlocks.NITROWD_WALL_SIGN.get()

        );
        event.modify(
                BlockEntityType.HANGING_SIGN,
                ModBlocks.ICE_LARCH_CEILING_HANGING_SIGN.get(),
                ModBlocks.ICE_LARCH_WALL_HANGING_SIGN.get(),
                ModBlocks.CLOWD_CEILING_HANGING_SIGN.get(),
                ModBlocks.CLOWD_WALL_HANGING_SIGN.get(),
                ModBlocks.CRIMSON_CRYSTAL_CEILING_HANGING_SIGN.get(),
                ModBlocks.CRIMSON_CRYSTAL_WALL_HANGING_SIGN.get(),
                ModBlocks.NITROWD_CEILING_HANGING_SIGN.get(),
                ModBlocks.NITROWD_WALL_HANGING_SIGN.get()
        );
    }
}
