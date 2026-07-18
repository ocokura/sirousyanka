package net.ocoserver.main;

import net.minecraft.data.DataProvider;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.ocoserver.Provider.Blocks.*;
import net.ocoserver.Provider.Items.ItemProvider;
import net.ocoserver.Provider.LootTables.LootProvider;
import net.ocoserver.Provider.Tags.BlockTag;
import net.ocoserver.Provider.Tags.ItemTag;
import net.ocoserver.dimension.ModPortal;
import net.ocoserver.Provider.Recipes.ModRecipes;

@EventBusSubscriber(modid = Sirousyanka.MODID)
public class CommonEvent {

    //UseFulHud NullPointerException直す　Rendererにnullチェック追加

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

        event.getGenerator().addProvider(
                event.includeClient(),
                (DataProvider.Factory<ItemProvider>) output -> new ItemProvider(output, event.getExistingFileHelper())
        );

        event.getGenerator().addProvider(
                event.includeServer(),
                (DataProvider.Factory<LootProvider>) output -> new LootProvider(output, event.getLookupProvider()));

        BlockTag blockTagProvider = event.getGenerator().addProvider(
                event.includeServer(),
                (DataProvider.Factory<BlockTag>) output -> new BlockTag(output, event.getLookupProvider(), event.getExistingFileHelper())
        );

        event.getGenerator().addProvider(
                event.includeServer(),
                (DataProvider.Factory<ItemTag>) output -> new ItemTag(output, event.getLookupProvider(), blockTagProvider.contentsGetter(), event.getExistingFileHelper())
        );


    }

    @SubscribeEvent
    public static void FMLCommonSetupEvent(FMLCommonSetupEvent event) {
        ModPortal.createPortal();
    }
}
