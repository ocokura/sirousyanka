package net.ocoserver.common.block.fluid;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FlowingFluid;
import net.ocoserver.common.damage.ModDamageSource;

public class LiquidNitrogenBlock extends LiquidBlock {

    public LiquidNitrogenBlock(FlowingFluid fluid, Properties properties) {
        super(fluid, properties);
    }

    @Override
    protected void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) {
        if (level.isClientSide) {
            return;
        }
        entity.clearFire();
        entity.hurt(ModDamageSource.cold(level), 4f);
        entity.setTicksFrozen(140);
    }

    @Override
    protected boolean isRandomlyTicking(BlockState state) {
        return true;
    }
}
