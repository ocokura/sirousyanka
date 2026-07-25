package net.ocoserver.common.fluid.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FlowingFluid;

public class HeatedLavaBlock extends LiquidBlock {

    public HeatedLavaBlock(FlowingFluid fluid, Properties properties) {
        super(fluid, properties);
    }

    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
        //120分の1を引いたら環境音再生
        if (random.nextInt(200) == 0) {
            level.playLocalSound(pos, SoundEvents.LAVA_AMBIENT, SoundSource.BLOCKS, 0.2F, 0.9F + random.nextFloat() * 0.2F, false);
        }
        //80分の1を引いてかつ上が空気ならパーティクルを再生
        if (random.nextInt(80) == 0 && level.getBlockState(pos.above()).isAir()) {
            level.addParticle(ParticleTypes.LAVA, pos.getX() + random.nextDouble(), pos.getY() + 1.0, pos.getZ() + random.nextDouble(),
                    (random.nextDouble() - 0.5) * 0.05,
                    0.01 + random.nextDouble() * 0.03,
                    (random.nextDouble() - 0.5) * 0.05
            );
        }
    }

    @Override
    protected void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) {
        if (level.isClientSide || entity.fireImmune()) {
            return;
        }
        entity.hurt(level.damageSources().lava(), 8f);
        entity.setRemainingFireTicks(500);
    }

    @Override
    protected boolean isRandomlyTicking(BlockState state) {
        return true;
    }

    @Override
    protected void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        int radius = 3;
        for (int x = -radius; x <= radius; x++) {
            for (int y = -radius; y <= radius; y++) {
                for (int z = -radius; z <= radius; z++) {
                    if (x * x + y * y + z * z > radius * radius) {
                        continue;
                    }
                    if (random.nextInt(3) == 1) {
                        continue;
                    }
                    BlockPos targetPos = pos.offset(x, y, z);
                    BlockState targetState = level.getBlockState(targetPos);
                    if (targetState.isFlammable(level, targetPos, Direction.UP)) {
                        level.setBlock(targetPos, Blocks.FIRE.defaultBlockState(), 3);
                    }
                }
            }
        }
    }
}
