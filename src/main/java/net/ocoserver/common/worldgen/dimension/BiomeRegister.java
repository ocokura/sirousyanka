package net.ocoserver.common.worldgen.dimension;

import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.carver.ConfiguredWorldCarver;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.ocoserver.common.init.world.ModBiomes;

public class BiomeRegister {

    public static void bootstrapBiomes(BootstrapContext<Biome> context) {

        HolderGetter<ConfiguredWorldCarver<?>> carverGetter = context.lookup(Registries.CONFIGURED_CARVER);
        HolderGetter<PlacedFeature> placedFeatureGetter = context.lookup(Registries.PLACED_FEATURE);
        
        register(context, ModBiomes.FROZEN_SPRUCE_FOREST,
                FrozenAbyssBiomes.frozenSpruceForest(placedFeatureGetter, carverGetter));

        register(context, ModBiomes.FROZEN_MOUNTAIN,
                FrozenAbyssBiomes.frozenMountain(placedFeatureGetter, carverGetter));

        register(context, ModBiomes.ABYSS_ICE_SPIKES_FIELD,
                FrozenAbyssBiomes.abyssIceSpikesField(placedFeatureGetter, carverGetter));

        register(context, ModBiomes.FROZEN_PEAKS,
                FrozenAbyssBiomes.frozenPeaks(placedFeatureGetter, carverGetter));


        register(context, ModBiomes.ABYSS_VOLCANO_CRATER,
                FrozenAbyssBiomes.abyssVolcanoCrater(placedFeatureGetter, carverGetter));

        register(context, ModBiomes.ABYSS_VOLCANO,
                FrozenAbyssBiomes.abyssVolcano(placedFeatureGetter, carverGetter));

        register(context, ModBiomes.ABYSS_PLAIN,
                FrozenAbyssBiomes.abyssPlain(placedFeatureGetter, carverGetter));

        register(context, ModBiomes.ABYSS_PEAKS,
                FrozenAbyssBiomes.abyssPeaks(placedFeatureGetter, carverGetter));

        register(context, ModBiomes.SOLID_NITROGEN_MOUNTAIN,
                FrozenAbyssBiomes.solidNitrogenMountain(placedFeatureGetter, carverGetter));

        register(context, ModBiomes.SOLID_NITROGEN_PLAIN,
                FrozenAbyssBiomes.solidNitrogenPlain(placedFeatureGetter, carverGetter));

        register(context, ModBiomes.SOLID_NITROGEN_FOREST,
                FrozenAbyssBiomes.solidNitrogenForest(placedFeatureGetter, carverGetter));

        register(context, ModBiomes.ICE_LARCH_FOREST,
                FrozenAbyssBiomes.iceLarchForest(placedFeatureGetter, carverGetter));

        register(context, ModBiomes.ICE_LARCH_MOUNTAIN,
                FrozenAbyssBiomes.iceLarchMountain(placedFeatureGetter, carverGetter));

        register(context, ModBiomes.KEUTI_FOREST,
                FrozenAbyssBiomes.keutiForest(placedFeatureGetter, carverGetter));

        register(context, ModBiomes.KEUTI_MOUNTAIN,
                FrozenAbyssBiomes.keutiMountain(placedFeatureGetter, carverGetter));

        register(context, ModBiomes.CRIMSON_CRYSTAL_FOREST,
                FrozenAbyssBiomes.crimsonCrystalForest(placedFeatureGetter, carverGetter));

        register(context, ModBiomes.ICE_PLANE,
                FrozenAbyssBiomes.icePlane(placedFeatureGetter, carverGetter));

        register(context, ModBiomes.ICE_MOUNTAIN,
                FrozenAbyssBiomes.iceMountain(placedFeatureGetter, carverGetter));

        register(context, ModBiomes.ICE_PEAKS,
                FrozenAbyssBiomes.icePeaks(placedFeatureGetter, carverGetter));

        register(context, ModBiomes.ETERNAL_BLIZZARD,
                FrozenAbyssBiomes.eternalBlizzard(placedFeatureGetter, carverGetter));

        register(context, ModBiomes.ABYSS_RIFT,
                FrozenAbyssBiomes.abyssRift(placedFeatureGetter, carverGetter));

        register(context, ModBiomes.UNSTABLE_WETLAND,
                FrozenAbyssBiomes.unstableWetland(placedFeatureGetter, carverGetter));
    }

    private static void register(BootstrapContext<Biome> context, ResourceKey<Biome> key, Biome biome) {
        context.register(key, biome);
    }

}
