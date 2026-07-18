package net.ocoserver.main;

import net.minecraft.data.DataProvider;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.ocoserver.Provider.Blocks.*;
import net.ocoserver.dimension.ModPortal;
import net.ocoserver.Provider.ModRecipes;

@EventBusSubscriber(modid = Sirousyanka.MODID)
public class CommonEvent {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        event.getGenerator().addProvider(
                event.includeServer(),
                (DataProvider.Factory<ModRecipes>) output -> new ModRecipes(output, event.getLookupProvider())
        );

        event.getGenerator().addProvider(
                event.includeClient(),
                (DataProvider.Factory<BlockProvider>) output -> new BlockProvider(output, event.getExistingFileHelper())
        );
    }

    @SubscribeEvent
    public static void FMLCommonSetupEvent(FMLCommonSetupEvent event) {
        ModPortal.createPortal();
    }
}
