package net.ocoserver.Provider.LootTables;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.ocoserver.blocks.ModBlocks;
import net.ocoserver.items.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.Set;

public class BlockLootTable extends BlockLootSubProvider {

    public BlockLootTable(HolderLookup.Provider lookupProvider) {
        super(Set.of(), FeatureFlags.DEFAULT_FLAGS, lookupProvider);
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries()
                .stream()
                .map(e -> (Block) e.value())
                .toList();
    }

    @Override
    protected void generate() {
        add(ModBlocks.USYALIUM_ORE_BLOCK.get(), createOreDrop(ModBlocks.USYALIUM_ORE_BLOCK.get(), ModItems.RAW_USYALIUM.get()));
        add(ModBlocks.DEEPSLATE_USYALIUM_ORE_BLOCK.get(), createOreDrop(ModBlocks.DEEPSLATE_USYALIUM_ORE_BLOCK.get(), ModItems.RAW_USYALIUM.get()));
        dropSelf(ModBlocks.USYALIUM_BLOCK.get());
        dropSelf(ModBlocks.ADVANCED_USYALIUM_BLOCK.get());

        dropSelf(ModBlocks.FROZEN_SPRUCE_LOG.get());

        add(ModBlocks.ABYSS_ICE.get(), createSilkTouchOnlyTable(ModBlocks.ABYSS_ICE.get()));
        add(ModBlocks.ABYSS_PACKED_ICE.get(), createSilkTouchOnlyTable(ModBlocks.ABYSS_PACKED_ICE.get()));

        add(ModBlocks.FROZEN_GRASS_BLOCK.get(), createSilkTouchDispatchTable(ModBlocks.FROZEN_GRASS_BLOCK.get(),
                LootItem.lootTableItem(Blocks.DIRT)
        ));

        dropSelf(ModBlocks.ABYSS_OBSIDIAN.get());

        //Abyss Stone系
        add(ModBlocks.ABYSS_STONE.get(), createSilkTouchDispatchTable(ModBlocks.ABYSS_STONE.get(),
                LootItem.lootTableItem(ModBlocks.ABYSS_COBBLE_STONE.get())
        ));
        registerStoneFamily(
                ModBlocks.ABYSS_STONE_STAIR.get(),
                ModBlocks.ABYSS_STONE_SLAB.get(),
                ModBlocks.ABYSS_STONE_PRESSURE_PLATE.get(),
                ModBlocks.ABYSS_STONE_BUTTON.get(),
                null,
                null,
                null
        );

        //ABYSS_COBLE
        dropSelf(ModBlocks.ABYSS_COBBLE_STONE.get());
        registerStoneFamily(
                ModBlocks.ABYSS_COBBLE_STONE_STAIR.get(),
                ModBlocks.ABYSS_COBBLE_STONE_SLAB.get(),
                null,
                null,
                ModBlocks.ABYSS_COBBLE_STONE_WALL_BLOCK.get(),
                null,
                null
        );

        //FROZEN_STONE
        add(ModBlocks.FROZEN_STONE.get(), createSilkTouchDispatchTable(ModBlocks.FROZEN_STONE.get(),
                LootItem.lootTableItem(Blocks.COBBLESTONE)
        ));
        registerStoneFamily(
                ModBlocks.FROZEN_STONE_STAIR.get(),
                ModBlocks.FROZEN_STONE_SLAB.get(),
                ModBlocks.FROZEN_STONE_PRESSURE_PLATE.get(),
                ModBlocks.FROZEN_STONE_BUTTON.get(),
                null,
                null,
                null
        );

        //FROZEN_STONE_BRICKS
        dropSelf(ModBlocks.FROZEN_STONE_BRICKS.get());
        registerStoneFamily(
                ModBlocks.FROZEN_STONE_BRICKS_STAIR.get(),
                ModBlocks.FROZEN_STONE_BRICKS_SLAB.get(),
                null,
                null,
                ModBlocks.FROZEN_STONE_BRICKS_WALL_BLOCK.get(),
                ModBlocks.FROZEN_CHISELED_STONE_BRICKS.get(),
                ModBlocks.FROZEN_CRACKED_STONE_BRICKS.get()
                );

    }

    private void registerStoneFamily(
        StairBlock stairBlock,
        SlabBlock slabBlock,
        @Nullable PressurePlateBlock pressurePlateBlock,
        @Nullable ButtonBlock buttonBlock,
        @Nullable WallBlock wallBlock,
        @Nullable Block chiseledBlock,
        @Nullable Block crackedBlock
    ) {
        dropSelf(stairBlock);
        add(slabBlock, block -> createSlabItemTable(slabBlock));
        if (pressurePlateBlock != null) {
            dropSelf(pressurePlateBlock);
        }
        if (buttonBlock != null) {
            dropSelf(buttonBlock);
        }
        if (wallBlock != null) {
            dropSelf(wallBlock);
        }
        if (chiseledBlock != null) {
            dropSelf(chiseledBlock);
        }
        if (crackedBlock != null) {
            dropSelf(crackedBlock);
        }
    }
}
