package net.ocoserver.common.worldgen.ore;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.ocoserver.Sirousyanka;

import java.util.List;

public class ModOrePlacedFeatures {

    public static final ResourceKey<PlacedFeature> USYALIUM_ORE_PLACED_KEY = registerKey("usyalium_ore_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);
        register(context, USYALIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModOreConfiguredFeatures.OVERWORLD_USYALIUM_ORE_KEY),
            ModOrePlacementUtils.commonOrePlacement(2, HeightRangePlacement.triangle(VerticalAnchor.absolute(-54), VerticalAnchor.absolute(20))));
    }




    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(Sirousyanka.MODID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
