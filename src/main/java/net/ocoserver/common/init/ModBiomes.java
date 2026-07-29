package net.ocoserver.common.init;

import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.carver.ConfiguredWorldCarver;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.ocoserver.common.util.ModUtils;

public class ModBiomes {

    //凍った系
    public static final ResourceKey<Biome> FROZEN_SPRUCE_FOREST = ModUtils.getResourceKey(Registries.BIOME, "frozen_spruce_forest");
    public static final ResourceKey<Biome> FROZEN_MOUNTAIN = ModUtils.getResourceKey(Registries.BIOME, "frozen_mountain");

    //深淵系
    public static final ResourceKey<Biome> ABYSS_VOLCANO = ModUtils.getResourceKey(Registries.BIOME, "abyss_volcano");
    public static final ResourceKey<Biome> ABYSS_PLAIN = ModUtils.getResourceKey(Registries.BIOME, "abyss_plain");

    //液体窒素系
    public static final ResourceKey<Biome> SOLID_NITROGEN_MOUNTAIN = ModUtils.getResourceKey(Registries.BIOME, "solid_nitrogen_mountain");
    public static final ResourceKey<Biome> SOLID_NITROGEN_PLAIN = ModUtils.getResourceKey(Registries.BIOME, "solid_nitrogen_plain");
    public static final ResourceKey<Biome> SOLID_NITROGEN_FOREST = ModUtils.getResourceKey(Registries.BIOME, "solid_nitrogen_forest");

    //普通の
    public static final ResourceKey<Biome> ICE_LARCH_FOREST = ModUtils.getResourceKey(Registries.BIOME, "ice_larch_forest");
    public static final ResourceKey<Biome> KEUTI_FOREST = ModUtils.getResourceKey(Registries.BIOME, "keuti_forest");
    public static final ResourceKey<Biome> CRIMSON_CRYSTAL_FOREST = ModUtils.getResourceKey(Registries.BIOME, "crimson_crystal_forest");

    public static void bootstrapBiomes(BootstrapContext<Biome> context) {
        HolderGetter<ConfiguredWorldCarver<?>> carver = context.lookup(Registries.CONFIGURED_CARVER);
        HolderGetter<PlacedFeature> placedFeature = context.lookup(Registries.PLACED_FEATURE);

        
    }

}
