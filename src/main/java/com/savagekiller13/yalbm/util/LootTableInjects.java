package com.savagekiller13.yalbm.util;

import com.google.common.collect.Lists;
import com.savagekiller13.yalbm.registry.ItemRegistry;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.FabricLootSupplierBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.ConstantLootTableRange;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.util.Identifier;
import org.apache.commons.lang3.ArrayUtils;

import java.util.List;
import java.util.Random;

public class LootTableInjects {
    private static final List<LootTableInsert> TABLE_INSERTS = Lists.newArrayList();

    static Random rand = new Random();

    public static int randomRoll(int maxRolls) {
        int itemRolls = rand.nextInt(maxRolls);
        if (itemRolls == 0) itemRolls = 1;
        return itemRolls;
    }

    public static void registerLootCallBacks() {

        FabricLootPoolBuilder LUCKY_BLOCK_SHARD = FabricLootPoolBuilder.builder().rolls(ConstantLootTableRange.create(randomRoll(4))).with(ItemEntry.builder(ItemRegistry.ITEM_LUCKY_BLOCK_SHARD)).withCondition(RandomChanceLootCondition.builder(0.8f).build());

        insert(new LootTableInsert(LUCKY_BLOCK_SHARD, new Identifier("minecraft", "chests/end_city_treasure"), new Identifier("minecraft", "chests/desert_pyramid")));

        LootTableLoadingCallback.EVENT.register(((resourceManager, lootManager, identifier, fabricLootSupplierBuilder, lootTableSetter) -> TABLE_INSERTS.forEach(i -> {
            if (ArrayUtils.contains(i.tables, identifier)) {
                i.insert(fabricLootSupplierBuilder);
            }
        })));
    }

    public static void insert(LootTableInsert insert) {
        TABLE_INSERTS.add(insert);
    }

    public static class LootTableInsert {
        public final Identifier[] tables;
        public final FabricLootPoolBuilder poolBuilder;

        public LootTableInsert(FabricLootPoolBuilder poolBuilder, Identifier... tables) {
            this.tables = tables;
            this.poolBuilder = poolBuilder;
        }

        public void insert(FabricLootSupplierBuilder supplier) {
            supplier.pool(poolBuilder);
        }
    }

}
