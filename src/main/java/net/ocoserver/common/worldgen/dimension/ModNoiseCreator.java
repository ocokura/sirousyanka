package net.ocoserver.common.worldgen.dimension;

import net.minecraft.core.HolderGetter;
import net.minecraft.world.level.levelgen.DensityFunction;
import net.minecraft.world.level.levelgen.DensityFunctions;
import net.minecraft.world.level.levelgen.synth.NormalNoise;
import net.ocoserver.common.init.world.ModNoiseParameters;

public class ModNoiseCreator {

    private final HolderGetter<NormalNoise.NoiseParameters> noises;
    private final DensityFunction shiftX;
    private final DensityFunction shiftZ;

    private final DensityFunction temperatureNoise;
    private final DensityFunction erosionNoise;


    public ModNoiseCreator(HolderGetter<NormalNoise.NoiseParameters> noises, DensityFunction shiftX, DensityFunction shiftZ, DensityFunction temperatureNoise, DensityFunction erosionNoise) {
        this.noises = noises;
        this.shiftX = shiftX;
        this.shiftZ = shiftZ;

        this.temperatureNoise = temperatureNoise;
        this.erosionNoise = erosionNoise;
    }

    //地形生成本体のメソッド
    public DensityFunction frozenAbyssTerrain() {

        //平原
        DensityFunction baseNoise = DensityFunctions.noise(noises.getOrThrow(ModNoiseParameters.BASE_NOISE));
        DensityFunction smallNoise = DensityFunctions.shiftedNoise2d(shiftX, shiftZ, 0.28, noises.getOrThrow(ModNoiseParameters.SMALL_NOISE));
        DensityFunction plainNoise = DensityFunctions.add(DensityFunctions.mul(baseNoise, DensityFunctions.constant(0.65)), DensityFunctions.mul(smallNoise, DensityFunctions.constant(0.35)));

        //山
        DensityFunction mountainMask = getMountainMask();

        //雪山
        DensityFunction peakMask = getPeakMask();

        //合成
        DensityFunction mountain = DensityFunctions.mul(mountainMask, DensityFunctions.constant(100));
        DensityFunction peak = DensityFunctions.mul(peakMask, DensityFunctions.constant(300));

        DensityFunction height = DensityFunctions.mul(plainNoise, DensityFunctions.constant(5));
        height = DensityFunctions.add(height, mountain);
        height = DensityFunctions.add(height, peak);

        return DensityFunctions.add(height, DensityFunctions.constant(60));
    }

    private DensityFunction getMountainMask() {
        DensityFunction mountainBaseNoise = DensityFunctions.shiftedNoise2d(shiftX, shiftZ, 0.2, noises.getOrThrow(ModNoiseParameters.BASE_MOUNTAIN_NOISE));
        mountainBaseNoise = DensityFunctions.cache2d(mountainBaseNoise);
        DensityFunction mountainSmallNoise = DensityFunctions.noise(noises.getOrThrow(ModNoiseParameters.BASE_MOUNTAIN_NOISE));
        DensityFunction mountainNoise = DensityFunctions.add(DensityFunctions.mul(mountainBaseNoise, DensityFunctions.constant(0.55)), DensityFunctions.mul(mountainSmallNoise, DensityFunctions.constant(0.45))).clamp(0, 1);
        mountainNoise = DensityFunctions.mul(mountainNoise, mountainNoise);

        DensityFunction erosion = DensityFunctions.mul(DensityFunctions.mul(erosionNoise, DensityFunctions.constant(-1)), DensityFunctions.constant(4)).clamp(0 ,1);
        return DensityFunctions.mul(erosion, mountainNoise);
    }

    private DensityFunction getPeakMask() {
        DensityFunction peakBaseNoise = DensityFunctions.shiftedNoise2d(shiftX, shiftZ, 0.14, noises.getOrThrow(ModNoiseParameters.BASE_PEAK_NOISE));
        peakBaseNoise = DensityFunctions.cache2d(peakBaseNoise);
        DensityFunction peakSmallNoise = DensityFunctions.noise(noises.getOrThrow(ModNoiseParameters.BASE_PEAK_NOISE));
        DensityFunction peakNoise = DensityFunctions.add(DensityFunctions.mul(peakBaseNoise, DensityFunctions.constant(0.7)), DensityFunctions.mul(peakSmallNoise, DensityFunctions.constant(0.3))).clamp(0, 1);
        peakNoise = DensityFunctions.mul(DensityFunctions.mul(peakNoise, peakNoise), DensityFunctions.constant(5));

        DensityFunction erosion = DensityFunctions.mul(erosionNoise, DensityFunctions.constant(-1)).clamp(0, 1);
        DensityFunction cold = DensityFunctions.mul(temperatureNoise, DensityFunctions.constant(-1)).clamp(0, 1);
        DensityFunction peakMask = DensityFunctions.mul(DensityFunctions.mul(erosion, cold), DensityFunctions.constant(2)).clamp(0, 1);
        return DensityFunctions.mul(peakMask, peakNoise);
    }
}
