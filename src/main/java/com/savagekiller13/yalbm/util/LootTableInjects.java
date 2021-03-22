// Command for testing Loot Tables (/setblock ~ ~ ~ minecraft:chest{LootTable:"minecraft:chests/desert_pyramid"})

package com.savagekiller13.yalbm.util;

import com.google.common.collect.Lists;
import com.savagekiller13.yalbm.registry.ItemRegistry;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.FabricLootSupplierBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.UniformLootTableRange;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.util.Identifier;
import org.apache.commons.lang3.ArrayUtils;

import java.util.List;

public class LootTableInjects {
    private static final List<LootTableInsert> TABLE_INSERTS = Lists.newArrayList();

    public static void registerLootCallBacks() {

        FabricLootPoolBuilder LUCKY_BLOCK_SHARD = FabricLootPoolBuilder.builder().rolls(UniformLootTableRange.between(1, 4)).withCondition(RandomChanceLootCondition.builder(0.8f).build()).with(ItemEntry.builder(ItemRegistry.ITEM_LUCKY_BLOCK_SHARD));
        FabricLootPoolBuilder POOR_GOLD_APPLE = FabricLootPoolBuilder.builder().rolls(UniformLootTableRange.between(1,3)).withCondition(RandomChanceLootCondition.builder(0.6f).build()).with(ItemEntry.builder(ItemRegistry.ITEM_POOR_GOLD_APPLE));

        insert(new LootTableInsert(LUCKY_BLOCK_SHARD, new Identifier("minecraft", "chests/end_city_treasure"), new Identifier("minecraft", "chests/desert_pyramid")));
        insert(new LootTableInsert(POOR_GOLD_APPLE, new Identifier("minecraft", "chests/desert_pyramid"), new Identifier("minecraft", "chests/simple_dungeon"), new Identifier("minecraft", "chests/ruined_portal"), new Identifier("minecraft", "chests/village_temple"), new Identifier("minecraft", "chests/end_city_treasure")));

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
