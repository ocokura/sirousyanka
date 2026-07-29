package net.ocoserver.common.init;

import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.ocoserver.Sirousyanka;


public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Sirousyanka.MODID);

    public static final DeferredItem<Item> USYALIUM_INGOT = ITEMS.registerSimpleItem("usyalium_ingot");
    public static final DeferredItem<Item> USYALIUM_NUGGET = ITEMS.registerSimpleItem("usyalium_nugget");
    public static final DeferredItem<Item> RAW_USYALIUM = ITEMS.registerSimpleItem("raw_usyalium");
    public static final DeferredItem<Item> ADVANCED_USYALIUM_INGOT = ITEMS.registerSimpleItem("advanced_usyalium_ingot");

    //氷雪のカラマツ
    public static final DeferredItem<Item> ICE_LARCH_SIGN = ITEMS.register("ice_larch_sign",
                    () -> new SignItem(new Item.Properties(), ModBlocks.ICE_LARCH_SIGN.get(), ModBlocks.ICE_LARCH_WALL_SIGN.get()));

    public static final DeferredItem<Item> ICE_LARCH_CEILING_HANGING_SIGN =
            ITEMS.register("ice_larch_ceiling_hanging_sign",
                    () -> new HangingSignItem(ModBlocks.ICE_LARCH_CEILING_HANGING_SIGN.get(), ModBlocks.ICE_LARCH_WALL_HANGING_SIGN.get(), new Item.Properties()));

    //ケウチ
    public static final DeferredItem<Item> KEUTI_SIGN = ITEMS.register("keuti_sign",
            () -> new SignItem(new Item.Properties(), ModBlocks.KEUTI_SIGN.get(), ModBlocks.KEUTI_WALL_SIGN.get()));

    public static final DeferredItem<Item> KEUTI_CEILING_HANGING_SIGN =
            ITEMS.register("keuti_ceiling_hanging_sign",
                    () -> new HangingSignItem(ModBlocks.KEUTI_CEILING_HANGING_SIGN.get(), ModBlocks.KEUTI_WALL_HANGING_SIGN.get(), new Item.Properties()));

    //紅結晶
    public static final DeferredItem<Item> CRIMSON_CRYSTAL_SIGN = ITEMS.register("crimson_crystal_sign",
            () -> new SignItem(new Item.Properties(), ModBlocks.CRIMSON_CRYSTAL_SIGN.get(), ModBlocks.CRIMSON_CRYSTAL_WALL_SIGN.get()));

    public static final DeferredItem<Item> CRIMSON_CRYSTAL_CEILING_HANGING_SIGN =
            ITEMS.register("crimson_crystal_ceiling_hanging_sign",
                    () -> new HangingSignItem(ModBlocks.CRIMSON_CRYSTAL_CEILING_HANGING_SIGN.get(), ModBlocks.CRIMSON_CRYSTAL_WALL_HANGING_SIGN.get(), new Item.Properties()));

    //ニトロウド
    public static final DeferredItem<Item> NITROWD_SIGN = ITEMS.register("nitrowd_sign",
            () -> new SignItem(new Item.Properties(), ModBlocks.NITROWD_SIGN.get(), ModBlocks.NITROWD_WALL_SIGN.get()));

    public static final DeferredItem<Item> NITROWD_CEILING_HANGING_SIGN =
            ITEMS.register("nitrowd_ceiling_hanging_sign",
                    () -> new HangingSignItem(ModBlocks.NITROWD_CEILING_HANGING_SIGN.get(), ModBlocks.NITROWD_WALL_HANGING_SIGN.get(), new Item.Properties()));

    //高温溶岩バケツ
    public static final DeferredItem<BucketItem> HEATED_LAVA_BUCKET = ITEMS.register("heated_lava_bucket",
            () -> new BucketItem(ModFluids.HEATED_LAVA.get(), new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));

    //液体窒素バケツ
    public static final DeferredItem<BucketItem> LIQUID_NITROGEN_BUCKET = ITEMS.register("liquid_nitrogen_bucket",
            () -> new BucketItem(ModFluids.LIQUID_NITROGEN.get(), new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
