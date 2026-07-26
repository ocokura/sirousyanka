package net.ocoserver.datagen.Tags;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.*;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.ocoserver.datagen.ModTags;
import net.ocoserver.common.block.ModBlocks;
import net.ocoserver.Sirousyanka;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class BlockTag extends BlockTagsProvider {

    public BlockTag(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Sirousyanka.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        tag(ModTags.Blocks.STONES)
            .add(ModBlocks.SNOW_PILED_STONE.get());

        //Abyss Stone系
        registerStoneFamily(
                ModBlocks.ABYSS_STONE.get(),
                ModBlocks.ABYSS_STONE_STAIR.get(),
                ModBlocks.ABYSS_STONE_SLAB.get(),
                ModBlocks.ABYSS_STONE_PRESSURE_PLATE.get(),
                ModBlocks.ABYSS_STONE_BUTTON.get(),
                null,
                null,
                null
        );

        //ABYSS STONE BRICKS
        registerStoneFamily(
                ModBlocks.ABYSS_STONE.get(),
                ModBlocks.ABYSS_STONE_STAIR.get(),
                ModBlocks.ABYSS_STONE_SLAB.get(),
                null,
                null,
                ModBlocks.ABYSS_STONE_BRICKS_WALL_BLOCK.get(),
                ModBlocks.CHISELED_ABYSS_STONE_BRICKS.get(),
                ModBlocks.CRACKED_ABYSS_STONE_BRICKS.get()
        );

        //Abyss Cobble
        tag(ModTags.Blocks.STONE_TOOL_MATERIAL)
            .add(ModBlocks.ABYSS_COBBLE_STONE.get());
        registerStoneFamily(
                ModBlocks.ABYSS_COBBLE_STONE.get(),
                ModBlocks.ABYSS_COBBLE_STONE_STAIR.get(),
                ModBlocks.ABYSS_COBBLE_STONE_SLAB.get(),
                null,
                null,
                ModBlocks.ABYSS_COBBLE_STONE_WALL_BLOCK.get(),
                null,
                null
        );

        //Frozen Stone
        registerStoneFamily(
                ModBlocks.FROZEN_STONE.get(),
                ModBlocks.FROZEN_STONE_STAIR.get(),
                ModBlocks.FROZEN_STONE_SLAB.get(),
                ModBlocks.FROZEN_STONE_PRESSURE_PLATE.get(),
                ModBlocks.FROZEN_STONE_BUTTON.get(),
                null,
                null,
                null
        );

        //Frozen Stone Bricks
        registerStoneFamily(
                ModBlocks.FROZEN_STONE_BRICKS.get(),
                ModBlocks.FROZEN_STONE_BRICKS_STAIR.get(),
                ModBlocks.FROZEN_STONE_BRICKS_SLAB.get(),
                null,
                null,
                ModBlocks.FROZEN_STONE_BRICKS_WALL_BLOCK.get(),
                ModBlocks.FROZEN_CHISELED_STONE_BRICKS.get(),
                ModBlocks.FROZEN_CRACKED_STONE_BRICKS.get()
        );

        //AZURE STONE
        registerStoneFamily(
                ModBlocks.AZURE_STONE.get(),
                ModBlocks.AZURE_STONE_STAIR.get(),
                ModBlocks.AZURE_STONE_SLAB.get(),
                null,
                null,
                ModBlocks.AZURE_STONE_WALL_BLOCK.get(),
                null,
                null
        );

        //POLISHED AZURE STONE
        registerStoneFamily(
                ModBlocks.POLISHED_AZURE_STONE.get(),
                ModBlocks.POLISHED_AZURE_STONE_STAIR.get(),
                ModBlocks.POLISHED_AZURE_STONE_SLAB.get(),
                null,
                null,
                null,
                null,
                null
        );

        //LIME STONE
        registerStoneFamily(
                ModBlocks.LIME_STONE.get(),
                ModBlocks.LIME_STONE_STAIR.get(),
                ModBlocks.LIME_STONE_SLAB.get(),
                null,
                null,
                ModBlocks.LIME_STONE_WALL.get(),
                null,
                null
        );

        //LIME STONE BRICKS
        registerStoneFamily(
                ModBlocks.LIME_STONE_BRICKS.get(),
                ModBlocks.LIME_STONE_BRICKS_STAIR.get(),
                ModBlocks.LIME_STONE_BRICKS_SLAB.get(),
                null,
                null,
                null,
                null,
                null
        );

        //氷雪のカラマツブロック
        registerWoodBlockTags(
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
                ModBlocks.ICE_LARCH_LEAVES.get(),
                ModBlocks.ICE_LARCH_SAPLING.get()
        );

        //ケウチ
        registerWoodBlockTags(
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
                ModBlocks.KEUTI_LEAVES.get(),
                ModBlocks.KEUTI_SAPLING.get()
        );

        //紅晶樹
        registerWoodBlockTags(
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
                ModBlocks.CRIMSON_CRYSTAL_LEAVES.get(),
                ModBlocks.CRIMSON_CRYSTAL_SAPLING.get()
        );

        tag(ModTags.Blocks.USYALIUM)
                .add(ModBlocks.USYALIUM_ORE_BLOCK.get())
                .add(ModBlocks.DEEPSLATE_USYALIUM_ORE_BLOCK.get())
                .add(ModBlocks.USYALIUM_BLOCK.get())
                .add(ModBlocks.ADVANCED_USYALIUM_BLOCK.get());

        //ツールが必要か
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .addTag(ModTags.Blocks.STONES)
                .addTag(ModTags.Blocks.USYALIUM)
                .add(ModBlocks.ABYSS_ICE.get())
                .add(ModBlocks.ABYSS_PACKED_ICE.get())
                .add(ModBlocks.ABYSS_OBSIDIAN.get());

        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.FROZEN_SPRUCE_LOG.get());

        tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(ModBlocks.FROZEN_GRASS_BLOCK.get());

        tag(BlockTags.NEEDS_STONE_TOOL)
                .addTag(ModTags.Blocks.STONES);

        tag(BlockTags.NEEDS_IRON_TOOL)
                .addTag(ModTags.Blocks.USYALIUM);

    }

    private void registerWoodBlockTags(
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
            Block leaves,
            Block sapling
    ) {

        //各アイテムを各カテゴリーのタグに登録
        tag(BlockTags.PLANKS)
            .add(planks);
        tag(BlockTags.LOGS)
                .add(log)
                .add(strippedLog);
        tag(BlockTags.LOGS_THAT_BURN)
                .add(log)
                .add(strippedLog)
                .add(wood)
                .add(strippedWood);
        tag(BlockTags.STAIRS).add(stair);
        tag(BlockTags.SLABS).add(slab);
        tag(BlockTags.FENCES).add(fence);
        tag(BlockTags.FENCE_GATES).add(fenceGate);
        tag(BlockTags.PRESSURE_PLATES).add(pressurePlate);
        tag(BlockTags.BUTTONS).add(button);
        tag(BlockTags.DOORS).add(door);
        tag(BlockTags.TRAPDOORS).add(trapdoor);
        tag(BlockTags.LEAVES).add(leaves);
        tag(BlockTags.SAPLINGS).add(sapling);
        tag(BlockTags.STANDING_SIGNS).add(sign);
        tag(BlockTags.WALL_SIGNS).add(wallSign);
        tag(BlockTags.CEILING_HANGING_SIGNS).add(ceilingSign);
        tag(BlockTags.WALL_HANGING_SIGNS).add(wallSignHanging);

        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(log).add(strippedLog).add(wood).add(strippedWood)
                .add(planks).add(stair).add(slab).add(fence).add(fenceGate)
                .add(pressurePlate).add(button)
                .add(door).add(trapdoor).add(sign).add(wallSign)
                .add(ceilingSign).add(wallSignHanging);

        tag(ModTags.Blocks.BURN_IN_FURNACE_PLANKS_BLOCK)
                .add(slab)
                .add(stair)
                .add(fence)
                .add(fenceGate)
                .add(door)
                .add(trapdoor)
                .add(sign)
                .add(ceilingSign);

        tag(ModTags.Blocks.BURN_IN_FURNACE_SHORT_BLOCK)
                .add(pressurePlate)
                .add(button)
                .add(sapling);
    }

    private void registerStoneFamily(
            Block baseBlock,
            StairBlock stairBlock,
            SlabBlock slabBlock,
            @Nullable PressurePlateBlock pressurePlateBlock,
            @Nullable ButtonBlock buttonBlock,
            @Nullable WallBlock wallBlock,
            @Nullable Block chiseledBlock,
            @Nullable Block crackedBlock
    ) {
        tag(ModTags.Blocks.STONES)
            .add(baseBlock)
            .add(stairBlock)
            .add(slabBlock);
        //階段
        tag(BlockTags.STAIRS)
            .add(stairBlock);
        //ハーフ
        tag(BlockTags.SLABS)
            .add(slabBlock);
        //感圧板
        if (pressurePlateBlock != null) {
            tag(ModTags.Blocks.STONES)
                .add(pressurePlateBlock);
            tag(BlockTags.PRESSURE_PLATES)
                .add(pressurePlateBlock);
        }
        //ボタン
        if (buttonBlock != null) {
            tag(ModTags.Blocks.STONES)
                .add(buttonBlock);
            tag(BlockTags.BUTTONS)
                    .add(buttonBlock);
        }
        //壁
        if (wallBlock != null) {
            tag(ModTags.Blocks.STONES)
                .add(wallBlock);
            tag(BlockTags.WALLS)
                .add(wallBlock);
        }
        if (chiseledBlock != null) {
            tag(ModTags.Blocks.STONES)
                .add(chiseledBlock);
        }
        if (crackedBlock != null) {
            tag(ModTags.Blocks.STONES)
                .add(crackedBlock);
        }
    }

}
