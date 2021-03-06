package com.savagekiller13.yalbm.util;

import com.savagekiller13.yalbm.registry.BlockRegistry;
import com.savagekiller13.yalbm.registry.ItemRegistry;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashMap;
import java.util.Map;

public class CustomLootTable  {

    public static int[] itemRarity = {1,2,3,4,5,6,7,8};

    public static Map<Item, Integer> commonDrops = new HashMap<>();
    public static Map<Item, Integer> uncommonDrops = new HashMap<>();
    public static Map<Item, Integer> rareDrops = new HashMap<>();
    public static Map<Item, Integer> epicDrops = new HashMap<>();
    public static Map<Item, Integer> trollDrops = new HashMap<>();

    public static Map<Enchantment, Integer> enchantmentList = new HashMap<>();

    public static Item[] moddedBlockDropsAsItem = {BlockRegistry.BLOCK_LUCKY.asItem(), BlockRegistry.MORNING_WOOD.asItem(), BlockRegistry.SPECIAL_LUCKY_BLOCK.asItem()};

    public static int[] itemAmountList = {64, 48, 32, 16, 8, 4, 2, 1};

    public static HashMap<Item, Integer> getCommonDrops() {
        commonDrops.clear();
        //0 = 64, 1 = 48, 2 = 32, 3 = 16, 4 = 8, 5 = 4, 6 = 2, 7 = 1
        commonDrops.put(Items.IRON_INGOT, itemRarity[4]);
        commonDrops.put(Items.APPLE, itemRarity[2]);
        commonDrops.put(Items.SPONGE, itemRarity[5]);
        commonDrops.put(ItemRegistry.ITEM_BASIC_COIN, itemRarity[4]);
        commonDrops.put(Items.EGG, itemRarity[4]);
        commonDrops.put(Items.LAPIS_LAZULI, itemRarity[3]);
        commonDrops.put(Items.GLOWSTONE_DUST, itemRarity[3]);
        commonDrops.put(Items.GLOWSTONE, itemRarity[5]);
        commonDrops.put(Items.QUARTZ, itemRarity[3]);
        commonDrops.put(ItemRegistry.ITEM_LUCKY_BLOCK_SHARD, itemRarity[5]);

        return (HashMap<Item, Integer>) commonDrops;
    }

    public static HashMap<Item, Integer> getUncommonDrops() {
        uncommonDrops.clear();
        //0 = 64, 1 = 48, 2 = 32, 3 = 16, 4 = 8, 5 = 4, 6 = 2, 7 = 1
        uncommonDrops.put(ItemRegistry.ITEM_SKELETON_SKULL_SHARD, itemRarity[3]);
        uncommonDrops.put(Items.GOLD_INGOT, itemRarity[2]);
        uncommonDrops.put(Items.REDSTONE, itemRarity[2]);
        uncommonDrops.put(Items.SLIME_BALL, itemRarity[5]);
        uncommonDrops.put(Items.PRISMARINE_CRYSTALS, itemRarity[4]);
        uncommonDrops.put(Items.PRISMARINE_SHARD, itemRarity[4]);
        uncommonDrops.put(Items.OBSIDIAN, itemRarity[4]);
        uncommonDrops.put(Items.BLAZE_POWDER, itemRarity[4]);
        uncommonDrops.put(ItemRegistry.ITEM_POOR_GOLD_APPLE, itemRarity[4]);
        uncommonDrops.put(ItemRegistry.ITEM_LUCKY_BLOCK_SHARD, itemRarity[4]);
        uncommonDrops.put(Items.GOLDEN_APPLE, itemRarity[5]);

        return (HashMap<Item, Integer>) uncommonDrops;
    }

    public static HashMap<Item, Integer> getRareDrops() {
        rareDrops.clear();
        //0 = 64, 1 = 48, 2 = 32, 3 = 16, 4 = 8, 5 = 4, 6 = 2, 7 = 1
        rareDrops.put(Items.DIAMOND, itemRarity[4]);
        rareDrops.put(Items.EMERALD, itemRarity[4]);
        rareDrops.put(ItemRegistry.ITEM_DIAMOND_SHARD, itemRarity[3]);
        rareDrops.put(Items.ENDER_PEARL, itemRarity[5]);
        rareDrops.put(Items.NAUTILUS_SHELL, itemRarity[5]);
        rareDrops.put(Items.EXPERIENCE_BOTTLE, itemRarity[5]);
        rareDrops.put(Items.RABBIT_FOOT, itemRarity[5]);
        rareDrops.put(ItemRegistry.ITEM_LUCKY_BLOCK_SHARD, itemRarity[4]);

        return (HashMap<Item, Integer>) rareDrops;
    }

    public static HashMap<Item, Integer> getEpicDrops() {
        epicDrops.clear();
        //0 = 64, 1 = 48, 2 = 32, 3 = 16, 4 = 8, 5 = 4, 6 = 2, 7 = 1
        epicDrops.put(Items.ENDER_EYE, itemRarity[5]);
        epicDrops.put(Items.HEART_OF_THE_SEA, itemRarity[6]);
        epicDrops.put(Items.NETHERITE_SCRAP, itemRarity[5]);
        epicDrops.put(Items.GHAST_TEAR, itemRarity[5]);
        epicDrops.put(ItemRegistry.ITEM_WITHER_SKULL_SHARD, itemRarity[4]);
        epicDrops.put(ItemRegistry.ITEM_LUCKY_BLOCK_SHARD, itemRarity[3]);
        epicDrops.put(moddedBlockDropsAsItem[0], itemRarity[6]);

        return (HashMap<Item, Integer>) epicDrops;
    }

    public static HashMap<Item, Integer> getTrollDrops() {
        trollDrops.clear();
        //0 = 64, 1 = 48, 2 = 32, 3 = 16, 4 = 8, 5 = 4, 6 = 2, 7 = 1
        trollDrops.put(Items.DIRT, itemRarity[6]);
        trollDrops.put(moddedBlockDropsAsItem[1], itemRarity[7]);
        trollDrops.put(moddedBlockDropsAsItem[2], itemRarity[7]);

        return (HashMap<Item, Integer>) trollDrops;
    }

    /*public static HashMap<Enchantment, Integer> getEnchantmentList() {
        enchantmentList.clear();

        enchantmentList.put(Enchantments.FORTUNE, 3);
        enchantmentList.put(Enchantments.SHARPNESS, 5);
        enchantmentList.put(Enchantments.LOOTING, 3);

        return (HashMap<Enchantment, Integer>) enchantmentList;
    }*/


}
