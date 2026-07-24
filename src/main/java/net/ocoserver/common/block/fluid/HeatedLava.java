package net.ocoserver.common.block.fluid;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;
import net.ocoserver.common.block.ModBlocks;

import java.util.Optional;

public abstract class HeatedLava extends BaseFlowingFluid {

    public HeatedLava(Properties properties) {
        super(properties);
    }

    @Override
    protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
        super.createFluidStateDefinition(builder);
        builder.add(LEVEL);
    }

    @Override
    protected int getSlopeFindDistance(LevelReader levelReader) {
        return 2;
    }

    @Override
    protected int getDropOff(LevelReader levelReader) {
        return 2;
    }

    @Override
    public int getTickDelay(LevelReader level) {
        return 10;
    }

    @Override
    public Optional<SoundEvent> getPickupSound() {
        return Optional.of(SoundEvents.BUCKET_FILL_LAVA);
    }

    @Override
    public void tick(Level level, BlockPos pos, FluidState state) {
        for (Direction direction : Direction.values()) {
            BlockPos targetPos = pos.relative(direction);
            FluidState fluidState = level.getFluidState(targetPos);
            if (fluidState.is(Tags.Fluids.LAVA)) {
                level.playSound(null, targetPos, SoundEvents.FIRE_EXTINGUISH, SoundSource.BLOCKS, 1f, 1f);
                level.setBlock(targetPos, Blocks.COBBLESTONE.defaultBlockState(), 3);
            } else if (fluidState.is(Tags.Fluids.WATER)) {
                level.playSound(null, targetPos, SoundEvents.FIRE_EXTINGUISH, SoundSource.BLOCKS, 1f, 1f);
                level.setBlock(targetPos, ModBlocks.ABYSS_STONE.get().defaultBlockState(), 3);
            }
        }
        super.tick(level, pos, state);
    }


    public static class Source extends HeatedLava {

        public Source() {
            super(ModFluids.HEATED_LAVA_PROPERTIES);
        }

        @Override
        public boolean isSource(FluidState state) {
            return true;
        }

        @Override
        public int getAmount(FluidState state) {
            return 8;
        }
    }

    public static class Flowing extends HeatedLava {

        public Flowing() {
            super(ModFluids.HEATED_LAVA_PROPERTIES);
        }

        @Override
        public boolean isSource(FluidState state) {
            return false;
        }

        @Override
        public int getAmount(FluidState state) {
            return state.getValue(LEVEL);
        }
    }
}