package net.ocoserver.Tags;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
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

}
