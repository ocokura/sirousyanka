package net.ocoserver.main;

import net.minecraft.data.DataProvider;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.ocoserver.recipe.ModRecipes;

@EventBusSubscriber(modid = Sirousyanka.MODID)
public class CommonEvent {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        event.getGenerator().addProvider(
                event.includeServer(),
                (DataProvider.Factory<ModRecipes>) output -> new ModRecipes(output, event.getLookupProvider())
        );
    }
}
