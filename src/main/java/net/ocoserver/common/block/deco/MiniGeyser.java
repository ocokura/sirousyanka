package net.ocoserver.common.block.deco;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.List;

public class MiniGeyser extends Block {

    public static final BooleanProperty ACTIVE = BooleanProperty.create("active");

    private static final VoxelShape SHAPE = Block.box(2, 0, 2, 14, 4, 14);

    public MiniGeyser(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(ACTIVE, false));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(ACTIVE);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    @Override
    protected void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (state.getValue(ACTIVE)) {
            AABB aabb = new AABB(pos.getX() + 0.2, pos.getY(), pos.getZ() + 0.2, pos.getX() + 0.8, pos.getY() + 8, pos.getZ() + 0.8);
            List<Entity> entities = level.getEntities(null, aabb);
            for (Entity entity : entities) {
                Vec3 motion = entity.getDeltaMovement();
                entity.setDeltaMovement(motion.x, Math.max(motion.y, 0.6), motion.z);
                entity.hurtMarked = true;
                entity.hurt(level.damageSources().inFire(), 1);
                entity.setRemainingFireTicks(100);
            }
            level.scheduleTick(pos, this, 2);
        }
    }

    @Override
    protected void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        BlockState newState = state.cycle(ACTIVE);
        level.setBlock(pos, newState, 3);
        if (newState.getValue(ACTIVE)) {
            level.scheduleTick(pos, this, 1);
        }
    }

    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
        if (random.nextInt(20) == 0) {
            level.playLocalSound(pos, SoundEvents.FIRE_EXTINGUISH, SoundSource.BLOCKS, 0.2F, 0.9F + random.nextFloat() * 0.2F, false);
        }
        if (random.nextInt(20) == 0) {
            level.addParticle(ParticleTypes.LAVA, pos.getX() + random.nextDouble(), pos.getY(), pos.getZ() + random.nextDouble(),
                    (random.nextDouble() - 0.5) * 0.05,
                    0.01 + random.nextDouble() * 0.06,
                    (random.nextDouble() - 0.5) * 0.05
            );
        }
        if (state.getValue(ACTIVE)) {
            for (int i = 1; i <= 4; i++) {
                double spread = 0.2;
                level.addParticle(ParticleTypes.CLOUD,
                        pos.getX() + 0.5 + (random.nextDouble() - 0.5) * spread,
                        pos.getY() + 0.3,
                        pos.getZ() + 0.5 + (random.nextDouble() - 0.5) * spread,
                        (random.nextDouble() - 0.5) * 0.03,
                        1,
                        (random.nextDouble() - 0.5) * 0.03
                );
            }
        }
    }

    @Override
    public void stepOn(Level level, BlockPos pos, BlockState state, Entity entity) {
        entity.hurt(level.damageSources().inFire(), 1);
        entity.setRemainingFireTicks(100);
    }
}
