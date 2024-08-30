/** *****************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 *
 * @name TrainCraft
 * @author Mrbrutal
 *****************************************************************************
 */
package tcce.common.items;

import cpw.mods.fml.common.registry.GameRegistry;
import tcce.common.library.TCCEInfo;
import tcce.common.library.TCCEItemIDs;
import train.common.Traincraft;

public class TCCEItems {

    public static void init() {
        loadItems();
        registerItems();
    }

    private static void loadItems() {

        TCCEItemIDs.recipeBook.item = new ItemRecipeBook().setCreativeTab(Traincraft.tcCommunityTab);
    }

    private static void registerItems() {
        for (TCCEItemIDs itemId : TCCEItemIDs.values()) {
            if (itemId.item != null) {
                if (itemId.className != null) {
                    GameRegistry.registerItem(itemId.item, itemId.name());
                    itemId.item.setUnlocalizedName(TCCEInfo.modID + ":" + itemId.name());

                }



            }
        }
    }
}
