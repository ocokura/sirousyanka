package net.ocoserver.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

import java.util.function.Supplier;

public class ModGrassBlock extends Block {

    private final Supplier<Block> grassBlockSupplier;
    public ModGrassBlock(BlockBehaviour.Properties properties, Supplier<Block> block) {
        super(properties);
        this.grassBlockSupplier = block;
    }

    @Override
    protected void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (level.getRawBrightness(pos.above(), 0) < 4) {
            level.setBlock(pos, Blocks.DIRT.defaultBlockState(), 3);
            return;
        }
        for (Direction direction : Direction.Plane.HORIZONTAL) {
            BlockPos targetPos = pos.relative(direction);
            if ((level.getBlockState(targetPos).is(Blocks.DIRT)) && (level.getRawBrightness(targetPos.above(), 0) >= 4)) {
                level.setBlock(targetPos, grassBlockSupplier.get().defaultBlockState(), 3);
            }
        }
    }
}
