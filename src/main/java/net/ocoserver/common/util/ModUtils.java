package net.ocoserver.common.util;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.ocoserver.Sirousyanka;

public class ModUtils {

    public static <T> ResourceKey<T> getResourceKey(ResourceKey<? extends Registry<T>> key, String name) {
        return ResourceKey.create(key , ResourceLocation.fromNamespaceAndPath(Sirousyanka.MODID, name));
    }

}
