package net.ocoserver.common.worldgen.tree;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.ocoserver.common.init.ModBlocks;
import net.ocoserver.common.util.ModUtils;
import net.ocoserver.common.util.WorldGenUtils;

public class ModTreePlacedFeatures {

    public static final ResourceKey<PlacedFeature> ICE_LARCH_TREE_PLACED = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "ice_larch_tree_placed");
    public static final ResourceKey<PlacedFeature> KEUTI_TREE_PLACED = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "keuti_tree_placed");
    public static final ResourceKey<PlacedFeature> CRIMSON_CRYSTAL_TREE_PLACED = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "crimson_crystal_tree_placed");
    public static final ResourceKey<PlacedFeature> FROZEN_SPRUCE_TREE_PLACED = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "frozen_spruce_tree_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        WorldGenUtils.registerPlacedFeature(context, ICE_LARCH_TREE_PLACED, configuredFeatures.getOrThrow(ModTreeConfiguredFeatures.ICE_LARCH_TREE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2), ModBlocks.ICE_LARCH_SAPLING.get()));
    }

}
