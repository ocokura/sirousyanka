package net.ocoserver.blocks;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.ocoserver.items.ModItems;
import net.ocoserver.main.Sirousyanka;

import java.util.Properties;
import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Sirousyanka.MODID);

    public static final DeferredBlock<Block> USYALIUM_ORE_BLOCK = registerBlock("usyalium_ore_block", () -> new Block(BlockBehaviour.Properties.of()
            .strength(3f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
    ));
    public static final DeferredBlock<Block> DEEPSLATE_USYALIUM_ORE_BLOCK = registerBlock("deepslate_usyalium_ore_block", () -> new Block(BlockBehaviour.Properties.of()
            .strength(4f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.DEEPSLATE)
    ));
    public static final DeferredBlock<Block> USYALIUM_BLOCK = registerBlock("usyalium_block", () -> new Block(BlockBehaviour.Properties.of()
            .strength(4f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
    ));
    public static final DeferredBlock<Block> ADVANCED_USYALIUM_BLOCK = registerBlock("advanced_usyalium_block", () -> new Block(BlockBehaviour.Properties.of()
            .strength(5f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.AMETHYST)
    ));

    public static final DeferredBlock<RotatedPillarBlock> FROZEN_SPRUCE_LOG = registerBlock("frozen_spruce_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of()
            .strength(2f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.WOOD)
    ));

    public static final DeferredBlock<Block> ABYSS_STONE = registerBlock("abyss_stone", () -> new Block(BlockBehaviour.Properties.of()
            .strength(3f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
    ));

    public static final DeferredBlock<Block> ABYSS_ICE = registerBlock("abyss_ice", () -> new Block(BlockBehaviour.Properties.of()
            .strength(1f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.GLASS)
    ));

    public static final DeferredBlock<Block> ABYSS_PACKED_ICE = registerBlock("abyss_packed_ice", () -> new Block(BlockBehaviour.Properties.of()
            .strength(1.5f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.GLASS)
    ));

    public static final DeferredBlock<Block> FROZEN_GRASS_BLOCK = registerBlock("frozen_grass_block", () -> new Block(BlockBehaviour.Properties.of()
            .strength(0.6f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.GRASS)
    ));

    public static final DeferredBlock<Block> FROZEN_STONE = registerBlock("frozen_stone", () -> new Block(BlockBehaviour.Properties.of()
            .strength(3f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
    ));

    public static final DeferredBlock<Block> ABYSS_OBSIDIAN = registerBlock("abyss_obsidian", () -> new Block(BlockBehaviour.Properties.of()
            .strength(50f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
    ));

    public static final DeferredBlock<Block> FROZEN_STONE_BRICKS = registerBlock("frozen_stone_bricks", () -> new Block(BlockBehaviour.Properties.of()
            .strength(3f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
    ));

    public static final DeferredBlock<Block> FROZEN_CHISELED_STONE_BRICKS = registerBlock("frozen_chiseled_stone_bricks", () -> new Block(BlockBehaviour.Properties.of()
            .strength(3f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
    ));

    public static final DeferredBlock<Block> FROZEN_CRACKED_STONE_BRICKS = registerBlock("frozen_cracked_stone_bricks", () -> new Block(BlockBehaviour.Properties.of()
            .strength(3f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
    ));

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
