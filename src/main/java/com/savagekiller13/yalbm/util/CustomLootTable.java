package com.savagekiller13.yalbm.util;

import com.savagekiller13.yalbm.registry.BlockRegistry;
import com.savagekiller13.yalbm.registry.ItemRegistry;
import jdk.nashorn.internal.ir.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.HashMap;
import java.util.Map;

public class CustomLootTable  {

    public static int[] itemRarity = {1,2,3,4,5,6,7,8};

    public static Map<Item, Integer> itemDrops = new HashMap<>();

    public static Map<Enchantment, Integer> enchantmentList = new HashMap<>();

    public static Item[] moddedBlockDropsAsItem = {BlockRegistry.BLOCK_LUCKY.asItem()};

    public static Item fortuneBook = Items.ENCHANTED_BOOK;

    public static void initializeTable() {
        itemDrops.put(Items.APPLE, itemRarity[2]);
        itemDrops.put(Items.DIAMOND, itemRarity[4]);
        itemDrops.put(Items.GOLD_INGOT, itemRarity[2]);
        itemDrops.put(Items.IRON_INGOT, itemRarity[1]);
        itemDrops.put(Items.EMERALD, itemRarity[4]);
        itemDrops.put(Items.SPONGE, itemRarity[5]);
        itemDrops.put(Items.LAPIS_LAZULI, itemRarity[3]);
        itemDrops.put(Items.EXPERIENCE_BOTTLE, itemRarity[5]);
        itemDrops.put(Items.ENDER_EYE, itemRarity[5]);
        itemDrops.put(Items.ENDER_PEARL, itemRarity[5]);
        itemDrops.put(Items.DIRT, itemRarity[6]);
        itemDrops.put(Items.NAUTILUS_SHELL, itemRarity[5]);
        itemDrops.put(Items.HEART_OF_THE_SEA, itemRarity[6]);
        itemDrops.put(Items.REDSTONE, itemRarity[2]);
        itemDrops.put(Items.NETHERITE_SCRAP, itemRarity[6]);
        itemDrops.put(Items.EGG, itemRarity[4]);
        itemDrops.put(Items.QUARTZ, itemRarity[3]);
        itemDrops.put(ItemRegistry.ITEM_POOR_GOLD_APPLE, itemRarity[4]);
        itemDrops.put(Items.GLOWSTONE_DUST, itemRarity[3]);
        itemDrops.put(Items.GLOWSTONE, itemRarity[5]);
        itemDrops.put(Items.OBSIDIAN, itemRarity[4]);
        itemDrops.put(Items.BLAZE_POWDER, itemRarity[4]);
        itemDrops.put(Items.GHAST_TEAR, itemRarity[5]);
        itemDrops.put(Items.PRISMARINE_SHARD, itemRarity[4]);
        itemDrops.put(Items.PRISMARINE_CRYSTALS, itemRarity[4]);
        itemDrops.put(Items.RABBIT_FOOT, itemRarity[5]);
        itemDrops.put(Items.SLIME_BALL, itemRarity[5]);
        itemDrops.put(ItemRegistry.ITEM_WITHER_SKULL_SHARD, itemRarity[4]);
        itemDrops.put(ItemRegistry.ITEM_SKELETON_SKULL_SHARD, itemRarity[3]);
        itemDrops.put(ItemRegistry.ITEM_DIAMOND_SHARD, itemRarity[3]);
        itemDrops.put(ItemRegistry.ITEM_BASIC_COIN, itemRarity[4]);
        itemDrops.put(moddedBlockDropsAsItem[0], itemRarity[6]);
        itemDrops.put(fortuneBook, itemRarity[7]);

        enchantmentList.put(Enchantments.FORTUNE, 10);
    }

    public static HashMap<Item, Integer> getItemDrops() {
        itemDrops.clear();

        initializeTable();

        return (HashMap<Item, Integer>) itemDrops;
    }

    public static HashMap<Enchantment, Integer> getEnchantmentsList() {
        return (HashMap<Enchantment, Integer>) enchantmentList;
    }


}
