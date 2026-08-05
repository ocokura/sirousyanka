package net.ocoserver.common.worldgen;

import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.ocoserver.common.worldgen.object.ObjectPlaced;
import net.ocoserver.common.worldgen.ore.OrePlaced;
import net.ocoserver.common.worldgen.tree.TreePlaced;

public class ModPlaced {

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        OrePlaced.bootstrap(context);
        TreePlaced.bootstrap(context);
        ObjectPlaced.bootstrap(context);
    }

}
