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

        //草
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
        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.WOLF, 8, 2, 4));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.STRAY, 200, 8, 12));

        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(placedFeatures, carvers);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);
        BiomeDefaultFeatures.addDefaultMonsterRoom(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);

        //草
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
        spawnBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.WOLF, 8, 2, 4));
        spawnBuilder.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.STRAY, 200, 8, 12));

        BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder(placedFeatures, carvers);
        BiomeDefaultFeatures.addDefaultCrystalFormations(biomeBuilder);
        BiomeDefaultFeatures.addDefaultMonsterRoom(biomeBuilder);
        BiomeDefaultFeatures.addDefaultOres(biomeBuilder);

        //草
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


}
