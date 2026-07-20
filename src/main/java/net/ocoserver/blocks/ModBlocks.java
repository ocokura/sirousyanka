package net.ocoserver.blocks;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.ocoserver.blocks.wood.ModWoodTypes;
import net.ocoserver.items.ModItems;
import net.ocoserver.main.Sirousyanka;
import org.jetbrains.annotations.Nullable;

import java.util.function.Function;
import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Sirousyanka.MODID);
    /*ウシャリウム鉱石
    * 深層岩ウシャリウム鉱石 k
    * ウシャリウムブロック　k
    * 高度なウシャリウムブロック k
    * 凍った松の原木 k
    * 深淵の石
    * 深淵の氷 k
    * 深淵の氷塊 k
    * 凍った草ブロック k
    * 凍った石 k
    * 深淵の黒曜石 k
    * 凍った石レンガ k
    * 凍った模様入り石レンガ k
    * 凍ったひび割れた石レンガ k
    * */
    public static final DeferredBlock<Block> USYALIUM_ORE_BLOCK = registerBlock("usyalium_ore_block", 3f, true, SoundType.STONE, null, Block::new);

    public static final DeferredBlock<Block> DEEPSLATE_USYALIUM_ORE_BLOCK = registerBlock("deepslate_usyalium_ore_block", 4f, true, SoundType.DEEPSLATE, null, Block::new);

    public static final DeferredBlock<Block> USYALIUM_BLOCK = registerBlock("usyalium_block", 4f, true, SoundType.STONE, null, Block::new);

    public static final DeferredBlock<Block> ADVANCED_USYALIUM_BLOCK = registerBlock("advanced_usyalium_block", 5f, true, SoundType.AMETHYST, null, Block::new);

    public static final DeferredBlock<RotatedPillarBlock> FROZEN_SPRUCE_LOG = registerBlock("frozen_spruce_log", 2.5f, false, SoundType.WOOD, 0.72f, RotatedPillarBlock::new);

    public static final DeferredBlock<Block> ABYSS_ICE = registerBlock("abyss_ice", () -> new Block(BlockBehaviour.Properties.of()
            .strength(1f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.GLASS)
            .friction(0.98F)
            .noOcclusion()
    ));

    public static final DeferredBlock<Block> ABYSS_PACKED_ICE = registerBlock("abyss_packed_ice", 1.5f, true, SoundType.GLASS, 0.98f, Block::new);

    public static final DeferredBlock<Block> FROZEN_GRASS_BLOCK = registerBlock("frozen_grass_block",1f, false, SoundType.GRASS, 0.72f, Block::new);

    public static final DeferredBlock<Block> ABYSS_OBSIDIAN = registerBlock("abyss_obsidian", 50f, true, SoundType.STONE, null, Block::new);

    //ABYSS_STONE
    public static final DeferredBlock<Block> ABYSS_STONE = registerBlock("abyss_stone", 3f, true, SoundType.STONE, null, Block::new);

    public static final DeferredBlock<StairBlock> ABYSS_STONE_STAIR = registerBlock("abyss_stone_stair", () -> new StairBlock(ModBlocks.ABYSS_STONE.get().defaultBlockState(),
            BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)
    ));

    public static final DeferredBlock<SlabBlock> ABYSS_STONE_SLAB = registerBlock("abyss_stone_slab", 3f, true, SoundType.STONE, null, SlabBlock::new);

    public static final DeferredBlock<PressurePlateBlock> ABYSS_STONE_PRESSURE_PLATE = registerBlock("abyss_stone_pressure_plate", () -> new PressurePlateBlock(BlockSetType.STONE,
            BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)
    ));

    public static final DeferredBlock<ButtonBlock> ABYSS_STONE_BUTTON = registerBlock("abyss_stone_button", () -> new ButtonBlock(BlockSetType.STONE, 20,
            BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE).noCollission()
    ));

    //ABYSS_COBBLE
    public static final DeferredBlock<Block> ABYSS_COBBLE_STONE = registerBlock("abyss_cobble_stone", 3f, true, SoundType.STONE, null, Block::new);

    public static final DeferredBlock<StairBlock> ABYSS_COBBLE_STONE_STAIR = registerBlock("abyss_cobble_stone_stair", () -> new StairBlock(ModBlocks.ABYSS_COBBLE_STONE.get().defaultBlockState(),
            BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)
    ));

    public static final DeferredBlock<SlabBlock> ABYSS_COBBLE_STONE_SLAB = registerBlock("abyss_cobble_stone_slab", 3f, true, SoundType.STONE, null, SlabBlock::new);

    public static final DeferredBlock<WallBlock> ABYSS_COBBLE_STONE_WALL_BLOCK = registerBlock("abyss_cobble_stone_wall_block", 3f, true, SoundType.STONE, null, WallBlock::new);

    //FROZEN_STONE
    public static final DeferredBlock<Block> FROZEN_STONE = registerBlock("frozen_stone", 3f, true, SoundType.STONE, 0.72f, Block::new);

    public static final DeferredBlock<StairBlock> FROZEN_STONE_STAIR = registerBlock("frozen_stone_stair", () -> new StairBlock(ModBlocks.FROZEN_STONE.get().defaultBlockState(),
            BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE).friction(0.72f)
    ));

    public static final DeferredBlock<SlabBlock> FROZEN_STONE_SLAB = registerBlock("frozen_stone_slab", 3f, true, SoundType.STONE, 0.72f, SlabBlock::new);

    public static final DeferredBlock<PressurePlateBlock> FROZEN_STONE_PRESSURE_PLATE = registerBlock("frozen_stone_pressure_plate", () -> new PressurePlateBlock(BlockSetType.STONE,
            BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE).friction(0.72f)
    ));

    public static final DeferredBlock<ButtonBlock> FROZEN_STONE_BUTTON = registerBlock("frozen_stone_button", () -> new ButtonBlock(BlockSetType.STONE, 20,
            BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE).friction(0.72f).noCollission()
    ));

    //FROZEN_STONE_BRICKS

    public static final DeferredBlock<Block> FROZEN_STONE_BRICKS = registerBlock("frozen_stone_bricks", 3f, true, SoundType.STONE, 0.72f, Block::new);

    public static final DeferredBlock<StairBlock> FROZEN_STONE_BRICKS_STAIR = registerBlock("frozen_stone_bricks_stair", () -> new StairBlock(
            ModBlocks.FROZEN_STONE_BRICKS.get().defaultBlockState(),
            BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE).friction(0.72f)
    ));

    public static final DeferredBlock<SlabBlock> FROZEN_STONE_BRICKS_SLAB = registerBlock("frozen_stone_bricks_slab", 3f, true, SoundType.STONE, 0.72f, SlabBlock::new);

    public static final DeferredBlock<WallBlock> FROZEN_STONE_BRICKS_WALL_BLOCK = registerBlock("frozen_stone_bricks_wall_block", 3f, true, SoundType.STONE, 0.72f, WallBlock::new);

    public static final DeferredBlock<Block> FROZEN_CHISELED_STONE_BRICKS = registerBlock("frozen_chiseled_stone_bricks", 3f, true, SoundType.STONE, 0.72f, Block::new);

    public static final DeferredBlock<Block> FROZEN_CRACKED_STONE_BRICKS = registerBlock("frozen_cracked_stone_bricks", 3f, true, SoundType.STONE, 0.72f, Block::new);



    //氷雪のカラマツ
    public static final DeferredBlock<RotatedPillarBlock> ICE_LARCH_LOG = registerBlock("ice_larch_log", 2.5f, false, SoundType.WOOD, null, RotatedPillarBlock::new);

    public static final DeferredBlock<RotatedPillarBlock> ICE_LARCH_WOOD = registerBlock("ice_larch_wood", 2.5f, false, SoundType.WOOD, null, RotatedPillarBlock::new);

    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_ICE_LARCH_LOG = registerBlock("stripped_ice_larch_log", 2.5f, false, SoundType.WOOD, null, RotatedPillarBlock::new);

    public static final DeferredBlock<RotatedPillarBlock> STRIPPED_ICE_LARCH_WOOD = registerBlock("stripped_ice_larch_wood", 2.5f, false, SoundType.WOOD, null, RotatedPillarBlock::new);

    public static final DeferredBlock<Block> ICE_LARCH_PLANKS = registerBlock("ice_larch_planks", 2.0f, false, SoundType.WOOD, null, Block::new); // 硬さはバニラ基準の2.0fに調整

    public static final DeferredBlock<LeavesBlock> ICE_LARCH_LEAVES = registerBlock("ice_larch_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of().strength(0.2f).randomTicks().sound(SoundType.GRASS).noOcclusion()
                    .isValidSpawn((state, level, pos, type) -> false)
                    .isSuffocating((state, level, pos) -> false)
                    .isViewBlocking((state, level, pos) -> false)
            ));

    public static final DeferredBlock<StairBlock> ICE_LARCH_PLANKS_STAIR = registerBlock("ice_larch_planks_stair", () -> new StairBlock(ModBlocks.ICE_LARCH_PLANKS.get().defaultBlockState(),
            BlockBehaviour.Properties.of().strength(2.0f).sound(SoundType.WOOD)
    ));

    public static final DeferredBlock<SlabBlock> ICE_LARCH_PLANKS_SLAB = registerBlock("ice_larch_planks_slab", 2.0f, false, SoundType.WOOD, null, SlabBlock::new);

    public static final DeferredBlock<PressurePlateBlock> ICE_LARCH_PLANKS_PRESSURE_PLATE = registerBlock("ice_larch_planks_pressure_plate", () -> new PressurePlateBlock(BlockSetType.ACACIA,
            BlockBehaviour.Properties.of().strength(0.5f).sound(SoundType.WOOD)
    ));

    public static final DeferredBlock<ButtonBlock> ICE_LARCH_PLANKS_BUTTON = registerBlock("ice_larch_planks_button", () -> new ButtonBlock(BlockSetType.ACACIA, 30,
            BlockBehaviour.Properties.of().strength(0.5f).sound(SoundType.WOOD).noCollission()
    ));

    public static final DeferredBlock<FenceBlock> ICE_LARCH_PLANKS_FENCE = registerBlock("ice_larch_planks_fence", 2.0f, false, SoundType.WOOD, null, FenceBlock::new);

    public static final DeferredBlock<FenceGateBlock> ICE_LARCH_PLANKS_FENCE_GATE = registerBlock("ice_larch_planks_fence_gate", () -> new FenceGateBlock(WoodType.ACACIA,
            BlockBehaviour.Properties.of().strength(2.0f).sound(SoundType.WOOD)
    ));

    public static final DeferredBlock<DoorBlock> ICE_LARCH_PLANKS_DOOR = registerBlock("ice_larch_planks_door", () -> new DoorBlock(BlockSetType.ACACIA,
            BlockBehaviour.Properties.of().strength(3.0f).sound(SoundType.WOOD).noOcclusion()
    ));

    public static final DeferredBlock<TrapDoorBlock> ICE_LARCH_PLANKS_TRAP_DOOR = registerBlock("ice_larch_planks_trap_door", () -> new TrapDoorBlock(BlockSetType.ACACIA,
            BlockBehaviour.Properties.of().strength(3.0f).sound(SoundType.WOOD).noOcclusion()
    ));

    public static final DeferredBlock<StandingSignBlock> ICE_LARCH_PLANKS_SIGN = registerBlockWithoutItem("ice_larch_planks_sign", () -> new StandingSignBlock(ModWoodTypes.ICE_LARCH,
            BlockBehaviour.Properties.of().noCollission().strength(1.0f).sound(SoundType.WOOD).noOcclusion()
    ));
    public static final DeferredBlock<WallSignBlock> ICE_LARCH_PLANKS_WALL_SIGN = registerBlockWithoutItem("ice_larch_planks_wall_sign", () -> new WallSignBlock(ModWoodTypes.ICE_LARCH,
            BlockBehaviour.Properties.of().noCollission().strength(1.0f).sound(SoundType.WOOD).noOcclusion().lootFrom(ICE_LARCH_PLANKS_SIGN)
    ));

    public static final DeferredBlock<CeilingHangingSignBlock> ICE_LARCH_PLANKS_CEILING_HANGING_SIGN = registerBlockWithoutItem("ice_larch_planks_ceiling_hanging_sign", () -> new CeilingHangingSignBlock(ModWoodTypes.ICE_LARCH,
            BlockBehaviour.Properties.of().strength(1.0f).sound(SoundType.WOOD).noOcclusion()
    ));
    public static final DeferredBlock<WallHangingSignBlock> ICE_LARCH_PLANKS_WALL_HANGING_SIGN = registerBlockWithoutItem("ice_larch_planks_wall_hanging_sign", () -> new WallHangingSignBlock(ModWoodTypes.ICE_LARCH,
            BlockBehaviour.Properties.of().strength(1.0f).sound(SoundType.WOOD).noOcclusion().lootFrom(ICE_LARCH_PLANKS_CEILING_HANGING_SIGN)
    ));

    public static final DeferredBlock<SaplingBlock> ICE_LARCH_SAPLING = registerBlock("ice_larch_sapling", () -> new SaplingBlock(null,
            BlockBehaviour.Properties.of().strength(0f).randomTicks().sound(SoundType.GRASS).noOcclusion().noCollission()
    ));




    //--------------------------------ここからメソッド--------------------------------------------------------



    private static <T extends Block> DeferredBlock<T> registerBlock(
            String name,
            float strength,
            boolean requiresCorrectTool,
            SoundType sound,
            @Nullable Float friction,
            Function<BlockBehaviour.Properties, T> function
    ) {
        BlockBehaviour.Properties properties = BlockBehaviour.Properties.of().strength(strength).sound(sound);
        if (friction == null) {
            friction = 0.6f;
        }
        properties.friction(friction);
        if (requiresCorrectTool) {
            properties.requiresCorrectToolForDrops();
        }
        DeferredBlock<T> result = BLOCKS.register(name, () -> function.apply(properties));
        registerBlockItem(name, result);
        return result;
    }

    private static <T extends Block> DeferredBlock<T> registerBlockWithoutItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
