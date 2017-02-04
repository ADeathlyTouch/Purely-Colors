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
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(getUnlitBlockForColor(Ref.PURE_WHITE)),Items.WATER_BUCKET,"colorBrick"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(getUnlitBlockForColor(Ref.PURE_WHITE)),Items.POTIONITEM,"colorBrick"));
    }

    private static void addShapedRecipes() {
        ColorBlock pureWhiteBlock = getUnlitBlockForColor(Ref.PURE_WHITE);
        /** Blocks*/
        GameRegistry.addShapedRecipe(new ItemStack(getUnlitBlockForColor(Ref.PURE_WHITE), 16),"xax","aya","xax",'a', ModItems.purifieddust,'y', Blocks.STONE);
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.purifieddust),"axa","xyx","axa",'x', Blocks.STONE,'y', Items.GLOWSTONE_DUST);
        GameRegistry.addShapedRecipe(new ItemStack(getUnlitBlockForColor(Ref.PURE_BLACK), 8),"aaa","aya","aaa",'a', pureWhiteBlock,'y', Items.DYE);
        GameRegistry.addShapedRecipe(new ItemStack(getUnlitBlockForColor(Ref.PURE_RED), 8),"aaa","aya","aaa",'a', pureWhiteBlock,'y', new ItemStack(Items.DYE, 1, 1));
        GameRegistry.addShapedRecipe(new ItemStack(getUnlitBlockForColor(Ref.PURE_GREEN), 8),"aaa","aya","aaa",'a', pureWhiteBlock,'y', new ItemStack(Items.DYE, 1, 2));
        GameRegistry.addShapedRecipe(new ItemStack(getUnlitBlockForColor(Ref.PURE_BROWN), 8),"aaa","aya","aaa",'a', pureWhiteBlock,'y', new ItemStack(Items.DYE, 1, 3));
        GameRegistry.addShapedRecipe(new ItemStack(getUnlitBlockForColor(Ref.PURE_BLUE), 8),"aaa","aya","aaa",'a', pureWhiteBlock,'y', new ItemStack(Items.DYE, 1, 4));
        GameRegistry.addShapedRecipe(new ItemStack(getUnlitBlockForColor(Ref.PURE_PURPLE), 8),"aaa","aya","aaa",'a', pureWhiteBlock,'y', new ItemStack(Items.DYE, 1, 5));
        GameRegistry.addShapedRecipe(new ItemStack(getUnlitBlockForColor(Ref.PURE_CYAN), 8),"aaa","aya","aaa",'a', pureWhiteBlock,'y', new ItemStack(Items.DYE, 1, 6));
        GameRegistry.addShapedRecipe(new ItemStack(getUnlitBlockForColor(Ref.PURE_LIGHTGREY), 8),"aaa","aya","aaa",'a', pureWhiteBlock,'y', new ItemStack(Items.DYE, 1, 7));
        GameRegistry.addShapedRecipe(new ItemStack(getUnlitBlockForColor(Ref.PURE_GREY), 8),"aaa","aya","aaa",'a', pureWhiteBlock,'y', new ItemStack(Items.DYE, 1, 8));
        GameRegistry.addShapedRecipe(new ItemStack(getUnlitBlockForColor(Ref.PURE_PINK), 8),"aaa","aya","aaa",'a', pureWhiteBlock,'y', new ItemStack(Items.DYE, 1, 9));
        GameRegistry.addShapedRecipe(new ItemStack(getUnlitBlockForColor(Ref.PURE_LIME), 8),"aaa","aya","aaa",'a', pureWhiteBlock,'y', new ItemStack(Items.DYE, 1, 10));
        GameRegistry.addShapedRecipe(new ItemStack(getUnlitBlockForColor(Ref.PURE_YELLOW), 8),"aaa","aya","aaa",'a', pureWhiteBlock,'y', new ItemStack(Items.DYE, 1, 11));
        GameRegistry.addShapedRecipe(new ItemStack(getUnlitBlockForColor(Ref.PURE_LIGHTBLUE), 8),"aaa","aya","aaa",'a', pureWhiteBlock,'y', new ItemStack(Items.DYE, 1, 12));
        GameRegistry.addShapedRecipe(new ItemStack(getUnlitBlockForColor(Ref.PURE_MAGENTA), 8),"aaa","aya","aaa",'a', pureWhiteBlock,'y', new ItemStack(Items.DYE, 1, 13));
        GameRegistry.addShapedRecipe(new ItemStack(getUnlitBlockForColor(Ref.PURE_ORANGE), 8),"aaa","aya","aaa",'a', pureWhiteBlock,'y', new ItemStack(Items.DYE, 1, 14));
        GameRegistry.addShapedRecipe(new ItemStack(getUnlitBlockForColor(Ref.RAINBOW_BLOCK)),"abc","dye","fgh",'y', pureWhiteBlock,'a', new ItemStack(Items.DYE, 1, 1),'b', new ItemStack(Items.DYE, 1, 9),'c', new ItemStack(Items.DYE, 1, 13),'d', new ItemStack(Items.DYE, 1, 14),'e', new ItemStack(Items.DYE, 1, 5),'f', new ItemStack(Items.DYE, 1, 11),'g', new ItemStack(Items.DYE, 1, 10),'h', new ItemStack(Items.DYE, 1, 4));

        /**Items*/
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.compressedepearl),"aax","aax","xxx",'a', Items.ENDER_PEARL);

    }
    
    private static ColorBlock getUnlitBlockForColor(String name) {
        return ModBlocks.blockMap.get(name).get(ModBlocks.UNLIT);
    }
}