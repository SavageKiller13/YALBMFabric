package com.savagekiller13.yalbm.registry;

import com.savagekiller13.yalbm.YALBMFabric;
import com.savagekiller13.yalbm.item.ItemCoin;
import com.savagekiller13.yalbm.item.ItemLuckySword;
import com.savagekiller13.yalbm.item.ItemPoorGoldApple;
import com.savagekiller13.yalbm.item.ItemShard;
import com.savagekiller13.yalbm.Enum.ToolMaterialLucky;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {

    public static final String modid = YALBMFabric.modid;

    public static FoodComponent poor_gold_apple  = (new FoodComponent.Builder()).hunger(6).saturationModifier(0.3F).alwaysEdible().build();

    public static final Item ITEM_POOR_GOLD_APPLE = new ItemPoorGoldApple((new Item.Settings()).group(ItemGroup.FOOD).food(poor_gold_apple));
    public static final Item ITEM_WITHER_SKULL_SHARD = new ItemShard((new Item.Settings()).group(ItemGroup.MISC).maxCount(16));
    public static final Item ITEM_SKELETON_SKULL_SHARD = new ItemShard((new Item.Settings()).group(ItemGroup.MISC).maxCount(16));
    public static final Item ITEM_DIAMOND_SHARD = new ItemShard((new Item.Settings()).group(ItemGroup.MATERIALS));
    public static final Item ITEM_BASIC_COIN = new ItemCoin((new Item.Settings()).group(ItemGroup.MISC));
    public static final Item ITEM_RARE_COIN = new ItemCoin((new Item.Settings()).group(ItemGroup.MISC));

    public static final Item ITEM_LUCKY_SWORD = new ItemLuckySword(ToolMaterialLucky.COMMON, 7, -2.0F, (new Item.Settings()).group(ItemGroup.TOOLS).rarity(Rarity.COMMON));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(modid, "poor_gold_apple"), ITEM_POOR_GOLD_APPLE);
        Registry.register(Registry.ITEM, new Identifier(modid, "wither_skull_shard"), ITEM_WITHER_SKULL_SHARD);
        Registry.register(Registry.ITEM, new Identifier(modid, "skeleton_skull_shard"), ITEM_SKELETON_SKULL_SHARD);
        Registry.register(Registry.ITEM, new Identifier(modid, "diamond_shard"), ITEM_DIAMOND_SHARD);
        Registry.register(Registry.ITEM, new Identifier(modid, "coin"), ITEM_BASIC_COIN);
        Registry.register(Registry.ITEM, new Identifier(modid, "rare_coin"), ITEM_RARE_COIN);

        Registry.register(Registry.ITEM, new Identifier(modid, "lucky_sword_common"), ITEM_LUCKY_SWORD);
    }
}
