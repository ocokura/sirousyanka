package net.ocoserver.main;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.ocoserver.blocks.wood.ModFlammable;

@EventBusSubscriber(modid = Sirousyanka.MODID)
public class SetupEvent {

    @SubscribeEvent
    public static void commonSetupEvent(FMLCommonSetupEvent event) {
        ModFlammable.setFlammable();

    }

}
