package net.ocoserver.common.worldgen;

import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.ocoserver.common.worldgen.object.ObjectConfigure;
import net.ocoserver.common.worldgen.ore.OreConfigure;
import net.ocoserver.common.worldgen.tree.TreeConfigure;

public class ModConfigure {

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context ) {
        TreeConfigure.bootstrap(context);
        OreConfigure.bootstrap(context);
        ObjectConfigure.bootstrap(context);
    }

}
