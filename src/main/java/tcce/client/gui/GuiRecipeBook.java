//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package tcce.client.gui;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import org.lwjgl.opengl.GL11;
import tcce.client.core.handlers.RecipeBookHandler;
import tcce.common.items.ItemRecipeBook;
import train.common.blocks.TCBlocks;
import train.common.core.managers.TierRecipe;
import train.common.core.managers.TierRecipeManager;
import train.common.inventory.TrainCraftingManager;
import train.common.items.ItemRollingStock;
import train.common.library.ItemIDs;
import train.common.recipes.ShapedTrainRecipes;
import train.common.recipes.ShapelessTrainRecipe;

import java.util.ArrayList;
import java.util.List;

@SideOnly(Side.CLIENT)
public class GuiRecipeBook extends GuiScreen {
    private final EntityPlayer editingPlayer;
    private final ItemStack itemstackBook;
    private int bookImageWidth = 206;
    private int bookImageHeight = 200;
    public static int bookTotalPages = 2;
    private int currPage;
    private int currRecipe;
    public ArrayList<String> leftPage = new ArrayList();
    public ArrayList<String> leftPageImage = new ArrayList();
    public ArrayList<ArrayList> leftPageItemStacks = new ArrayList();
    public ArrayList<String> rightPage = new ArrayList();
    public ArrayList<String> rightPageImage = new ArrayList();
    public ArrayList<ArrayList> rightPageItemStacks = new ArrayList();
    private List recipeListWB = null;
    private List<TierRecipe> recipeList = null;
    private GuiButtonNextPage buttonRead;
    private GuiButtonNextPage buttonNextPage;
    private GuiButtonNextPage buttonPreviousPage;
    private GuiButtonNextPage buttonBack;
    private RenderItem renderItem = new RenderItem();

    public GuiRecipeBook(EntityPlayer par1EntityPlayer, ItemStack par2ItemStack) {
        this.editingPlayer = par1EntityPlayer;
        this.itemstackBook = par2ItemStack;
        this.currPage = this.itemstackBook.getTagCompound().getInteger("currPage");
        this.currRecipe = this.itemstackBook.getTagCompound().getInteger("currRecipe");
        this.addPage("", "", "left", (ArrayList)null);
        this.addPage("", "", "right", (ArrayList)null);
        this.addPage("Welcome to the TC MLP guide! \nThis book contains everything you need to know about the MLP addon.\n\nAuthors:\nTheDoctor1138,\n\nThanks to CovertJaguar for his help and a great API.\n", "", "left", new ArrayList<StackToDraw>() {
            {
                this.add(GuiRecipeBook.this.new StackToDraw(new ItemStack(ItemIDs.minecartLocoBR80_DB.item), 20, 16));
                this.add(GuiRecipeBook.this.new StackToDraw(new ItemStack(TCBlocks.trainWorkbench), 170, 16));
                this.add(GuiRecipeBook.this.new StackToDraw(new ItemStack(ItemIDs.minecartCabooseWork.item), 60, 175));
                this.add(GuiRecipeBook.this.new StackToDraw(new ItemStack(ItemIDs.minecartTankWagon_DB.item), 80, 175));
                this.add(GuiRecipeBook.this.new StackToDraw(new ItemStack(ItemIDs.minecartFlatCartRail_DB.item), 100, 175));
                this.add(GuiRecipeBook.this.new StackToDraw(new ItemStack(ItemIDs.minecartFreightWagon_DB.item), 120, 175));
                this.add(GuiRecipeBook.this.new StackToDraw(new ItemStack(ItemIDs.minecartPassengerBlue.item), 140, 175));
                this.add(GuiRecipeBook.this.new StackToDraw(new ItemStack(ItemIDs.minecartV60_DB.item), 160, 175));
            }
        });
        this.addPage("Modelers:\nchazi898,\nkrankerbusfahrer,\nsquidman88,\nTheDoctor1138.\n\nGitHub 1.7.10 port Team: \nEternal BlueFlame,\nNitroxydeX,\nFirEmerald,\nHagurd\nTheDoctor1138\n\nWebsite:\nhttp://traincraft-mod.\nblogspot.com", "", "right", new ArrayList<StackToDraw>() {
            {
                this.add(GuiRecipeBook.this.new StackToDraw(new ItemStack(ItemIDs.minecartLocoSteamAdler.item), 20, 16));
                this.add(GuiRecipeBook.this.new StackToDraw(new ItemStack(TCBlocks.assemblyTableI), 170, 16));
                this.add(GuiRecipeBook.this.new StackToDraw(new ItemStack(ItemIDs.minecartLocoForneyRed.item), 20, 175));
                this.add(GuiRecipeBook.this.new StackToDraw(new ItemStack(ItemIDs.minecartPassengerBlue.item), 40, 175));
                this.add(GuiRecipeBook.this.new StackToDraw(new ItemStack(ItemIDs.minecartPassengerBlue.item), 60, 175));
                this.add(GuiRecipeBook.this.new StackToDraw(new ItemStack(ItemIDs.minecartFreightWagon_DB.item), 80, 175));
                this.add(GuiRecipeBook.this.new StackToDraw(new ItemStack(ItemIDs.minecartWood.item), 100, 175));
                this.add(GuiRecipeBook.this.new StackToDraw(new ItemStack(ItemIDs.minecartCabooseLogging.item), 120, 175));
            }
        });
        this.addPage("On the following pages you will find all the train workbench recipes and assembly table recipes.\nIt is however strongly suggested to try to discover the recipes by yourself...\n\nWe hope you will enjoy the mod!\n\nSpitfire4466 and MrBrutal", "", "left", new ArrayList<StackToDraw>() {
            {
                this.add(GuiRecipeBook.this.new StackToDraw(new ItemStack(TCBlocks.assemblyTableII), 20, 16));
                this.add(GuiRecipeBook.this.new StackToDraw(new ItemStack(ItemIDs.hat.item), 40, 155));
                this.add(GuiRecipeBook.this.new StackToDraw(new ItemStack(ItemIDs.jacket.item), 90, 155));
                this.add(GuiRecipeBook.this.new StackToDraw(new ItemStack(ItemIDs.overalls.item), 140, 155));
            }
        });
        this.addPage("this page was intentionally left blank, as a joke.", "", "right", (ArrayList)null);
        if (this.recipeListWB == null || this.recipeListWB.size() < 1) {
            this.recipeListWB = RecipeBookHandler.workbenchListCleaner(TrainCraftingManager.getInstance().getRecipeList());
            this.recipeList = RecipeBookHandler.assemblyListCleaner(TierRecipeManager.getInstance().getRecipeList());
        }

        if (this.rightPage != null && this.recipeList != null && this.recipeListWB != null) {
            bookTotalPages = this.rightPage.size() + this.recipeList.size() / 2 + this.recipeListWB.size() / 2;
        }

    }

    private void addPage(String text, String image, String side, ArrayList<StackToDraw> stacks) {
        if (side.equals("left")) {
            this.leftPage.add(text);
            this.leftPageImage.add(image);
            this.leftPageItemStacks.add(stacks);
        }

        if (side.equals("right")) {
            this.rightPage.add(text);
            this.rightPageImage.add(image);
            this.rightPageItemStacks.add(stacks);
        }

    }

    public void initGui() {
        this.buttonList.clear();
        int var1 = this.width / 2;
        int var2 = this.height / 2;
        this.buttonList.add(this.buttonBack = new GuiButtonNextPage(4, var1 + 150, var2 + 80, 23, 13, true));
        this.buttonList.add(this.buttonRead = new GuiButtonNextPage(3, var1 - 8, var2 + 98, 40, 20, true));
        this.buttonList.add(this.buttonNextPage = new GuiButtonNextPage(1, var1 + 150, var2 + 80, 23, 13, true));
        this.buttonList.add(this.buttonPreviousPage = new GuiButtonNextPage(2, var1 - 180, var2 + 80, 23, 13, false));
        this.updateButtons();
    }

    private void updateButtons() {
        this.buttonBack.visible = this.currPage == bookTotalPages - 1;
        this.buttonBack.showButton = true;
        this.buttonRead.visible = this.currPage == 0;
        this.buttonRead.showButton = false;
        this.buttonNextPage.visible = this.currPage > 0 && this.currPage < bookTotalPages - 1;
        this.buttonNextPage.showButton = this.currPage > 0 && this.currPage < bookTotalPages - 1;
        this.buttonPreviousPage.visible = this.currPage > 0;
        this.buttonPreviousPage.showButton = this.currPage > 0;
    }

    protected void actionPerformed(GuiButton par1GuiButton) {
        if (par1GuiButton.enabled) {
            if (par1GuiButton.id == 1) {
                if (this.currPage < bookTotalPages - 1) {
                    ++this.currPage;
                    this.currRecipe += 2;
                }
            } else if (par1GuiButton.id == 2) {
                if (this.currPage > 0) {
                    --this.currPage;
                    this.currRecipe -= 2;
                }
            } else if (par1GuiButton.id == 3) {
                if (this.currPage == 0) {
                    ++this.currPage;
                    this.currRecipe += 2;
                }
            } else if (par1GuiButton.id == 4 && this.currPage == bookTotalPages - 1) {
                this.currPage = 0;
                this.currRecipe = 0;
            }

            this.updateButtons();
        }

    }

    public void drawScreen(int par1, int par2, float par3) {
        int var5 = this.width / 2;
        int var6 = this.height / 2 - this.bookImageHeight / 2;
        if (this.currPage > 0) {
            this.mc.renderEngine.bindTexture(new ResourceLocation("tc", "textures/gui/book/bookright.png"));
            this.drawTexturedModalRect(var5, var6, 0, 0, this.bookImageWidth, this.bookImageHeight + 20);
            this.mc.renderEngine.bindTexture(new ResourceLocation("tc", "textures/gui/book/bookleft.png"));
            var5 -= this.bookImageWidth;
            this.drawTexturedModalRect(var5, var6, 256 - this.bookImageWidth, 0, this.bookImageWidth, this.bookImageHeight);
        } else {
            this.mc.renderEngine.bindTexture(new ResourceLocation("tc", "textures/gui/book/bookcover.png"));
            this.drawTexturedModalRect(var5 - 55, var6 - 15, 0, 0, 256, 256);
        }

        String pageIndic = String.format(StatCollector.translateToLocal("book.pageIndicator"), this.currPage + 1, bookTotalPages);
        int var9 = this.fontRendererObj.getStringWidth(pageIndic);
        if (this.currPage > 0) {
            this.fontRendererObj.drawString(pageIndic, var5 - var9 + this.bookImageWidth - 44, var6 + 7, 0);
        }

        super.drawScreen(par1, par2, par3);
        int t;
        if (this.currPage < this.rightPage.size()) {
            this.fontRendererObj.drawSplitString((String)this.leftPage.get(this.currPage), var5 + 36, var6 + 16 + 16, 140, 0);
            this.fontRendererObj.drawSplitString((String)this.rightPage.get(this.currPage), var5 + 250, var6 + 16 + 16, 140, 0);
            GL11.glEnable(32826);
            RenderHelper.enableGUIStandardItemLighting();
            if (this.leftPageItemStacks != null && this.leftPageItemStacks.get(this.currPage) != null && ((ArrayList)this.leftPageItemStacks.get(this.currPage)).get(0) != null) {
                for(t = 0; t < ((ArrayList)this.leftPageItemStacks.get(this.currPage)).size(); ++t) {
                    if (((ArrayList)this.leftPageItemStacks.get(this.currPage)).get(t) != null) {
                        this.renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, ((StackToDraw)((ArrayList)this.leftPageItemStacks.get(this.currPage)).get(t)).getItemStack(), var5 + ((StackToDraw)((ArrayList)this.leftPageItemStacks.get(this.currPage)).get(t)).getX(), var6 + ((StackToDraw)((ArrayList)this.leftPageItemStacks.get(this.currPage)).get(t)).getY());
                    }
                }
            }

            if (this.rightPageItemStacks != null && this.rightPageItemStacks.get(this.currPage) != null && ((ArrayList)this.rightPageItemStacks.get(this.currPage)).get(0) != null) {
                for(t = 0; t < ((ArrayList)this.rightPageItemStacks.get(this.currPage)).size(); ++t) {
                    if (((ArrayList)this.rightPageItemStacks.get(this.currPage)).get(t) != null) {
                        this.renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, ((StackToDraw)((ArrayList)this.rightPageItemStacks.get(this.currPage)).get(t)).getItemStack(), var5 + ((StackToDraw)((ArrayList)this.rightPageItemStacks.get(this.currPage)).get(t)).getX() + 210, var6 + ((StackToDraw)((ArrayList)this.rightPageItemStacks.get(this.currPage)).get(t)).getY());
                    }
                }
            }

            GL11.glDisable(32826);
        }

        if (this.currPage > this.rightPage.size() - 1) {
            t = this.currRecipe - this.rightPage.size() * 2 + 1;
            if (t <= this.recipeListWB.size() - 1) {
                this.drawWorkBenchBackground(this.recipeListWB, var5, var6, 0, var9, "right");
                this.drawWorkBenchBackground(this.recipeListWB, var5, var6, 0, var9, "left");
                RenderHelper.enableGUIStandardItemLighting();
                this.drawWorkBenchRecipe(this.recipeListWB, var5, var6, t - 1, var9, "right");
                this.drawWorkBenchRecipe(this.recipeListWB, var5, var6, t, var9, "left");
            } else if (t - this.recipeListWB.size() >= 0 && t - this.recipeListWB.size() < this.recipeList.size() && this.recipeList.get(t - this.recipeListWB.size()) != null) {
                this.drawAssemblyBackground(this.recipeList, var5 - 125, var6 - 33, t - this.recipeListWB.size(), var9, "right");
                this.drawAssemblyBackground(this.recipeList, var5 - 50, var6 - 33, t - this.recipeListWB.size() - 1, var9, "left");
                RenderHelper.enableGUIStandardItemLighting();
                this.drawAssemblyRecipe(this.recipeList, var5 - 125, var6 - 33, t - this.recipeListWB.size(), var9, "right");
                this.drawAssemblyRecipe(this.recipeList, var5 - 50, var6 - 33, t - this.recipeListWB.size() - 1, var9, "left");
            }
        }

        GL11.glDisable(2896);
    }

    private void drawAssemblyBackground(List<TierRecipe> recipeList, int var5, int var6, int page, int var9, String side) {
        if (page >= 0) {
            int tier = ((TierRecipe)recipeList.get(page)).getTier();
            if (tier == 1) {
                this.mc.renderEngine.bindTexture(new ResourceLocation("tc", "textures/gui/gui_tierI_ironAge.png"));
            }

            if (tier == 2) {
                this.mc.renderEngine.bindTexture(new ResourceLocation("tc", "textures/gui/gui_tierII_steelAge.png"));
            }

            if (tier == 3) {
                this.mc.renderEngine.bindTexture(new ResourceLocation("tc", "textures/gui/gui_tierIII_advancedAge.png"));
            }

            if (side.equals("left")) {
                this.drawTexturedModalRect(var5 + 70, var6 + 50, 0, 0, 177, 163);
            }

            if (side.equals("right")) {
                this.drawTexturedModalRect(var5 + 340, var6 + 50, 0, 0, 177, 163);
            }

        }
    }

    private void drawWorkBenchBackground(List<ShapedTrainRecipes> recipeListWB, int var5, int var6, int page, int var9, String side) {
        this.mc.renderEngine.bindTexture(new ResourceLocation("tc", "textures/gui/crafting_table.png"));
        if (side.equals("left")) {
            this.drawTexturedModalRect(var5 + 20, var6 + 50, 0, 0, 177, 80);
        }

        if (side.equals("right")) {
            this.drawTexturedModalRect(var5 + 215, var6 + 50, 0, 0, 177, 80);
        }

    }

    private void drawWorkBenchRecipe(List recipeList, int var5, int var6, int page, int var9, String side) {
        if (recipeList.get(page) != null) {
            ItemStack[] itemList = new ItemStack[9];
            ItemStack itemOutput = null;
            if (recipeList.get(page) instanceof ShapedTrainRecipes) {
                itemList = ((ShapedTrainRecipes)recipeList.get(page)).recipeItems;
                itemOutput = ((ShapedTrainRecipes)recipeList.get(page)).getRecipeOutput();
            }

            int z;
            if (recipeList.get(page) instanceof ShapelessTrainRecipe) {
                List<ItemStack> itemListShapeless = ((ShapelessTrainRecipe)recipeList.get(page)).recipeItems;

                for(z = 0; z < itemListShapeless.size(); ++z) {
                    if (itemListShapeless != null && itemListShapeless.get(z) != null) {
                        itemList[z] = (ItemStack)itemListShapeless.get(z);
                    }
                }

                itemOutput = ((ShapelessTrainRecipe)recipeList.get(page)).getRecipeOutput();
            }

            int offset = 0;
            if (side.equals("right")) {
                offset = 194;
            }

            GL11.glEnable(32826);
            if (itemList[0] != null) {
                this.renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList[0], var5 + 50 + offset, var6 + 67);
            }

            if (itemList[1] != null) {
                this.renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList[1], var5 + 68 + offset, var6 + 67);
            }

            if (itemList[2] != null) {
                this.renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList[2], var5 + 86 + offset, var6 + 67);
            }

            if (itemList[3] != null) {
                this.renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList[3], var5 + 50 + offset, var6 + 85);
            }

            if (itemList[4] != null) {
                this.renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList[4], var5 + 68 + offset, var6 + 85);
            }

            if (itemList[5] != null) {
                this.renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList[5], var5 + 86 + offset, var6 + 85);
            }

            if (itemList[6] != null) {
                this.renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList[6], var5 + 50 + offset, var6 + 103);
            }

            if (itemList[7] != null) {
                this.renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList[7], var5 + 68 + offset, var6 + 103);
            }

            if (itemList[8] != null) {
                this.renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemList[8], var5 + 86 + offset, var6 + 103);
            }

            if (itemOutput != null && itemOutput.getItem() != null) {
                this.renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemOutput, var5 + 145 + offset, var6 + 85);
            }

            if (itemOutput != null && itemOutput.getItem() != null) {
                this.fontRendererObj.drawString(itemOutput.getItem().getItemStackDisplayName(itemOutput), var5 + 20 + offset, var6 + 40, 0);
            }

            if (itemOutput != null) {
                this.fontRendererObj.drawString("Crafted in: Train Workbench", var5 + 20 + offset, var6 + 130, 0);
            }

            if (itemOutput != null) {
                for(z = 0; z < RecipeBookHandler.vanillaWorkTableRecipes.length; ++z) {
                    if (itemOutput.getItem() != null && RecipeBookHandler.vanillaWorkTableRecipes[z] != null && RecipeBookHandler.vanillaWorkTableRecipes[z].equals(itemOutput.getItem().getItemStackDisplayName(itemOutput))) {
                        this.fontRendererObj.drawString("Also crafted in: Crafting Table", var5 + 20 + offset, var6 + 140, 0);
                        break;
                    }
                }
            }

            GL11.glDisable(32826);
        }
    }

    private void drawAssemblyRecipe(List<TierRecipe> recipeList, int var5, int var6, int page, int var9, String side) {
        if (page >= 0) {
            int tier = ((TierRecipe)recipeList.get(page)).getTier();
            List<ItemStack> itemList = ((TierRecipe)recipeList.get(page)).getInput();
            int offset = 0;
            if (side.equals("right")) {
                offset = 271;
            }

            GL11.glEnable(32826);
            if (itemList.get(0) != null) {
                this.renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, (ItemStack)itemList.get(0), var5 + 94 + offset, var6 + 76);
            }

            if (itemList.get(0) != null) {
                this.renderItem.renderItemOverlayIntoGUI(this.fontRendererObj, this.mc.renderEngine, (ItemStack)itemList.get(0), var5 + 94 + offset, var6 + 76);
            }

            if (itemList.get(1) != null) {
                this.renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, (ItemStack)itemList.get(1), var5 + 113 + offset, var6 + 143);
            }

            if (itemList.get(1) != null) {
                this.renderItem.renderItemOverlayIntoGUI(this.fontRendererObj, this.mc.renderEngine, (ItemStack)itemList.get(1), var5 + 113 + offset, var6 + 143);
            }

            if (itemList.get(2) != null) {
                this.renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, (ItemStack)itemList.get(2), var5 + 148 + offset, var6 + 143);
            }

            if (itemList.get(2) != null) {
                this.renderItem.renderItemOverlayIntoGUI(this.fontRendererObj, this.mc.renderEngine, (ItemStack)itemList.get(2), var5 + 148 + offset, var6 + 143);
            }

            if (itemList.get(3) != null) {
                this.renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, (ItemStack)itemList.get(3), var5 + 214 + offset, var6 + 143);
            }

            if (itemList.get(3) != null) {
                this.renderItem.renderItemOverlayIntoGUI(this.fontRendererObj, this.mc.renderEngine, (ItemStack)itemList.get(3), var5 + 214 + offset, var6 + 143);
            }

            if (itemList.get(4) != null) {
                this.renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, (ItemStack)itemList.get(4), var5 + 148 + offset, var6 + 77);
            }

            if (itemList.get(4) != null) {
                this.renderItem.renderItemOverlayIntoGUI(this.fontRendererObj, this.mc.renderEngine, (ItemStack)itemList.get(4), var5 + 148 + offset, var6 + 77);
            }

            if (itemList.get(5) != null) {
                this.renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, (ItemStack)itemList.get(5), var5 + 184 + offset, var6 + 77);
            }

            if (itemList.get(5) != null) {
                this.renderItem.renderItemOverlayIntoGUI(this.fontRendererObj, this.mc.renderEngine, (ItemStack)itemList.get(5), var5 + 184 + offset, var6 + 77);
            }

            if (itemList.get(6) != null) {
                this.renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, (ItemStack)itemList.get(6), var5 + 149 + offset, var6 + 110);
            }

            if (itemList.get(6) != null) {
                this.renderItem.renderItemOverlayIntoGUI(this.fontRendererObj, this.mc.renderEngine, (ItemStack)itemList.get(6), var5 + 149 + offset, var6 + 110);
            }

            if (itemList.get(7) != null) {
                this.renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, (ItemStack)itemList.get(7), var5 + 185 + offset, var6 + 110);
            }

            if (itemList.get(7) != null) {
                this.renderItem.renderItemOverlayIntoGUI(this.fontRendererObj, this.mc.renderEngine, (ItemStack)itemList.get(7), var5 + 185 + offset, var6 + 110);
            }

            if (itemList.get(8) != null) {
                this.renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, (ItemStack)itemList.get(8), var5 + 94 + offset, var6 + 110);
            }

            if (itemList.get(8) != null) {
                this.renderItem.renderItemOverlayIntoGUI(this.fontRendererObj, this.mc.renderEngine, (ItemStack)itemList.get(8), var5 + 94 + offset, var6 + 110);
            }

            if (itemList.get(9) != null) {
                this.renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, (ItemStack)itemList.get(9), var5 + 214 + offset, var6 + 77);
            }

            if (itemList.get(9) != null) {
                this.renderItem.renderItemOverlayIntoGUI(this.fontRendererObj, this.mc.renderEngine, (ItemStack)itemList.get(9), var5 + 214 + offset, var6 + 77);
            }

            ItemStack output = ((TierRecipe)recipeList.get(page)).getOutput();
            if (output != null && side.equals("left")) {
                this.renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, output, var5 + 162, var6 + 177);
            }

            if (output != null && side.equals("right")) {
                this.renderItem.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, output, var5 + 432, var6 + 177);
            }

            String name = "";
            if (output != null && output.getItem() instanceof ItemRollingStock) {
                name = output.getDisplayName();
            }

            if (side.equals("left")) {
                this.fontRendererObj.drawString("Tier: " + tier, var5 - var9 + this.bookImageWidth - 56, var6 + 40, 0);
                this.fontRendererObj.drawString(name, var5 - var9 + this.bookImageWidth - 55, var6 + 56, 16777215);
            }

            if (side.equals("right")) {
                this.fontRendererObj.drawString(name, var5 - var9 + this.bookImageWidth + 215, var6 + 56, 16777215);
                this.fontRendererObj.drawString("Tier: " + tier, var5 - var9 + this.bookImageWidth + 338, var6 + 40, 0);
            }

            GL11.glDisable(32826);
        }
    }

    public void onGuiClosed() {
        ItemRecipeBook.page = this.currPage;
        ItemRecipeBook.recipe = this.currRecipe;
        this.itemstackBook.getTagCompound().setInteger("currPage", this.currPage);
        this.itemstackBook.getTagCompound().setInteger("currRecipe", this.currRecipe);
        super.onGuiClosed();
    }

    public boolean doesGuiPauseGame() {
        return false;
    }

    protected void keyTyped(char par1, int par2) {
        if (par2 == 1 || par2 == this.mc.gameSettings.keyBindInventory.getKeyCode()) {
            this.mc.thePlayer.closeScreen();
        }

    }

    public class StackToDraw {
        private ItemStack stack;
        private int x;
        private int y;

        public StackToDraw(ItemStack stack, int x, int y) {
            this.stack = stack;
            this.x = x;
            this.y = y;
        }

        public ItemStack getItemStack() {
            return this.stack;
        }

        public int getX() {
            return this.x;
        }

        public int getY() {
            return this.y;
        }
    }
}
