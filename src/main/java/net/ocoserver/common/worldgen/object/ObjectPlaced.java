package net.ocoserver.common.worldgen.object;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ObjectPlaced {

    // 基本となる草花　通常設置
    public static final ResourceKey<PlacedFeature> FROZEN_GRASS_PLACED = PlacementUtils.createKey("frozen_grass_placed");
    public static final ResourceKey<PlacedFeature> FROZEN_POPPY_PLACED = PlacementUtils.createKey("frozen_poppy_placed");
    public static final ResourceKey<PlacedFeature> BERRY_GRASS_PLACED = PlacementUtils.createKey("berry_grass_placed");
    public static final ResourceKey<PlacedFeature> IRIS_PETAL_PLACED = PlacementUtils.createKey("iris_petal_placed");
    public static final ResourceKey<PlacedFeature> FROST_FLARE_PLACED = PlacementUtils.createKey("frost_flare_placed");
    public static final ResourceKey<PlacedFeature> ABYSS_STONE_GRASS_PLACED = PlacementUtils.createKey("abyss_stone_grass_placed");
    public static final ResourceKey<PlacedFeature> LIT_ABYSS_STONE_GRASS_PLACED = PlacementUtils.createKey("lit_abyss_stone_grass_placed");
    public static final ResourceKey<PlacedFeature> ICE_BUSH_PLACED = PlacementUtils.createKey("ice_bush_placed");
    public static final ResourceKey<PlacedFeature> CRIMSON_GRASS_PLACED = PlacementUtils.createKey("crimson_grass_placed");
    public static final ResourceKey<PlacedFeature> ABYSS_GRASS_PLACED = PlacementUtils.createKey("abyss_grass_placed");
    public static final ResourceKey<PlacedFeature> COSMOS_PLACED = PlacementUtils.createKey("cosmos_placed");
    public static final ResourceKey<PlacedFeature> SPIKE_ICER_PLACED = PlacementUtils.createKey("spike_icer_placed");
    public static final ResourceKey<PlacedFeature> BLOWER_PLACED = PlacementUtils.createKey("blower_placed");
    public static final ResourceKey<PlacedFeature> PINK_AZUSAI_PLACED = PlacementUtils.createKey("pink_azusai_placed");
    public static final ResourceKey<PlacedFeature> BLUE_AZUSAI_PLACED = PlacementUtils.createKey("blue_azusai_placed");
    public static final ResourceKey<PlacedFeature> PURPLE_AZUSAI_PLACED = PlacementUtils.createKey("purple_azusai_placed");

    // 機能付き自然ブロック　通常設置
    public static final ResourceKey<PlacedFeature> MINI_GEYSER_PLACED = PlacementUtils.createKey("mini_geyser_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var cf = context.lookup(Registries.CONFIGURED_FEATURE);

        PlacementUtils.register(context, FROZEN_GRASS_PLACED, cf.getOrThrow(ObjectConfigure.FROZEN_GRASS), List.of(
                CountPlacement.of(40),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                BiomeFilter.biome()
        ));
        PlacementUtils.register(context, ICE_BUSH_PLACED, cf.getOrThrow(ObjectConfigure.ICE_BUSH), List.of(
                CountPlacement.of(30),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                BiomeFilter.biome()
        ));
        PlacementUtils.register(context, BERRY_GRASS_PLACED, cf.getOrThrow(ObjectConfigure.BERRY_GRASS), List.of(
                CountPlacement.of(30),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                BiomeFilter.biome()
        ));
        PlacementUtils.register(context, ABYSS_GRASS_PLACED, cf.getOrThrow(ObjectConfigure.ABYSS_GRASS), List.of(
                CountPlacement.of(40),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                BiomeFilter.biome()
        ));
        PlacementUtils.register(context, CRIMSON_GRASS_PLACED, cf.getOrThrow(ObjectConfigure.CRIMSON_GRASS), List.of(
                CountPlacement.of(40),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                BiomeFilter.biome()
        ));
        PlacementUtils.register(context, ABYSS_STONE_GRASS_PLACED, cf.getOrThrow(ObjectConfigure.ABYSS_STONE_GRASS), List.of(
                CountPlacement.of(40),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                BiomeFilter.biome()
        ));
        PlacementUtils.register(context, LIT_ABYSS_STONE_GRASS_PLACED, cf.getOrThrow(ObjectConfigure.LIT_ABYSS_STONE_GRASS), List.of(
                CountPlacement.of(20),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                BiomeFilter.biome()
        ));

        PlacementUtils.register(context, FROZEN_POPPY_PLACED, cf.getOrThrow(ObjectConfigure.FROZEN_POPPY), List.of(
                CountPlacement.of(10),
                RarityFilter.onAverageOnceEvery(2),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                BiomeFilter.biome()
        ));
        PlacementUtils.register(context, IRIS_PETAL_PLACED, cf.getOrThrow(ObjectConfigure.IRIS_PETAL), List.of(
                CountPlacement.of(10),
                RarityFilter.onAverageOnceEvery(2),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                BiomeFilter.biome()
        ));
        PlacementUtils.register(context, FROST_FLARE_PLACED, cf.getOrThrow(ObjectConfigure.FROST_FLARE), List.of(
                CountPlacement.of(10),
                RarityFilter.onAverageOnceEvery(2),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                BiomeFilter.biome()
        ));
        PlacementUtils.register(context, COSMOS_PLACED, cf.getOrThrow(ObjectConfigure.COSMOS), List.of(
                CountPlacement.of(10),
                RarityFilter.onAverageOnceEvery(2),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                BiomeFilter.biome()
        ));
        PlacementUtils.register(context, SPIKE_ICER_PLACED, cf.getOrThrow(ObjectConfigure.SPIKE_ICER), List.of(
                CountPlacement.of(10),
                RarityFilter.onAverageOnceEvery(2),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                BiomeFilter.biome()
        ));
        PlacementUtils.register(context, BLOWER_PLACED, cf.getOrThrow(ObjectConfigure.BLOWER), List.of(
                CountPlacement.of(10),
                RarityFilter.onAverageOnceEvery(2),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                BiomeFilter.biome()
        ));
        PlacementUtils.register(context, PINK_AZUSAI_PLACED, cf.getOrThrow(ObjectConfigure.PINK_AZUSAI), List.of(
                CountPlacement.of(10),
                RarityFilter.onAverageOnceEvery(2),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                BiomeFilter.biome()
        ));
        PlacementUtils.register(context, BLUE_AZUSAI_PLACED, cf.getOrThrow(ObjectConfigure.BLUE_AZUSAI), List.of(
                CountPlacement.of(10),
                RarityFilter.onAverageOnceEvery(2),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                BiomeFilter.biome()
        ));
        PlacementUtils.register(context, PURPLE_AZUSAI_PLACED, cf.getOrThrow(ObjectConfigure.PURPLE_AZUSAI), List.of(
                CountPlacement.of(10),
                RarityFilter.onAverageOnceEvery(2),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                BiomeFilter.biome()
        ));

        PlacementUtils.register(context, MINI_GEYSER_PLACED, cf.getOrThrow(ObjectConfigure.MINI_GEYSER), List.of(
                CountPlacement.of(20),
                RarityFilter.onAverageOnceEvery(2),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                BiomeFilter.biome()
        ));
    }
}
