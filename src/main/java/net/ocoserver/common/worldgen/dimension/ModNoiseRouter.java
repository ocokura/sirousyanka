package net.ocoserver.common.worldgen.dimension;


import net.minecraft.core.HolderGetter;
import net.minecraft.world.level.levelgen.DensityFunction;
import net.minecraft.world.level.levelgen.NoiseRouter;
import net.minecraft.world.level.levelgen.NoiseRouterData;
import net.minecraft.world.level.levelgen.synth.NormalNoise;

public class ModNoiseRouter extends NoiseRouterData {

    public static NoiseRouter getData(HolderGetter<DensityFunction> densityFunctions, HolderGetter<NormalNoise.NoiseParameters> noise, boolean large, boolean amplified) {
        return overworld(densityFunctions, noise, large, amplified);
    }

}
