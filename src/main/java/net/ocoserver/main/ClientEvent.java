package net.ocoserver.main;

import net.minecraft.client.renderer.Sheets;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.ocoserver.blocks.ModBlocks;
import net.ocoserver.blocks.ModWoodTypes;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

@EventBusSubscriber(modid = Sirousyanka.MODID, value = Dist.CLIENT)
public class ClientEvent {

    @SubscribeEvent
    public static void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            // 1. 木材タイプを登録
            Sheets.addWoodType(ModWoodTypes.ICE_LARCH);

            // 2. 通常の看板（地上用・壁用）を登録
            addBlockToVanillaBlockEntity(BlockEntityType.SIGN,
                    ModBlocks.ICE_LARCH_PLANKS_SIGN.get(),
                    ModBlocks.ICE_LARCH_PLANKS_WALL_SIGN.get()
            );

            // 3. 吊り看板（天井用・壁吊り用）を登録
            addBlockToVanillaBlockEntity(BlockEntityType.HANGING_SIGN,
                    ModBlocks.ICE_LARCH_PLANKS_CEILING_HANGING_SIGN.get(),
                    ModBlocks.ICE_LARCH_PLANKS_WALL_HANGING_SIGN.get()
            );
        });
    }

    // Javaのリフレクション機能を使って、privateなvalidBlocksに自作ブロックをねじ込む
    private static void addBlockToVanillaBlockEntity(BlockEntityType<?> type, net.minecraft.world.level.block.Block... blocks) {
        try {
            // バニラの難読化名（またはそのままの名前）でフィールドを取得
            // 1.21.1環境のNeoForgeでは通常 "validBlocks" またはマッピング名になります
            Field field;
            try {
                field = BlockEntityType.class.getDeclaredField("validBlocks");
            } catch (NoSuchFieldException e) {
                // 開発環境以外（難読化環境）で動かす場合の対策（フィールドの型で探す）
                field = null;
                for (Field f : BlockEntityType.class.getDeclaredFields()) {
                    if (f.getType() == Set.class) {
                        field = f;
                        break;
                    }
                }
            }

            if (field != null) {
                field.setAccessible(true); // privateの壁をぶち破る設定
                Set<net.minecraft.world.level.block.Block> validBlocks = (Set<Block>) field.get(type);

                // 元のセットが変更不可能なリスト（Immutable）の場合があるため、HashSetにコピーして差し替える
                if (!(validBlocks instanceof HashSet)) {
                    validBlocks = new HashSet<>(validBlocks);
                    field.set(type, validBlocks);
                }

                // 自作ブロックを追加
                for (var block : blocks) {
                    validBlocks.add(block);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
