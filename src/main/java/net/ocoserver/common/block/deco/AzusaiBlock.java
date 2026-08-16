package net.ocoserver.common.block.deco;

import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockState;

public class AzusaiBlock extends LeavesBlock {

    public AzusaiBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected boolean isRandomlyTicking(BlockState state) {
        return false;
    }

}
