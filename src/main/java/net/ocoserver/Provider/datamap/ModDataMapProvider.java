package net.ocoserver.Provider.datamap;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.datamaps.builtin.FurnaceFuel;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;
import net.ocoserver.Tags.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModDataMapProvider extends DataMapProvider {

    public ModDataMapProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }

    @Override
    protected void gather(HolderLookup.Provider lookupProvider) {
        builder(NeoForgeDataMaps.FURNACE_FUELS)
                .add(ModTags.Items.BURN_IN_FURNACE_PLANKS, new FurnaceFuel(75), false)
                .add(ModTags.Items.BURN_IN_FURNACE_SHORT, new FurnaceFuel(37), false);
    }
}
