package net.ocoserver.common.init;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.ocoserver.Sirousyanka;
import net.ocoserver.common.init.block.SetFlammable;
import net.ocoserver.common.init.fluid.FluidExtension;
import net.ocoserver.common.init.world.ModPortal;

@EventBusSubscriber(modid = Sirousyanka.MODID)
public class SetupEvents {

    @SubscribeEvent
    public static void commonSetupEvent(FMLCommonSetupEvent event) {
        SetFlammable.setFlammable();

    }

    @SubscribeEvent
    public static void FMLCommonSetupEvent(FMLCommonSetupEvent event) {
        ModPortal.createPortal();
    }

    @SubscribeEvent
    public static void registerFluidClient(RegisterClientExtensionsEvent event) {
        FluidExtension.registerFluidClient(event);
    }

}
