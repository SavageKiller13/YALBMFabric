package com.savagekiller13.yalbm.block.LuckyBlocks;

import com.savagekiller13.yalbm.util.LootHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SpecialLuckyBlock extends Block {

    public SpecialLuckyBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        ItemStack stack = LootHandler.getItemDrop(LootHandler.trollDrops);

        if (!world.isClient()) {
            if (!player.isCreative()) {
                dropStack(world, pos, stack);
            }
        }

        super.onBreak(world, pos, state, player);
    }

}
