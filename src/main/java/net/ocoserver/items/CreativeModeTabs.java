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
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
