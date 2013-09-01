package k2b6s9j.OreEncyclopedia;

import java.util.logging.Level;
import java.util.logging.Logger;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "OreEncyclopedia", name = "OreEncylopedia", version = "1.0")
public class OreEncyclopedia {
	
	//Logger
	public static final Logger oeLog = Logger.getLogger("OreEncyclopedia");
	
	//Configuration Booleans
	public static Boolean logInfo;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Configuration cfg = new Configuration(event.getSuggestedConfigurationFile());
        try
        {
        	logInfo = cfg.get("Features", "logInfo", true, "Should post mod name, copyright, and website in log.").getBoolean(true);
        }
        catch (Exception e)
        {
            FMLLog.log(Level.SEVERE, e, "OreDictionary had a problem loading it's configuration");
        }
        finally
        {
            if (cfg.hasChanged())
                cfg.save();
        }
	}

	@EventHandler
	public void Init(FMLInitializationEvent event) {
		if (logInfo) {
			oeLog.info("OreEncyclopedia");
			oeLog.info("Copyright Kepler Sticka-Jones 2013");
			oeLog.info("http://k2b6s9j.com/projects/minecraft/oreencyclopedia");
		}
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
