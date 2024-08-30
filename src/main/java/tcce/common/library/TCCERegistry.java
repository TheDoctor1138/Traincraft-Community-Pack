package tcce.common.library;


import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.render.CustomItemModel;
import ebf.tim.utility.DebugUtil;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.StatCollector;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.oredict.OreDictionary;
import tcce.client.core.ClientProxy;
import tcce.client.render.TCCERenderEnum;
import tcce.common.TCCE;
import train.common.Traincraft;
import train.common.api.TrainRecord;
import train.common.api.TrainRenderRecord;
import train.common.api.TrainSoundRecord;
import train.common.api.blocks.BlockDynamic;
import train.common.api.blocks.TileRenderFacing;
import train.common.items.ItemRollingStock;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TCCERegistry {

    private List<TrainRecord> trainRecords = new ArrayList<>();
    private Map<Item, TrainRecord> trainRecordsByItem = new HashMap<>();
    private Map<Class<?>, TrainRenderRecord> trainRenderRecords = new HashMap<>();
    private List<TrainSoundRecord> trainSoundRecords = new ArrayList<>();

    public void init() {
        for (TrainRecord train : TCCEEnumTrains.trains()) {
            Traincraft.instance.traincraftRegistry.registerTrainRecord(train);
        }

        Side side = FMLCommonHandler.instance().getEffectiveSide();
        if (side == Side.CLIENT) {
            for (TCCERenderEnum render : TCCERenderEnum.values()) {
                Traincraft.instance.traincraftRegistry.registerTrainRenderRecord(render);
            }

            for (TrainSoundRecord sound : TCCEEnumSounds.values()) {
                Traincraft.instance.traincraftRegistry.registerTrainSoundRecord(sound);
            }
        }
    }

    public TrainRecord getTrainRecord(Class<?> entityClass) {
        if (entityClass == null) return null;

        for (TrainRecord record : trainRecords) {
            if (entityClass.equals(record.getEntityClass())) {
                return record;
            }
        }
        return null;
    }


    public void registerTrainRecord(TrainRecord record) {
        trainRecords.add(record);
        trainRecordsByItem.put(record.getItem(), record);
    }

    public void registerTrainRenderRecord(TrainRenderRecord record) {
        trainRenderRecords.put(record.getEntityClass(), record);
        addLivery(train.common.entity.rollingStock.EntityBoxCartUS.class, "burple");
    }

    public void addLivery(Class<?> entityClass, String name){
        for (TrainRecord record : trainRecords) {
            if (entityClass.equals(record.getEntityClass())) {
                record.skins.add(name);
            }
        }
    }


    public void registerTrainSoundRecord(TrainSoundRecord sound) {
        trainSoundRecords.add(sound);
    }

    private static List<String> usedNames = new ArrayList<>();
    private static List<String> redundantTiles = new ArrayList<>();
    private static List<String> redundantBlocks = new ArrayList<>();

    public static int registryPosition = 18;


    //Item and Block registration:
    /**
     * @param block             the block in question
     * @param tab               the creative tab to put the block's item into, leave null for no creative tab entry.
     * @param MODID             modid of the host add-on, used for translations, texture names, and generic identification.
     * @param unlocalisedName   unlocalized name, used for translations, texture names, and generic identification.
     * @param oreDictionaryName ore directory name, used for other mods to identify type, mainly used for ingots, ores, and wood.
     * @param render            a ModelBase instance for rendering the tile entity.
     *                          Can instead be a TESR instance for more rendering control.
     *                          Null will fallback to a normal textured block render.
     * @return
     */

    /**Blocks That allow for Models, oreDictionary:*/
    public static Block registerBlock(Block block, CreativeTabs tab, String MODID, String unlocalizedName, @Nullable String oreDictionaryName, @Nullable Object render) {
        if (render instanceof ModelBase) {
            return registerBlock(block, tab, MODID, unlocalizedName, oreDictionaryName, TCCE.proxy.getTESR(), (ModelBase) render, unlocalizedName);
        } else {
            return registerBlock(block, tab, MODID, unlocalizedName, oreDictionaryName, render, null, unlocalizedName);
        }
    }
    /**Blocks That allow for Models, oredictionary, but require texture name*/
    public static Block registerBlock(Block block, CreativeTabs tab, String MODID, String unlocalizedName, @Nullable String oreDictionaryName, @Nullable Object render, String textureName) {
        if (render instanceof ModelBase) {
            return registerBlock(block, tab, MODID, unlocalizedName, oreDictionaryName, TCCE.proxy.getTESR(), (ModelBase) render, textureName);
        } else {
            return registerBlock(block, tab, MODID, unlocalizedName, oreDictionaryName, render, null, textureName);
        }
    }
    /**Most basic block:*/
    public static Block registerBlock(Block block, CreativeTabs tab, String modid, String unlocalizedName) {
        return registerBlock(block, tab, modid, unlocalizedName, null, TCCE.proxy.getTESR());
    }
    /**Most basic block that allows for oreDictionary:*/
    public static Block registerBlock(Block block, CreativeTabs tab, String modid, String unlocalizedName, @Nullable String oreDictionaryName) {
        return registerBlock(block, tab, modid, unlocalizedName, oreDictionaryName, TCCE.proxy.getTESR());
    }
    /**Block with Model:*/
    public static Block registerBlock(Block block, CreativeTabs tab, String unlocalizedName, @Nullable String oreDictionaryName, @Nullable Object render) {
        return registerBlock(block, tab, null, unlocalizedName, oreDictionaryName, render);
    }
    /**Other:*/
    public static Block registerBlock(Block block, CreativeTabs tab, String MODID, String unlocalizedName, @Nullable String oreDictionaryName, @Nullable Object TESR, @Nullable ModelBase model) {
        return registerBlock(block, tab, MODID, unlocalizedName, oreDictionaryName, TESR, model, unlocalizedName);
    }


    /**Registration of Block*/

    public static Block registerBlock(Block block, CreativeTabs tab, String MODID, String unlocalizedName, @Nullable String oreDictionaryName, @Nullable Object TESR, @Nullable ModelBase model, String textureName) {
        if (usedNames.contains(unlocalizedName)) {
            DebugUtil.println("ERROR: ", "attempted to register Block with a used unlocalizedName", unlocalizedName);
            DebugUtil.throwStackTrace();
        }
        if (tab != null) {
            block.setCreativeTab(tab);
        }
        if (!unlocalizedName.isEmpty()) {
            block.setBlockName(unlocalizedName);
            GameRegistry.registerBlock(block, null, unlocalizedName);
            if(model!=null || (block instanceof ITileEntityProvider && ((ITileEntityProvider) block).createNewTileEntity(null,0) instanceof TileRenderFacing)) {
                registerItem(new ItemBlock(block), MODID, unlocalizedName, oreDictionaryName + ".item", tab, null, ebf.tim.render.CustomItemModel.instance, textureName);
                if(TCCE.proxy.isClient() && TESR==null){
                    TESR=new ebf.tim.render.BlockTESR();
                }
            } else {
                registerItem(new ItemBlock(block), MODID, unlocalizedName, oreDictionaryName + ".item", tab, null, null, textureName);
            }
            usedNames.add(unlocalizedName);
        } else {
            DebugUtil.println("ERROR: ", "attempted to register Block with no unlocalizedName");
            DebugUtil.throwStackTrace();
        }

        if (TCCE.proxy.isClient() && MODID != null) {
            block.setBlockTextureName(MODID + ":" + textureName);
        }
        if (oreDictionaryName != null) {
            OreDictionary.registerOre(oreDictionaryName, block);
        }
        if (DebugUtil.dev && TCCE.proxy.isClient() && block.getUnlocalizedName().equals(StatCollector.translateToLocal(block.getUnlocalizedName() +".name"))) {
            DebugUtil.println("Block missing lang entry: " + block.getUnlocalizedName());
        }
        if (block instanceof ITileEntityProvider) {
            Class<? extends TileEntity> tile = ((ITileEntityProvider) block).createNewTileEntity(null, 0).getClass();
            if (!redundantTiles.contains(tile.getName())) {
                GameRegistry.registerTileEntity(tile, unlocalizedName + "tile");
                redundantTiles.add(tile.getName());
                redundantTiles.add(unlocalizedName + "tile");
                if (TCCE.proxy.isClient() && TESR!=null) {
                    regTileRender(MODID,unlocalizedName,block,tile,model,TESR);
                }
            } else if(!redundantTiles.contains(unlocalizedName + "tile")) {
                if (TCCE.proxy.isClient() && TESR != null) {
                    regTileRender(MODID,unlocalizedName,block, tile, model, TESR);
                }
            } else {
                DebugUtil.println("redundant tile name found",tile.getName(), unlocalizedName + "tile");
                DebugUtil.printStackTrace();
            }
        }
        return block;
    }


    /**Most basic Item*/
    public static Item registerItem(Item item, String MODID, String unlocalizedName, CreativeTabs tab) {
        return registerItem(item, MODID, unlocalizedName, null, tab, null, null);
    }
    /**Most basic Item that has custom texture*/
    public static Item registerItem(Item item, String MODID, String unlocalizedName, CreativeTabs tab, String textureName) {
        return registerItem(item, MODID, unlocalizedName, null, tab, null, null, textureName);
    }

    /**Item with oreDictionary compatibility, has ItemRender for itemModel, if container item is used, it will return said item when crafted with (eg milk returns empty bucket after crafting cake */
    public static Item registerItem(Item item, String MODID, String unlocalizedName, @Nullable String oreDictionaryName, @Nullable CreativeTabs tab, @Nullable Item container, @Nullable Object itemRender) {
        return registerItem(item, MODID, unlocalizedName, oreDictionaryName, tab, container, itemRender, unlocalizedName.replace("item.", ""));
    }

    public static Item registerItem(Item item, String MODID, String unlocalizedName, @Nullable String oreDictionaryName, @Nullable CreativeTabs tab, @Nullable Item container, @Nullable Object itemRender, String textureName) {
        if (usedNames.contains(unlocalizedName)) {
            DebugUtil.println("ERROR: ", "attempted to register Item with a used unlocalizedName", unlocalizedName);
            DebugUtil.throwStackTrace();
        }
        if (tab != null) {
            item.setCreativeTab(tab);
        }
        if (container != null) {
            item.setContainerItem(container);
        }
        if (!unlocalizedName.equals("")) {
            item.setUnlocalizedName(MODID + ":" + unlocalizedName);
            usedNames.add(unlocalizedName);
        } else {
            DebugUtil.println("ERROR: ", "attempted to register Item with no unlocalizedName");
            DebugUtil.throwStackTrace();
        }
        GameRegistry.registerItem(item, unlocalizedName);
        if (oreDictionaryName != null) {
            OreDictionary.registerOre(oreDictionaryName, item);
        }
        if (DebugUtil.dev && TCCE.proxy != null && TCCE.proxy.isClient() && item.getUnlocalizedName().equals(StatCollector.translateToLocal(item.getUnlocalizedName()+".name"))) {
            DebugUtil.println("Item missing lang entry: " + item.getUnlocalizedName());
        }
        if (TCCE.proxy.isClient() && itemRender != null) {
            MinecraftForgeClient.registerItemRenderer(item, (IItemRenderer) itemRender);
            if (ClientProxy.preRenderModels) {
                ebf.tim.render.CustomItemModel.instance.renderItem(IItemRenderer.ItemRenderType.INVENTORY, new ItemStack(item));
            }
        } else if (TCCE.proxy.isClient() && item instanceof ItemRollingStock) {
            MinecraftForgeClient.registerItemRenderer(item, ebf.tim.render.CustomItemModel.instance);
            if (ClientProxy.preRenderModels) {
                ebf.tim.render.CustomItemModel.instance.renderItem(IItemRenderer.ItemRenderType.INVENTORY, new ItemStack(item));
            }
        } else if(TCCE.proxy.isClient()){
            item.setTextureName(MODID+ ":" + textureName);
        }
        return item;
    }

































    @SideOnly(Side.CLIENT)
    private static void regTileRender(String MODID, String unlocalizedName, Block block, Class<? extends TileEntity> tile, ModelBase model, Object TESR) {

        if (block instanceof BlockDynamic) {
            if (model != null) {
                ((BlockDynamic) block).setModel(model);
            } else if (TESR != null) {
                ((BlockDynamic) block).setTESR(TESR);
            }
        }
        if (TESR != null) {
            cpw.mods.fml.client.registry.ClientRegistry.bindTileEntitySpecialRenderer(tile, (TileEntitySpecialRenderer) TESR);
            MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(block), CustomItemModel.instance);
            CustomItemModel.registerBlockTextures(Item.getItemFromBlock(block), ((ITileEntityProvider) block).createNewTileEntity(null, 0));
        } else {
            cpw.mods.fml.client.registry.ClientRegistry.bindTileEntitySpecialRenderer(tile, (TileEntitySpecialRenderer) Traincraft.proxy.getTESR());
            MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(block), CustomItemModel.instance);
            CustomItemModel.registerBlockTextures(Item.getItemFromBlock(block), ((ITileEntityProvider) block).createNewTileEntity(null, 0));
        }
    }

    public static void endRegistration() {
        usedNames = null;
        registryPosition = -1;
        redundantTiles = null;
    }





}
