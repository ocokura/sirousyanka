package net.ocoserver.blocks;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.ocoserver.items.ModItems;
import net.ocoserver.main.Sirousyanka;

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
