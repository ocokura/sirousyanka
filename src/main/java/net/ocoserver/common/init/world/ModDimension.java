package net.ocoserver.common.init.world;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.BuiltinDimensionTypes;
import net.minecraft.world.level.dimension.DimensionType;
import net.ocoserver.common.util.ModUtils;

import java.util.OptionalLong;

public class ModDimension {

    public static final ResourceKey<DimensionType> FROZEN_ABYSS_TYPE = ModUtils.getResourceKey(Registries.DIMENSION_TYPE, "frozen_abyss_type");
    public static final ResourceKey<Level> FROZEN_ABYSS = ModUtils.getResourceKey(Registries.DIMENSION, "frozen_abyss");

    public static void bootstrap(BootstrapContext<DimensionType> context) {
        context.register(FROZEN_ABYSS_TYPE, new DimensionType(
                OptionalLong.of(18000),
                true,
                false,
                false,
                false,
                1.0,
                true,
                false,
                -64,
                384,
                384,
                BlockTags.INFINIBURN_OVERWORLD,
                BuiltinDimensionTypes.OVERWORLD_EFFECTS,
                0.2f,
                new DimensionType.MonsterSettings(false, false, ConstantInt.of(0), 0)
        ));
    }
}
