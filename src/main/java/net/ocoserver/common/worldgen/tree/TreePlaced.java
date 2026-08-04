package net.ocoserver.common.worldgen.tree;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.placement.*;
import net.ocoserver.common.init.block.ModBlocks;
import net.ocoserver.common.util.ModUtils;

public class TreePlaced {

    //通常設置
    public static final ResourceKey<PlacedFeature> ICE_LARCH_TREE_PLAIN = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "ice_larch_tree_plain");
    public static final ResourceKey<PlacedFeature> KEUTI_TREE_PLAIN = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "keuti_tree_plain");
    public static final ResourceKey<PlacedFeature> CRIMSON_CRYSTAL_TREE_PLAIN = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "crimson_crystal_tree_plain");
    public static final ResourceKey<PlacedFeature> NITROWD_TREE_PLAIN = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "nitrowd_tree_plain");
    public static final ResourceKey<PlacedFeature> FROZEN_SPRUCE_TREE_PLAIN = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "frozen_spruce_tree_plain");

    //専用バイオームごとの設置
    public static final ResourceKey<PlacedFeature> ICE_LARCH_TREE_FOREST = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "ice_larch_tree_forest");
    public static final ResourceKey<PlacedFeature> KEUTI_TREE_FOREST = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "keuti_tree_forest");
    public static final ResourceKey<PlacedFeature> CRIMSON_CRYSTAL_TREE_FOREST = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "crimson_crystal_tree_forest");
    public static final ResourceKey<PlacedFeature> NITROWD_TREE_FOREST = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "nitrowd_tree_forest");
    public static final ResourceKey<PlacedFeature> FROZEN_SPRUCE_TREE_FOREST = ModUtils.getResourceKey(Registries.PLACED_FEATURE, "frozen_spruce_tree_forest");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var cf = context.lookup(Registries.CONFIGURED_FEATURE);

        PlacementUtils.register(context, ICE_LARCH_TREE_PLAIN, cf.getOrThrow(TreeConfigure.ICE_LARCH_TREE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1F, 1), ModBlocks.ICE_LARCH_SAPLING.get()));
        PlacementUtils.register(context, KEUTI_TREE_PLAIN, cf.getOrThrow(TreeConfigure.KEUTI_TREE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1F, 1), ModBlocks.KEUTI_SAPLING.get()));
        PlacementUtils.register(context, CRIMSON_CRYSTAL_TREE_PLAIN, cf.getOrThrow(TreeConfigure.CRIMSON_CRYSTAL_TREE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1F, 1), ModBlocks.CRIMSON_CRYSTAL_SAPLING.get()));
        PlacementUtils.register(context, NITROWD_TREE_PLAIN, cf.getOrThrow(TreeConfigure.NITROWD_TREE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1F, 1), ModBlocks.NITROWD_SAPLING.get()));
        PlacementUtils.register(context, FROZEN_SPRUCE_TREE_PLAIN, cf.getOrThrow(TreeConfigure.FROZEN_SPRUCE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1F, 1), Blocks.SPRUCE_SAPLING));

        PlacementUtils.register(context, ICE_LARCH_TREE_FOREST, cf.getOrThrow(TreeConfigure.ICE_LARCH_TREE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(10, 0.1F, 1)));
        PlacementUtils.register(context, KEUTI_TREE_FOREST, cf.getOrThrow(TreeConfigure.KEUTI_TREE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(10, 0.1F, 1)));
        PlacementUtils.register(context, CRIMSON_CRYSTAL_TREE_FOREST, cf.getOrThrow(TreeConfigure.CRIMSON_CRYSTAL_TREE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(10, 0.1F, 1)));
        PlacementUtils.register(context, NITROWD_TREE_FOREST, cf.getOrThrow(TreeConfigure.NITROWD_TREE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(10, 0.1F, 1)));
        PlacementUtils.register(context, FROZEN_SPRUCE_TREE_FOREST, cf.getOrThrow(TreeConfigure.FROZEN_SPRUCE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(10, 0.1F, 1)));
    }
}
