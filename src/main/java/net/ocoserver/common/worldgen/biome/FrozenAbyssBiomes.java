package net.ocoserver.common.worldgen.biome;

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
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.FROZEN_GRASS_PLAIN);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.FROZEN_POPPY_PLAIN);

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
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.FROZEN_GRASS_PLAIN);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.FROZEN_POPPY_PLAIN);

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

    public static Biome abyssIceSpikeField(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<ConfiguredWorldCarver<?>> carvers) {
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
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.FROZEN_GRASS_PLAIN);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.FROZEN_POPPY_PLAIN);
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
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.FROZEN_GRASS_PLAIN);

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
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.ABYSS_GRASS_PLAIN);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.LIT_ABYSS_STONE_GRASS_PLAIN);

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
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.ABYSS_GRASS_PLAIN);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.LIT_ABYSS_STONE_GRASS_PLAIN);

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
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.ABYSS_GRASS_PLAIN);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.LIT_ABYSS_STONE_GRASS_PLAIN);

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
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.ABYSS_GRASS_PLAIN);

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
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.FROZEN_GRASS_PLAIN);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.FROZEN_POPPY_PLAIN);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.ICE_BUSH_PLAIN);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.SPIKE_ICER_PLAIN);

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, TreePlaced.NITROWD_TREE_FOREST);

        return new Biome.BiomeBuilder().hasPrecipitation(true).temperature(-1.9F).downfall(0.1F).specialEffects(new BiomeSpecialEffects.Builder()
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
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.FROZEN_POPPY_PLAIN);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.ICE_BUSH_PLAIN);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.SPIKE_ICER_PLAIN);

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, TreePlaced.NITROWD_TREE_PLAIN);

        return new Biome.BiomeBuilder().hasPrecipitation(true).temperature(-1.7F).downfall(0.2F).specialEffects(new BiomeSpecialEffects.Builder()
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

    public static Biome solidNitrogenFOREST(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<ConfiguredWorldCarver<?>> carvers) {
        MobSpawnSettings.Builder spawnBuilder = new MobSpawnSettings.Builder();
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.STRAY, 200, 6, 12));

        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(placedFeatures, carvers);
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeBuilder);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);
        BiomeDefaultFeatures.addDefaultMonsterRoom(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);

        //自然オブジェクト
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.FROZEN_GRASS_PLAIN);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.FROZEN_POPPY_PLAIN);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.ICE_BUSH_PLAIN);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.SPIKE_ICER_PLAIN);

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, TreePlaced.NITROWD_TREE_FOREST);

        return new Biome.BiomeBuilder().hasPrecipitation(true).temperature(-1.5F).downfall(0.3F).specialEffects(new BiomeSpecialEffects.Builder()
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
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.FROZEN_GRASS_PLAIN);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.FROZEN_POPPY_PLAIN);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.BERRY_GRASS_PLAIN);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.FROST_FLARE_PLAIN);

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
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.FROZEN_GRASS_PLAIN);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.FROZEN_POPPY_PLAIN);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.BERRY_GRASS_PLAIN);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.FROST_FLARE_PLAIN);

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
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.ABYSS_GRASS_PLAIN);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.BLOWER_PLAIN);

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, TreePlaced.KEUTI_TREE_FOREST);

        return new Biome.BiomeBuilder().hasPrecipitation(true).temperature(0.6F).downfall(0.6F).specialEffects(new BiomeSpecialEffects.Builder()
                        .waterColor(new Color(0, 42, 134).getRGB())
                        .waterFogColor(new Color(0, 22, 61).getRGB())
                        .fogColor(new Color(54, 54, 57).getRGB())
                        .skyColor(new Color(55, 55, 55).getRGB())
                        .grassColorOverride(new Color(130, 130, 130).getRGB())
                        .foliageColorOverride(new Color(37, 37, 37).getRGB())
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
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.ABYSS_GRASS_PLAIN);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.BLOWER_PLAIN);

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, TreePlaced.KEUTI_TREE_PLAIN);

        return new Biome.BiomeBuilder().hasPrecipitation(true).temperature(0.1F).downfall(0.4F).specialEffects(new BiomeSpecialEffects.Builder()
                        .waterColor(new Color(0, 42, 134).getRGB())
                        .waterFogColor(new Color(0, 22, 61).getRGB())
                        .fogColor(new Color(54, 54, 57).getRGB())
                        .skyColor(new Color(55, 55, 55).getRGB())
                        .grassColorOverride(new Color(130, 130, 130).getRGB())
                        .foliageColorOverride(new Color(37, 37, 37).getRGB())
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
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.CRIMSON_GRASS_PLAIN);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.COSMOS_CRIMSON_BIOME);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.PINK_AZUSAI_CRIMSON_BIOME);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.PURPLE_AZUSAI_CRIMSON_BIOME);

        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, TreePlaced.CRIMSON_CRYSTAL_TREE_FOREST);

        return new Biome.BiomeBuilder().hasPrecipitation(true).temperature(0.8F).downfall(0.5F).specialEffects(new BiomeSpecialEffects.Builder()
                        .waterColor(new Color(60, 0, 134).getRGB())
                        .waterFogColor(new Color(8, 0, 61).getRGB())
                        .fogColor(new Color(208, 49, 237).getRGB())
                        .skyColor(new Color(255, 40, 244).getRGB())
                        .grassColorOverride(new Color(194, 108, 255, 173).getRGB())
                        .foliageColorOverride(new Color(37, 37, 37).getRGB())
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
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.FROZEN_GRASS_PLAIN);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.FROZEN_POPPY_PLAIN);

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
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.FROZEN_GRASS_PLAIN);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.FROZEN_POPPY_PLAIN);

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
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.FROZEN_GRASS_PLAIN);

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
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.FROZEN_GRASS_PLAIN);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.FROZEN_POPPY_PLAIN);
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.ICE_BUSH_PLAIN);

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

    public static Biome abyssRIFT(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<ConfiguredWorldCarver<?>> carvers) {
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
        biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ObjectPlaced.ABYSS_STONE_GRASS_PLAIN);

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
