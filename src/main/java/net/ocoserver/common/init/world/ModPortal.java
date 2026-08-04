package net.ocoserver.common.init.world;

import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.resources.ResourceLocation;
import net.ocoserver.common.init.item.ModItems;
import net.ocoserver.common.init.block.ModBlocks;

public class ModPortal {

    public static void createPortal() {
        CustomPortalBuilder.beginPortal()
                .frameBlock(ModBlocks.ADVANCED_USYALIUM_BLOCK.get())
                .destDimID(ResourceLocation.fromNamespaceAndPath("sirousyanka", "frozen_abyss"))
                .tintColor(0, 144, 187)
                .forcedSize(2,3)
                .lightWithItem(ModItems.USYALIUM_INGOT.get())
                .onlyLightInOverworld()
                .registerPortal();
    }
}
