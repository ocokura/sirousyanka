package net.ocoserver.common.worldgen.object;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.ocoserver.common.init.ModBlocks;
import net.ocoserver.common.util.ModUtils;
import net.ocoserver.common.util.WorldGenUtils;

public class ObjectConfigure {

    public static final ResourceKey<ConfiguredFeature<?, ?>> FROZEN_GRASS = ModUtils.getResourceKey(Registries.CONFIGURED_FEATURE, "frozen_grass");


    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context ) {
        WorldGenUtils.registerConfiguredFeature(context, FROZEN_GRASS, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 7, 3,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.FROZEN_GRASS.get())),
                        BlockPredicate.ONLY_IN_AIR_PREDICATE
                )
            )
        );
    }


}
