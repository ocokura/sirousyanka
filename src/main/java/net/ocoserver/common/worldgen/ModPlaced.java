package net.ocoserver.common.worldgen;

import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.ocoserver.common.worldgen.ore.OrePlaced;

public class ModPlaced {

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        OrePlaced.bootstrap(context);
    }

}
