package net.ocoserver.common.worldgen.biome;

import net.minecraft.core.HolderGetter;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.carver.ConfiguredWorldCarver;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.ocoserver.common.worldgen.tree.ModTreePlacedFeatures;

import java.awt.*;

public class FrozenAbyssBiomes {

    public static Biome frozenSpruceForest(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<ConfiguredWorldCarver<?>> carvers) {

        //スポーン
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.WOLF, 8, 2, 4));

        // ===== Generation =====
        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(placedFeatures, carvers);
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);
        BiomeDefaultFeatures.addDefaultMonsterRoom(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);

        // 草・花
        BiomeDefaultFeatures.addDefaultGrass(biomeBuilder);
        BiomeDefaultFeatures.addDefaultFlowers(biomeBuilder);

        // 木（自作）
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModTreePlacedFeatures.FROZEN_SPRUCE_TREE_PLACED);

        // ===== Biome =====
        return new Biome.BiomeBuilder().hasPrecipitation(true).temperature(-0.8F).downfall(0.9F)
                .specialEffects(new BiomeSpecialEffects.Builder()
                        .waterColor(new Color(100, 151, 255).getRGB())
                        .waterFogColor(new Color(33, 77, 160).getRGB())
                        .fogColor(new Color(187, 198, 210).getRGB())
                        .skyColor(new Color(187, 198, 210).getRGB())
                        .grassColorOverride(new Color(233, 255, 233).getRGB())
                        .foliageColorOverride(new Color(233, 255, 233).getRGB())
                        .build())
                .mobSpawnSettings(spawnBuilder.build())
                .generationSettings(biomeBuilder.build())
                .build();
    }

    private static void addFeature(BiomeGenerationSettings.Builder builder, GenerationStep.Decoration step, ResourceKey<PlacedFeature> feature)
    {
        builder.addFeature(step, feature);
    }

}
