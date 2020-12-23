package com.savagekiller13.yalbm.registry;

import com.savagekiller13.yalbm.YALBMFabric;
import com.savagekiller13.yalbm.block.LuckyBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockRegistry {

    public static final Block BLOCK_LUCKY = new LuckyBlock(FabricBlockSettings.of(Material.STONE).hardness(0.5f));

    public static void registerBlocks() {
        {
            Registry.register(Registry.BLOCK, new Identifier(YALBMFabric.modid, "lucky_block"), BLOCK_LUCKY);
        }
    }

    public static void registerBlockItems() {
        {
            Registry.register(Registry.ITEM, new Identifier(YALBMFabric.modid, "lucky_block"), new BlockItem(BLOCK_LUCKY, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        }
    }

}