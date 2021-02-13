package com.savagekiller13.yalbm.compat.rei;

import com.savagekiller13.yalbm.YALBMFabric;
import com.savagekiller13.yalbm.registry.BlockRegistry;
import me.shedaniel.rei.api.RecipeHelper;
import me.shedaniel.rei.api.plugins.REIPluginV0;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class REIPluginYALBM implements REIPluginV0 {
    @Override
    public Identifier getPluginIdentifier() {
        return new Identifier(YALBMFabric.modid, "rei_plugin");
    }

    @Override
    public void registerOthers(RecipeHelper recipeHelper) {
        registerWorkingStations(recipeHelper);
    }

    private void registerWorkingStations(RecipeHelper recipeHelper) {


        ItemStack luckyBlock = new ItemStack(BlockRegistry.BLOCK_LUCKY);
    }
}
