package net.ocoserver.datagen.datapack;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.ocoserver.Sirousyanka;
import net.ocoserver.common.worldgen.ore.ModOreBiomeModifiers;
import net.ocoserver.common.worldgen.ore.ModOreConfiguredFeatures;
import net.ocoserver.common.worldgen.ore.ModOrePlacedFeatures;
import net.ocoserver.common.worldgen.tree.ModTreeConfiguredFeatures;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ModDatapackProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            //Tree
            .add(Registries.CONFIGURED_FEATURE, ModTreeConfiguredFeatures::bootstrap)
            //Ore
            .add(Registries.CONFIGURED_FEATURE, ModOreConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, ModOrePlacedFeatures::bootstrap)
            .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ModOreBiomeModifiers::bootstrap);



    public ModDatapackProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(Sirousyanka.MODID));
    }



}
