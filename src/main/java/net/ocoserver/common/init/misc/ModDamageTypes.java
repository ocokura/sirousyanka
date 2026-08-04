package net.ocoserver.common.init.misc;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageType;
import net.ocoserver.Sirousyanka;

public class ModDamageTypes {

    public static final ResourceKey<DamageType> COLD = ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.fromNamespaceAndPath(Sirousyanka.MODID, "cold"));

}
