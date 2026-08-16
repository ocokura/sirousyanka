package net.ocoserver.common.worldgen.object;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.BlockStateConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.ocoserver.common.init.block.ModBlocks;
import net.ocoserver.common.init.world.ModFeatures;
import net.ocoserver.common.util.ModUtils;

public class ObjectConfigure {

    //基本となる草花の単品
    public static final ResourceKey<ConfiguredFeature<?, ?>> GRASS = ModUtils.getResourceKey(Registries.CONFIGURED_FEATURE, "grass");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FROZEN_GRASS = ModUtils.getResourceKey(Registries.CONFIGURED_FEATURE, "frozen_grass");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ICE_BUSH = ModUtils.getResourceKey(Registries.CONFIGURED_FEATURE, "ice_bush");

    public static final ResourceKey<ConfiguredFeature<?, ?>> BLOWER = ModUtils.getResourceKey(Registries.CONFIGURED_FEATURE, "blower");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SPIKE_ICER = ModUtils.getResourceKey(Registries.CONFIGURED_FEATURE, "spike_icer");
    public static final ResourceKey<ConfiguredFeature<?, ?>> COSMOS = ModUtils.getResourceKey(Registries.CONFIGURED_FEATURE, "cosmos");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_AZUSAI = ModUtils.getResourceKey(Registries.CONFIGURED_FEATURE, "pink_azusai");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLUE_AZUSAI = ModUtils.getResourceKey(Registries.CONFIGURED_FEATURE, "blue_azusai");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PURPLE_AZUSAI = ModUtils.getResourceKey(Registries.CONFIGURED_FEATURE, "purple_azusai");

    //機能付き自然ブロック
    public static final ResourceKey<ConfiguredFeature<?, ?>> MINI_GEYSER = ModUtils.getResourceKey(Registries.CONFIGURED_FEATURE, "mini_geyser");

    //その他の自然オブジェクト
    public static final ResourceKey<ConfiguredFeature<?, ?>> ABYSS_ICE_SPIKE = ModUtils.getResourceKey(Registries.CONFIGURED_FEATURE, "abyss_ice_spike");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context ) {

        FeatureUtils.register(context, GRASS, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(Blocks.SHORT_GRASS), 32));
        FeatureUtils.register(context, FROZEN_GRASS, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(ModBlocks.FROZEN_GRASS.get()), 32));
        FeatureUtils.register(context, ICE_BUSH, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(Blocks.SHORT_GRASS), 10));

        FeatureUtils.register(context, SPIKE_ICER, Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, simpleBlock(ModBlocks.SPIKE_ICER.get())));
        FeatureUtils.register(context, COSMOS, Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, simpleBlock(ModBlocks.COSMOS.get())));
        FeatureUtils.register(context, BLOWER, Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, simpleBlock(ModBlocks.BLOWER.get())));
        FeatureUtils.register(context, PINK_AZUSAI, Feature.FOREST_ROCK, new BlockStateConfiguration(ModBlocks.PINK_AZUSAI.get().defaultBlockState()));
        FeatureUtils.register(context, BLUE_AZUSAI, Feature.FOREST_ROCK, new BlockStateConfiguration(ModBlocks.BLUE_AZUSAI.get().defaultBlockState()));
        FeatureUtils.register(context, PURPLE_AZUSAI, Feature.FOREST_ROCK, new BlockStateConfiguration(ModBlocks.PURPLE_AZUSAI.get().defaultBlockState()));

        FeatureUtils.register(context, MINI_GEYSER, Feature.SIMPLE_BLOCK, simpleBlock(ModBlocks.MINI_GEYSER.get()));

        FeatureUtils.register(context, ABYSS_ICE_SPIKE, ModFeatures.ABYSS_ICE_SPIKE.get());
    }

    private static RandomPatchConfiguration grassPatch(BlockStateProvider stateProvider, int tries) {
        return FeatureUtils.simpleRandomPatchConfiguration(tries, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(stateProvider)));
    }

    private static SimpleBlockConfiguration simpleBlock(Block block) {
        return new SimpleBlockConfiguration(BlockStateProvider.simple(block));
    }


}
