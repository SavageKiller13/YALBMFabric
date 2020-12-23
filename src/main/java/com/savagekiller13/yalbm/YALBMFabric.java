package com.savagekiller13.yalbm;

import com.savagekiller13.yalbm.registry.BlockRegistry;
import com.savagekiller13.yalbm.registry.ItemRegistry;
import net.fabricmc.api.ModInitializer;


public class YALBMFabric implements ModInitializer {

	public static final String modid = "yalbm";

	@Override
	public void onInitialize() {

		BlockRegistry.registerBlocks();
		BlockRegistry.registerBlockItems();

		ItemRegistry.registerItems();

		System.out.println("Hello Fabric world!");
	}
}