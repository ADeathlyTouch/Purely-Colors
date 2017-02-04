package com.deathly.colors.utils;

import com.deathly.colors.Ref;
import com.deathly.colors.blocks.ModBlocks;
import net.minecraft.item.ItemStack;

import static net.minecraftforge.oredict.OreDictionary.registerOre;
/**
 * Created by Deathly on 11/20/2016 at 3:46 AM.
 */
public class ModOreDict {
    public static void registerOeDictEntries() {
        registerOre("colorBrick", new ItemStack(ModBlocks.getUnlitBlock(Ref.PURE_WHITE), 1));
        registerOre("colorBrick", new ItemStack(ModBlocks.getUnlitBlock(Ref.PURE_RED), 1));
        registerOre("colorBrick", new ItemStack(ModBlocks.getUnlitBlock(Ref.PURE_GREY), 1));
        registerOre("colorBrick", new ItemStack(ModBlocks.getUnlitBlock(Ref.PURE_YELLOW), 1));
        registerOre("colorBrick", new ItemStack(ModBlocks.getUnlitBlock(Ref.PURE_GREEN), 1));
        registerOre("colorBrick", new ItemStack(ModBlocks.getUnlitBlock(Ref.PURE_BROWN), 1));
        registerOre("colorBrick", new ItemStack(ModBlocks.getUnlitBlock(Ref.PURE_CYAN), 1));
        registerOre("colorBrick", new ItemStack(ModBlocks.getUnlitBlock(Ref.PURE_LIME), 1));
        registerOre("colorBrick", new ItemStack(ModBlocks.getUnlitBlock(Ref.PURE_PURPLE), 1));
        registerOre("colorBrick", new ItemStack(ModBlocks.getUnlitBlock(Ref.PURE_PINK), 1));
        registerOre("colorBrick", new ItemStack(ModBlocks.getUnlitBlock(Ref.PURE_ORANGE), 1));
        registerOre("colorBrick", new ItemStack(ModBlocks.getUnlitBlock(Ref.PURE_WHITE), 1));
        registerOre("colorBrick", new ItemStack(ModBlocks.getUnlitBlock(Ref.PURE_BLACK), 1));
        registerOre("colorBrick", new ItemStack(ModBlocks.getUnlitBlock(Ref.PURE_MAGENTA), 1));
        registerOre("colorBrick", new ItemStack(ModBlocks.getUnlitBlock(Ref.PURE_LIGHTBLUE), 1));
        registerOre("colorBrick", new ItemStack(ModBlocks.getUnlitBlock(Ref.PURE_LIGHTGREY), 1));
    }
}
