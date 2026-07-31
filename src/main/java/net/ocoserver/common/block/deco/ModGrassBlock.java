package net.ocoserver.common.block.deco;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import java.util.function.Supplier;

public abstract class ModGrassBlock extends Block implements BonemealableBlock {

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

    public boolean isValidBonemealTarget(LevelReader level, BlockPos pos, BlockState state) {
        return true;
    }

    public boolean isBonemealSuccess(Level level, RandomSource random, BlockPos pos, BlockState state) {
        return true;
    }

    public abstract void performBonemeal(ServerLevel level, RandomSource random, BlockPos pos, BlockState state);
}
