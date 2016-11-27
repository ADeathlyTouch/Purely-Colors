package com.deathly.colors;

import com.deathly.colors.Items.ModItems;
import com.deathly.colors.proxy.CommonProxy;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Ref.modid, name = Ref.modname, version = Ref.version)
public class Colors {

	public static boolean enableLamps = true;

	@Instance(value = Ref.modid)
	public static Colors instance;

	@SidedProxy(clientSide = "com.deathly.colors.proxy.ClientProxy", serverSide = "com.deathly.colors.proxy.ServerProxy")
	public static CommonProxy proxy;

	public static Logger logger;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();

		enableLamps = config.getBoolean("enableLamps", Configuration.CATEGORY_GENERAL, true, "Enable or Disable Pure Block Lighting via Redstone Signal");

		config.save();
		proxy.preInit(event);
		ModItems.preInit();

	}


	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
		//Crafting
	}
}
