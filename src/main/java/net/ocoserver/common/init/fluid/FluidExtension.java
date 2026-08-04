package net.ocoserver.common.init.fluid;

import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.ocoserver.Sirousyanka;

public class FluidExtension {

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
        }, ModFluidTypes.HEATED_LAVA_TYPE);

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
        }, ModFluidTypes.LIQUID_NITROGEN_TYPE);
    }
}
