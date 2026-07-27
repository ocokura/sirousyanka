package net.ocoserver.common.worldgen;

import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.ocoserver.common.worldgen.ore.ModOreConfiguredFeatures;
import net.ocoserver.common.worldgen.tree.ModTreeConfiguredFeatures;

public class ModConfiguredFeatures {

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context ) {
        ModTreeConfiguredFeatures.bootstrap(context);
        ModOreConfiguredFeatures.bootstrap(context);
    }

}
