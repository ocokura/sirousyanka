package net.ocoserver.common.init.world;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.synth.NormalNoise;
import net.ocoserver.common.util.ModUtils;

public class ModNoiseParameters {

    public static final ResourceKey<NormalNoise.NoiseParameters> FROZEN_ABYSS_BASE_NOISE = ModUtils.getResourceKey(Registries.NOISE, "frozen_abyss_base_noise");
    public static final ResourceKey<NormalNoise.NoiseParameters> FROZEN_ABYSS_MOUNTAIN_NOISE = ModUtils.getResourceKey(Registries.NOISE, "frozen_abyss_mountain_noise");
    public static final ResourceKey<NormalNoise.NoiseParameters> FROZEN_ABYSS_PEAK_NOISE = ModUtils.getResourceKey(Registries.NOISE, "frozen_abyss_peak_noise");
    public static final ResourceKey<NormalNoise.NoiseParameters> FROZEN_ABYSS_SMALL_NOISE = ModUtils.getResourceKey(Registries.NOISE, "frozen_abyss_small_noise");

    public static void bootstrap(BootstrapContext<NormalNoise.NoiseParameters> context) {
        context.register(FROZEN_ABYSS_BASE_NOISE, new NormalNoise.NoiseParameters(-5, 2, 0.5));
        context.register(FROZEN_ABYSS_MOUNTAIN_NOISE, new NormalNoise.NoiseParameters(-6, 2));
        context.register(FROZEN_ABYSS_PEAK_NOISE, new NormalNoise.NoiseParameters(-4, 2));
        context.register(FROZEN_ABYSS_SMALL_NOISE, new NormalNoise.NoiseParameters(-3, 1));
    }
}
