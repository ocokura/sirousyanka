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

        //平原
        DensityFunction baseNoise = DensityFunctions.noise(noises.getOrThrow(ModNoiseParameters.BASE_NOISE));
        DensityFunction smallNoise = DensityFunctions.shiftedNoise2d(shiftX, shiftZ, 0.28, noises.getOrThrow(ModNoiseParameters.SMALL_NOISE));
        DensityFunction plainNoise = DensityFunctions.add(DensityFunctions.mul(baseNoise, DensityFunctions.constant(0.65)), DensityFunctions.mul(smallNoise, DensityFunctions.constant(0.35)));

        //山
        DensityFunction mountainBaseNoise = DensityFunctions.shiftedNoise2d(shiftX, shiftZ, 0.2, noises.getOrThrow(ModNoiseParameters.BASE_MOUNTAIN_NOISE));
        DensityFunction mountainSmallNoise = DensityFunctions.noise(noises.getOrThrow(ModNoiseParameters.BASE_MOUNTAIN_NOISE));
        DensityFunction mountainNoise = DensityFunctions.add(DensityFunctions.mul(mountainBaseNoise, DensityFunctions.constant(0.61)), DensityFunctions.mul(mountainSmallNoise, DensityFunctions.constant(0.39)));

        //雪山
        DensityFunction peakBaseNoise = DensityFunctions.shiftedNoise2d(shiftX, shiftZ, 0.2, noises.getOrThrow(ModNoiseParameters.BASE_PEAK_NOISE));
        DensityFunction peakSmallNoise = DensityFunctions.noise(noises.getOrThrow(ModNoiseParameters.SMALL_PEAK_NOISE));
        DensityFunction peakNoise = DensityFunctions.add(DensityFunctions.mul(peakBaseNoise, DensityFunctions.constant(0.9)), DensityFunctions.mul(peakSmallNoise, DensityFunctions.constant(0.1)));

        //合成
        DensityFunction mountain = DensityFunctions.mul(DensityFunctions.add(mountainNoise, DensityFunctions.constant(-0.27)).clamp(0, 1), DensityFunctions.constant(50));
        DensityFunction peak =
                DensityFunctions.mul(
                        DensityFunctions.mul(
                                DensityFunctions.add(
                                        mountainNoise,
                                        DensityFunctions.constant(-0.8)
                                ).clamp(0, 1),
                                peakNoise.clamp(0, 1)
                        ),
                        DensityFunctions.constant(200)
                );

        DensityFunction height = DensityFunctions.mul(plainNoise, DensityFunctions.constant(5));
        height = DensityFunctions.add(height, mountain);
        height = DensityFunctions.add(height, peak);

        return DensityFunctions.add(height, DensityFunctions.constant(60));
    }
}
