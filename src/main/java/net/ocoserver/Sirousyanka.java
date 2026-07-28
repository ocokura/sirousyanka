package net.ocoserver;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.ocoserver.common.init.ModBlocks;
import net.ocoserver.common.init.ModFluidTypes;
import net.ocoserver.common.init.ModFluids;
import net.ocoserver.common.init.ModEffects;
import net.ocoserver.common.init.ModCreativeTabs;
import net.ocoserver.common.init.ModItems;

@Mod(Sirousyanka.MODID)
public class Sirousyanka {

    public static final String MODID = "sirousyanka";

    public Sirousyanka(IEventBus eventBus, ModContainer container) {
        System.out.println("[SIR] starting setup mod");
        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        ModCreativeTabs.register(eventBus);
        ModFluids.register(eventBus);
        ModFluidTypes.register(eventBus);
        ModEffects.register(eventBus);
    }
}
