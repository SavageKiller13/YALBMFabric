package com.savagekiller13.yalbm.registry;

import com.savagekiller13.yalbm.YALBMFabric;
import com.savagekiller13.yalbm.block.CommonLuckyBlock;
import com.savagekiller13.yalbm.block.LuckyBlock;
import com.savagekiller13.yalbm.block.MorningWood;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockRegistry {

    public static final Block BLOCK_LUCKY = new LuckyBlock(FabricBlockSettings.of(Material.STONE).hardness(0.5f).sounds(BlockSoundGroup.METAL));
    public static final Block MORNING_WOOD = new MorningWood(FabricBlockSettings.of(Material.WOOD).hardness(0.25f).sounds(BlockSoundGroup.STONE));
    public static final Block COMMON_LUCKY_BLOCK = new CommonLuckyBlock(FabricBlockSettings.of(Material.STONE).hardness(0.5f).sounds(BlockSoundGroup.METAL));

    public static void registerBlocks() {
         Registry.register(Registry.BLOCK, new Identifier(YALBMFabric.modid, "lucky_block"), BLOCK_LUCKY);
         Registry.register(Registry.BLOCK, new Identifier(YALBMFabric.modid, "morning_wood"), MORNING_WOOD);
         Registry.register(Registry.BLOCK, new Identifier(YALBMFabric.modid, "common_lucky_block"), COMMON_LUCKY_BLOCK);
    }

    public static void registerBlockItems() {
        Registry.register(Registry.ITEM, new Identifier(YALBMFabric.modid, "lucky_block"), new BlockItem(BLOCK_LUCKY, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(YALBMFabric.modid, "morning_wood"), new BlockItem(MORNING_WOOD, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(YALBMFabric.modid, "common_lucky_block"), new BlockItem(COMMON_LUCKY_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
    }

    public static void register() {
        registerBlocks();
        registerBlockItems();
    }

}
