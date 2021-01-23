package com.savagekiller13.yalbm.util;

import com.google.common.primitives.Ints;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Map;
import java.util.Random;

public class LootHandler {



    public static int[] itemRarity = CustomLootTable.itemRarity;

    public static Map<Item, Integer> commonDrops = CustomLootTable.getCommonDrops();
    public static Map<Item, Integer> uncommonDrops = CustomLootTable.getUncommonDrops();
    public static Map<Item, Integer> rareDrops = CustomLootTable.getRareDrops();
    public static Map<Item, Integer> epicDrops = CustomLootTable.getEpicDrops();
    public static Map<Item, Integer> trollDrops = CustomLootTable.getTrollDrops();

    public static Map<Enchantment, Integer> enchantmentList = CustomLootTable.getEnchantmentList();

    public static ItemStack luckyItemDrop() {
        Random rand = new Random();
        double chance = rand.nextDouble();

        double dropChance = new BigDecimal(chance, new MathContext(2, RoundingMode.HALF_DOWN)).doubleValue();

        int[] itemAmountList = {64, 48, 32, 16, 8, 4, 2, 1};
        int itemAmount;
        int itemAmountNeeded;
        int item;

        int commonLength = commonDrops.size();
        int uncommonLength = uncommonDrops.size();
        int rareLength =  rareDrops.size();
        int epicLength = epicDrops.size();
        int trollLength = trollDrops.size();

        ItemStack stack = new ItemStack(Items.AIR, 1);

        if (dropChance >= 0.00 && dropChance <= 0.55) {
            item = rand.nextInt(commonLength);
            itemAmount = itemAmountList[Ints.indexOf(itemRarity, (int) commonDrops.values().toArray()[item])];
            itemAmountNeeded = rand.nextInt(itemAmount);

            Item neededItem = (Item) commonDrops.keySet().toArray()[item];

            if (itemAmountNeeded == 0) itemAmountNeeded = 1;

            stack = new ItemStack(neededItem, itemAmountNeeded);
        } else if (dropChance >= 0.56 && dropChance <= 0.75) {
            item = rand.nextInt(uncommonLength);
            itemAmount = itemAmountList[Ints.indexOf(itemRarity, (int) uncommonDrops.values().toArray()[item])];
            itemAmountNeeded = rand.nextInt(itemAmount);

            Item neededItem = (Item) uncommonDrops.keySet().toArray()[item];

            if (itemAmountNeeded == 0) itemAmountNeeded = 1;

            stack = new ItemStack(neededItem, itemAmountNeeded);
        } else if (dropChance >= 0.76 && dropChance <= 0.90) {
            item = rand.nextInt(rareLength);
            itemAmount = itemAmountList[Ints.indexOf(itemRarity, (int) rareDrops.values().toArray()[item])];
            itemAmountNeeded = rand.nextInt(itemAmount);

            Item neededItem = (Item) rareDrops.keySet().toArray()[item];

            if (itemAmountNeeded == 0) itemAmountNeeded = 1;

            stack = new ItemStack(neededItem, itemAmountNeeded);
        } else if (dropChance >= 0.91 && dropChance <= 0.98) {
            item = rand.nextInt(epicLength);
            itemAmount = itemAmountList[Ints.indexOf(itemRarity, (int) epicDrops.values().toArray()[item])];
            itemAmountNeeded = rand.nextInt(itemAmount);

            Item neededItem = (Item) epicDrops.keySet().toArray()[item];

            if (itemAmountNeeded == 0) itemAmountNeeded = 1;

            stack = new ItemStack(neededItem, itemAmountNeeded);
        } else if (dropChance >= 0.99 && dropChance <= 1.00) {
            item = rand.nextInt(trollLength);
            itemAmount = itemAmountList[Ints.indexOf(itemRarity, (int) trollDrops.values().toArray()[item])];
            itemAmountNeeded = rand.nextInt(itemAmount);

            Item neededItem = (Item) trollDrops.keySet().toArray()[item];

            if (itemAmountNeeded == 0) itemAmountNeeded = 1;

            stack = new ItemStack(neededItem, itemAmountNeeded);
        }

        return stack;

    }

    public static ItemStack dropEnchant(Map<Enchantment, Integer> enchantList) {
        ItemStack stack = new ItemStack(Items.ENCHANTED_BOOK);

        EnchantmentHelper.set(enchantList, stack);
        return stack;
    }

}













