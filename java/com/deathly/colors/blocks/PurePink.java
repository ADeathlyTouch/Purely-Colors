package com.deathly.colors.blocks;

/**
 * Created by Deathly on 11/19/2016 at 9:39 PM.
 */
import com.deathly.colors.Colors;
import com.deathly.colors.Ref;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.Random;

/**
 * Created by Deathly on 11/19/2016.
 */
public class PurePink extends Block {
    public PurePink() {
        super(Material.WOOD);

        setUnlocalizedName("purepink");
        setResistance(100F);
        setHardness(0.5F);
        setRegistryName("purepink");
        setHarvestLevel("pickaxe", 0);

        setCreativeTab(Ref.colorstab);

        GameRegistry.register(this);
        GameRegistry.register(new ItemBlock(this), getRegistryName());
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

    @Override
    public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {

        if (Colors.enableLamps == true) {
            if (worldIn.isBlockPowered(pos)) {
                worldIn.setBlockState(pos, ModBlocks.purepinklit.getDefaultState());
            } else {
                worldIn.setBlockState(pos, ModBlocks.purepink.getDefaultState());
            }
        }else {
            worldIn.setBlockState(pos, ModBlocks.purepink.getDefaultState());
        }
        super.neighborChanged(state, worldIn, pos, blockIn, fromPos);
    }

    @Nullable
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(ModBlocks.purepink);
    }

    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
    {
        return new ItemStack(ModBlocks.purepink);
    }

    protected ItemStack createStackedBlock(IBlockState state)
    {
        return new ItemStack(ModBlocks.purepink);
    }

}