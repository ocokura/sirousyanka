package net.ocoserver.common.init.fluid;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.ocoserver.common.fluid.HeatedLava;
import net.ocoserver.common.fluid.LiquidNitrogen;
import net.ocoserver.Sirousyanka;
import net.ocoserver.common.init.item.ModItems;
import net.ocoserver.common.init.block.ModBlocks;

public class ModFluids {

    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(Registries.FLUID, Sirousyanka.MODID);

    //高温の溶岩
    public static final DeferredHolder<Fluid, FlowingFluid> HEATED_LAVA = FLUIDS.register("heated_lava", HeatedLava.Source::new);

    public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_HEATED_LAVA = FLUIDS.register("flowing_heated_lava", HeatedLava.Flowing::new);

    public static final BaseFlowingFluid.Properties HEATED_LAVA_PROPERTIES = new BaseFlowingFluid.Properties(ModFluidTypes.HEATED_LAVA_TYPE,
            HEATED_LAVA, FLOWING_HEATED_LAVA).block(ModBlocks.HEATED_LAVA_BLOCK).bucket(ModItems.HEATED_LAVA_BUCKET);

    //液体窒素
    public static final DeferredHolder<Fluid, FlowingFluid> LIQUID_NITROGEN = FLUIDS.register("liquid_nitrogen", LiquidNitrogen.Source::new);

    public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_LIQUID_NITROGEN = FLUIDS.register("flowing_liquid_nitrogen", LiquidNitrogen.Flowing::new);

    public static final BaseFlowingFluid.Properties LIQUID_NITROGEN_PROPERTIES = new BaseFlowingFluid.Properties(ModFluidTypes.LIQUID_NITROGEN_TYPE,
            LIQUID_NITROGEN, FLOWING_LIQUID_NITROGEN).block(ModBlocks.LIQUID_NITROGEN_BLOCK).bucket(ModItems.LIQUID_NITROGEN_BUCKET);

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }

}
