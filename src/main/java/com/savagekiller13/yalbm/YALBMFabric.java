package com.savagekiller13.yalbm;

import com.savagekiller13.yalbm.block.LuckyBlock;
import com.savagekiller13.yalbm.registry.BlockRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;


public class YALBMFabric implements ModInitializer {

	public static final String modid = "yalbm";

	@Override
	public void onInitialize() {

		BlockRegistry.registerBlocks();
		BlockRegistry.registerBlockItems();



		System.out.println("Hello Fabric world!");
	}
}