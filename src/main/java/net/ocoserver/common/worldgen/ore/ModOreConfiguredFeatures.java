package net.ocoserver.common.worldgen.ore;

import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.ocoserver.common.block.ModBlocks;
import net.ocoserver.common.worldgen.ModFeatureUtils;

import java.util.List;

public class ModOreConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_USYALIUM_ORE_KEY = ModFeatureUtils.registerConfiguredFeatureKey("overworld_usyalium_ore");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context ) {

        //USYALIUM ORE
        RuleTest stonePlaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslatePlaceable = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        List<OreConfiguration.TargetBlockState> overworldUsyaliumOres = List.of(
                OreConfiguration.target(stonePlaceable, ModBlocks.USYALIUM_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslatePlaceable, ModBlocks.DEEPSLATE_USYALIUM_ORE_BLOCK.get().defaultBlockState())
        );
        ModFeatureUtils.registerConfiguredFeature(context, OVERWORLD_USYALIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldUsyaliumOres, 4));
    }

}
