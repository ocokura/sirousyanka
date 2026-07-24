package net.ocoserver.init;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.ocoserver.common.block.ModBlocks;
import net.ocoserver.common.block.fluid.ModFluidTypes;
import net.ocoserver.common.block.fluid.ModFluids;
import net.ocoserver.common.item.CreativeModeTabs;
import net.ocoserver.common.item.ModItems;

@Mod(Sirousyanka.MODID)
public class Sirousyanka {

    public static final String MODID = "sirousyanka";

    public Sirousyanka(IEventBus eventBus, ModContainer container) {
        System.out.println("[SIR] starting setup mod");
        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        CreativeModeTabs.register(eventBus);
        ModFluids.register(eventBus);
        ModFluidTypes.register(eventBus);
    }
}
