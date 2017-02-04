package com.deathly.colors;

import com.deathly.colors.blocks.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

/**
 * Created by Deathly
 */

public class Ref {

    public static final String
            modid = "colors",
            modname = "Colors",
            version = "1.0.0",

    // colors
            RAINBOW_BLOCK = "rainbowblock",
            PURE_WHITE = "purewhite",
            PURE_BLACK = "pureblack",
            PURE_GREY = "puregrey",
            PURE_LIGHTGREY = "purelightgrey",
            PURE_BROWN = "purebrown",
            PURE_BLUE = "pureblue",
            PURE_LIGHTBLUE = "purelightblue",
            PURE_RED = "purered",
            PURE_ORANGE = "pureorange",
            PURE_GREEN = "puregreen",
            PURE_LIME = "purelime",
            PURE_CYAN = "purecyan",
            PURE_PINK = "purepink",
            PURE_PURPLE = "purepurple",
            PURE_YELLOW = "pureyellow",
            PURE_MAGENTA = "puremagenta";

    public static final CreativeTabs COLORS_CREATIVE_TAB = new CreativeTabs("Colors") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ModBlocks.getUnlitBlock(RAINBOW_BLOCK));
        }
    };
}
