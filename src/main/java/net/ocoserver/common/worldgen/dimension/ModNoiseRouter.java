package net.ocoserver.common.worldgen.dimension;

import net.minecraft.core.HolderGetter;
import net.minecraft.world.level.levelgen.*;
import net.minecraft.world.level.levelgen.synth.NormalNoise;
import net.ocoserver.common.mixin.NoiseRouterAccessor;

public class ModNoiseRouter extends NoiseRouterData {

    public static NoiseRouter frozenAbyss(HolderGetter<DensityFunction> density, HolderGetter<NormalNoise.NoiseParameters> noise) {

        DensityFunction shiftX = new DensityFunctions.HolderHolder(density.getOrThrow(NoiseRouterAccessor.shiftX()));
        DensityFunction shiftZ = new DensityFunctions.HolderHolder(density.getOrThrow(NoiseRouterAccessor.shiftZ()));

        ModNoiseCreator noiseCreator = new ModNoiseCreator(noise, shiftX, shiftZ);

        DensityFunction temperature = noiseCreator.frozenAbyssTemperature();
        DensityFunction vegetation = DensityFunctions.flatCache(DensityFunctions.shiftedNoise2d(shiftX, shiftZ, 0.2, noise.getOrThrow(Noises.VEGETATION)));
        DensityFunction continents = DensityFunctions.flatCache(DensityFunctions.shiftedNoise2d(shiftX, shiftZ, 0.2, noise.getOrThrow(Noises.CONTINENTALNESS)));
        DensityFunction erosion = noiseCreator.frozenAbyssErosion();
        DensityFunction ridges = DensityFunctions.flatCache(DensityFunctions.shiftedNoise2d(shiftX, shiftZ, 0.2, noise.getOrThrow(Noises.RIDGE)));

        DensityFunction height = noiseCreator.frozenAbyssTerrain();
        DensityFunction y = DensityFunctions.yClampedGradient(-64, 320, -64, 320);
        DensityFunction finalDensity = DensityFunctions.add(height, DensityFunctions.mul(y, DensityFunctions.constant(-1)));

        return new NoiseRouter(
                DensityFunctions.zero(),
                DensityFunctions.zero(),
                DensityFunctions.zero(),
                DensityFunctions.zero(),
                temperature,
                vegetation,
                continents,
                erosion,
                DensityFunctions.zero(),
                ridges,
                DensityFunctions.zero(),
                finalDensity,
                DensityFunctions.zero(),
                DensityFunctions.zero(),
                DensityFunctions.zero()
        );

    }

}
