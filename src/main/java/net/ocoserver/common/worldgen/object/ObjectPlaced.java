package net.ocoserver.common.worldgen.object;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.placement.*;
import net.ocoserver.common.util.ModUtils;

import java.util.List;

public class ObjectPlaced {

    //grass
    public static final ResourceKey<PlacedFeature> GRASS_PLAIN = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "grass_plain");
    public static final ResourceKey<PlacedFeature> GRASS_FOREST = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "grass_forest");
    public static final ResourceKey<PlacedFeature> GRASS_MOUNTAIN = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "grass_mountain");

    //frozen_grass
    public static final ResourceKey<PlacedFeature> FROZEN_GRASS_PLAIN = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "frozen_grass_plain");
    public static final ResourceKey<PlacedFeature> FROZEN_GRASS_FOREST = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "frozen_grass_forest");
    public static final ResourceKey<PlacedFeature> FROZEN_GRASS_MOUNTAIN = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "frozen_grass_mountain");

    //ice_bush
    public static final ResourceKey<PlacedFeature> ICE_BUSH_PLAIN = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "ice_bush_plain");

    //spike_icer
    public static final ResourceKey<PlacedFeature> SPIKE_ICER_PLAIN = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "spike_icer_plain");
    public static final ResourceKey<PlacedFeature> SPIKE_ICER_FOREST = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "spike_icer_forest");

    //geyser
    public static final ResourceKey<PlacedFeature> MINI_GEYSER_PLAIN = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "mini_geyser_plain");

    //その他の自然オブジェクト
    public static final ResourceKey<PlacedFeature> ABYSS_ICE_SPIKE = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "abyss_ice_spike");

    //blower
    public static final ResourceKey<PlacedFeature> BLOWER_PLAIN = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "blower_plain");
    public static final ResourceKey<PlacedFeature> BLOWER_FOREST = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "blower_forest");

    //cosmos
    public static final ResourceKey<PlacedFeature> COSMOS_IN_CRIMSON = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "cosmos_in_crimson");

    //azusai
    public static final ResourceKey<PlacedFeature> PINK_AZUSAI_IN_CRIMSON = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "pink_azusai_in_crimson");
    public static final ResourceKey<PlacedFeature> PURPLE_AZUSAI_IN_CRIMSON = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "purple_azusai_in_crimson");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var cf = context.lookup(Registries.CONFIGURED_FEATURE);

        PlacementUtils.register(context, GRASS_PLAIN, cf.getOrThrow(ObjectConfigure.GRASS), List.of(
                CountPlacement.of(20),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome()
        ));
        PlacementUtils.register(context, GRASS_FOREST, cf.getOrThrow(ObjectConfigure.GRASS), List.of(
                CountPlacement.of(6),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome()
        ));
        PlacementUtils.register(context, GRASS_MOUNTAIN, cf.getOrThrow(ObjectConfigure.GRASS), List.of(
                CountPlacement.of(3),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome()
        ));

        PlacementUtils.register(context, FROZEN_GRASS_PLAIN, cf.getOrThrow(ObjectConfigure.FROZEN_GRASS), List.of(
                CountPlacement.of(20),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome()
        ));
        PlacementUtils.register(context, FROZEN_GRASS_FOREST, cf.getOrThrow(ObjectConfigure.FROZEN_GRASS), List.of(
                CountPlacement.of(6),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome()
        ));
        PlacementUtils.register(context, FROZEN_GRASS_MOUNTAIN, cf.getOrThrow(ObjectConfigure.FROZEN_GRASS), List.of(
                CountPlacement.of(3),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome()
        ));

        PlacementUtils.register(context, ICE_BUSH_PLAIN, cf.getOrThrow(ObjectConfigure.ICE_BUSH), List.of(
                CountPlacement.of(2),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome()
        ));

        PlacementUtils.register(context, SPIKE_ICER_PLAIN, cf.getOrThrow(ObjectConfigure.SPIKE_ICER), List.of(
                CountPlacement.of(1),
                RarityFilter.onAverageOnceEvery(8),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome()
        ));
        PlacementUtils.register(context, SPIKE_ICER_FOREST, cf.getOrThrow(ObjectConfigure.SPIKE_ICER), List.of(
                CountPlacement.of(1),
                RarityFilter.onAverageOnceEvery(4),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome()
        ));


        PlacementUtils.register(context, BLOWER_PLAIN, cf.getOrThrow(ObjectConfigure.BLOWER), List.of(
                CountPlacement.of(2),
                RarityFilter.onAverageOnceEvery(5),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome()
        ));
        PlacementUtils.register(context, BLOWER_FOREST, cf.getOrThrow(ObjectConfigure.BLOWER), List.of(
                CountPlacement.of(4),
                RarityFilter.onAverageOnceEvery(3),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome()
        ));



        PlacementUtils.register(context, COSMOS_IN_CRIMSON, cf.getOrThrow(ObjectConfigure.COSMOS), List.of(
                CountPlacement.of(4),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome()
        ));
        PlacementUtils.register(context, PINK_AZUSAI_IN_CRIMSON, cf.getOrThrow(ObjectConfigure.PINK_AZUSAI), List.of(
                CountPlacement.of(2),
                RarityFilter.onAverageOnceEvery(2),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome()
        ));
        PlacementUtils.register(context, PURPLE_AZUSAI_IN_CRIMSON, cf.getOrThrow(ObjectConfigure.PURPLE_AZUSAI), List.of(
                CountPlacement.of(2),
                RarityFilter.onAverageOnceEvery(2),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome()
        ));


        PlacementUtils.register(context, ABYSS_ICE_SPIKE, cf.getOrThrow(ObjectConfigure.ABYSS_ICE_SPIKE), List.of(
                CountPlacement.of(4),
                RarityFilter.onAverageOnceEvery(5),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome()
        ));


    }
}
