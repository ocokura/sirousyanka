package net.ocoserver.main;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.ocoserver.items.CreativeModeTabs;
import net.ocoserver.items.ModItems;

@Mod(Sirousyanka.MODID)
public class Sirousyanka {

    public static final String MODID = "sirousyanka";

    public Sirousyanka(IEventBus eventBus, ModContainer container) {
        ModItems.register(eventBus);
        CreativeModeTabs.register(eventBus);
    }

}
