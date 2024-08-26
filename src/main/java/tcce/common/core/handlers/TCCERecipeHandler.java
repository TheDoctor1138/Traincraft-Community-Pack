//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package tcce.common.core.handlers;


import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import tcce.common.library.TCCEItemIDs;
import tcce.common.recipes.AssemblyTableRecipes;
import train.common.inventory.TrainCraftingManager;
import train.common.recipes.RecipesArmorDyes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TCCERecipeHandler  {
    public TCCERecipeHandler() {
    }

    private static ArrayList<ItemStack> multiNameOreDict(String... names) {
        ArrayList<ItemStack> entries = new ArrayList();
        String[] var2 = names;
        int var3 = names.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            String name = var2[var4];
            entries.addAll(OreDictionary.getOres(name));
        }

        return entries;
    }

    public static void initBlockRecipes() {
        ArrayList<ItemStack> iron = OreDictionary.getOres("ingotIron");
        TrainCraftingManager.instance.getRecipeList().add(new RecipesArmorDyes());
        Iterator var1 = iron.iterator();

        ItemStack ironingot;
        while(var1.hasNext()) {
            ironingot = (ItemStack)var1.next();
//        }

            while(var1.hasNext()) {
                ironingot = (ItemStack)var1.next();
            }
        }



        var1 = iron.iterator();

        while(var1.hasNext()) {
            ironingot = (ItemStack)var1.next();
            //GameRegistry.addRecipe(new ItemStack(BlockIDs.lantern.block, 4), new Object[]{"III", "PTP", "III", 'I', ironingot, 'P', Blocks.glass_pane, 'T', Blocks.torch});
        }

        var1 = iron.iterator();

        while(var1.hasNext()) {
            ironingot = (ItemStack)var1.next();
        }

        GameRegistry.addRecipe(new ItemStack(TCCEItemIDs.recipeBook.item, 1),  "TTT", "TBT", "TTT", Character.valueOf('T'), Blocks.rail, Character.valueOf('B'), Items.book );
    }

    public static void initItemRecipes() {
        ArrayList<ItemStack> steel = OreDictionary.getOres("ingotSteel");
        ArrayList<ItemStack> iron = OreDictionary.getOres("ingotIron");
        ArrayList<ItemStack> planks = OreDictionary.getOres("plankWood");
        ArrayList<ItemStack> logs = OreDictionary.getOres("logWood");
        ArrayList<ItemStack> plastics = multiNameOreDict("itemPlastic", "dustPlastic");
        ArrayList<ItemStack> copper = OreDictionary.getOres("ingotCopper");
        ArrayList<ItemStack> dustCoal = OreDictionary.getOres("dustCoal");
        List<ItemStack> coal = new ArrayList();
        coal.add(new ItemStack(Items.coal));
        coal.addAll(OreDictionary.getOres("coal"));
        ArrayList<ItemStack> redstone = OreDictionary.getOres("dustRedstone");
        ArrayList<ItemStack> waterbucket = AssemblyTableRecipes.waterContainers();
        Iterator var10 = planks.iterator();

        ItemStack plankItem;
        Iterator var12;
        ItemStack steelItem;
        while(var10.hasNext()) {
            plankItem = (ItemStack)var10.next();
            var12 = iron.iterator();


        }

       var10 = iron.iterator();

        while(var10.hasNext()) {
            plankItem = (ItemStack)var10.next();
        }
        var10 = iron.iterator();

        while(var10.hasNext()) {
            plankItem = (ItemStack)var10.next();
        }

        TrainCraftingManager.instance.addRecipe(new ItemStack(TCCEItemIDs.recipeBook.item, 1),  "TTT", "TBT", "TTT", Character.valueOf('T'), Blocks.rail, Character.valueOf('B'), Items.book );


    }

    public static void initSmeltingRecipes() {
    }

    public static void addDictRecipe(ItemStack stack, Object... obj) {
        ShapedOreRecipe recipe = new ShapedOreRecipe(stack, obj);
        GameRegistry.addRecipe(recipe);
    }
}
