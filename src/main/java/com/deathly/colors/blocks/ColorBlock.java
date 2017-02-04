package com.deathly.colors.blocks;

/**
 * Created by Deathly on 11/19/2016 at 9:39 PM.
 */
import com.deathly.colors.Colors;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Random;

import static com.deathly.colors.Colors.logger;

/**
 * Created by Deathly on 11/19/2016.
 */
public class ColorBlock extends Block {

    private String color;
    /**
     * @param uname The block's unlocalized name
     */
    public ColorBlock(String uname, Boolean isOn) {
        super(Material.WOOD);

        setResistance(100F);
        setHardness(0.5F);
        setHarvestLevel("pickaxe", 0);

        if (isOn) {
            setLightLevel(1F);
            setRegistryName(uname + "lit");
            setUnlocalizedName(uname + "lit");
        } else {
            setRegistryName(uname);
            setUnlocalizedName(uname);
        }

        color = uname;

        GameRegistry.register(this);
        GameRegistry.register(new ItemBlock(this), getRegistryName());
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

    @Override
    public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos p_189540_5_) {
        logger.info("Neighbor changed!!");
        this.toggleLight(worldIn, pos);
    }

    public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state)
    {
        logger.info("Block added!!!");
        this.toggleLight(worldIn, pos);
    }

    public void toggleLight(World worldIn, BlockPos pos) {
        if (Colors.enableLamps) {
            if (worldIn.isBlockPowered(pos)) {
                worldIn.setBlockState(pos, this.getLitBlock().getDefaultState());
            } else {
                worldIn.setBlockState(pos, this.getUnlitBlock().getDefaultState());
            }
        }
    }

    public ColorBlock getLitBlock() {
        return this.getBlockByLitStatus(ModBlocks.LIT);
    }

    public ColorBlock getUnlitBlock() {
        return this.getBlockByLitStatus(ModBlocks.UNLIT);
    }

    private ColorBlock getBlockByLitStatus(String status) {
        HashMap<String, ColorBlock> colorBlocks = ModBlocks.blockMap.get(this.color);

        if (colorBlocks != null) {
            return colorBlocks.get(status);
        } else {
            throw new Error("Invalid color block key" + this.color + ".  No color block registered with that name");
        }
    }

    @Nullable
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(this.getUnlitBlock());
    }

    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
    {
        return new ItemStack(this.getUnlitBlock());
    }

    protected ItemStack createStackedBlock(IBlockState state)
    {
        return new ItemStack(this.getUnlitBlock());
    }


}