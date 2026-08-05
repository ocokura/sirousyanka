package net.ocoserver.common.init.world;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.ocoserver.Sirousyanka;
import net.ocoserver.common.worldgen.feature.AbyssIceSpikeFeature;

public class ModFeatures {

    public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(Registries.FEATURE, Sirousyanka.MODID);

    public static final DeferredHolder<Feature<?>, Feature<NoneFeatureConfiguration>> ABYSS_ICE_SPIKE = FEATURES.register("abyss_ice_spike_feature", () -> new AbyssIceSpikeFeature(NoneFeatureConfiguration.CODEC));

    public static void register(IEventBus eventBus) {
        FEATURES.register(eventBus);
    }

}
