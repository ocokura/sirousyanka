package net.ocoserver.common.worldgen.dimension;

import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.*;
import net.minecraft.world.level.levelgen.placement.CaveSurface;
import net.minecraft.world.level.levelgen.synth.NormalNoise;
import net.ocoserver.common.init.block.ModBlocks;
import net.ocoserver.common.init.world.ModBiomes;
import net.ocoserver.common.util.ModUtils;

import java.util.List;

public class NoiseGenSettings {

    public static final ResourceKey<NoiseGeneratorSettings> FROZEN_ABYSS_NOISE_SETTINGS = ModUtils.getResourceKey(Registries.NOISE_SETTINGS, "frozen_abyss_noise_settings");

    public static void bootstrap(BootstrapContext<NoiseGeneratorSettings> context) {
        HolderGetter<DensityFunction> densityFunctions = context.lookup(Registries.DENSITY_FUNCTION);
        HolderGetter<NormalNoise.NoiseParameters> noise = context.lookup(Registries.NOISE);
        context.register(FROZEN_ABYSS_NOISE_SETTINGS, createNoiseSettings(densityFunctions, noise));
    }

    private static SurfaceRules.RuleSource getSurface() {
        SurfaceRules.RuleSource rule = SurfaceRules.sequence(
                //fg
                SurfaceRules.ifTrue(SurfaceRules.isBiome(ModBiomes.FROZEN_SPRUCE_FOREST, ModBiomes.FROZEN_MOUNTAIN, ModBiomes.ICE_PLANE, ModBiomes.ICE_MOUNTAIN, ModBiomes.ETERNAL_BLIZZARD),
                        SurfaceRules.sequence(
                                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, SurfaceRules.state(ModBlocks.FROZEN_GRASS_BLOCK.get().defaultBlockState())),
                                SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(4, false, CaveSurface.FLOOR), SurfaceRules.state(Blocks.DIRT.defaultBlockState())))),
                //as
                SurfaceRules.ifTrue(SurfaceRules.isBiome(ModBiomes.ABYSS_VOLCANO, ModBiomes.ABYSS_VOLCANO_CRATER, ModBiomes.ABYSS_PEAKS, ModBiomes.ABYSS_RIFT),
                                SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(23, false, CaveSurface.FLOOR), SurfaceRules.state(ModBlocks.ABYSS_STONE.get().defaultBlockState()))),

                //fs
                SurfaceRules.ifTrue(SurfaceRules.isBiome(ModBiomes.ICE_PEAKS),
                                SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(23, false, CaveSurface.FLOOR), SurfaceRules.state(ModBlocks.FROZEN_STONE.get().defaultBlockState()))),

                //ns
                SurfaceRules.ifTrue(SurfaceRules.isBiome(ModBiomes.SOLID_NITROGEN_MOUNTAIN),
                        SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(23, false, CaveSurface.FLOOR), SurfaceRules.state(ModBlocks.SOLID_NITROGEN_BLOCK.get().defaultBlockState()))),

                //g
                SurfaceRules.sequence(
                        SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, SurfaceRules.state(Blocks.GRASS_BLOCK.defaultBlockState())),
                        SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(4, false, CaveSurface.FLOOR), SurfaceRules.state(Blocks.DIRT.defaultBlockState()))));
        return rule;
    }

    private static NoiseGeneratorSettings createNoiseSettings(HolderGetter<DensityFunction> densityFunctions, HolderGetter<NormalNoise.NoiseParameters> noise) {
        return new NoiseGeneratorSettings(
                NoiseSettings.create(-64, 384, 1, 2),
                Blocks.STONE.defaultBlockState(),
                Blocks.AIR.defaultBlockState(),
                ModNoiseRouter.frozenAbyss(densityFunctions, noise),
                getSurface(),
                List.of(),
                0,
                false,
                false,
                false,
                false
        );
    }
}
