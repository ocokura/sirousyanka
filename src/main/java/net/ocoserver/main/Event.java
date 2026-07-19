package net.ocoserver.main;

import net.minecraft.client.renderer.Sheets;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.event.BlockEntityTypeAddBlocksEvent;
import net.ocoserver.blocks.ModBlocks;
import net.ocoserver.blocks.ModWoodTypes;

@EventBusSubscriber(modid = Sirousyanka.MODID)
public class Event {

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
