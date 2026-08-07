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
        DensityFunction plainNoise = DensityFunctions.add(DensityFunctions.mul(baseNoise, DensityFunctions.constant(1.35)), DensityFunctions.mul(smallNoise, DensityFunctions.constant(0.65)));

        DensityFunction mountainNoise = DensityFunctions.noise(noises.getOrThrow(ModNoiseParameters.FROZEN_ABYSS_MOUNTAIN_NOISE));

        DensityFunction height = DensityFunctions.mul(plainNoise, DensityFunctions.constant(2));
        DensityFunction mountainHeight = DensityFunctions.mul(DensityFunctions.add(mountainNoise, DensityFunctions.constant(-0.06)).clamp(0, 1), DensityFunctions.constant(40));

        return DensityFunctions.add(height, DensityFunctions.constant(60));
    }
}
