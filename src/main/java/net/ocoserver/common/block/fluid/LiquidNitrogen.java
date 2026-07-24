package net.ocoserver.common.block.fluid;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import java.util.Optional;

public abstract class LiquidNitrogen extends BaseFlowingFluid {

    public LiquidNitrogen(Properties properties) {
        super(properties);
    }

    @Override
    protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
        super.createFluidStateDefinition(builder);
        builder.add(LEVEL);
    }

    @Override
    public Optional<SoundEvent> getPickupSound() {
        return Optional.of(SoundEvents.BUCKET_FILL);
    }

    @Override
    public void tick(Level level, BlockPos pos, FluidState state) {
        for (Direction direction : Direction.values()) {
            BlockPos targetPos = pos.relative(direction);
            FluidState fluidState = level.getFluidState(targetPos);
            if (fluidState.is(ModFluids.HEATED_LAVA.get()) || fluidState.is(ModFluids.FLOWING_HEATED_LAVA.get())) {
                level.playSound(null, targetPos, SoundEvents.FIRE_EXTINGUISH, SoundSource.BLOCKS, 1f, 1f);
                level.setBlock(targetPos, Blocks.OBSIDIAN.defaultBlockState(), 3);
            } else if (fluidState.is(Tags.Fluids.WATER)) {
                level.playSound(null, targetPos, SoundEvents.FIRE_EXTINGUISH, SoundSource.BLOCKS, 1f, 1f);
                level.setBlock(targetPos, Blocks.ICE.defaultBlockState(), 3);
            }
        }
        super.tick(level, pos, state);
    }

    public static class Source extends LiquidNitrogen {

        public Source() {
            super(ModFluids.LIQUID_NITROGEN_PROPERTIES);
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

    public static class Flowing extends LiquidNitrogen {

        public Flowing() {
            super(ModFluids.LIQUID_NITROGEN_PROPERTIES);
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