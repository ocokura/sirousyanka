package net.ocoserver.datagen.LootTables;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.ocoserver.common.init.ModBlocks;
import net.ocoserver.common.init.ModItems;
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
                .filter(block -> block != ModBlocks.HEATED_LAVA_BLOCK.get())
                .filter(block -> block != ModBlocks.LIQUID_NITROGEN_BLOCK.get())
                .toList();
    }

    @Override
    protected void generate() {
        add(ModBlocks.USYALIUM_ORE_BLOCK.get(), createOreDrop(ModBlocks.USYALIUM_ORE_BLOCK.get(), ModItems.RAW_USYALIUM.get()));
        add(ModBlocks.DEEPSLATE_USYALIUM_ORE_BLOCK.get(), createOreDrop(ModBlocks.DEEPSLATE_USYALIUM_ORE_BLOCK.get(), ModItems.RAW_USYALIUM.get()));
        dropSelf(ModBlocks.USYALIUM_BLOCK.get());
        dropSelf(ModBlocks.ADVANCED_USYALIUM_BLOCK.get());

        dropSelf(ModBlocks.FROZEN_SPRUCE_LOG.get());
        dropWhenSilkTouch(ModBlocks.FROZEN_SPRUCE_LEAVES.get());

        add(ModBlocks.SNOW_PILED_STONE.get(), createSilkTouchDispatchTable(ModBlocks.SNOW_PILED_STONE.get(),
                LootItem.lootTableItem(Blocks.COBBLESTONE)
        ));

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

        //ABYSS STONE BRICKS
        dropSelf(ModBlocks.ABYSS_STONE_BRICKS.get());
        registerStoneFamily(
                ModBlocks.ABYSS_STONE_BRICKS_STAIR.get(),
                ModBlocks.ABYSS_STONE_BRICKS_SLAB.get(),
                null,
                null,
                ModBlocks.ABYSS_STONE_BRICKS_WALL_BLOCK.get(),
                ModBlocks.CHISELED_ABYSS_STONE_BRICKS.get(),
                ModBlocks.CRACKED_ABYSS_STONE_BRICKS.get()
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

        //AZURE_STONE
        dropSelf(ModBlocks.AZURE_STONE.get());
        registerStoneFamily(
                ModBlocks.AZURE_STONE_STAIR.get(),
                ModBlocks.AZURE_STONE_SLAB.get(),
                null,
                null,
                ModBlocks.AZURE_STONE_WALL_BLOCK.get(),
                null,
                null
        );

        //POLISHED_AZURE_STONE
        dropSelf(ModBlocks.POLISHED_AZURE_STONE.get());
        registerStoneFamily(
                ModBlocks.POLISHED_AZURE_STONE_STAIR.get(),
                ModBlocks.POLISHED_AZURE_STONE_SLAB.get(),
                null,
                null,
                null,
                null,
                null
        );

        //LIME_STONE
        dropSelf(ModBlocks.LIME_STONE.get());
        registerStoneFamily(
                ModBlocks.LIME_STONE_STAIR.get(),
                ModBlocks.LIME_STONE_SLAB.get(),
                null,
                null,
                ModBlocks.LIME_STONE_WALL.get(),
                null,
                null
        );

        //LIME_STONE_BRICKS
        dropSelf(ModBlocks.LIME_STONE_BRICKS.get());
        registerStoneFamily(
                ModBlocks.LIME_STONE_BRICKS_STAIR.get(),
                ModBlocks.LIME_STONE_BRICKS_SLAB.get(),
                null,
                null,
                null,
                null,
                null
        );

        //氷雪のカラマツ
        registerWoodLootFamily(
                ModBlocks.ICE_LARCH_LOG.get(),
                ModBlocks.ICE_LARCH_WOOD.get(),
                ModBlocks.STRIPPED_ICE_LARCH_LOG.get(),
                ModBlocks.STRIPPED_ICE_LARCH_WOOD.get(),
                ModBlocks.ICE_LARCH_PLANKS.get(),
                ModBlocks.ICE_LARCH_PLANKS_STAIR.get(),
                ModBlocks.ICE_LARCH_PLANKS_SLAB.get(),
                ModBlocks.ICE_LARCH_PLANKS_FENCE.get(),
                ModBlocks.ICE_LARCH_PLANKS_FENCE_GATE.get(),
                ModBlocks.ICE_LARCH_PLANKS_PRESSURE_PLATE.get(),
                ModBlocks.ICE_LARCH_PLANKS_BUTTON.get(),
                ModBlocks.ICE_LARCH_PLANKS_DOOR.get(),
                ModBlocks.ICE_LARCH_PLANKS_TRAP_DOOR.get(),
                ModBlocks.ICE_LARCH_PLANKS_SIGN.get(),
                ModBlocks.ICE_LARCH_PLANKS_WALL_SIGN.get(),
                ModBlocks.ICE_LARCH_PLANKS_CEILING_HANGING_SIGN.get(),
                ModBlocks.ICE_LARCH_PLANKS_WALL_HANGING_SIGN.get(),
                ModBlocks.ICE_LARCH_SAPLING.get(),
                ModBlocks.ICE_LARCH_LEAVES.get()
        );

        //ケウチ
        registerWoodLootFamily(
                ModBlocks.KEUTI_LOG.get(),
                ModBlocks.KEUTI_WOOD.get(),
                ModBlocks.STRIPPED_KEUTI_LOG.get(),
                ModBlocks.STRIPPED_KEUTI_WOOD.get(),
                ModBlocks.KEUTI_PLANKS.get(),
                ModBlocks.KEUTI_PLANKS_STAIR.get(),
                ModBlocks.KEUTI_PLANKS_SLAB.get(),
                ModBlocks.KEUTI_PLANKS_FENCE.get(),
                ModBlocks.KEUTI_PLANKS_FENCE_GATE.get(),
                ModBlocks.KEUTI_PLANKS_PRESSURE_PLATE.get(),
                ModBlocks.KEUTI_PLANKS_BUTTON.get(),
                ModBlocks.KEUTI_PLANKS_DOOR.get(),
                ModBlocks.KEUTI_PLANKS_TRAP_DOOR.get(),
                ModBlocks.KEUTI_PLANKS_SIGN.get(),
                ModBlocks.KEUTI_PLANKS_WALL_SIGN.get(),
                ModBlocks.KEUTI_PLANKS_CEILING_HANGING_SIGN.get(),
                ModBlocks.KEUTI_PLANKS_WALL_HANGING_SIGN.get(),
                ModBlocks.KEUTI_SAPLING.get(),
                ModBlocks.KEUTI_LEAVES.get()
        );

        //紅晶樹
        registerWoodLootFamily(
                ModBlocks.CRIMSON_CRYSTAL_LOG.get(),
                ModBlocks.CRIMSON_CRYSTAL_WOOD.get(),
                ModBlocks.STRIPPED_CRIMSON_CRYSTAL_LOG.get(),
                ModBlocks.STRIPPED_CRIMSON_CRYSTAL_WOOD.get(),
                ModBlocks.CRIMSON_CRYSTAL_PLANKS.get(),
                ModBlocks.CRIMSON_CRYSTAL_PLANKS_STAIR.get(),
                ModBlocks.CRIMSON_CRYSTAL_PLANKS_SLAB.get(),
                ModBlocks.CRIMSON_CRYSTAL_PLANKS_FENCE.get(),
                ModBlocks.CRIMSON_CRYSTAL_PLANKS_FENCE_GATE.get(),
                ModBlocks.CRIMSON_CRYSTAL_PLANKS_PRESSURE_PLATE.get(),
                ModBlocks.CRIMSON_CRYSTAL_PLANKS_BUTTON.get(),
                ModBlocks.CRIMSON_CRYSTAL_PLANKS_DOOR.get(),
                ModBlocks.CRIMSON_CRYSTAL_PLANKS_TRAP_DOOR.get(),
                ModBlocks.CRIMSON_CRYSTAL_PLANKS_SIGN.get(),
                ModBlocks.CRIMSON_CRYSTAL_PLANKS_WALL_SIGN.get(),
                ModBlocks.CRIMSON_CRYSTAL_PLANKS_CEILING_HANGING_SIGN.get(),
                ModBlocks.CRIMSON_CRYSTAL_PLANKS_WALL_HANGING_SIGN.get(),
                ModBlocks.CRIMSON_CRYSTAL_SAPLING.get(),
                ModBlocks.CRIMSON_CRYSTAL_LEAVES.get()
        );

        //植物
        registerGrass(ModBlocks.FROZEN_GRASS.get());
        dropSelf(ModBlocks.FROZEN_POPPY.get());
        registerGrass(ModBlocks.BERRY_GRASS.get());
        dropSelf(ModBlocks.IRIS_PETAL.get());
        dropSelf(ModBlocks.FROST_FLARE.get());
        dropWhenSilkTouch(ModBlocks.ABYSS_STONE_GRASS.get());
        dropWhenSilkTouch(ModBlocks.LIT_ABYSS_STONE_GRASS.get());
        registerGrass(ModBlocks.ICE_BUSH.get());

    }

    private void registerGrass(Block block) {
        add(block, createShearsDispatchTable(block, LootItem.lootTableItem(Items.WHEAT_SEEDS).when(LootItemRandomChanceCondition.randomChance(0.125F))));
    }

    private void registerWoodLootFamily(
            Block log,
            Block wood,
            Block strippedLog,
            Block strippedWood,
            Block planks,
            Block stair,
            Block slab,
            Block fence,
            Block fenceGate,
            Block pressurePlate,
            Block button,
            Block door,
            Block trapdoor,
            Block sign,
            Block wallSign,
            Block ceilingSign,
            Block wallSignHanging,
            Block sapling,
            Block leaves
    ) {

        dropSelf(log);
        dropSelf(wood);
        dropSelf(strippedLog);
        dropSelf(strippedWood);
        dropSelf(planks);
        dropSelf(stair);
        dropSelf(fence);
        dropSelf(fenceGate);
        dropSelf(pressurePlate);
        dropSelf(button);
        dropSelf(trapdoor);
        dropSelf(sapling);

        add(slab, block -> createSlabItemTable(slab));

        add(door, block ->createDoorTable(door));

        dropSelf(sign);
        add(wallSign, block -> createSingleItemTable(sign));

        dropSelf(ceilingSign);
        add(wallSignHanging, block -> createSingleItemTable(ceilingSign));

        add(leaves, block -> createLeavesDrops(
                leaves,
                sapling,
                0.05F, 0.0625F, 0.083333336F, 0.1F
        ));
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
