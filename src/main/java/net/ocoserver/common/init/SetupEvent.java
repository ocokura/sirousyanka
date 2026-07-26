package net.ocoserver.common.init;

import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.ocoserver.Sirousyanka;
import net.ocoserver.common.block.custom.wood.ModFlammable;
import net.ocoserver.common.fluid.ModFluidTypes;
import net.ocoserver.common.worldgen.dimension.ModPortal;

@EventBusSubscriber(modid = Sirousyanka.MODID)
public class SetupEvent {

    @SubscribeEvent
    public static void commonSetupEvent(FMLCommonSetupEvent event) {
        ModFlammable.setFlammable();

    }

    @SubscribeEvent
    public static void FMLCommonSetupEvent(FMLCommonSetupEvent event) {
        ModPortal.createPortal();
    }

    @SubscribeEvent
    public static void registerFluidClient(RegisterClientExtensionsEvent event) {
        event.registerFluidType(new IClientFluidTypeExtensions() {

                    @Override
                    public ResourceLocation getStillTexture() {
                        return ResourceLocation.fromNamespaceAndPath(
                                Sirousyanka.MODID,
                                "block/heated_lava_still"
                        );
                    }

                    @Override
                    public ResourceLocation getFlowingTexture() {
                        return ResourceLocation.fromNamespaceAndPath(
                                Sirousyanka.MODID,
                                "block/heated_lava_flow"
                        );
                    }

                    @Override
                    public int getTintColor() {
                        return 0xFFFFFFFF;
                    }

                },
                ModFluidTypes.HEATED_LAVA_TYPE
        );

        event.registerFluidType(new IClientFluidTypeExtensions() {
                @Override
                public ResourceLocation getStillTexture() {
                    return ResourceLocation.fromNamespaceAndPath(
                            Sirousyanka.MODID,
                            "block/liquid_nitrogen_still"
                    );
                }

                @Override
                public ResourceLocation getFlowingTexture() {
                    return ResourceLocation.fromNamespaceAndPath(
                            Sirousyanka.MODID,
                            "block/liquid_nitrogen_flow"
                    );
                }
            },
                ModFluidTypes.LIQUID_NITROGEN_TYPE
        );
    }

}
