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

    public static int[] itemAmountList = CustomLootTable.itemAmountList;

    //public static Map<Enchantment, Integer> enchantmentList = CustomLootTable.getEnchantmentList();

    public static ItemStack luckyItemDrop() {
        Random rand = new Random();
        double chance = rand.nextDouble();

        double dropChance = new BigDecimal(chance, new MathContext(2, RoundingMode.HALF_DOWN)).doubleValue();

        ItemStack stack = new ItemStack(Items.AIR, 1);

        if (dropChance >= 0.00 && dropChance <= 0.55) {
            stack = getItemDrop(commonDrops);
        } else if (dropChance >= 0.56 && dropChance <= 0.75) {
            stack = getItemDrop(uncommonDrops);
        } else if (dropChance >= 0.76 && dropChance <= 0.90) {
            stack = getItemDrop(rareDrops);
        } else if (dropChance >= 0.91 && dropChance <= 0.98) {
            stack = getItemDrop(epicDrops);
        } else if (dropChance >= 0.99 && dropChance <= 1.00) {
            stack = getItemDrop(trollDrops);
        }

        return stack;

    }

    public static ItemStack getItemDrop(Map<Item, Integer> dropList) {
        Random rand = new Random();
        int item;
        int itemAmount;
        int itemAmountNeeded;

        int dropListLength = dropList.size();

        item = rand.nextInt(dropListLength);
        itemAmount = itemAmountList[Ints.indexOf(itemRarity, (int) dropList.values().toArray()[item])];
        itemAmountNeeded = rand.nextInt(itemAmount);

        Item neededItem = (Item) dropList.keySet().toArray()[item];

        if (itemAmountNeeded == 0) itemAmountNeeded = 1;


        return new ItemStack(neededItem, itemAmountNeeded);
    }

    /*public static ItemStack dropEnchant(Map<Enchantment, Integer> enchantList) {
        ItemStack stack = new ItemStack(Items.ENCHANTED_BOOK);
        int enchantListLength = enchantList.size();
        Random rand = new Random();

        int enchantNeeded = rand.nextInt(enchantListLength);

        EnchantmentHelper.set(enchantList, stack);
        return stack;
    }*/

}













