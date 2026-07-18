package net.ocoserver.Tags;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {

    public static class Blocks {
        public static final TagKey<Block> STONES =
                TagKey.create(Registries.BLOCK,
                        ResourceLocation.fromNamespaceAndPath("sirousyanka", "stone")
                );
        public static final TagKey<Block> USYALIUM =
                TagKey.create(Registries.BLOCK,
                        ResourceLocation.fromNamespaceAndPath("sirousyanka", "usyalium_block")
                );

    }

    public static class Items {
        public static final TagKey<Item> FROZEN_SPRUCE_LOG =
                TagKey.create(Registries.ITEM,
                        ResourceLocation.fromNamespaceAndPath("sirousyanka", "frozen_spruce_log")
                );
    }

}
