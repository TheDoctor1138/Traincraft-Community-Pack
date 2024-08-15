//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package tcce.client.core.handlers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import net.minecraft.item.Item;
import train.common.core.interfaces.ITCRecipe;
import train.common.core.managers.TierRecipe;
import train.common.recipes.ShapedTrainRecipes;
import train.common.recipes.ShapelessTrainRecipe;

public class RecipeBookHandler {
    public static String[] vanillaWorkTableRecipes = new String[21];

    public RecipeBookHandler() {
    }

    public static List<ITCRecipe> workbenchListCleaner(List recipeList) {
        Set<String> outputs = new HashSet();
        ArrayList<ITCRecipe> cleaned = new ArrayList();
        Iterator var3 = recipeList.iterator();

        while(true) {
            Object r;
            do {
                if (!var3.hasNext()) {
                    return cleaned;
                }

                r = var3.next();
            } while(!(r instanceof ShapedTrainRecipes) && !(r instanceof ShapelessTrainRecipe));

            ITCRecipe recipe = (ITCRecipe)r;
            String output = Item.itemRegistry.getNameForObject(recipe.getRecipeOutput().getItem());
            if (!outputs.contains(output)) {
                if (!output.contains("tc:")) {
                    cleaned.add(recipe);
                    outputs.add(output);
                }
            }
        }
    }

    public static List<TierRecipe> assemblyListCleaner(List recipeList) {
        Set<String> outputs = new HashSet();
        ArrayList<TierRecipe> cleanedList = new ArrayList();
        Iterator var3 = recipeList.iterator();

        while(var3.hasNext()) {
            Object r = var3.next();
            if (r instanceof TierRecipe) {
                TierRecipe recipe = (TierRecipe)r;
                String output = Item.itemRegistry.getNameForObject(recipe.getOutput().getItem());
                if (!outputs.contains(output)) {
                    if (!output.contains("tc:")) {
                        cleanedList.add(recipe);
                        outputs.add(output);
                    }
                }
            }
        }

        return cleanedList;
    }
}
