package net.ocoserver.common.worldgen.dimension;

import com.mojang.datafixers.util.Pair;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.MultiNoiseBiomeSource;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.levelgen.*;
import net.ocoserver.common.init.world.ModBiomes;
import net.ocoserver.common.init.world.ModDimension;
import net.ocoserver.common.util.ModUtils;

import java.util.List;

public class LevelStems {

    public static final ResourceKey<LevelStem> FROZEN_ABYSS_STEM = ModUtils.getResourceKey(Registries.LEVEL_STEM, "frozen_abyss");

    public static void levelBootstrap(BootstrapContext<LevelStem> context) {
        HolderGetter<Biome> biomes = context.lookup(Registries.BIOME);
        HolderGetter<NoiseGeneratorSettings> noiseSettings = context.lookup(Registries.NOISE_SETTINGS);
        HolderGetter<DimensionType> dimensions = context.lookup(Registries.DIMENSION_TYPE);

        context.register(FROZEN_ABYSS_STEM, levelStem(biomes, noiseSettings, dimensions));
    }

    private static LevelStem levelStem(HolderGetter<Biome> biomes, HolderGetter<NoiseGeneratorSettings> noiseSettings, HolderGetter<DimensionType> dimensions) {
        NoiseBasedChunkGenerator chunkGenerator = new NoiseBasedChunkGenerator(MultiNoiseBiomeSource.createFromList(new Climate.ParameterList<>(List.of(

                Pair.of(Climate.parameters(0.55f, -0.3f, 0f, 0.037f, 0f, 0.037f, 0),
                        biomes.getOrThrow(ModBiomes.ABYSS_VOLCANO_CRATER)),

                Pair.of(Climate.parameters(0.6f, -0.27f, 0f, 0.132f, 0f, 0.132f, 0),
                        biomes.getOrThrow(ModBiomes.ABYSS_VOLCANO)),

                Pair.of(Climate.parameters(0.3f, 0.2f, 0f, 0.0455f, 0f, 0.0455f, 0),
                        biomes.getOrThrow(ModBiomes.ABYSS_PLAIN)),

                Pair.of(Climate.parameters(0.45f, -0.27f, 0f, 0.0455f, 0f, 0.0455f, 0),
                        biomes.getOrThrow(ModBiomes.ABYSS_RIFT)),

                Pair.of(Climate.parameters(0.35f, -0.15f, 0f, 0.0455f, 0f, 0.0455f, 0),
                        biomes.getOrThrow(ModBiomes.UNSTABLE_WETLAND)),

                Pair.of(Climate.parameters(0.1f, -0.45f, 0f, 0.4717f, 0f, 0.4717f, 0),
                        biomes.getOrThrow(ModBiomes.ABYSS_PEAKS)),

                Pair.of(Climate.parameters(-0.2f, 0.14f, 0f, 0.0455f, 0f, 0.0455f, 0),
                        biomes.getOrThrow(ModBiomes.ABYSS_ICE_SPIKES_FIELD)),

                Pair.of(Climate.parameters(0.0f, 0.27f, 0f, 0.0455f, 0f, 0.0455f, 0),
                        biomes.getOrThrow(ModBiomes.ICE_PLANE)),

                Pair.of(Climate.parameters(0.0f, 0.4f, 0f, 0.0455f, 0f, 0.0455f, 0),
                        biomes.getOrThrow(ModBiomes.ICE_LARCH_FOREST)),

                Pair.of(Climate.parameters(0.2f, 0.4f, 0f, 0.0455f, 0f, 0.0455f, 0),
                        biomes.getOrThrow(ModBiomes.CLOWD_FOREST)),

                Pair.of(Climate.parameters(0.2f, 0f, 0f, 0.1321f, 0f, 0.1321f, 0),
                        biomes.getOrThrow(ModBiomes.ICE_MOUNTAIN)),

                Pair.of(Climate.parameters(0.0f, 0.16f, 0f, 0.1321f, 0f, 0.1321f, 0),
                        biomes.getOrThrow(ModBiomes.ICE_LARCH_MOUNTAIN)),

                Pair.of(Climate.parameters(0.0f, 0.16f, 0f, 0.1321f, 0f, 0.1321f, 0),
                        biomes.getOrThrow(ModBiomes.CLOWD_MOUNTAIN)),

                Pair.of(Climate.parameters(0.1f, 0.3f, 0f, 0.0455f, 0f, 0.0455f, 0),
                        biomes.getOrThrow(ModBiomes.CRIMSON_CRYSTAL_FOREST)),

                Pair.of(Climate.parameters(-0.2f, -0.45f, 0f, 0.4712f, 0f, 0.4712f, 0),
                        biomes.getOrThrow(ModBiomes.ICE_PEAKS)),

                Pair.of(Climate.parameters(-0.2f, 0f, 0f, 0.1321f, 0f, 0.1321f, 0),
                        biomes.getOrThrow(ModBiomes.FROZEN_MOUNTAIN)),

                Pair.of(Climate.parameters(-0.2f, 0.4f, 0f, 0.0455f, 0f, 0.0455f, 0),
                        biomes.getOrThrow(ModBiomes.FROZEN_SPRUCE_FOREST)),

                Pair.of(Climate.parameters(-0.4f, -0.37f, 0f, 0.4717f, 0f, 0.4717f, 0),
                        biomes.getOrThrow(ModBiomes.FROZEN_PEAKS)),

                Pair.of(Climate.parameters(-0.4f, 0.23f, 0f, 0.0455f, 0, 0.0455f, 0),
                        biomes.getOrThrow(ModBiomes.SOLID_NITROGEN_PLAIN)),

                Pair.of(Climate.parameters(-0.4f, 0.4f, 0f, 0.0455f, 0f, 0.0455f, 0),
                        biomes.getOrThrow(ModBiomes.SOLID_NITROGEN_FOREST)),

                Pair.of(Climate.parameters(-0.4f, 0.04f, 0f, 0.1321f, 0f, 0.1321f, 0),
                        biomes.getOrThrow(ModBiomes.SOLID_NITROGEN_MOUNTAIN)),

                Pair.of(Climate.parameters(-0.55f, -0.2f, 0f, 0.0455f, 0f, 0.0455f, 0),
                        biomes.getOrThrow(ModBiomes.ETERNAL_BLIZZARD))


        ))), noiseSettings.getOrThrow(NoiseGenSettings.FROZEN_ABYSS_NOISE_SETTINGS));
        return new LevelStem(dimensions.getOrThrow(ModDimension.FROZEN_ABYSS_TYPE), chunkGenerator);
    }
}
