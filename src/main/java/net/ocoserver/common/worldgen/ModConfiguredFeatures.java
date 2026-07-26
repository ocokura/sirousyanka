package net.ocoserver.common.worldgen;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.ocoserver.Sirousyanka;
import net.ocoserver.common.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_USYALIUM_ORE_KEY = registerKey("overworld_usyalium_ore");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context ) {

        RuleTest stonePlaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslatePlaceable = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreConfiguration.TargetBlockState> overworldUsyaliumOres = List.of(
                OreConfiguration.target(stonePlaceable, ModBlocks.USYALIUM_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslatePlaceable, ModBlocks.DEEPSLATE_USYALIUM_ORE_BLOCK.get().defaultBlockState())
        );

        register(context, OVERWORLD_USYALIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldUsyaliumOres, 4));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(Sirousyanka.MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
