package net.ocoserver.common.worldgen.tree;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.AcaciaFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.SpruceFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.ocoserver.common.init.block.ModBlocks;
import net.ocoserver.common.util.ModUtils;
import net.ocoserver.common.util.WorldGenUtils;

public class TreeConfigure {

    public static final ResourceKey<ConfiguredFeature<?, ?>> FROZEN_SPRUCE = ModUtils.getResourceKey(Registries.CONFIGURED_FEATURE, "frozen_spruce_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ICE_LARCH_TREE = ModUtils.getResourceKey(Registries.CONFIGURED_FEATURE, "ice_larch_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CLOWD_TREE = ModUtils.getResourceKey(Registries.CONFIGURED_FEATURE, "clowd_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CRIMSON_CRYSTAL_TREE = ModUtils.getResourceKey(Registries.CONFIGURED_FEATURE, "crimson_crystal_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NITROWD_TREE = ModUtils.getResourceKey(Registries.CONFIGURED_FEATURE, "nitrowd_tree");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context ) {

        //FROZEN SPRUCE
        WorldGenUtils.registerConfiguredFeature(context, FROZEN_SPRUCE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.FROZEN_SPRUCE_LOG.get()),
                new StraightTrunkPlacer(5, 2, 1),

                BlockStateProvider.simple(ModBlocks.FROZEN_SPRUCE_LEAVES.get()),
                new SpruceFoliagePlacer(UniformInt.of(2, 3), UniformInt.of(0, 2), UniformInt.of(1, 2)),

                new TwoLayersFeatureSize(2, 0, 2)).ignoreVines().build());

        //ICE LARCH TREE
        WorldGenUtils.registerConfiguredFeature(context, ICE_LARCH_TREE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.ICE_LARCH_LOG.get()),
                new StraightTrunkPlacer(8, 2, 2),

                BlockStateProvider.simple(ModBlocks.ICE_LARCH_LEAVES.get()),
                new SpruceFoliagePlacer(UniformInt.of(2, 3), ConstantInt.of(0), UniformInt.of(1, 2)),

                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());

        //CLOWD TREE
        WorldGenUtils.registerConfiguredFeature(context, CLOWD_TREE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CLOWD_LOG.get()),
                new StraightTrunkPlacer(5, 3, 2),

                BlockStateProvider.simple(ModBlocks.CLOWD_LEAVES.get()),
                new BlobFoliagePlacer(UniformInt.of(2, 3), ConstantInt.of(0), 3),

                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());

        //CRIMSON CRYSTAL TREE
        WorldGenUtils.registerConfiguredFeature(context, CRIMSON_CRYSTAL_TREE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CRIMSON_CRYSTAL_LOG.get()),
                new ForkingTrunkPlacer(6, 3, 2),

                BlockStateProvider.simple(ModBlocks.CRIMSON_CRYSTAL_LEAVES.get()),
                new BlobFoliagePlacer(UniformInt.of(2, 3), ConstantInt.of(3), 3),

                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());

        //NITROWD_TREE
        WorldGenUtils.registerConfiguredFeature(context, NITROWD_TREE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.NITROWD_LOG.get()),
                new ForkingTrunkPlacer(7, 3, 2),

                BlockStateProvider.simple(ModBlocks.NITROWD_LEAVES.get()),
                new AcaciaFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0)),

                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
    }
}
