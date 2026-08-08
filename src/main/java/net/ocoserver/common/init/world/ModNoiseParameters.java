package net.ocoserver.common.init.world;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.synth.NormalNoise;
import net.ocoserver.common.util.ModUtils;

public class ModNoiseParameters {

    public static final ResourceKey<NormalNoise.NoiseParameters> BASE_NOISE = ModUtils.getResourceKey(Registries.NOISE, "base_noise");
    public static final ResourceKey<NormalNoise.NoiseParameters> SMALL_NOISE = ModUtils.getResourceKey(Registries.NOISE, "small_noise");

    public static final ResourceKey<NormalNoise.NoiseParameters> BASE_MOUNTAIN_NOISE = ModUtils.getResourceKey(Registries.NOISE, "base_mountain_noise");

    public static final ResourceKey<NormalNoise.NoiseParameters> BASE_PEAK_NOISE = ModUtils.getResourceKey(Registries.NOISE, "base_peak_noise");
    public static final ResourceKey<NormalNoise.NoiseParameters> SMALL_PEAK_NOISE = ModUtils.getResourceKey(Registries.NOISE, "small_peak_noise");


    public static void bootstrap(BootstrapContext<NormalNoise.NoiseParameters> context) {
        context.register(BASE_NOISE, new NormalNoise.NoiseParameters(-5, 2, 0.5));
        context.register(SMALL_NOISE, new NormalNoise.NoiseParameters(-3, 1));

        context.register(BASE_MOUNTAIN_NOISE, new NormalNoise.NoiseParameters(-8, 3));

        context.register(BASE_PEAK_NOISE, new NormalNoise.NoiseParameters(-7, 1));
        context.register(SMALL_PEAK_NOISE, new NormalNoise.NoiseParameters(-3, 1));
    }
}
