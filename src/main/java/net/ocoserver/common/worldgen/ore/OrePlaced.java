package net.ocoserver.common.worldgen.ore;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.ocoserver.common.util.ModUtils;
import net.ocoserver.common.util.WorldGenUtils;

import java.util.List;

public class OrePlaced {

    public static final ResourceKey<PlacedFeature> USYALIUM_ORE_OVERWORLD_PLACED = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "usyalium_ore_overworld_placed");
    public static final ResourceKey<PlacedFeature> USYALIUM_ORE_FROZEN_ABYSS_PLACED = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "usyalium_ore_frozen_abyss_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);
        WorldGenUtils.registerPlacedFeature(context, USYALIUM_ORE_OVERWORLD_PLACED, configuredFeatures.getOrThrow(OreConfigure.USYALIUM_ORE_KEY),
            commonOrePlacement(2, HeightRangePlacement.triangle(VerticalAnchor.absolute(-54), VerticalAnchor.absolute(20))));
        WorldGenUtils.registerPlacedFeature(context, USYALIUM_ORE_FROZEN_ABYSS_PLACED, configuredFeatures.getOrThrow(OreConfigure.USYALIUM_ORE_KEY),
                commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.absolute(-54), VerticalAnchor.absolute(40))));
    }

    public static List<PlacementModifier> commonOrePlacement(int count, PlacementModifier heightRange) {
        return orePlacement(CountPlacement.of(count), heightRange);
    }

    private static List<PlacementModifier> orePlacement(PlacementModifier countPlacement, PlacementModifier heightRange) {
        return List.of(countPlacement, InSquarePlacement.spread(), heightRange, BiomeFilter.biome());
    }

}
