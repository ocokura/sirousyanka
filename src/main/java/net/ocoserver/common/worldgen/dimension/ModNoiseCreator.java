package net.ocoserver.common.worldgen.dimension;

import net.minecraft.core.HolderGetter;
import net.minecraft.world.level.levelgen.DensityFunction;
import net.minecraft.world.level.levelgen.DensityFunctions;
import net.minecraft.world.level.levelgen.synth.NormalNoise;
import net.ocoserver.common.init.world.ModNoiseParameters;

public class ModNoiseCreator {

    //地形生成本体のメソッド
    public static DensityFunction frozenAbyssTerrain(HolderGetter<NormalNoise.NoiseParameters> noises, DensityFunction shiftX, DensityFunction shiftZ, DensityFunction temperatureNoise) {

        //平原
        DensityFunction baseNoise = DensityFunctions.noise(noises.getOrThrow(ModNoiseParameters.BASE_NOISE));
        DensityFunction smallNoise = DensityFunctions.shiftedNoise2d(shiftX, shiftZ, 0.28, noises.getOrThrow(ModNoiseParameters.SMALL_NOISE));
        DensityFunction plainNoise = DensityFunctions.add(DensityFunctions.mul(baseNoise, DensityFunctions.constant(0.65)), DensityFunctions.mul(smallNoise, DensityFunctions.constant(0.35)));

        //山
        DensityFunction base = DensityFunctions.shiftedNoise2d(shiftX, shiftZ, 0.2, noises.getOrThrow(ModNoiseParameters.BASE_MOUNTAIN_NOISE));
        DensityFunction small = DensityFunctions.noise(noises.getOrThrow(ModNoiseParameters.BASE_MOUNTAIN_NOISE));
        DensityFunction mountainBaseNoise = DensityFunctions.add(DensityFunctions.mul(base, DensityFunctions.constant(0.55)), DensityFunctions.mul(small, DensityFunctions.constant(0.45))).clamp(0, 1);
        DensityFunction mountainNoise = DensityFunctions.mul(mountainBaseNoise, mountainBaseNoise);

        //雪山
        DensityFunction peakMask = DensityFunctions.mul(DensityFunctions.add(temperatureNoise, DensityFunctions.constant(0.4)), DensityFunctions.constant(-5)).clamp(0, 1);
        DensityFunction peakNoise = DensityFunctions.mul(mountainBaseNoise, peakMask);

        //合成
        DensityFunction mountain = DensityFunctions.mul(mountainNoise, DensityFunctions.constant(100));
        DensityFunction peak = DensityFunctions.mul(peakNoise, DensityFunctions.constant(145));

        DensityFunction height = DensityFunctions.mul(plainNoise, DensityFunctions.constant(5));
        height = DensityFunctions.add(height, mountain);
        height = DensityFunctions.add(height, peak);

        return DensityFunctions.add(height, DensityFunctions.constant(60));
    }
}
