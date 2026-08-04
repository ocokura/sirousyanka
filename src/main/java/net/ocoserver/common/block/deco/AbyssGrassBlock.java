package net.ocoserver.common.block.deco;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.ocoserver.common.init.block.ModBlocks;

import java.util.function.Supplier;

public class AbyssGrassBlock extends ModGrassBlock implements BonemealableBlock {

    public AbyssGrassBlock(BlockBehaviour.Properties properties, Supplier<Block> blockSupplier) {
        super(properties, blockSupplier);
    }

    @Override
    public void performBonemeal(ServerLevel level, RandomSource random, BlockPos pos, BlockState state) {
        int radius = random.nextInt(3) + 1;
        for (int x = -radius; x <= radius; x++) {
            for (int z = -radius; z <= radius; z++) {
                if (x * x + z * z <= radius * radius) {
                    BlockPos targetPos = pos.offset(x, 1, z);
                    BlockState targetBlock = level.getBlockState(targetPos);
                    if (!targetBlock.isAir()) {
                        if (level.getBlockState(targetPos.above()).isAir() && targetBlock.is(ModBlocks.ABYSS_GRASS_BLOCK.get())) {
                            targetPos = targetPos.above();
                        } else {
                            continue;
                        }
                    } else {
                        if (!level.getBlockState(targetPos.below()).is(ModBlocks.ABYSS_GRASS_BLOCK.get())) {
                            continue;
                        }
                    }
                    int chance = random.nextInt(24);
                    if (chance < 8) {
                        level.setBlock(targetPos, ModBlocks.ABYSS_GRASS.get().defaultBlockState(), 3);
                    } else if (chance < 11) {
                        level.setBlock(targetPos, ModBlocks.BLOWER.get().defaultBlockState(), 3);
                    }
                }
            }
        }
    }
}
