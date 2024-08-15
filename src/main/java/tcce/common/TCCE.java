package tcce.common;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStoppedEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import net.minecraft.creativetab.CreativeTabs;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import tcce.common.items.TCCEItems;
import tcce.common.library.TCCEInfo;
import tcce.common.library.TCCERegistry;
import train.common.core.CommonProxy;
import train.common.core.handlers.EntityHandler;

@Mod(modid = TCCEInfo.modID, name = TCCEInfo.modName, version = TCCEInfo.modVersion)
public class TCCE {

    /* TrainCraft instance */
    @Mod.Instance(TCCEInfo.modID)
    public static TCCE instance;

    @SidedProxy(clientSide = "com.thedoctor1138.train.client.core.ClientProxy", serverSide = "com.thedoctor1138.train.common.core.CommonProxy")
    public static CommonProxy proxy;

    /* TrainCraft Logger */
    public static Logger tcLog = LogManager.getLogger(TCCEInfo.modName);

//	public static File configDirectory;

    /* Creative tab for Traincraft */
    public static CreativeTabs tcMLPTab;

    private TCCERegistry registry;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        tcLog.info("Starting Traincraft MLP Addon " + TCCEInfo.modVersion + "!");

        /* Config handler */
//		configDirectory= event.getModConfigurationDirectory();

        /* Register Items, Blocks, ... */
        tcLog.info("Initialize Blocks, Items, ...");

        tcMLPTab = new TCCECreativeTabTraincraftTrains(CreativeTabs.getNextID(), "TCMLP");


        TCCEItems.init();
        EntityHandler.init();

        /* Other Proxy init */
        tcLog.info("Initialize Renderer and Events");

        registry = new TCCERegistry();
        registry.init();

        tcLog.info("Finished PreInitialization");
    }



    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
    }

    @Mod.EventHandler
    public void load(FMLInitializationEvent event) {



        tcLog.info("Initialize Gui");
        NetworkRegistry.INSTANCE.registerGuiHandler(instance, proxy);


        tcLog.info("Initialize Recipes");
        TCCERecipeHandler.initBlockRecipes();
        TCCERecipeHandler.initItemRecipes();
        TCCERecipeHandler.initSmeltingRecipes();
        AssemblyTableRecipes.recipes();

        proxy.registerBookHandler();


    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent evt) {
    }

    @Mod.EventHandler
    public void serverStop(FMLServerStoppedEvent event) {
    }
}    }