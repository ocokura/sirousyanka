package net.ocoserver.common.worldgen.ore;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.ocoserver.common.util.ModUtils;
import net.ocoserver.common.util.WorldGenUtils;

public class ModOrePlacedFeatures {

    public static final ResourceKey<PlacedFeature> USYALIUM_ORE_PLACED_KEY = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "usyalium_ore_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);
        WorldGenUtils.registerPlacedFeature(context, USYALIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModOreConfiguredFeatures.OVERWORLD_USYALIUM_ORE_KEY),
            ModOrePlacementUtils.commonOrePlacement(2, HeightRangePlacement.triangle(VerticalAnchor.absolute(-54), VerticalAnchor.absolute(20))));
    }

}
