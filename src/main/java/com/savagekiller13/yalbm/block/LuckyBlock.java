package com.savagekiller13.yalbm.block;

import com.google.common.primitives.Ints;
import com.savagekiller13.yalbm.registry.ItemRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class LuckyBlock extends Block {


    public int[] itemRarity = {1,2,3,4,5,6,7};

    public Map<Item, Integer> itemDrops = new HashMap<>();

    public LuckyBlock(Settings settings) {
        super(settings);


        itemDrops.put(Items.APPLE, itemRarity[2]);
        itemDrops.put(Items.DIAMOND, itemRarity[4]);
        itemDrops.put(Items.GOLD_INGOT, itemRarity[2]);
        itemDrops.put(Items.IRON_INGOT, itemRarity[1]);
        itemDrops.put(Items.EMERALD, itemRarity[4]);
        itemDrops.put(Items.SPONGE, itemRarity[5]);
        itemDrops.put(Items.LAPIS_LAZULI, itemRarity[3]);
        itemDrops.put(Items.EXPERIENCE_BOTTLE, itemRarity[5]);
        itemDrops.put(Items.ENDER_EYE, itemRarity[6]);
        itemDrops.put(Items.DIRT, itemRarity[6]);
        itemDrops.put(Items.NAUTILUS_SHELL, itemRarity[5]);
        itemDrops.put(Items.HEART_OF_THE_SEA, itemRarity[6]);
        itemDrops.put(Items.REDSTONE, itemRarity[2]);
        itemDrops.put(Items.NETHERITE_SCRAP, itemRarity[6]);
        itemDrops.put(Items.EGG, itemRarity[4]);
        itemDrops.put(Items.QUARTZ, itemRarity[3]);
        itemDrops.put(ItemRegistry.ITEM_POOR_GOLD_APPLE, itemRarity[5]);
    }

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        ItemStack stack = luckyDrop(itemDrops);

        if (!world.isClient()) {
            if (!player.isCreative()) {
                dropStack(world, pos, stack);
            }
        }

        super.onBreak(world, pos, state, player);
    }

    public ItemStack luckyDrop(Map<Item, Integer> list) {
        int listLength = list.size();

        Random rand = new Random();

        int item = rand.nextInt(listLength);

        int[] itemAmountList = {64, 48, 32, 16, 8, 4, 2};
        int itemAmount;

        itemAmount = itemAmountList[Ints.indexOf(itemRarity, (int) list.values().toArray()[item])];

        int itemAmountNeeded = rand.nextInt(itemAmount);

        if (itemAmountNeeded == 0)  itemAmountNeeded = 1;

        Item neededItem = (Item) list.keySet().toArray()[item];


        return new ItemStack(neededItem, itemAmountNeeded);

    }

    public int randomChance(Integer rarity) {

        int maxChance = rarity;

        Random rand = new Random();

        if (maxChance == 1) {
            return 1;
        } else {
            int chance = rand.nextInt(maxChance);

            if (chance == 0) chance = 1;

            return chance;
        }

    }
}



























