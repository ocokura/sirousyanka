package net.ocoserver.common.worldgen.object;

import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.BlockStateConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.ocoserver.common.init.block.ModBlocks;
import net.ocoserver.common.init.world.ModFeatures;

public class ObjectConfigure {

    //基本となる草花の単品
    public static final ResourceKey<ConfiguredFeature<?, ?>> FROZEN_GRASS = FeatureUtils.createKey("frozen_grass");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FROZEN_POPPY = FeatureUtils.createKey("frozen_poppy");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BERRY_GRASS = FeatureUtils.createKey("berry_grass");
    public static final ResourceKey<ConfiguredFeature<?, ?>> IRIS_PETAL = FeatureUtils.createKey("iris_petal");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FROST_FLARE = FeatureUtils.createKey("frost_flare");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ABYSS_STONE_GRASS = FeatureUtils.createKey("abyss_stone_grass");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LIT_ABYSS_STONE_GRASS = FeatureUtils.createKey("lit_abyss_stone_grass");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ICE_BUSH = FeatureUtils.createKey("ice_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CRIMSON_GRASS = FeatureUtils.createKey("crimson_grass");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ABYSS_GRASS = FeatureUtils.createKey("abyss_grass");
    public static final ResourceKey<ConfiguredFeature<?, ?>> COSMOS = FeatureUtils.createKey("cosmos");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SPIKE_ICER = FeatureUtils.createKey("spike_icer");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLOWER = FeatureUtils.createKey("blower");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_AZUSAI = FeatureUtils.createKey("pink_azusai");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLUE_AZUSAI = FeatureUtils.createKey("blue_azusai");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PURPLE_AZUSAI = FeatureUtils.createKey("purple_azusai");

    //機能付き自然ブロック
    public static final ResourceKey<ConfiguredFeature<?, ?>> MINI_GEYSER = FeatureUtils.createKey("mini_geyser");

    //その他の自然オブジェクト
    public static final ResourceKey<ConfiguredFeature<?, ?>> ABYSS_ICE_SPIKE = FeatureUtils.createKey("abyss_ice_spike");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context ) {

        FeatureUtils.register(context, FROZEN_GRASS, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(ModBlocks.FROZEN_GRASS.get()), 32));
        FeatureUtils.register(context, ICE_BUSH, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(ModBlocks.ICE_BUSH.get()), 32));
        FeatureUtils.register(context, ABYSS_GRASS, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(ModBlocks.ABYSS_GRASS.get()), 32));
        FeatureUtils.register(context, CRIMSON_GRASS, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(ModBlocks.CRIMSON_GRASS.get()), 32));
        FeatureUtils.register(context, ABYSS_STONE_GRASS, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(ModBlocks.ABYSS_STONE_GRASS.get()), 32));
        FeatureUtils.register(context, LIT_ABYSS_STONE_GRASS, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(ModBlocks.LIT_ABYSS_STONE_GRASS.get()), 16));
        FeatureUtils.register(context, BERRY_GRASS, Feature.RANDOM_PATCH, grassPatch(BlockStateProvider.simple(ModBlocks.BERRY_GRASS.get()), 32));

        FeatureUtils.register(context, FROZEN_POPPY, Feature.RANDOM_PATCH,
                FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.FROZEN_POPPY.get()))));
        FeatureUtils.register(context, IRIS_PETAL, Feature.RANDOM_PATCH,
                FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.IRIS_PETAL.get()))));
        FeatureUtils.register(context, FROST_FLARE, Feature.RANDOM_PATCH,
                FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.FROST_FLARE.get()))));
        FeatureUtils.register(context, COSMOS, Feature.RANDOM_PATCH,
                FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.COSMOS.get()))));
        FeatureUtils.register(context, SPIKE_ICER, Feature.RANDOM_PATCH,
                FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.SPIKE_ICER.get()))));
        FeatureUtils.register(context, BLOWER, Feature.RANDOM_PATCH,
                FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.BLOWER.get()))));
        FeatureUtils.register(context, PINK_AZUSAI, Feature.FOREST_ROCK, new BlockStateConfiguration(ModBlocks.PINK_AZUSAI.get().defaultBlockState()));
        FeatureUtils.register(context, BLUE_AZUSAI, Feature.FOREST_ROCK, new BlockStateConfiguration(ModBlocks.BLUE_AZUSAI.get().defaultBlockState()));
        FeatureUtils.register(context, PURPLE_AZUSAI, Feature.FOREST_ROCK, new BlockStateConfiguration(ModBlocks.PURPLE_AZUSAI.get().defaultBlockState()));

        FeatureUtils.register(context, MINI_GEYSER, Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.MINI_GEYSER.get())));

        FeatureUtils.register(context, ABYSS_ICE_SPIKE, ModFeatures.ABYSS_ICE_SPIKE.get());
    }

    private static RandomPatchConfiguration grassPatch(BlockStateProvider stateProvider, int tries) {
        return FeatureUtils.simpleRandomPatchConfiguration(tries, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(stateProvider)));
    }


}
