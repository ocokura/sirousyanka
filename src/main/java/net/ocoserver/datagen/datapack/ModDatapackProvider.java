package net.ocoserver.datagen.datapack;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.ocoserver.Sirousyanka;
import net.ocoserver.common.init.world.ModDimension;
import net.ocoserver.common.init.world.ModNoiseParameters;
import net.ocoserver.common.worldgen.ModConfigure;
import net.ocoserver.common.worldgen.ModPlaced;
import net.ocoserver.common.worldgen.dimension.BiomeRegister;
import net.ocoserver.common.worldgen.dimension.LevelStems;
import net.ocoserver.common.worldgen.dimension.NoiseGenSettings;
import net.ocoserver.common.worldgen.ore.OreBiomeModifiers;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ModDatapackProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            //Tree
            //Ore
            .add(Registries.CONFIGURED_FEATURE, ModConfigure::bootstrap)
            .add(Registries.PLACED_FEATURE, ModPlaced::bootstrap)
            .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, OreBiomeModifiers::bootstrap)
            .add(Registries.NOISE_SETTINGS, NoiseGenSettings::bootstrap)
            .add(Registries.BIOME, BiomeRegister::bootstrapBiomes)
            .add(Registries.LEVEL_STEM, LevelStems::levelBootstrap)
            .add(Registries.DIMENSION_TYPE, ModDimension::bootstrap)
            .add(Registries.NOISE, ModNoiseParameters::bootstrap);



    public ModDatapackProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(Sirousyanka.MODID));
    }



}
