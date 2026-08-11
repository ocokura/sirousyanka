package net.ocoserver.common.worldgen.dimension;

import net.minecraft.core.HolderGetter;
import net.minecraft.world.level.levelgen.*;
import net.minecraft.world.level.levelgen.synth.NormalNoise;
import net.ocoserver.common.mixin.NoiseRouterAccessor;

public class ModNoiseRouter extends NoiseRouterData {

    public static NoiseRouter frozenAbyss(HolderGetter<DensityFunction> density, HolderGetter<NormalNoise.NoiseParameters> noise) {

        DensityFunction shiftX = new DensityFunctions.HolderHolder(density.getOrThrow(NoiseRouterAccessor.shiftX()));
        DensityFunction shiftZ = new DensityFunctions.HolderHolder(density.getOrThrow(NoiseRouterAccessor.shiftZ()));

        DensityFunction temperature = DensityFunctions.flatCache(DensityFunctions.shiftedNoise2d(shiftX, shiftZ, 0.2, noise.getOrThrow(Noises.TEMPERATURE)));
        DensityFunction vegetation = DensityFunctions.flatCache(DensityFunctions.shiftedNoise2d(shiftX, shiftZ, 0.2, noise.getOrThrow(Noises.VEGETATION)));
        DensityFunction continents = DensityFunctions.flatCache(DensityFunctions.shiftedNoise2d(shiftX, shiftZ, 0.2, noise.getOrThrow(Noises.CONTINENTALNESS)));

        DensityFunction height = ModNoiseCreator.frozenAbyssTerrain(noise, shiftX, shiftZ, temperature);
        DensityFunction y = DensityFunctions.yClampedGradient(-64, 320, -64, 320);
        DensityFunction finalDensity = DensityFunctions.add(height, DensityFunctions.mul(y, DensityFunctions.constant(-1)));
        DensityFunction erosion = DensityFunctions.mul(DensityFunctions.add(height, DensityFunctions.constant(-55)), DensityFunctions.constant(1f / 265));
        DensityFunction ridges = DensityFunctions.mul(erosion, DensityFunctions.constant(-1));

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
