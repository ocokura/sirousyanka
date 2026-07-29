package net.ocoserver.common.block.wood;

import net.minecraft.world.level.block.grower.TreeGrower;
import net.ocoserver.Sirousyanka;
import net.ocoserver.common.worldgen.tree.ModTreeConfiguredFeatures;

import java.util.Optional;

public class ModTreeGrowers {
    public static final TreeGrower ICE_LARCH_TREE = new TreeGrower(Sirousyanka.MODID + ":" + "ice_larch_tree", Optional.empty(), Optional.of(ModTreeConfiguredFeatures.ICE_LARCH_TREE_KEY), Optional.empty());
    public static final TreeGrower KEUTI_TREE = new TreeGrower(Sirousyanka.MODID + ":" + "keuti_tree", Optional.empty(), Optional.of(ModTreeConfiguredFeatures.KEUTI_TREE_KEY), Optional.empty());
    public static final TreeGrower CRIMSON_CRYSTAL_TREE = new TreeGrower(Sirousyanka.MODID + ":" + "crimson_crystal_tree", Optional.empty(), Optional.of(ModTreeConfiguredFeatures.CRIMSON_CRYSTAL_TREE_KEY), Optional.empty());
}
