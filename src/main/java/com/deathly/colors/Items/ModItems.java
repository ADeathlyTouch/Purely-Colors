package com.deathly.colors.Items;

import com.deathly.colors.Ref;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Deathly on 11/19/2016.
 */
public class ModItems {

    public static Item TAvionLogo;
    public static Item purifieddust;
    public static Item compressedepearl;

    public static void preInit(){
        TAvionLogo = new ItemTAvionLogo("tavionlogo");
        purifieddust = new ItemPurifiedDust("purifieddust");
        compressedepearl = new ItemCompressedEnderPearl("compressed_enderpearl");

        registerItems();
    }

    public static void registerItems() {
        GameRegistry.register(TAvionLogo, new ResourceLocation(Ref.modid, "tavionlogo"));
        GameRegistry.register(purifieddust, new ResourceLocation(Ref.modid, "purifieddust"));
        GameRegistry.register(compressedepearl, new ResourceLocation(Ref.modid, "compressed_enderpearl"));
    }

    @SideOnly(Side.CLIENT)
    public static void registerRenders() {
        registerRender(TAvionLogo);
        registerRender(purifieddust);
        registerRender(compressedepearl);
    }

    @SideOnly(Side.CLIENT)
    private static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Ref.modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
