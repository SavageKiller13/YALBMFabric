package com.savagekiller13.yalbm.block.LuckyBlocks;

import com.savagekiller13.yalbm.util.LootHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EpicLuckyBlock extends Block {
    public EpicLuckyBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        ItemStack[] stacks = LootHandler.MultiLuckyItemDrop(2, LootHandler.epicDrops);

        if (!world.isClient()) {
            if (!player.isCreative()) {
                for (ItemStack stack : stacks) {
                    dropStack(world, pos, stack);
                }
            }
        }

        super.onBreak(world, pos, state, player);
    }
}
