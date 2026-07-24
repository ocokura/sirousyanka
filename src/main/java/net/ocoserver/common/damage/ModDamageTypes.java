package net.ocoserver.common.damage;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageType;
import net.ocoserver.init.Sirousyanka;

public class ModDamageTypes {

    public static final ResourceKey<DamageType> COLD = ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.fromNamespaceAndPath(Sirousyanka.MODID, "cold"));
    public static final ResourceKey<DamageType> STEAM_EXPLOSION = ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.fromNamespaceAndPath(Sirousyanka.MODID, "steam_explosion"));

}
