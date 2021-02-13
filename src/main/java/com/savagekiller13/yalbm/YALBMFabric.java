package com.savagekiller13.yalbm;

import com.savagekiller13.yalbm.registry.BlockRegistry;
import com.savagekiller13.yalbm.registry.ItemRegistry;
import com.savagekiller13.yalbm.util.LootTableInjects;
import net.fabricmc.api.ModInitializer;


public class YALBMFabric implements ModInitializer {

	public static final String modid = "yalbm";

	@Override
	public void onInitialize() {

		BlockRegistry.register();

		ItemRegistry.registerItems();

		LootTableInjects.registerLootCallBacks();

		System.out.println("Hello Fabric world!");
	}
}