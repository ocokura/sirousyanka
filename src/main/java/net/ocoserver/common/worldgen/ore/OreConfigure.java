package net.ocoserver.common.worldgen.ore;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.ocoserver.common.init.ModBlocks;
import net.ocoserver.common.util.ModUtils;
import net.ocoserver.common.util.WorldGenUtils;

import java.util.List;

public class OreConfigure {

    public static final ResourceKey<ConfiguredFeature<?, ?>> USYALIUM_ORE_KEY = ModUtils.getResourceKey(Registries.CONFIGURED_FEATURE, "usyalium_ore");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context ) {
        //USYALIUM ORE
        RuleTest stonePlaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslatePlaceable = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        List<OreConfiguration.TargetBlockState> overworldUsyaliumOres = List.of(
                OreConfiguration.target(stonePlaceable, ModBlocks.USYALIUM_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslatePlaceable, ModBlocks.DEEPSLATE_USYALIUM_ORE_BLOCK.get().defaultBlockState())
        );
        WorldGenUtils.registerConfiguredFeature(context, USYALIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldUsyaliumOres, 4));
    }

}
