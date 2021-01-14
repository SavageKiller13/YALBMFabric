package com.savagekiller13.yalbm.util;

import com.google.common.primitives.Ints;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class LootHandler {


    public static int[] itemRarity = CustomLootTable.itemRarity;

    public static Map<Item, Integer> itemDrops = CustomLootTable.getItemDrops();


    public static ItemStack luckyDrop(Map<Item, Integer> list) {
        int listLength = list.size();

        Random rand = new Random();

        int item = rand.nextInt(listLength);

        int[] itemAmountList = {64, 48, 32, 16, 8, 4, 2, 1};
        int itemAmount;

        itemAmount = itemAmountList[Ints.indexOf(itemRarity, (int) list.values().toArray()[item])];

        int itemAmountNeeded = rand.nextInt(itemAmount);

        if (itemAmountNeeded == 0)  itemAmountNeeded = 1;

        Item neededItem = (Item) list.keySet().toArray()[item];

        if (neededItem == Items.ENCHANTED_BOOK) {

            return addEnchant(neededItem, Enchantments.FORTUNE, 10);

        } else {
            return new ItemStack(neededItem, itemAmountNeeded);
        }



    }

    public static ItemStack addEnchant(Item item, Enchantment enchant, Integer level) {
        ItemStack stack = new ItemStack(item, 1);

        Map<Enchantment, Integer> enchantList = new HashMap<>();
        enchantList.put(enchant, level);

        EnchantmentHelper.set(enchantList, stack);
        return stack;
    }

}
