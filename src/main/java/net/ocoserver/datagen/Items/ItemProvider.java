package net.ocoserver.datagen.Items;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.ocoserver.common.init.ModItems;
import net.ocoserver.Sirousyanka;

public class ItemProvider extends ItemModelProvider {

    public ItemProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Sirousyanka.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.USYALIUM_INGOT.get());
        basicItem(ModItems.USYALIUM_NUGGET.get());
        basicItem(ModItems.RAW_USYALIUM.get());
        basicItem(ModItems.ADVANCED_USYALIUM_INGOT.get());
        basicItem(ModItems.HEATED_LAVA_BUCKET.get());
        basicItem(ModItems.LIQUID_NITROGEN_BUCKET.get());
    }

}
