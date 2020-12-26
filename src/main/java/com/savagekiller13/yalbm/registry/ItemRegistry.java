package com.savagekiller13.yalbm.registry;

import com.savagekiller13.yalbm.YALBMFabric;
import com.savagekiller13.yalbm.item.ItemPoorGoldApple;
import com.savagekiller13.yalbm.item.ItemShard;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {

    public static final String modid = YALBMFabric.modid;

    public static FoodComponent poor_gold_apple  = (new FoodComponent.Builder()).hunger(6).saturationModifier(0.3F).alwaysEdible().build();

    public static final Item ITEM_POOR_GOLD_APPLE = new ItemPoorGoldApple((new Item.Settings()).group(ItemGroup.FOOD).food(poor_gold_apple));
    public static final Item ITEM_WITHER_SKULL_SHARD = new ItemShard((new Item.Settings()).group(ItemGroup.MISC).maxCount(16));
    public static final Item ITEM_SKELETON_SKULL_SHARD = new ItemShard((new Item.Settings()).group(ItemGroup.MISC).maxCount(16));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(modid, "poor_gold_apple"), ITEM_POOR_GOLD_APPLE);
        Registry.register(Registry.ITEM, new Identifier(modid, "wither_skull_shard"), ITEM_WITHER_SKULL_SHARD);
        Registry.register(Registry.ITEM, new Identifier(modid, "skeleton_skull_shard"), ITEM_SKELETON_SKULL_SHARD);
    }
}
