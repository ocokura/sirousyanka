package net.ocoserver.common.worldgen.object;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.ocoserver.common.util.ModUtils;
import net.ocoserver.common.util.WorldGenUtils;

import java.util.List;

public class ObjectPlaced {

    public static final ResourceKey<PlacedFeature> FROZEN_GRASS_IN_FROZEN_SPRUCE_FOREST = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "frozen_grass_in_frozen_spruce_forest");
    public static final ResourceKey<PlacedFeature> FROZEN_GRASS_IN_FROZEN_MOUNTAIN = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "frozen_grass_in_frozen_mountain");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        WorldGenUtils.registerPlacedFeature(context, FROZEN_GRASS_IN_FROZEN_SPRUCE_FOREST, configuredFeatures.getOrThrow(ObjectConfigure.FROZEN_GRASS),
                List.of(CountPlacement.of(20), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE));
        WorldGenUtils.registerPlacedFeature(context, FROZEN_GRASS_IN_FROZEN_MOUNTAIN, configuredFeatures.getOrThrow(ObjectConfigure.FROZEN_GRASS),
                List.of(CountPlacement.of(5), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE));
    }
}
