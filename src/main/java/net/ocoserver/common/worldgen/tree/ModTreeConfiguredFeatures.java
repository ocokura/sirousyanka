package net.ocoserver.common.worldgen.tree;

import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;
import net.ocoserver.common.block.ModBlocks;
import net.ocoserver.common.worldgen.ModFeatureUtils;

public class ModTreeConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> ICE_LARCH_TREE_KEY = ModFeatureUtils.registerConfiguredFeatureKey("ice_larch_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> KEUTI_TREE_KEY = ModFeatureUtils.registerConfiguredFeatureKey("keuti_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CRIMSON_CRYSTAL_TREE_KEY = ModFeatureUtils.registerConfiguredFeatureKey("crimson_crystal_tree");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context ) {

        //FROZEN LARCH TREE
        ModFeatureUtils.registerConfiguredFeature(context, ICE_LARCH_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.ICE_LARCH_LOG.get()),
                new ForkingTrunkPlacer(4, 4, 3),

                BlockStateProvider.simple(ModBlocks.ICE_LARCH_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(3), 3),

                new TwoLayersFeatureSize(1, 0, 2)).build());

        //KEUTI TREE
        ModFeatureUtils.registerConfiguredFeature(context, KEUTI_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.KEUTI_LOG.get()),
                new ForkingTrunkPlacer(4, 4, 3),

                BlockStateProvider.simple(ModBlocks.KEUTI_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(3), 3),

                new TwoLayersFeatureSize(1, 0, 2)).build());

        //CRIMSON CRYSTAL TREE
        ModFeatureUtils.registerConfiguredFeature(context, CRIMSON_CRYSTAL_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CRIMSON_CRYSTAL_LOG.get()),
                new ForkingTrunkPlacer(4, 4, 3),

                BlockStateProvider.simple(ModBlocks.CRIMSON_CRYSTAL_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(3), 3),

                new TwoLayersFeatureSize(1, 0, 2)).build());
    }
}
