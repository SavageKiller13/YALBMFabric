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

    public static Map<Item, Integer> itemDrops = new HashMap<>();

    public static Map<Item, Integer> commonDrops = new HashMap<>();
    public static Map<Item, Integer> uncommonDrops = new HashMap<>();
    public static Map<Item, Integer> rareDrops = new HashMap<>();
    public static Map<Item, Integer> epicDrops = new HashMap<>();
    public static Map<Item, Integer> trollDrops = new HashMap<>();

    public static Map<Enchantment, Integer> enchantmentList = new HashMap<>();

    public static Item[] moddedBlockDropsAsItem = {BlockRegistry.BLOCK_LUCKY.asItem()};

    public static void initializeTable() {
        { // Common Drops
            commonDrops.put(Items.IRON_INGOT, itemRarity[4]);
            commonDrops.put(Items.APPLE, itemRarity[2]);
            commonDrops.put(Items.SPONGE, itemRarity[5]);
            commonDrops.put(ItemRegistry.ITEM_BASIC_COIN, itemRarity[4]);
            commonDrops.put(Items.EGG, itemRarity[4]);
            commonDrops.put(Items.LAPIS_LAZULI, itemRarity[3]);
            commonDrops.put(Items.GLOWSTONE_DUST, itemRarity[3]);
            commonDrops.put(Items.GLOWSTONE, itemRarity[5]);
            commonDrops.put(Items.QUARTZ, itemRarity[3]);

        }
        { // Uncommon Drops
            uncommonDrops.put(ItemRegistry.ITEM_SKELETON_SKULL_SHARD, itemRarity[3]);
            uncommonDrops.put(moddedBlockDropsAsItem[0], itemRarity[6]);
            uncommonDrops.put(Items.GOLD_INGOT, itemRarity[2]);
            uncommonDrops.put(Items.REDSTONE, itemRarity[2]);
            uncommonDrops.put(Items.SLIME_BALL, itemRarity[5]);
            uncommonDrops.put(Items.PRISMARINE_CRYSTALS, itemRarity[4]);
            uncommonDrops.put(Items.PRISMARINE_SHARD, itemRarity[4]);
            uncommonDrops.put(Items.OBSIDIAN, itemRarity[4]);
            uncommonDrops.put(Items.BLAZE_POWDER, itemRarity[4]);
            uncommonDrops.put(ItemRegistry.ITEM_POOR_GOLD_APPLE, itemRarity[4]);

        }
        { // Rare Drops
            rareDrops.put(Items.DIAMOND, itemRarity[4]);
            rareDrops.put(Items.EMERALD, itemRarity[4]);
            rareDrops.put(ItemRegistry.ITEM_DIAMOND_SHARD, itemRarity[3]);
            rareDrops.put(Items.ENDER_PEARL, itemRarity[5]);
            rareDrops.put(Items.NAUTILUS_SHELL, itemRarity[5]);
            rareDrops.put(Items.EXPERIENCE_BOTTLE, itemRarity[5]);
            rareDrops.put(Items.RABBIT_FOOT, itemRarity[5]);
        }
        { // Epic Drops
            epicDrops.put(Items.ENDER_EYE, itemRarity[5]);
            epicDrops.put(Items.HEART_OF_THE_SEA, itemRarity[6]);
            epicDrops.put(Items.NETHERITE_SCRAP, itemRarity[6]);
            epicDrops.put(Items.GHAST_TEAR, itemRarity[5]);
            epicDrops.put(ItemRegistry.ITEM_WITHER_SKULL_SHARD, itemRarity[4]);
        }
        { // Troll Drops
            trollDrops.put(Items.DIRT, itemRarity[6]);
        }
        { // Enchantments
            enchantmentList.put(Enchantments.FORTUNE, 5);
        }



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
