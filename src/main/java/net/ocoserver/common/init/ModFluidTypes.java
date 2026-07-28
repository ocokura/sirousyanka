package net.ocoserver.common.init;

import net.minecraft.sounds.SoundEvents;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.SoundActions;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.ocoserver.Sirousyanka;

public class ModFluidTypes {

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(NeoForgeRegistries.Keys.FLUID_TYPES, Sirousyanka.MODID);

    public static final DeferredHolder<FluidType, FluidType> HEATED_LAVA_TYPE = FLUID_TYPES.register("heated_lava",
            () -> new FluidType(FluidType.Properties.create().density(2800).viscosity(3000).temperature(2500).sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA)));

    public static final DeferredHolder<FluidType, FluidType> LIQUID_NITROGEN_TYPE = FLUID_TYPES.register("liquid_nitrogen",
            () -> new FluidType(FluidType.Properties.create().density(800).viscosity(100).temperature(50).sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                    .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)));

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}
