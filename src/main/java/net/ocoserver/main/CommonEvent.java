package net.ocoserver.main;

import net.minecraft.data.DataProvider;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.ocoserver.Provider.Blocks.DecoBlockProvider;
import net.ocoserver.Provider.Blocks.OreBlockProvider;
import net.ocoserver.Provider.Blocks.StoneBlockProvider;
import net.ocoserver.Provider.Blocks.WoodBlockProvider;
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
                event.includeServer(),
                (DataProvider.Factory<OreBlockProvider>) output -> new OreBlockProvider(output, event.getExistingFileHelper())
        );

        event.getGenerator().addProvider(
                event.includeServer(),
                (DataProvider.Factory<StoneBlockProvider>) output -> new StoneBlockProvider(output, event.getExistingFileHelper())
        );

        event.getGenerator().addProvider(
                event.includeServer(),
                (DataProvider.Factory<WoodBlockProvider>) output -> new WoodBlockProvider(output, event.getExistingFileHelper())
        );

        event.getGenerator().addProvider(
                event.includeServer(),
                (DataProvider.Factory<DecoBlockProvider>) output -> new DecoBlockProvider(output, event.getExistingFileHelper())
        );
    }

    @SubscribeEvent
    public static void FMLCommonSetupEvent(FMLCommonSetupEvent event) {
        ModPortal.createPortal();
    }
}
