package net.ocoserver.items;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.ocoserver.main.Sirousyanka;


public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Sirousyanka.MODID);

    public static final DeferredItem<Item> USYALIUM_INGOT = ITEMS.registerSimpleItem("usyalium_ingot");
    public static final DeferredItem<Item> USYALIUM_NUGGET = ITEMS.registerSimpleItem("usyalium_nugget");
    public static final DeferredItem<Item> RAW_USYALIUM = ITEMS.registerSimpleItem("raw_usyalium");
    public static final DeferredItem<Item> ADVANCED_USYALIUM_INGOT = ITEMS.registerSimpleItem("advanced_usyalium_ingot");

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
