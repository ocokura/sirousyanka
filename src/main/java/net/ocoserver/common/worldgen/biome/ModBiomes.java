package net.ocoserver.common.worldgen.biome;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.ocoserver.Sirousyanka;
import net.ocoserver.common.worldgen.tree.ModTreePlacedFeatures;

public class ModBiomes {

    //凍った系
    public static final ResourceKey<Biome> FROZEN_SPRUCE_FOREST = getResourceKey("frozen_spruce_forest");
    public static final ResourceKey<Biome> FROZEN_MOUNTAIN = getResourceKey("frozen_mountain");

    //深淵系
    public static final ResourceKey<Biome> ABYSS_VOLCANO = getResourceKey("abyss_volcano");
    public static final ResourceKey<Biome> ABYSS_PLAIN = getResourceKey("abyss_plain");

    //液体窒素系
    public static final ResourceKey<Biome> SOLID_NITROGEN_MOUNTAIN = getResourceKey("solid_nitrogen_mountain");
    public static final ResourceKey<Biome> SOLID_NITROGEN_PLAIN = getResourceKey("solid_nitrogen_plain");
    public static final ResourceKey<Biome> SOLID_NITROGEN_FOREST = getResourceKey("solid_nitrogen_forest");

    //普通の
    public static final ResourceKey<Biome> ICE_LARCH_FOREST = getResourceKey("ice_larch_forest");
    public static final ResourceKey<Biome> KEUTI_FOREST = getResourceKey("keuti_forest");
    public static final ResourceKey<Biome> CRIMSON_CRYSTAL_FOREST = getResourceKey("crimson_crystal_forest");

    private static ResourceKey<Biome> getResourceKey(String key) {
        return ResourceKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath(Sirousyanka.MODID, key));
    }

    public static void bootstrap(BootstrapContext<Biome> context) {
        context.register(FROZEN_SPRUCE_FOREST, );
    }

    private static Biome frozenSpruceForest(BootstrapContext<Biome> context) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
        BiomeGenerationSettings.Builder generationBuilder = new BiomeGenerationSettings.Builder(context.lookup(Registries.PLACED_FEATURE), context.lookup(Registries.CONFIGURED_CARVER));

        // 地形
        BiomeDefaultFeatures.addDefaultOres(generationBuilder);
        BiomeDefaultFeatures.addDefaultSoftDisks(generationBuilder);

        // 木
        generationBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModTreePlacedFeatures.FROZEN_SPRUCE_TREE_PLACED);

        // 鉱石
        generationBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.USYALIUM_ORE_PLACED_KEY);

        // モブ
        BiomeDefaultFeatures.farmAnimals(spawnBuilder);

        return new Biome.BiomeBuilder()
                .hasPrecipitation(true)
                .temperature(-0.8F)
                .downfall(0.9F)
                .specialEffects(...)
            .mobspownsetting(spawnBuilder.build())
                .generationSettings(generationBuilder.build())
                .build();
    }

}
