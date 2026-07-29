package net.ocoserver.common.init;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.ocoserver.Sirousyanka;

public class ModEffects {

    public static final DeferredRegister<MobEffect> EFFECTS = DeferredRegister.create(BuiltInRegistries.MOB_EFFECT, Sirousyanka.MODID);

    public static void register(IEventBus eventBus) {
        EFFECTS.register(eventBus);
    }

}
