package net.ocoserver.items;

import net.minecraft.world.item.HangingSignItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.ocoserver.blocks.ModBlocks;
import net.ocoserver.main.Sirousyanka;


public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Sirousyanka.MODID);

    public static final DeferredItem<Item> USYALIUM_INGOT = ITEMS.registerSimpleItem("usyalium_ingot");
    public static final DeferredItem<Item> USYALIUM_NUGGET = ITEMS.registerSimpleItem("usyalium_nugget");
    public static final DeferredItem<Item> RAW_USYALIUM = ITEMS.registerSimpleItem("raw_usyalium");
    public static final DeferredItem<Item> ADVANCED_USYALIUM_INGOT = ITEMS.registerSimpleItem("advanced_usyalium_ingot");

    //氷雪のカラマツ
    public static final DeferredItem<Item> ICE_LARCH_PLANKS_SIGN = ITEMS.register("ice_larch_planks_sign",
                    () -> new SignItem(new Item.Properties(), ModBlocks.ICE_LARCH_PLANKS_SIGN.get(), ModBlocks.ICE_LARCH_PLANKS_WALL_SIGN.get()));

    public static final DeferredItem<Item> ICE_LARCH_PLANKS_CEILING_HANGING_SIGN =
            ITEMS.register("ice_larch_planks_ceiling_hanging_sign",
                    () -> new HangingSignItem(ModBlocks.ICE_LARCH_PLANKS_CEILING_HANGING_SIGN.get(), ModBlocks.ICE_LARCH_PLANKS_WALL_HANGING_SIGN.get(), new Item.Properties()));

    //ケウチ
    public static final DeferredItem<Item> KEUTI_PLANKS_SIGN = ITEMS.register("keuti_planks_sign",
            () -> new SignItem(new Item.Properties(), ModBlocks.KEUTI_PLANKS_SIGN.get(), ModBlocks.KEUTI_PLANKS_WALL_SIGN.get()));

    public static final DeferredItem<Item> KEUTI_PLANKS_CEILING_HANGING_SIGN =
            ITEMS.register("keuti_planks_ceiling_hanging_sign",
                    () -> new HangingSignItem(ModBlocks.KEUTI_PLANKS_CEILING_HANGING_SIGN.get(), ModBlocks.KEUTI_PLANKS_WALL_HANGING_SIGN.get(), new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
