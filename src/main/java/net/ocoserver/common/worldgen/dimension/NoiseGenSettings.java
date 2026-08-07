package net.ocoserver.common.worldgen.dimension;

import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.*;
import net.minecraft.world.level.levelgen.synth.NormalNoise;
import net.ocoserver.common.util.ModUtils;

import java.util.List;

public class NoiseGenSettings {

    public static final ResourceKey<NoiseGeneratorSettings> FROZEN_ABYSS_NOISE_SETTINGS = ModUtils.getResourceKey(Registries.NOISE_SETTINGS, "frozen_abyss_noise_settings");

    public static void bootstrap(BootstrapContext<NoiseGeneratorSettings> context) {
        HolderGetter<DensityFunction> densityFunctions = context.lookup(Registries.DENSITY_FUNCTION);
        HolderGetter<NormalNoise.NoiseParameters> noise = context.lookup(Registries.NOISE);
        context.register(FROZEN_ABYSS_NOISE_SETTINGS, createNoiseSettings(densityFunctions, noise));
    }

    private static NoiseGeneratorSettings createNoiseSettings(HolderGetter<DensityFunction> densityFunctions, HolderGetter<NormalNoise.NoiseParameters> noise) {
        return new NoiseGeneratorSettings(
                NoiseSettings.create(-64, 384, 1, 2),
                Blocks.STONE.defaultBlockState(),
                Blocks.AIR.defaultBlockState(),
                ModNoiseRouter.frozenAbyss(densityFunctions, noise),
                SurfaceRules.sequence(SurfaceRules.state(Blocks.STONE.defaultBlockState())),
                List.of(),
                0,
                false,
                false,
                false,
                false
        );
    }
}
