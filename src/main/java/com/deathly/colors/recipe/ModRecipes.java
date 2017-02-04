package com.deathly.colors.recipe;

/**
 * Created by Deathly on 11/20/2016 at 1:09 AM.
 */
import com.deathly.colors.Items.ModItems;
import com.deathly.colors.Ref;
import com.deathly.colors.blocks.ColorBlock;
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
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(getBlock(Ref.PURE_WHITE)),Items.WATER_BUCKET,"colorBrick"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(getBlock(Ref.PURE_WHITE)),Items.POTIONITEM,"colorBrick"));
    }

    private static void addShapedRecipes() {
        ColorBlock whiteBlock = getBlock(Ref.PURE_WHITE);

        /** Blocks*/
        GameRegistry.addShapedRecipe(getStack(Ref.PURE_WHITE, 16),"xax","aya","xax",'a', ModItems.purifieddust,'y', Blocks.STONE);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.purifieddust),"axa","xyx","axa",'x', Blocks.STONE,'y', Items.GLOWSTONE_DUST);
        GameRegistry.addShapedRecipe(getStack(Ref.PURE_BLACK, 8),"aaa","aya","aaa",'a', whiteBlock,'y', Items.DYE);
        GameRegistry.addShapedRecipe(getStack(Ref.PURE_RED, 8),"aaa","aya","aaa",'a', whiteBlock,'y', getDye(1));
        GameRegistry.addShapedRecipe(getStack(Ref.PURE_GREEN, 8),"aaa","aya","aaa",'a', whiteBlock,'y', getDye(2));
        GameRegistry.addShapedRecipe(getStack(Ref.PURE_BROWN, 8),"aaa","aya","aaa",'a', whiteBlock,'y', getDye(3));
        GameRegistry.addShapedRecipe(getStack(Ref.PURE_BLUE, 8),"aaa","aya","aaa",'a', whiteBlock,'y', getDye(4));
        GameRegistry.addShapedRecipe(getStack(Ref.PURE_PURPLE, 8),"aaa","aya","aaa",'a', whiteBlock,'y', getDye(5));
        GameRegistry.addShapedRecipe(getStack(Ref.PURE_CYAN, 8),"aaa","aya","aaa",'a', whiteBlock,'y', getDye(6));
        GameRegistry.addShapedRecipe(getStack(Ref.PURE_LIGHTGREY, 8),"aaa","aya","aaa",'a', whiteBlock,'y', getDye(7));
        GameRegistry.addShapedRecipe(getStack(Ref.PURE_GREY, 8),"aaa","aya","aaa",'a', whiteBlock,'y', getDye(8));
        GameRegistry.addShapedRecipe(getStack(Ref.PURE_PINK, 8),"aaa","aya","aaa",'a', whiteBlock,'y', getDye(9));
        GameRegistry.addShapedRecipe(getStack(Ref.PURE_LIME, 8),"aaa","aya","aaa",'a', whiteBlock,'y', getDye(10));
        GameRegistry.addShapedRecipe(getStack(Ref.PURE_YELLOW, 8),"aaa","aya","aaa",'a', whiteBlock,'y', getDye(11));
        GameRegistry.addShapedRecipe(getStack(Ref.PURE_LIGHTBLUE, 8),"aaa","aya","aaa",'a', whiteBlock,'y', getDye(12));
        GameRegistry.addShapedRecipe(getStack(Ref.PURE_MAGENTA, 8),"aaa","aya","aaa",'a', whiteBlock,'y', getDye(13));
        GameRegistry.addShapedRecipe(getStack(Ref.PURE_ORANGE, 8),"aaa","aya","aaa",'a', whiteBlock,'y', getDye(14));

        GameRegistry.addShapedRecipe(
                new ItemStack(getBlock(Ref.RAINBOW_BLOCK)), "abc","dye","fgh", // <-- I see what you did there
                'a', getDye(1), 'b', getDye(9), 'c', getDye(13),
                'd', getDye(14), 'y', whiteBlock, 'e', getDye(5),
                'f', getDye(11), 'g', getDye(10), 'h', getDye(4)
        );

        /**Items*/
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.compressedepearl),"aax","aax","xxx",'a', Items.ENDER_PEARL);

    }

    private static ItemStack getStack(String color, int amount) {
        return new ItemStack(getBlock(color), amount);
    }
    
    private static ColorBlock getBlock(String name) {
        return ModBlocks.blockMap.get(name).get(ModBlocks.UNLIT);
    }

    private static ItemStack getDye(int meta) {
        return new ItemStack(Items.DYE, 1, meta);
    }
}