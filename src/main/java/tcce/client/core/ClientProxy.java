package tcce.client.core;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import tcce.client.core.handlers.RecipeBookHandler;
import tcce.client.gui.GuiRecipeBook;
import tcce.common.core.CommonProxy;
import tcce.common.library.GuiIDs;

import java.util.Calendar;

public class ClientProxy extends CommonProxy {

    public static boolean isHoliday() {
        Calendar cal = Calendar.getInstance();
        return(cal.get(Calendar.MONTH) == Calendar.DECEMBER || (cal.get(Calendar.MONTH) == Calendar.JANUARY) && cal.get(Calendar.DATE) < 7);
    }
    public static boolean isPumpkin() {
        Calendar cal = Calendar.getInstance();
        return(cal.get(Calendar.MONTH) == Calendar.OCTOBER || cal.get(Calendar.MONTH) == Calendar.NOVEMBER && cal.get(Calendar.DATE) < 15);
    }
    public static boolean isAnniversary() {
        Calendar cal = Calendar.getInstance();
        return(cal.get(Calendar.MONTH) == Calendar.AUGUST && cal.get(Calendar.DATE) == 29);
    }

    public static boolean preRenderModels = false;


    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity te = world.getTileEntity(x, y, z);
        EntityPlayer riddenByEntity = null;
        Entity entity = player.ridingEntity;
        if (player.ridingEntity != null) {
            riddenByEntity = (EntityPlayer) entity.riddenByEntity;
        }

        Entity entity1 = null;
        if (y == -1) {
            for (Object ent : world.loadedEntityList) {
                if (((Entity) ent).getEntityId() == x)
                    entity1 = (Entity) ent;
            }
        }
        switch (ID) {

            case (GuiIDs.RECIPE_BOOK):
                return new GuiRecipeBook(player, player.getCurrentEquippedItem());


            default:
                return null;
        }
    }

    @Override
    public GuiScreen getCurrentScreen() {
        return Minecraft.getMinecraft().currentScreen;
    }

    @Override
    public void registerBookHandler() {
        RecipeBookHandler recipeBookHandler = new RecipeBookHandler();
    }

}
