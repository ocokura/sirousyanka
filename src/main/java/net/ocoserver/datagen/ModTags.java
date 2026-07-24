package net.ocoserver.datagen;

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
        public static final TagKey<Block> BURN_IN_FURNACE_PLANKS_BLOCK =
                TagKey.create(Registries.BLOCK,
                        ResourceLocation.fromNamespaceAndPath("sirousyanka", "burn_in_furnace_planks_block")
                );
        public static final TagKey<Block> BURN_IN_FURNACE_SHORT_BLOCK =
                TagKey.create(Registries.BLOCK,
                        ResourceLocation.fromNamespaceAndPath("sirousyanka", "burn_in_furnace_short_block")
                );
        public static final TagKey<Block> STONE_TOOL_MATERIAL =
                TagKey.create(Registries.BLOCK,
                        ResourceLocation.fromNamespaceAndPath("sirousyanka", "stone_tool_material")
                );
    }

    public static class Items {
        public static final TagKey<Item> CRAFTABLE_TO_SPRUCE_PLANKS =
                TagKey.create(Registries.ITEM,
                        ResourceLocation.fromNamespaceAndPath("sirousyanka", "craftable_to_spruce_planks")
                );
        public static final TagKey<Item> CRAFTABLE_TO_ICE_LARCH_PLANKS =
                TagKey.create(Registries.ITEM,
                        ResourceLocation.fromNamespaceAndPath("sirousyanka", "craftable_to_ice_larch_planks")
                );
        public static final TagKey<Item> CRAFTABLE_TO_KEUTI_PLANKS =
                TagKey.create(Registries.ITEM,
                        ResourceLocation.fromNamespaceAndPath("sirousyanka", "craftable_to_keuti_planks")
                );
        public static final TagKey<Item> CRAFTABLE_TO_CRIMSON_CRYSTAL_PLANKS =
                TagKey.create(Registries.ITEM,
                        ResourceLocation.fromNamespaceAndPath("sirousyanka", "craftable_to_crimson_crystal_planks")
                );
        public static final TagKey<Item> BURN_IN_FURNACE_PLANKS =
                TagKey.create(Registries.ITEM,
                        ResourceLocation.fromNamespaceAndPath("sirousyanka", "burn_in_furnace_planks")
                );
        public static final TagKey<Item> BURN_IN_FURNACE_SHORT =
                TagKey.create(Registries.ITEM,
                        ResourceLocation.fromNamespaceAndPath("sirousyanka", "burn_in_furnace_short")
                );
    }

}
