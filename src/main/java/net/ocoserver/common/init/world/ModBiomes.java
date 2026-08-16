package net.ocoserver.common.init.world;

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
    public static final ResourceKey<Biome> FROZEN_SPRUCE_FOREST = ModUtils.getResourceKey(Registries.BIOME, "frozen_spruce_forest");//fg
    public static final ResourceKey<Biome> FROZEN_MOUNTAIN = ModUtils.getResourceKey(Registries.BIOME, "frozen_mountain");//fg
    public static final ResourceKey<Biome> ABYSS_ICE_SPIKES_FIELD = ModUtils.getResourceKey(Registries.BIOME, "abyss_ice_spikes_field");//g
    public static final ResourceKey<Biome> FROZEN_PEAKS = ModUtils.getResourceKey(Registries.BIOME, "frozen_peaks");//fs


    //深淵系
    public static final ResourceKey<Biome> ABYSS_VOLCANO_CRATER = ModUtils.getResourceKey(Registries.BIOME, "abyss_volcano_crater");//as
    public static final ResourceKey<Biome> ABYSS_VOLCANO = ModUtils.getResourceKey(Registries.BIOME, "abyss_volcano");//as
    public static final ResourceKey<Biome> ABYSS_PLAIN = ModUtils.getResourceKey(Registries.BIOME, "abyss_plain");//ag
    public static final ResourceKey<Biome> ABYSS_PEAKS = ModUtils.getResourceKey(Registries.BIOME, "abyss_peaks");//as


    //液体窒素系
    public static final ResourceKey<Biome> SOLID_NITROGEN_MOUNTAIN = ModUtils.getResourceKey(Registries.BIOME, "solid_nitrogen_mountain");//ns
    public static final ResourceKey<Biome> SOLID_NITROGEN_PLAIN = ModUtils.getResourceKey(Registries.BIOME, "solid_nitrogen_plain");//g
    public static final ResourceKey<Biome> SOLID_NITROGEN_FOREST = ModUtils.getResourceKey(Registries.BIOME, "solid_nitrogen_forest");//g


    //普通の
    public static final ResourceKey<Biome> ICE_LARCH_FOREST = ModUtils.getResourceKey(Registries.BIOME, "ice_larch_forest");//g
    public static final ResourceKey<Biome> ICE_LARCH_MOUNTAIN = ModUtils.getResourceKey(Registries.BIOME, "ice_larch_mountain");//g

    public static final ResourceKey<Biome> CLOWD_FOREST = ModUtils.getResourceKey(Registries.BIOME, "clowd_forest");//g
    public static final ResourceKey<Biome> CLOWD_MOUNTAIN = ModUtils.getResourceKey(Registries.BIOME, "clowd_mountain");//g

    public static final ResourceKey<Biome> CRIMSON_CRYSTAL_FOREST = ModUtils.getResourceKey(Registries.BIOME, "crimson_crystal_forest");//g

    public static final ResourceKey<Biome> ICE_PLANE = ModUtils.getResourceKey(Registries.BIOME, "ice_plane");//fg
    public static final ResourceKey<Biome> ICE_MOUNTAIN = ModUtils.getResourceKey(Registries.BIOME, "ice_mountain");//fg
    public static final ResourceKey<Biome> ICE_PEAKS = ModUtils.getResourceKey(Registries.BIOME, "ice_peaks");//fs


    //極限環境
    public static final ResourceKey<Biome> ETERNAL_BLIZZARD = ModUtils.getResourceKey(Registries.BIOME, "eternal_blizzard");//fg
    public static final ResourceKey<Biome> ABYSS_RIFT = ModUtils.getResourceKey(Registries.BIOME, "abyss_rift");//as
    public static final ResourceKey<Biome> UNSTABLE_WETLAND = ModUtils.getResourceKey(Registries.BIOME, "unstable_wetland");//g

    public static void bootstrapBiomes(BootstrapContext<Biome> context) {
        HolderGetter<ConfiguredWorldCarver<?>> carver = context.lookup(Registries.CONFIGURED_CARVER);
        HolderGetter<PlacedFeature> placedFeature = context.lookup(Registries.PLACED_FEATURE);

        
    }

    /*
    * -------火山
    * 噴気孔
    *
    *
    * -------深淵
    *
    *
    * -------雪原
    *
    * -------氷雪
    *
    * */
}
