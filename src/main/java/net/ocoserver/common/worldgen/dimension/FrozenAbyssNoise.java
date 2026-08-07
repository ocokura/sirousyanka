package net.ocoserver.common.worldgen.dimension;

import net.minecraft.core.HolderGetter;
import net.minecraft.world.level.levelgen.DensityFunction;
import net.minecraft.world.level.levelgen.DensityFunctions;
import net.minecraft.world.level.levelgen.synth.NormalNoise;
import net.ocoserver.common.init.world.ModNoiseParameters;
import net.ocoserver.common.mixin.NoiseRouterAccessor;

public class FrozenAbyssNoise {

    public static DensityFunction frozenAbyss2D(HolderGetter<NormalNoise.NoiseParameters> noises, HolderGetter<DensityFunction> density) {

        DensityFunction shiftX = new DensityFunctions.HolderHolder(density.getOrThrow(NoiseRouterAccessor.shiftX()));
        DensityFunction shiftZ = new DensityFunctions.HolderHolder(density.getOrThrow(NoiseRouterAccessor.shiftZ()));

        DensityFunction baseNoise = DensityFunctions.noise(noises.getOrThrow(ModNoiseParameters.FROZEN_ABYSS_BASE_NOISE));
        DensityFunction smallNoise = DensityFunctions.shiftedNoise2d(shiftX, shiftZ, 0.28, noises.getOrThrow(ModNoiseParameters.FROZEN_ABYSS_SMALL_NOISE));
        DensityFunction plainNoise = DensityFunctions.add(DensityFunctions.mul(baseNoise, DensityFunctions.constant(0.65)), DensityFunctions.mul(smallNoise, DensityFunctions.constant(0.35)));

        DensityFunction mountainBaseNoise = DensityFunctions.shiftedNoise2d(shiftX, shiftZ, 0.2, noises.getOrThrow(ModNoiseParameters.FROZEN_ABYSS_BASE_MOUNTAIN_NOISE));
        DensityFunction mountainSmallNoise = DensityFunctions.noise(noises.getOrThrow(ModNoiseParameters.FROZEN_ABYSS_BASE_MOUNTAIN_NOISE));

        DensityFunction mountainNoise = DensityFunctions.add(DensityFunctions.mul(mountainBaseNoise, DensityFunctions.constant(0.61)), DensityFunctions.mul(mountainSmallNoise, DensityFunctions.constant(0.39)));

        DensityFunction mountain = DensityFunctions.mul(DensityFunctions.add(mountainNoise, DensityFunctions.constant(-0.47)).clamp(0, 1), DensityFunctions.constant(50));

        DensityFunction height = DensityFunctions.mul(plainNoise, DensityFunctions.constant(5));
        height = DensityFunctions.add(height, mountain);

        return DensityFunctions.add(height, DensityFunctions.constant(60));
    }
}
