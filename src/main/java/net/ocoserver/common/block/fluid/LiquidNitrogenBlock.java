package net.ocoserver.common.block.fluid;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FlowingFluid;
import net.ocoserver.common.damage.ModDamageSource;

public class LiquidNitrogenBlock extends LiquidBlock {

    private final static MobEffectInstance EFFECT = new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 4);

    public LiquidNitrogenBlock(FlowingFluid fluid, Properties properties) {
        super(fluid, properties);
    }

    @Override
    protected void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) {
        if (level.isClientSide) {
            return;
        }
        entity.hurt(ModDamageSource.cold(level), 4f);
        if (entity instanceof LivingEntity) {
            ((LivingEntity) entity).addEffect(EFFECT);
        }
    }

    @Override
    protected boolean isRandomlyTicking(BlockState state) {
        return true;
    }
}
