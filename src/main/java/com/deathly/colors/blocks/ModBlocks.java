package com.deathly.colors.blocks;


import com.deathly.colors.Ref;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.*;

import static com.deathly.colors.Colors.logger;

public class ModBlocks {

    public static HashMap<String, HashMap<String, ColorBlock>> blockMap = new HashMap<>();
    public static List<ColorBlock> blocks = new ArrayList<>();
    public static List<String> colors = new ArrayList<>(
            Arrays.asList(
                    Ref.RAINBOW_BLOCK,
                    Ref.PURE_WHITE, Ref.PURE_BLACK, Ref.PURE_GREY, Ref.PURE_LIGHTGREY,
                    Ref.PURE_BROWN, Ref.PURE_BLUE, Ref.PURE_LIGHTBLUE, Ref.PURE_RED,
                    Ref.PURE_ORANGE, Ref.PURE_GREEN, Ref.PURE_LIME, Ref.PURE_CYAN,
                    Ref.PURE_PINK, Ref.PURE_PURPLE, Ref.PURE_YELLOW, Ref.PURE_MAGENTA

    ));

    public static String LIT = "lit";
    public static String UNLIT = "unlit";

    public static void init() {
        for (String color : colors) {
            addBlocksForColor(color);
        }

    }

    private static void addBlocksForColor(String color) {
        // given a single color unlocalized name string, generate both lit
        // and unlit blocks, and store them respectively
        ColorBlock unlitBlock = new ColorBlock(color, false);
        ColorBlock litBlock = new ColorBlock(color, true);

        HashMap<String, ColorBlock> myHash = new HashMap<>();

        myHash.put(LIT, litBlock);
        myHash.put(UNLIT, unlitBlock);

        blockMap.put(color, myHash);

        blocks.add(litBlock);
        blocks.add(unlitBlock);
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        for (ColorBlock block : blocks) {
            // iterate through all blocks and register each one
            block.initModel();
        }
    }

    public static ColorBlock getUnlitBlock(String color) {
        if (blockMap.get(color) == null) {
            logger.error("Attempted to retrieve unknown color block '" + color + "'.");
            return null;
        }
        return blockMap.get(color).get(UNLIT);
    }

    public static ColorBlock getLitBlock(String color) {
        if (blockMap.get(color) == null) {
            logger.error("Attempted to retrieve unknown color block '" + color + "'.");
            return null;
        }
        return blockMap.get(color).get(LIT);
    }

}
