package net.ocoserver.common.mixin;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.DensityFunction;
import net.minecraft.world.level.levelgen.NoiseRouterData;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(NoiseRouterData.class)
public interface NoiseRouterAccessor {
    @Accessor("SHIFT_X")
    static ResourceKey<DensityFunction> shiftX() {
        throw new IllegalStateException("already replaced");
    }

    @Accessor("SHIFT_Z")
    static ResourceKey<DensityFunction> shiftZ() {
        throw new IllegalStateException("already replaced");
    }

    @Accessor("BASE_3D_NOISE_OVERWORLD")
    static ResourceKey<DensityFunction> base3dNoiseOverworld() {
        throw new IllegalStateException("already replaced");
    }
}