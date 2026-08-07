package net.ocoserver.common.worldgen.object;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.placement.*;
import net.ocoserver.common.util.ModUtils;

import java.util.List;

public class ObjectPlaced {

    // 基本となる草花　通常設置
    public static final ResourceKey<PlacedFeature> FROZEN_GRASS_PLAIN = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "frozen_grass_plain");
    public static final ResourceKey<PlacedFeature> FROZEN_POPPY_PLAIN = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "frozen_poppy_plain");
    public static final ResourceKey<PlacedFeature> BERRY_GRASS_PLAIN = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "berry_grass_plain");
    public static final ResourceKey<PlacedFeature> IRIS_PETAL_PLAIN = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "iris_petal_plain");
    public static final ResourceKey<PlacedFeature> FROST_FLARE_PLAIN = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "frost_flare_plain");
    public static final ResourceKey<PlacedFeature> ABYSS_STONE_GRASS_PLAIN = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "abyss_stone_grass_plain");
    public static final ResourceKey<PlacedFeature> LIT_ABYSS_STONE_GRASS_PLAIN = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "lit_abyss_stone_grass_plain");
    public static final ResourceKey<PlacedFeature> ICE_BUSH_PLAIN = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "ice_bush_plain");
    public static final ResourceKey<PlacedFeature> CRIMSON_GRASS_PLAIN = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "crimson_grass_plain");
    public static final ResourceKey<PlacedFeature> ABYSS_GRASS_PLAIN = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "abyss_grass_plain");
    public static final ResourceKey<PlacedFeature> COSMOS_PLAIN = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "cosmos_plain");
    public static final ResourceKey<PlacedFeature> SPIKE_ICER_PLAIN = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "spike_icer_plain");
    public static final ResourceKey<PlacedFeature> BLOWER_PLAIN = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "blower_plain");
    public static final ResourceKey<PlacedFeature> PINK_AZUSAI_PLAIN = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "pink_azusai_plain");
    public static final ResourceKey<PlacedFeature> BLUE_AZUSAI_PLAIN = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "blue_azusai_plain");
    public static final ResourceKey<PlacedFeature> PURPLE_AZUSAI_PLAIN = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "purple_azusai_plain");

    // 機能付き自然ブロック　通常設置
    public static final ResourceKey<PlacedFeature> MINI_GEYSER_PLAIN = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "mini_geyser_plain");

    //その他の自然オブジェクト
    public static final ResourceKey<PlacedFeature> ABYSS_ICE_SPIKE = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "abyss_ice_spike");

    //バイオームごとの特殊配置
    public static final ResourceKey<PlacedFeature> COSMOS_CRIMSON_BIOME = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "cosmos_placed");
    public static final ResourceKey<PlacedFeature> PINK_AZUSAI_CRIMSON_BIOME = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "pink_azusai_placed");
    public static final ResourceKey<PlacedFeature> PURPLE_AZUSAI_CRIMSON_BIOME = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "purple_azusai_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var cf = context.lookup(Registries.CONFIGURED_FEATURE);

        PlacementUtils.register(context, FROZEN_GRASS_PLAIN, cf.getOrThrow(ObjectConfigure.FROZEN_GRASS), List.of(
                CountPlacement.of(5),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                BiomeFilter.biome()
        ));
        PlacementUtils.register(context, ICE_BUSH_PLAIN, cf.getOrThrow(ObjectConfigure.ICE_BUSH), List.of(
                CountPlacement.of(5),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                BiomeFilter.biome()
        ));
        PlacementUtils.register(context, BERRY_GRASS_PLAIN, cf.getOrThrow(ObjectConfigure.BERRY_GRASS), List.of(
                CountPlacement.of(5),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                BiomeFilter.biome()
        ));
        PlacementUtils.register(context, ABYSS_GRASS_PLAIN, cf.getOrThrow(ObjectConfigure.ABYSS_GRASS), List.of(
                CountPlacement.of(5),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                BiomeFilter.biome()
        ));
        PlacementUtils.register(context, CRIMSON_GRASS_PLAIN, cf.getOrThrow(ObjectConfigure.CRIMSON_GRASS), List.of(
                CountPlacement.of(5),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                BiomeFilter.biome()
        ));
        PlacementUtils.register(context, ABYSS_STONE_GRASS_PLAIN, cf.getOrThrow(ObjectConfigure.ABYSS_STONE_GRASS), List.of(
                CountPlacement.of(5),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                BiomeFilter.biome()
        ));
        PlacementUtils.register(context, LIT_ABYSS_STONE_GRASS_PLAIN, cf.getOrThrow(ObjectConfigure.LIT_ABYSS_STONE_GRASS), List.of(
                CountPlacement.of(1),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                BiomeFilter.biome()
        ));

        PlacementUtils.register(context, FROZEN_POPPY_PLAIN, cf.getOrThrow(ObjectConfigure.FROZEN_POPPY), List.of(
                CountPlacement.of(2),
                RarityFilter.onAverageOnceEvery(2),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                BiomeFilter.biome()
        ));
        PlacementUtils.register(context, IRIS_PETAL_PLAIN, cf.getOrThrow(ObjectConfigure.IRIS_PETAL), List.of(
                CountPlacement.of(10),
                RarityFilter.onAverageOnceEvery(2),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                BiomeFilter.biome()
        ));
        PlacementUtils.register(context, FROST_FLARE_PLAIN, cf.getOrThrow(ObjectConfigure.FROST_FLARE), List.of(
                CountPlacement.of(10),
                RarityFilter.onAverageOnceEvery(2),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                BiomeFilter.biome()
        ));
        PlacementUtils.register(context, COSMOS_PLAIN, cf.getOrThrow(ObjectConfigure.COSMOS), List.of(
                CountPlacement.of(10),
                RarityFilter.onAverageOnceEvery(2),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                BiomeFilter.biome()
        ));
        PlacementUtils.register(context, COSMOS_CRIMSON_BIOME, cf.getOrThrow(ObjectConfigure.COSMOS), List.of(
                CountPlacement.of(30),
                RarityFilter.onAverageOnceEvery(2),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                BiomeFilter.biome()
        ));
        PlacementUtils.register(context, SPIKE_ICER_PLAIN, cf.getOrThrow(ObjectConfigure.SPIKE_ICER), List.of(
                CountPlacement.of(10),
                RarityFilter.onAverageOnceEvery(2),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                BiomeFilter.biome()
        ));
        PlacementUtils.register(context, BLOWER_PLAIN, cf.getOrThrow(ObjectConfigure.BLOWER), List.of(
                CountPlacement.of(10),
                RarityFilter.onAverageOnceEvery(2),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                BiomeFilter.biome()
        ));
        PlacementUtils.register(context, PINK_AZUSAI_PLAIN, cf.getOrThrow(ObjectConfigure.PINK_AZUSAI), List.of(
                CountPlacement.of(10),
                RarityFilter.onAverageOnceEvery(2),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                BiomeFilter.biome()
        ));
        PlacementUtils.register(context, PINK_AZUSAI_CRIMSON_BIOME, cf.getOrThrow(ObjectConfigure.PINK_AZUSAI), List.of(
                CountPlacement.of(30),
                RarityFilter.onAverageOnceEvery(2),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                BiomeFilter.biome()
        ));
        PlacementUtils.register(context, BLUE_AZUSAI_PLAIN, cf.getOrThrow(ObjectConfigure.BLUE_AZUSAI), List.of(
                CountPlacement.of(10),
                RarityFilter.onAverageOnceEvery(2),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                BiomeFilter.biome()
        ));
        PlacementUtils.register(context, PURPLE_AZUSAI_PLAIN, cf.getOrThrow(ObjectConfigure.PURPLE_AZUSAI), List.of(
                CountPlacement.of(10),
                RarityFilter.onAverageOnceEvery(2),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                BiomeFilter.biome()
        ));
        PlacementUtils.register(context, PURPLE_AZUSAI_CRIMSON_BIOME, cf.getOrThrow(ObjectConfigure.PINK_AZUSAI), List.of(
                CountPlacement.of(30),
                RarityFilter.onAverageOnceEvery(2),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                BiomeFilter.biome()
        ));

        PlacementUtils.register(context, MINI_GEYSER_PLAIN, cf.getOrThrow(ObjectConfigure.MINI_GEYSER), List.of(
                CountPlacement.of(20),
                RarityFilter.onAverageOnceEvery(2),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                BiomeFilter.biome()
        ));

        PlacementUtils.register(context, ABYSS_ICE_SPIKE, cf.getOrThrow(ObjectConfigure.ABYSS_ICE_SPIKE), List.of(
                CountPlacement.of(4),
                RarityFilter.onAverageOnceEvery(5),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                BiomeFilter.biome()
        ));
    }
}
