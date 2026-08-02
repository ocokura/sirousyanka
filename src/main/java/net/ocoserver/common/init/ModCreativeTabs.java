package net.ocoserver.common.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.ocoserver.Sirousyanka;

import java.util.function.Supplier;

public class ModCreativeTabs {

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
                        output.accept(ModBlocks.FROZEN_SPRUCE_LEAVES.get());

                        output.accept(ModBlocks.SNOW_PILED_STONE.get());

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
                        output.accept(ModBlocks.ABYSS_GRASS_BLOCK.get());

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

                        // AZURE_STONE
                        output.accept(ModBlocks.AZURE_STONE.get());
                        output.accept(ModBlocks.AZURE_STONE_STAIR.get());
                        output.accept(ModBlocks.AZURE_STONE_SLAB.get());
                        output.accept(ModBlocks.AZURE_STONE_WALL_BLOCK.get());

                        // POLISHED_AZURE_STONE
                        output.accept(ModBlocks.POLISHED_AZURE_STONE.get());
                        output.accept(ModBlocks.POLISHED_AZURE_STONE_STAIR.get());
                        output.accept(ModBlocks.POLISHED_AZURE_STONE_SLAB.get());

                        //LIME STONE
                        output.accept(ModBlocks.LIME_STONE.get());
                        output.accept(ModBlocks.LIME_STONE_STAIR.get());
                        output.accept(ModBlocks.LIME_STONE_SLAB.get());
                        output.accept(ModBlocks.LIME_STONE_WALL.get());

                        //LIME STONE BRICKS
                        output.accept(ModBlocks.LIME_STONE_BRICKS.get());
                        output.accept(ModBlocks.LIME_STONE_BRICKS_STAIR.get());
                        output.accept(ModBlocks.LIME_STONE_BRICKS_SLAB.get());

                        //SOLID NITROGEN
                        output.accept(ModBlocks.SOLID_NITROGEN_BLOCK.get());
                        output.accept(ModBlocks.SOLID_NITROGEN_STAIR.get());
                        output.accept(ModBlocks.SOLID_NITROGEN_SLAB.get());

                        //SOLID NITROGEN BRICKS
                        output.accept(ModBlocks.SOLID_NITROGEN_BRICKS.get());
                        output.accept(ModBlocks.SOLID_NITROGEN_BRICKS_STAIR.get());
                        output.accept(ModBlocks.SOLID_NITROGEN_BRICKS_SLAB.get());
                        output.accept(ModBlocks.SOLID_NITROGEN_BRICKS_WALL.get());

                        //氷雪のカラマツ
                        output.accept(ModBlocks.ICE_LARCH_LOG.get());
                        output.accept(ModBlocks.ICE_LARCH_WOOD.get());
                        output.accept(ModBlocks.STRIPPED_ICE_LARCH_LOG.get());
                        output.accept(ModBlocks.STRIPPED_ICE_LARCH_WOOD.get());
                        output.accept(ModBlocks.ICE_LARCH_PLANKS.get());
                        output.accept(ModBlocks.ICE_LARCH_STAIR.get());
                        output.accept(ModBlocks.ICE_LARCH_SLAB.get());
                        output.accept(ModBlocks.ICE_LARCH_FENCE.get());
                        output.accept(ModBlocks.ICE_LARCH_FENCE_GATE.get());
                        output.accept(ModBlocks.ICE_LARCH_DOOR.get());
                        output.accept(ModBlocks.ICE_LARCH_TRAP_DOOR.get());
                        output.accept(ModBlocks.ICE_LARCH_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.ICE_LARCH_BUTTON.get());
                        output.accept(ModBlocks.ICE_LARCH_SIGN.get());
                        output.accept(ModBlocks.ICE_LARCH_CEILING_HANGING_SIGN.get());
                        output.accept(ModBlocks.ICE_LARCH_LEAVES.get());
                        output.accept(ModBlocks.ICE_LARCH_SAPLING.get());

                        //ケウチ
                        output.accept(ModBlocks.KEUTI_LOG.get());
                        output.accept(ModBlocks.KEUTI_WOOD.get());
                        output.accept(ModBlocks.STRIPPED_KEUTI_LOG.get());
                        output.accept(ModBlocks.STRIPPED_KEUTI_WOOD.get());
                        output.accept(ModBlocks.KEUTI_PLANKS.get());
                        output.accept(ModBlocks.KEUTI_STAIR.get());
                        output.accept(ModBlocks.KEUTI_SLAB.get());
                        output.accept(ModBlocks.KEUTI_FENCE.get());
                        output.accept(ModBlocks.KEUTI_FENCE_GATE.get());
                        output.accept(ModBlocks.KEUTI_DOOR.get());
                        output.accept(ModBlocks.KEUTI_TRAP_DOOR.get());
                        output.accept(ModBlocks.KEUTI_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.KEUTI_BUTTON.get());
                        output.accept(ModBlocks.KEUTI_SIGN.get());
                        output.accept(ModBlocks.KEUTI_CEILING_HANGING_SIGN.get());
                        output.accept(ModBlocks.KEUTI_LEAVES.get());
                        output.accept(ModBlocks.KEUTI_SAPLING.get());

                        //紅結晶
                        output.accept(ModBlocks.CRIMSON_CRYSTAL_LOG.get());
                        output.accept(ModBlocks.CRIMSON_CRYSTAL_WOOD.get());
                        output.accept(ModBlocks.STRIPPED_CRIMSON_CRYSTAL_LOG.get());
                        output.accept(ModBlocks.STRIPPED_CRIMSON_CRYSTAL_WOOD.get());
                        output.accept(ModBlocks.CRIMSON_CRYSTAL_PLANKS.get());
                        output.accept(ModBlocks.CRIMSON_CRYSTAL_STAIR.get());
                        output.accept(ModBlocks.CRIMSON_CRYSTAL_SLAB.get());
                        output.accept(ModBlocks.CRIMSON_CRYSTAL_FENCE.get());
                        output.accept(ModBlocks.CRIMSON_CRYSTAL_FENCE_GATE.get());
                        output.accept(ModBlocks.CRIMSON_CRYSTAL_DOOR.get());
                        output.accept(ModBlocks.CRIMSON_CRYSTAL_TRAP_DOOR.get());
                        output.accept(ModBlocks.CRIMSON_CRYSTAL_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.CRIMSON_CRYSTAL_BUTTON.get());
                        output.accept(ModBlocks.CRIMSON_CRYSTAL_SIGN.get());
                        output.accept(ModBlocks.CRIMSON_CRYSTAL_CEILING_HANGING_SIGN.get());
                        output.accept(ModBlocks.CRIMSON_CRYSTAL_LEAVES.get());
                        output.accept(ModBlocks.CRIMSON_CRYSTAL_SAPLING.get());
                        output.accept(ModBlocks.CRIMSON_GRASS_BLOCK.get());

                        //ニトロウド
                        output.accept(ModBlocks.NITROWD_LOG.get());
                        output.accept(ModBlocks.NITROWD_WOOD.get());
                        output.accept(ModBlocks.STRIPPED_NITROWD_LOG.get());
                        output.accept(ModBlocks.STRIPPED_NITROWD_WOOD.get());
                        output.accept(ModBlocks.NITROWD_PLANKS.get());
                        output.accept(ModBlocks.NITROWD_STAIR.get());
                        output.accept(ModBlocks.NITROWD_SLAB.get());
                        output.accept(ModBlocks.NITROWD_FENCE.get());
                        output.accept(ModBlocks.NITROWD_FENCE_GATE.get());
                        output.accept(ModBlocks.NITROWD_DOOR.get());
                        output.accept(ModBlocks.NITROWD_TRAP_DOOR.get());
                        output.accept(ModBlocks.NITROWD_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.NITROWD_BUTTON.get());
                        output.accept(ModBlocks.NITROWD_SIGN.get());
                        output.accept(ModBlocks.NITROWD_CEILING_HANGING_SIGN.get());
                        output.accept(ModBlocks.NITROWD_LEAVES.get());
                        output.accept(ModBlocks.NITROWD_SAPLING.get());

                        //plant
                        output.accept(ModBlocks.FROZEN_GRASS.get());
                        output.accept(ModBlocks.FROZEN_POPPY.get());
                        output.accept(ModBlocks.BERRY_GRASS.get());
                        output.accept(ModBlocks.IRIS_PETAL.get());
                        output.accept(ModBlocks.FROST_FLARE.get());
                        output.accept(ModBlocks.ABYSS_STONE_GRASS.get());
                        output.accept(ModBlocks.LIT_ABYSS_STONE_GRASS.get());
                        output.accept(ModBlocks.ICE_BUSH.get());
                        output.accept(ModBlocks.PINK_AZUSAI.get());
                        output.accept(ModBlocks.BLUE_AZUSAI.get());
                        output.accept(ModBlocks.PURPLE_AZUSAI.get());
                        output.accept(ModBlocks.CRIMSON_GRASS.get());
                        output.accept(ModBlocks.ABYSS_GRASS.get());
                        output.accept(ModBlocks.COSMOS.get());
                        output.accept(ModBlocks.SPIKE_ICER.get());
                        output.accept(ModBlocks.BLOWER.get());

                        //geyser
                        output.accept(ModBlocks.MINI_GEYSER.get());

                        //Fluid
                        output.accept(ModItems.HEATED_LAVA_BUCKET.get());
                        output.accept(ModItems.LIQUID_NITROGEN_BUCKET.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
