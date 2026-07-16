package net.ocoserver.items;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.ocoserver.main.Sirousyanka;

import java.util.function.Supplier;

public class CreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Sirousyanka.MODID);

    public static final Supplier<CreativeModeTab> SIROUSYANKA_ITEMS_TAB =
            CREATIVE_MODE_TAB.register("sirousyanka_item_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("sirousyanka_gui_creativeTab_title"))
                    .icon(() -> new ItemStack(ModItems.USYALIUM_INGOT.get()))

                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.USYALIUM_INGOT);
                        output.accept(ModItems.USYALIUM_NUGGET);
                        output.accept(ModItems.RAW_USYALIUM);
                        output.accept(ModItems.ADVANCED_USYALIUM_INGOT);
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
