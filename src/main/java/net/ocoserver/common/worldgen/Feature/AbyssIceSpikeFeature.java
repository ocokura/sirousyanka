package net.ocoserver.common.worldgen.Feature;

import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.ocoserver.common.init.block.ModBlocks;

public class AbyssIceSpikeFeature extends Feature<NoneFeatureConfiguration> {

    public AbyssIceSpikeFeature(Codec<NoneFeatureConfiguration> codec) {
        super(codec);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        BlockPos blockpos = context.origin();
        RandomSource random = context.random();
        WorldGenLevel level = context.level();

        while (level.isEmptyBlock(blockpos) && blockpos.getY() > level.getMinBuildHeight() + 5) {
            blockpos = blockpos.below();
        }
        if (level.getMaxBuildHeight() - blockpos.getY() <= 80) {
            return false;
        }
        if (!level.getBlockState(blockpos).is(ModBlocks.FROZEN_GRASS_BLOCK.get())) {
            return false;
        }

        int height = random.nextInt(20, 81);
        int radius = random.nextInt(8, 20);
        for (int currentY = 1; currentY <= height; currentY++) {
            int currentRadius = Math.max(1, (int) (radius * (1.0 - (double) currentY / height) + random.nextInt(-1, 2)));
            for (int x = -currentRadius; x <= currentRadius; x++) {
                for (int z = -currentRadius; z <= currentRadius; z++) {
                    if (x * x + z * z > currentRadius * currentRadius) {
                        continue;
                    }
                    BlockPos targetPos = blockpos.offset(x, currentY, z);
                    if (level.isEmptyBlock(targetPos)) {
                        level.setBlock(targetPos, ModBlocks.ABYSS_PACKED_ICE.get().defaultBlockState(), 3);
                    }
                }
            }
        }
        return true;
    }

}
