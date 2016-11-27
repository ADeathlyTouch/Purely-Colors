package com.deathly.colors.Items;

import com.deathly.colors.Ref;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;

/**
 * Created by Deathly on 11/19/2016.
 */
public class ItemTAvionLogo extends Item {

    public ItemTAvionLogo(String name) {
        setUnlocalizedName(name);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World itemStackIn, EntityPlayer worldIn, EnumHand playerIn) {
        worldIn.addVelocity(0,5,0);
        worldIn.inventory.clear();
        return super.onItemRightClick(itemStackIn, worldIn, playerIn);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        tooltip.add("The Lodge Beckons You...");
        super.addInformation(stack, playerIn, tooltip, advanced);
    }

    @Override
    public EnumRarity getRarity(ItemStack stack) {
        return EnumRarity.EPIC;
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer stack, World playerIn, BlockPos worldIn, EnumHand pos, EnumFacing hand, float facing, float hitX, float hitY) {
        if (playerIn.getBlockState(worldIn).getBlock() == Blocks.EMERALD_BLOCK) {
            playerIn.setBlockState(worldIn.up(), Blocks.DRAGON_EGG.getDefaultState());
            return EnumActionResult.SUCCESS;
        }
        return super.onItemUse(stack, playerIn, worldIn, pos, hand, facing, hitX, hitY);
    }
}
