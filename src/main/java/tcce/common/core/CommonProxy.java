package tcce.common.core;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class CommonProxy implements IGuiHandler {
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

            return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

      return null;

    }

    public boolean isClient(){
        return false;
    }
    public Object getTESR(){return null;}

    public GuiScreen getCurrentScreen() {
        return null;
    }

    public void registerBookHandler() {}
}
