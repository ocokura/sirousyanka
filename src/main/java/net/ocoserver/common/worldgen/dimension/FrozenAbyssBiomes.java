package net.ocoserver.common.worldgen.dimension;

import net.minecraft.core.HolderGetter;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.carver.ConfiguredWorldCarver;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.ocoserver.common.worldgen.object.ObjectPlaced;
import net.ocoserver.common.worldgen.tree.TreePlaced;

import java.awt.*;

public class FrozenAbyssBiomes {

    public static Biome frozenSpruceForest(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<ConfiguredWorldCarver<?>> carvers) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.WOLF, 8, 2, 4));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.STRAY, 200, 6, 12));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 50, 1, 3));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 50, 1, 2));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 50, 2, 3));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 20, 1, 1));

        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(placedFeatures, carvers);
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);
        BiomeDefaultFeatures.addDefaultMonsterRoom(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);

        //自然オブジェクト

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, TreePlaced.FROZEN_SPRUCE_TREE_FOREST);

        return new Biome.BiomeBuilder().hasPrecipitation(true).temperature(-0.8F).downfall(0.9F).specialEffects(new BiomeSpecialEffects.Builder()
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

    public static Biome frozenMountain(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<ConfiguredWorldCarver<?>> carvers) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.STRAY, 200, 6, 12));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 50, 1, 3));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 50, 1, 2));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 50, 2, 3));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 20, 1, 1));

        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(placedFeatures, carvers);
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);
        BiomeDefaultFeatures.addDefaultMonsterRoom(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);

        //自然オブジェクト

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, TreePlaced.FROZEN_SPRUCE_TREE_PLAIN);

        return new Biome.BiomeBuilder().hasPrecipitation(true).temperature(-0.8F).downfall(0.9F).specialEffects(new BiomeSpecialEffects.Builder()
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

    public static Biome abyssIceSpikesField(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<ConfiguredWorldCarver<?>> carvers) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.STRAY, 200, 6, 12));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 50, 1, 3));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 50, 1, 2));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 50, 2, 3));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 20, 1, 1));

        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(placedFeatures, carvers);
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);
        BiomeDefaultFeatures.addDefaultMonsterRoom(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);

        //自然オブジェクト
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.ABYSS_ICE_SPIKE);

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, TreePlaced.FROZEN_SPRUCE_TREE_PLAIN);

        return new Biome.BiomeBuilder().hasPrecipitation(true).temperature(-0.8F).downfall(0.9F).specialEffects(new BiomeSpecialEffects.Builder()
                        .waterColor(new Color(35, 62, 111).getRGB())
                        .waterFogColor(new Color(6, 36, 96).getRGB())
                        .fogColor(new Color(13, 41, 68).getRGB())
                        .skyColor(new Color(14, 32, 59).getRGB())
                        .grassColorOverride(new Color(121, 121, 121).getRGB())
                        .foliageColorOverride(new Color(61, 61, 61).getRGB())
                        .build())
                .mobSpawnSettings(spawnBuilder.build())
                .generationSettings(biomeBuilder.build())
                .build();
    }

    public static Biome frozenPeaks(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<ConfiguredWorldCarver<?>> carvers) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.STRAY, 70, 3, 6));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 30, 1, 3));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 30, 1, 2));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 30, 2, 3));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 5, 1, 1));

        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(placedFeatures, carvers);
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);
        BiomeDefaultFeatures.addDefaultMonsterRoom(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);

        //自然オブジェクト

        return new Biome.BiomeBuilder().hasPrecipitation(true).temperature(-0.8F).downfall(0.9F).specialEffects(new BiomeSpecialEffects.Builder()
                        .waterColor(new Color(28, 177, 255, 121).getRGB())
                        .waterFogColor(new Color(105, 156, 255).getRGB())
                        .fogColor(new Color(228, 242, 255).getRGB())
                        .skyColor(new Color(255, 255, 255).getRGB())
                        .grassColorOverride(new Color(219, 219, 219).getRGB())
                        .foliageColorOverride(new Color(166, 166, 166).getRGB())
                        .build())
                .mobSpawnSettings(spawnBuilder.build())
                .generationSettings(biomeBuilder.build())
                .build();
    }

    public static Biome abyssVolcanoCrater(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<ConfiguredWorldCarver<?>> carvers) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 70, 3, 6));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 30, 1, 3));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 30, 1, 2));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 30, 2, 3));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 5, 1, 1));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITHER_SKELETON, 40, 3, 5));

        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(placedFeatures, carvers);
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);
        BiomeDefaultFeatures.addDefaultMonsterRoom(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);

        //自然オブジェクト

        return new Biome.BiomeBuilder().hasPrecipitation(false).temperature(1.5F).downfall(0.4F).specialEffects(new BiomeSpecialEffects.Builder()
                        .waterColor(new Color(27, 27, 27, 121).getRGB())
                        .waterFogColor(new Color(30, 30, 30).getRGB())
                        .fogColor(new Color(20, 20, 20).getRGB())
                        .skyColor(new Color(14, 14, 14).getRGB())
                        .grassColorOverride(new Color(37, 37, 37).getRGB())
                        .foliageColorOverride(new Color(34, 34, 34).getRGB())
                        .build())
                .mobSpawnSettings(spawnBuilder.build())
                .generationSettings(biomeBuilder.build())
                .build();
    }

    public static Biome abyssVolcano(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<ConfiguredWorldCarver<?>> carvers) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 70, 3, 6));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 30, 1, 3));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 30, 1, 2));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 30, 2, 3));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 5, 1, 1));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITHER_SKELETON, 40, 3, 5));

        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(placedFeatures, carvers);
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);
        BiomeDefaultFeatures.addDefaultMonsterRoom(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);

        //自然オブジェクト

        return new Biome.BiomeBuilder().hasPrecipitation(false).temperature(1.8F).downfall(0.3F).specialEffects(new BiomeSpecialEffects.Builder()
                        .waterColor(new Color(27, 27, 27, 121).getRGB())
                        .waterFogColor(new Color(30, 30, 30).getRGB())
                        .fogColor(new Color(20, 20, 20).getRGB())
                        .skyColor(new Color(14, 14, 14).getRGB())
                        .grassColorOverride(new Color(37, 37, 37).getRGB())
                        .foliageColorOverride(new Color(34, 34, 34).getRGB())
                        .build())
                .mobSpawnSettings(spawnBuilder.build())
                .generationSettings(biomeBuilder.build())
                .build();
    }

    public static Biome abyssPlain(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<ConfiguredWorldCarver<?>> carvers) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 70, 3, 6));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 30, 1, 3));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 30, 1, 2));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 30, 2, 3));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 5, 1, 1));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITHER_SKELETON, 40, 3, 5));

        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(placedFeatures, carvers);
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);
        BiomeDefaultFeatures.addDefaultMonsterRoom(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);

        //自然オブジェクト

        return new Biome.BiomeBuilder().hasPrecipitation(false).temperature(1F).downfall(0.5F).specialEffects(new BiomeSpecialEffects.Builder()
                        .waterColor(new Color(27, 27, 27, 121).getRGB())
                        .waterFogColor(new Color(30, 30, 30).getRGB())
                        .fogColor(new Color(20, 20, 20).getRGB())
                        .skyColor(new Color(14, 14, 14).getRGB())
                        .grassColorOverride(new Color(37, 37, 37).getRGB())
                        .foliageColorOverride(new Color(34, 34, 34).getRGB())
                        .build())
                .mobSpawnSettings(spawnBuilder.build())
                .generationSettings(biomeBuilder.build())
                .build();
    }

    public static Biome abyssPeaks(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<ConfiguredWorldCarver<?>> carvers) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 30, 3, 6));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 20, 1, 3));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 20, 1, 2));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 20, 2, 3));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 5, 1, 1));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITHER_SKELETON, 40, 2, 4));

        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(placedFeatures, carvers);
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);
        BiomeDefaultFeatures.addDefaultMonsterRoom(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);

        //自然オブジェクト

        return new Biome.BiomeBuilder().hasPrecipitation(false).temperature(0.3F).downfall(0.7F).specialEffects(new BiomeSpecialEffects.Builder()
                        .waterColor(new Color(27, 27, 27, 121).getRGB())
                        .waterFogColor(new Color(30, 30, 30).getRGB())
                        .fogColor(new Color(20, 20, 20).getRGB())
                        .skyColor(new Color(14, 14, 14).getRGB())
                        .grassColorOverride(new Color(37, 37, 37).getRGB())
                        .foliageColorOverride(new Color(34, 34, 34).getRGB())
                        .build())
                .mobSpawnSettings(spawnBuilder.build())
                .generationSettings(biomeBuilder.build())
                .build();
    }

    public static Biome solidNitrogenMountain(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<ConfiguredWorldCarver<?>> carvers) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.STRAY, 200, 6, 12));

        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(placedFeatures, carvers);
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);
        BiomeDefaultFeatures.addDefaultMonsterRoom(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);

        //自然オブジェクト
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.FROZEN_GRASS_MOUNTAIN);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.ICE_BUSH_PLAIN);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, TreePlaced.NITROWD_TREE_PLAIN);

        return new Biome.BiomeBuilder().hasPrecipitation(true).temperature(-1.9F).downfall(0.1F).specialEffects(new BiomeSpecialEffects.Builder()
                        .waterColor(new Color(209, 224, 255).getRGB())
                        .waterFogColor(new Color(213, 253, 255).getRGB())
                        .fogColor(new Color(187, 198, 210).getRGB())
                        .skyColor(new Color(187, 198, 210).getRGB())
                        .grassColorOverride(new Color(237, 237, 237).getRGB())
                        .foliageColorOverride(new Color(226, 226, 226).getRGB())
                        .build())
                .mobSpawnSettings(spawnBuilder.build())
                .generationSettings(biomeBuilder.build())
                .build();
    }

    public static Biome solidNitrogenPlain(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<ConfiguredWorldCarver<?>> carvers) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.STRAY, 200, 6, 12));

        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(placedFeatures, carvers);
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);
        BiomeDefaultFeatures.addDefaultMonsterRoom(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);

        //自然オブジェクト
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.FROZEN_GRASS_PLAIN);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.ICE_BUSH_PLAIN);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.SPIKE_ICER_PLAIN);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, TreePlaced.NITROWD_TREE_PLAIN);

        return new Biome.BiomeBuilder().hasPrecipitation(true).temperature(-1.7F).downfall(0.2F).specialEffects(new BiomeSpecialEffects.Builder()
                        .waterColor(new Color(209, 224, 255).getRGB())
                        .waterFogColor(new Color(213, 253, 255).getRGB())
                        .fogColor(new Color(187, 198, 210).getRGB())
                        .skyColor(new Color(187, 198, 210).getRGB())
                        .grassColorOverride(new Color(237, 237, 237).getRGB())
                        .foliageColorOverride(new Color(226, 226, 226).getRGB())
                        .build())
                .mobSpawnSettings(spawnBuilder.build())
                .generationSettings(biomeBuilder.build())
                .build();
    }

    public static Biome solidNitrogenForest(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<ConfiguredWorldCarver<?>> carvers) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.STRAY, 200, 6, 12));

        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(placedFeatures, carvers);
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);
        BiomeDefaultFeatures.addDefaultMonsterRoom(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);

        //自然オブジェクト
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.FROZEN_GRASS_FOREST);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.ICE_BUSH_PLAIN);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.SPIKE_ICER_FOREST);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, TreePlaced.NITROWD_TREE_FOREST);

        return new Biome.BiomeBuilder().hasPrecipitation(true).temperature(-1.5F).downfall(0.3F).specialEffects(new BiomeSpecialEffects.Builder()
                        .waterColor(new Color(209, 224, 255).getRGB())
                        .waterFogColor(new Color(213, 253, 255).getRGB())
                        .fogColor(new Color(187, 198, 210).getRGB())
                        .skyColor(new Color(187, 198, 210).getRGB())
                        .grassColorOverride(new Color(237, 237, 237).getRGB())
                        .foliageColorOverride(new Color(226, 226, 226).getRGB())
                        .build())
                .mobSpawnSettings(spawnBuilder.build())
                .generationSettings(biomeBuilder.build())
                .build();
    }

    public static Biome iceLarchForest(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<ConfiguredWorldCarver<?>> carvers) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 30, 1, 3));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 30, 1, 3));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 30, 1, 2));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 30, 2, 3));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 5, 1, 1));

        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(placedFeatures, carvers);
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);
        BiomeDefaultFeatures.addDefaultMonsterRoom(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);

        //自然オブジェクト

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, TreePlaced.ICE_LARCH_TREE_FOREST);

        return new Biome.BiomeBuilder().hasPrecipitation(true).temperature(-0.5F).downfall(0.5F).specialEffects(new BiomeSpecialEffects.Builder()
                        .waterColor(new Color(101, 132, 202).getRGB())
                        .waterFogColor(new Color(64, 109, 189).getRGB())
                        .fogColor(new Color(187, 198, 210).getRGB())
                        .skyColor(new Color(187, 198, 210).getRGB())
                        .grassColorOverride(new Color(218, 255, 218).getRGB())
                        .foliageColorOverride(new Color(221, 255, 221).getRGB())
                        .build())
                .mobSpawnSettings(spawnBuilder.build())
                .generationSettings(biomeBuilder.build())
                .build();
    }

    public static Biome iceLarchMountain(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<ConfiguredWorldCarver<?>> carvers) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 30, 1, 3));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 30, 1, 3));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 30, 1, 2));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 30, 2, 3));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 5, 1, 1));

        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(placedFeatures, carvers);
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);
        BiomeDefaultFeatures.addDefaultMonsterRoom(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);

        //自然オブジェクト

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, TreePlaced.ICE_LARCH_TREE_PLAIN);

        return new Biome.BiomeBuilder().hasPrecipitation(true).temperature(-0.7F).downfall(0.4F).specialEffects(new BiomeSpecialEffects.Builder()
                        .waterColor(new Color(101, 132, 202).getRGB())
                        .waterFogColor(new Color(64, 109, 189).getRGB())
                        .fogColor(new Color(187, 198, 210).getRGB())
                        .skyColor(new Color(187, 198, 210).getRGB())
                        .grassColorOverride(new Color(218, 255, 218).getRGB())
                        .foliageColorOverride(new Color(221, 255, 221).getRGB())
                        .build())
                .mobSpawnSettings(spawnBuilder.build())
                .generationSettings(biomeBuilder.build())
                .build();
    }

    public static Biome keutiForest(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<ConfiguredWorldCarver<?>> carvers) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 30, 1, 3));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 30, 1, 3));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 30, 1, 2));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 30, 2, 3));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 50, 1, 2));

        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(placedFeatures, carvers);
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);
        BiomeDefaultFeatures.addDefaultMonsterRoom(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);

        //自然オブジェクト
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.GRASS_FOREST);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.BLOWER_FOREST);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, TreePlaced.KEUTI_TREE_FOREST);

        return new Biome.BiomeBuilder().hasPrecipitation(true).temperature(0.6F).downfall(0.6F).specialEffects(new BiomeSpecialEffects.Builder()
                        .waterColor(new Color(39, 39, 39).getRGB())
                        .waterFogColor(new Color(45, 45, 45).getRGB())
                        .fogColor(new Color(54, 54, 57).getRGB())
                        .skyColor(new Color(55, 55, 55).getRGB())
                        .grassColorOverride(new Color(130, 130, 130).getRGB())
                        .foliageColorOverride(new Color(75, 75, 75).getRGB())
                        .build())
                .mobSpawnSettings(spawnBuilder.build())
                .generationSettings(biomeBuilder.build())
                .build();
    }

    public static Biome keutiMountain(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<ConfiguredWorldCarver<?>> carvers) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 30, 1, 3));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 30, 1, 3));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 30, 1, 2));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 30, 2, 3));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 50, 1, 2));

        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(placedFeatures, carvers);
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);
        BiomeDefaultFeatures.addDefaultMonsterRoom(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);

        //自然オブジェクト
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.GRASS_MOUNTAIN);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, TreePlaced.KEUTI_TREE_PLAIN);

        return new Biome.BiomeBuilder().hasPrecipitation(true).temperature(0.1F).downfall(0.4F).specialEffects(new BiomeSpecialEffects.Builder()
                        .waterColor(new Color(39, 39, 39).getRGB())
                        .waterFogColor(new Color(45, 45, 45).getRGB())
                        .fogColor(new Color(54, 54, 57).getRGB())
                        .skyColor(new Color(55, 55, 55).getRGB())
                        .grassColorOverride(new Color(130, 130, 130).getRGB())
                        .foliageColorOverride(new Color(75, 75, 75).getRGB())
                        .build())
                .mobSpawnSettings(spawnBuilder.build())
                .generationSettings(biomeBuilder.build())
                .build();
    }

    public static Biome crimsonCrystalForest(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<ConfiguredWorldCarver<?>> carvers) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 30, 1, 3));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 30, 1, 3));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 30, 1, 2));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 30, 2, 3));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 50, 1, 2));

        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(placedFeatures, carvers);
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);
        BiomeDefaultFeatures.addDefaultMonsterRoom(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);

        //自然オブジェクト
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.GRASS_FOREST);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.COSMOS_IN_CRIMSON);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.PINK_AZUSAI_IN_CRIMSON);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.PURPLE_AZUSAI_IN_CRIMSON);

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, TreePlaced.CRIMSON_CRYSTAL_TREE_FOREST);

        return new Biome.BiomeBuilder().hasPrecipitation(true).temperature(0.8F).downfall(0.5F).specialEffects(new BiomeSpecialEffects.Builder()
                        .waterColor(new Color(255, 109, 174).getRGB())
                        .waterFogColor(new Color(255, 137, 201).getRGB())
                        .fogColor(new Color(255, 150, 207).getRGB())
                        .skyColor(new Color(255, 166, 229).getRGB())
                        .grassColorOverride(new Color(255, 0, 100, 255).getRGB())
                        .foliageColorOverride(new Color(255, 12, 134).getRGB())
                        .build())
                .mobSpawnSettings(spawnBuilder.build())
                .generationSettings(biomeBuilder.build())
                .build();
    }

    public static Biome icePlane(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<ConfiguredWorldCarver<?>> carvers) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.STRAY, 50, 1, 3));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 50, 1, 3));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 50, 1, 2));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 50, 2, 3));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 20, 1, 1));

        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(placedFeatures, carvers);
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);
        BiomeDefaultFeatures.addDefaultMonsterRoom(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);

        //自然オブジェクト

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, TreePlaced.ICE_LARCH_TREE_PLAIN);

        return new Biome.BiomeBuilder().hasPrecipitation(true).temperature(-0.6F).downfall(0.5F).specialEffects(new BiomeSpecialEffects.Builder()
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

    public static Biome iceMountain(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<ConfiguredWorldCarver<?>> carvers) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.STRAY, 50, 1, 3));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 50, 1, 3));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 50, 1, 2));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 50, 2, 3));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 20, 1, 1));

        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(placedFeatures, carvers);
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);
        BiomeDefaultFeatures.addDefaultMonsterRoom(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);

        //自然オブジェクト

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, TreePlaced.ICE_LARCH_TREE_PLAIN);

        return new Biome.BiomeBuilder().hasPrecipitation(true).temperature(-1.0F).downfall(0.4F).specialEffects(new BiomeSpecialEffects.Builder()
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

    public static Biome icePeaks(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<ConfiguredWorldCarver<?>> carvers) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.STRAY, 50, 1, 2));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 50, 1, 2));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 50, 1, 1));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 50, 2, 3));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 20, 1, 1));

        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(placedFeatures, carvers);
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);
        BiomeDefaultFeatures.addDefaultMonsterRoom(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);

        //自然オブジェクト

        return new Biome.BiomeBuilder().hasPrecipitation(true).temperature(-1.4F).downfall(0.2F).specialEffects(new BiomeSpecialEffects.Builder()
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

    public static Biome eternalBlizzard(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<ConfiguredWorldCarver<?>> carvers) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();

        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(placedFeatures, carvers);
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);
        BiomeDefaultFeatures.addDefaultMonsterRoom(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);

        //自然オブジェクト

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, TreePlaced.NITROWD_TREE_PLAIN);

        return new Biome.BiomeBuilder().hasPrecipitation(true).temperature(-2F).downfall(0.2F).specialEffects(new BiomeSpecialEffects.Builder()
                        .waterColor(new Color(186, 208, 255).getRGB())
                        .waterFogColor(new Color(87, 133, 214).getRGB())
                        .fogColor(new Color(187, 198, 210).getRGB())
                        .skyColor(new Color(187, 198, 210).getRGB())
                        .grassColorOverride(new Color(233, 255, 233).getRGB())
                        .foliageColorOverride(new Color(233, 255, 233).getRGB())
                        .build())
                .mobSpawnSettings(spawnBuilder.build())
                .generationSettings(biomeBuilder.build())
                .build();
    }

    public static Biome abyssRift(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<ConfiguredWorldCarver<?>> carvers) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 80, 5, 15));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 50, 5, 7));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 50, 1, 1));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 50, 3, 7));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 20, 1, 1));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.WITHER_SKELETON, 100, 4, 10));

        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(placedFeatures, carvers);
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);
        BiomeDefaultFeatures.addDefaultMonsterRoom(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);

        //自然オブジェクト

        return new Biome.BiomeBuilder().hasPrecipitation(true).temperature(1.0F).downfall(0.5F).specialEffects(new BiomeSpecialEffects.Builder()
                        .waterColor(new Color(27, 27, 27, 121).getRGB())
                        .waterFogColor(new Color(30, 30, 30).getRGB())
                        .fogColor(new Color(20, 20, 20).getRGB())
                        .skyColor(new Color(14, 14, 14).getRGB())
                        .grassColorOverride(new Color(37, 37, 37).getRGB())
                        .foliageColorOverride(new Color(34, 34, 34).getRGB())
                        .build())
                .mobSpawnSettings(spawnBuilder.build())
                .generationSettings(biomeBuilder.build())
                .build();
    }

    public static Biome unstableWetland(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<ConfiguredWorldCarver<?>> carvers) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 30, 1, 2));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 50, 1, 2));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SPIDER, 50, 1, 1));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 50, 1, 2));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 20, 1, 1));

        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(placedFeatures, carvers);
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);
        BiomeDefaultFeatures.addDefaultMonsterRoom(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);

        //自然オブジェクト
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, TreePlaced.KEUTI_TREE_PLAIN);

        return new Biome.BiomeBuilder().hasPrecipitation(true).temperature(0.7F).downfall(0.8F).specialEffects(new BiomeSpecialEffects.Builder()
                        .waterColor(new Color(27, 27, 27, 121).getRGB())
                        .waterFogColor(new Color(30, 30, 30).getRGB())
                        .fogColor(new Color(20, 20, 20).getRGB())
                        .skyColor(new Color(14, 14, 14).getRGB())
                        .grassColorOverride(new Color(37, 37, 37).getRGB())
                        .foliageColorOverride(new Color(34, 34, 34).getRGB())
                        .build())
                .mobSpawnSettings(spawnBuilder.build())
                .generationSettings(biomeBuilder.build())
                .build();
    }



}
