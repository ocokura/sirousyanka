package net.ocoserver.common.worldgen;

import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.ocoserver.common.worldgen.ore.ModOrePlacedFeatures;

public class ModPlacedFeatures {

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        ModOrePlacedFeatures.bootstrap(context);
    }

}
