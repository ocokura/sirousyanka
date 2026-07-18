package net.ocoserver.Provider.LootTables;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.ocoserver.blocks.ModBlocks;
import net.ocoserver.items.ModItems;

import java.util.Set;

public class BlockLootTable extends BlockLootSubProvider {

    public BlockLootTable(HolderLookup.Provider lookupProvider) {
        super(Set.of(), FeatureFlags.DEFAULT_FLAGS, lookupProvider);
    }

    @Override
    protected void generate() {
        createOreDrop(ModBlocks.USYALIUM_ORE_BLOCK.get(), ModItems.RAW_USYALIUM.get());
        createOreDrop(ModBlocks.DEEPSLATE_USYALIUM_ORE_BLOCK.get(), ModItems.RAW_USYALIUM.get());

        dropSelf(ModBlocks.USYALIUM_BLOCK.get());
        dropSelf(ModBlocks.ADVANCED_USYALIUM_BLOCK.get());
        dropSelf(ModBlocks.FROZEN_SPRUCE_LOG.get());
        add(ModBlocks.FROZEN_STONE.get(), createSilkTouchDispatchTable(ModBlocks.FROZEN_STONE.get(),
                LootItem.lootTableItem(Blocks.COBBLESTONE)
        ));
        add(ModBlocks.ABYSS_ICE.get(), createSilkTouchOnlyTable(ModBlocks.ABYSS_ICE.get()));
        add(ModBlocks.ABYSS_PACKED_ICE.get(), createSilkTouchOnlyTable(ModBlocks.ABYSS_PACKED_ICE.get()));
        add(ModBlocks.FROZEN_GRASS_BLOCK.get(), createSilkTouchDispatchTable(ModBlocks.FROZEN_GRASS_BLOCK.get(),
                LootItem.lootTableItem(Blocks.DIRT)
        ));
        dropSelf(ModBlocks.ABYSS_OBSIDIAN.get());
        dropSelf(ModBlocks.FROZEN_STONE_BRICKS.get());
        dropSelf(ModBlocks.FROZEN_CRACKED_STONE_BRICKS.get());
        dropSelf(ModBlocks.FROZEN_CHISELED_STONE_BRICKS.get());
    }

}
