package com.deathly.colors.recipe;

/**
 * Created by Deathly on 11/20/2016 at 1:09 AM.
 */
import com.deathly.colors.Items.ModItems;
import com.deathly.colors.blocks.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import static net.minecraftforge.fml.common.registry.GameRegistry.addRecipe;

public class ModRecipes {

    public static void init() {
        addShapedRecipes();
        addShapelessRecipes();
    }

    private static void addShapelessRecipes() {
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.purewhite),Items.WATER_BUCKET,"colorBrick"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.purewhite),Items.POTIONITEM,"colorBrick"));
    }

    private static void addShapedRecipes() {
        /** Blocks*/
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.purewhite, 16),"xax","aya","xax",'a', ModItems.purifieddust,'y', Blocks.STONE);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.purifieddust),"axa","xyx","axa",'x', Blocks.STONE,'y', Items.GLOWSTONE_DUST);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.pureblack, 8),"aaa","aya","aaa",'a', ModBlocks.purewhite,'y', Items.DYE);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.purered, 8),"aaa","aya","aaa",'a', ModBlocks.purewhite,'y', new ItemStack(Items.DYE, 1, 1));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.puregreen, 8),"aaa","aya","aaa",'a', ModBlocks.purewhite,'y', new ItemStack(Items.DYE, 1, 2));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.purebrown, 8),"aaa","aya","aaa",'a', ModBlocks.purewhite,'y', new ItemStack(Items.DYE, 1, 3));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.pureblue, 8),"aaa","aya","aaa",'a', ModBlocks.purewhite,'y', new ItemStack(Items.DYE, 1, 4));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.purepurple, 8),"aaa","aya","aaa",'a', ModBlocks.purewhite,'y', new ItemStack(Items.DYE, 1, 5));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.purecyan, 8),"aaa","aya","aaa",'a', ModBlocks.purewhite,'y', new ItemStack(Items.DYE, 1, 6));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.purelightgrey, 8),"aaa","aya","aaa",'a', ModBlocks.purewhite,'y', new ItemStack(Items.DYE, 1, 7));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.puregrey, 8),"aaa","aya","aaa",'a', ModBlocks.purewhite,'y', new ItemStack(Items.DYE, 1, 8));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.purepink, 8),"aaa","aya","aaa",'a', ModBlocks.purewhite,'y', new ItemStack(Items.DYE, 1, 9));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.purelime, 8),"aaa","aya","aaa",'a', ModBlocks.purewhite,'y', new ItemStack(Items.DYE, 1, 10));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.pureyellow, 8),"aaa","aya","aaa",'a', ModBlocks.purewhite,'y', new ItemStack(Items.DYE, 1, 11));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.purelightblue, 8),"aaa","aya","aaa",'a', ModBlocks.purewhite,'y', new ItemStack(Items.DYE, 1, 12));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.puremagenta, 8),"aaa","aya","aaa",'a', ModBlocks.purewhite,'y', new ItemStack(Items.DYE, 1, 13));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.pureorange, 8),"aaa","aya","aaa",'a', ModBlocks.purewhite,'y', new ItemStack(Items.DYE, 1, 14));
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.rainbowblock),"abc","dye","fgh",'y', ModBlocks.purewhite,'a', new ItemStack(Items.DYE, 1, 1),'b', new ItemStack(Items.DYE, 1, 9),'c', new ItemStack(Items.DYE, 1, 13),'d', new ItemStack(Items.DYE, 1, 14),'e', new ItemStack(Items.DYE, 1, 5),'f', new ItemStack(Items.DYE, 1, 11),'g', new ItemStack(Items.DYE, 1, 10),'h', new ItemStack(Items.DYE, 1, 4));

        /**Items*/
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.compressedepearl),"aax","aax","xxx",'a', Items.ENDER_PEARL);

    }
}