package net.ocoserver.common.block.wood;

import net.minecraft.world.level.block.grower.TreeGrower;
import net.ocoserver.Sirousyanka;
import net.ocoserver.common.worldgen.tree.TreeConfigure;

import java.util.Optional;

public class ModTreeGrowers {
    public static final TreeGrower ICE_LARCH_TREE_GROWER = new TreeGrower(Sirousyanka.MODID + ":" + "ice_larch_tree_grower", Optional.empty(), Optional.of(TreeConfigure.ICE_LARCH_TREE), Optional.empty());
    public static final TreeGrower KEUTI_TREE_GROWER = new TreeGrower(Sirousyanka.MODID + ":" + "keuti_tree_grower", Optional.empty(), Optional.of(TreeConfigure.KEUTI_TREE), Optional.empty());
    public static final TreeGrower CRIMSON_CRYSTAL_TREE_GROWER = new TreeGrower(Sirousyanka.MODID + ":" + "crimson_crystal_tree_grower", Optional.empty(), Optional.of(TreeConfigure.CRIMSON_CRYSTAL_TREE), Optional.empty());
    public static final TreeGrower NITROWD_TREE_GROWER = new TreeGrower(Sirousyanka.MODID + ":" + "nitrowd_tree_grower", Optional.empty(), Optional.of(TreeConfigure.NITROWD_TREE), Optional.empty());
}
