package net.ocoserver.items;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.ocoserver.blocks.ModBlocks;
import net.ocoserver.main.Sirousyanka;

import java.util.function.Supplier;

public class CreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Sirousyanka.MODID);

    public static final Supplier<CreativeModeTab> SIROUSYANKA_ITEMS_TAB =
            CREATIVE_MODE_TAB.register("sirousyanka_item_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("sirousyanka_gui_creativeTab_title"))
                    .icon(() -> new ItemStack(ModItems.RAW_USYALIUM.get()))

                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.USYALIUM_INGOT.get());
                        output.accept(ModItems.USYALIUM_NUGGET.get());
                        output.accept(ModItems.RAW_USYALIUM.get());
                        output.accept(ModItems.ADVANCED_USYALIUM_INGOT.get());

                        output.accept(ModBlocks.USYALIUM_ORE_BLOCK.get());
                        output.accept(ModBlocks.DEEPSLATE_USYALIUM_ORE_BLOCK.get());
                        output.accept(ModBlocks.USYALIUM_BLOCK.get());
                        output.accept(ModBlocks.ADVANCED_USYALIUM_BLOCK.get());

                        output.accept(ModBlocks.FROZEN_SPRUCE_LOG.get());

                        // ABYSS
                        output.accept(ModBlocks.ABYSS_STONE.get());
                        output.accept(ModBlocks.ABYSS_STONE_STAIR.get());
                        output.accept(ModBlocks.ABYSS_STONE_SLAB.get());
                        output.accept(ModBlocks.ABYSS_STONE_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.ABYSS_STONE_BUTTON.get());

                        //ABYSS STONE BRICKS
                        output.accept(ModBlocks.ABYSS_STONE_BRICKS.get());
                        output.accept(ModBlocks.ABYSS_STONE_BRICKS_STAIR.get());
                        output.accept(ModBlocks.ABYSS_STONE_BRICKS_SLAB.get());
                        output.accept(ModBlocks.ABYSS_STONE_BRICKS_WALL_BLOCK.get());
                        output.accept(ModBlocks.CHISELED_ABYSS_STONE_BRICKS.get());
                        output.accept(ModBlocks.CRACKED_ABYSS_STONE_BRICKS.get());

                        //ABYSS COBBLE STONE
                        output.accept(ModBlocks.ABYSS_COBBLE_STONE.get());
                        output.accept(ModBlocks.ABYSS_COBBLE_STONE_STAIR.get());
                        output.accept(ModBlocks.ABYSS_COBBLE_STONE_SLAB.get());
                        output.accept(ModBlocks.ABYSS_COBBLE_STONE_WALL_BLOCK.get());

                        output.accept(ModBlocks.ABYSS_ICE.get());
                        output.accept(ModBlocks.ABYSS_PACKED_ICE.get());
                        output.accept(ModBlocks.ABYSS_OBSIDIAN.get());

                        // FROZEN
                        output.accept(ModBlocks.FROZEN_GRASS_BLOCK.get());
                        output.accept(ModBlocks.FROZEN_STONE.get());
                        output.accept(ModBlocks.FROZEN_STONE_STAIR.get());
                        output.accept(ModBlocks.FROZEN_STONE_SLAB.get());
                        output.accept(ModBlocks.FROZEN_STONE_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.FROZEN_STONE_BUTTON.get());

                        // FROZEN STONE BRICKS
                        output.accept(ModBlocks.FROZEN_STONE_BRICKS.get());
                        output.accept(ModBlocks.FROZEN_STONE_BRICKS_STAIR.get());
                        output.accept(ModBlocks.FROZEN_STONE_BRICKS_SLAB.get());
                        output.accept(ModBlocks.FROZEN_STONE_BRICKS_WALL_BLOCK.get());
                        output.accept(ModBlocks.FROZEN_CHISELED_STONE_BRICKS.get());
                        output.accept(ModBlocks.FROZEN_CRACKED_STONE_BRICKS.get());

                        //氷雪のカラマツ
                        output.accept(ModBlocks.ICE_LARCH_LOG.get());
                        output.accept(ModBlocks.ICE_LARCH_WOOD.get());
                        output.accept(ModBlocks.STRIPPED_ICE_LARCH_LOG.get());
                        output.accept(ModBlocks.STRIPPED_ICE_LARCH_WOOD.get());
                        output.accept(ModBlocks.ICE_LARCH_PLANKS.get());
                        output.accept(ModBlocks.ICE_LARCH_PLANKS_STAIR.get());
                        output.accept(ModBlocks.ICE_LARCH_PLANKS_SLAB.get());
                        output.accept(ModBlocks.ICE_LARCH_PLANKS_FENCE.get());
                        output.accept(ModBlocks.ICE_LARCH_PLANKS_FENCE_GATE.get());
                        output.accept(ModBlocks.ICE_LARCH_PLANKS_DOOR.get());
                        output.accept(ModBlocks.ICE_LARCH_PLANKS_TRAP_DOOR.get());
                        output.accept(ModBlocks.ICE_LARCH_PLANKS_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.ICE_LARCH_PLANKS_BUTTON.get());
                        output.accept(ModBlocks.ICE_LARCH_PLANKS_SIGN.get());
                        output.accept(ModBlocks.ICE_LARCH_PLANKS_CEILING_HANGING_SIGN.get());
                        output.accept(ModBlocks.ICE_LARCH_LEAVES.get());
                        output.accept(ModBlocks.ICE_LARCH_SAPLING.get());

                        //ケウチ
                        output.accept(ModBlocks.KEUTI_LOG.get());
                        output.accept(ModBlocks.KEUTI_WOOD.get());
                        output.accept(ModBlocks.STRIPPED_KEUTI_LOG.get());
                        output.accept(ModBlocks.STRIPPED_KEUTI_WOOD.get());
                        output.accept(ModBlocks.KEUTI_PLANKS.get());
                        output.accept(ModBlocks.KEUTI_PLANKS_STAIR.get());
                        output.accept(ModBlocks.KEUTI_PLANKS_SLAB.get());
                        output.accept(ModBlocks.KEUTI_PLANKS_FENCE.get());
                        output.accept(ModBlocks.KEUTI_PLANKS_FENCE_GATE.get());
                        output.accept(ModBlocks.KEUTI_PLANKS_DOOR.get());
                        output.accept(ModBlocks.KEUTI_PLANKS_TRAP_DOOR.get());
                        output.accept(ModBlocks.KEUTI_PLANKS_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.KEUTI_PLANKS_BUTTON.get());
                        output.accept(ModBlocks.KEUTI_PLANKS_SIGN.get());
                        output.accept(ModBlocks.KEUTI_PLANKS_CEILING_HANGING_SIGN.get());
                        output.accept(ModBlocks.KEUTI_LEAVES.get());
                        output.accept(ModBlocks.KEUTI_SAPLING.get());

                        //紅結晶
                        output.accept(ModBlocks.CRIMSON_CRYSTAL_LOG.get());
                        output.accept(ModBlocks.CRIMSON_CRYSTAL_WOOD.get());
                        output.accept(ModBlocks.STRIPPED_CRIMSON_CRYSTAL_LOG.get());
                        output.accept(ModBlocks.STRIPPED_CRIMSON_CRYSTAL_WOOD.get());
                        output.accept(ModBlocks.CRIMSON_CRYSTAL_PLANKS.get());
                        output.accept(ModBlocks.CRIMSON_CRYSTAL_PLANKS_STAIR.get());
                        output.accept(ModBlocks.CRIMSON_CRYSTAL_PLANKS_SLAB.get());
                        output.accept(ModBlocks.CRIMSON_CRYSTAL_PLANKS_FENCE.get());
                        output.accept(ModBlocks.CRIMSON_CRYSTAL_PLANKS_FENCE_GATE.get());
                        output.accept(ModBlocks.CRIMSON_CRYSTAL_PLANKS_DOOR.get());
                        output.accept(ModBlocks.CRIMSON_CRYSTAL_PLANKS_TRAP_DOOR.get());
                        output.accept(ModBlocks.CRIMSON_CRYSTAL_PLANKS_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.CRIMSON_CRYSTAL_PLANKS_BUTTON.get());
                        output.accept(ModBlocks.CRIMSON_CRYSTAL_PLANKS_SIGN.get());
                        output.accept(ModBlocks.CRIMSON_CRYSTAL_PLANKS_CEILING_HANGING_SIGN.get());
                        output.accept(ModBlocks.CRIMSON_CRYSTAL_LEAVES.get());
                        output.accept(ModBlocks.CRIMSON_CRYSTAL_SAPLING.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
