/** *****************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 *
 * @name TrainCraft
 * @author Mrbrutal
 *****************************************************************************
 */
package tcce.common.items;

import tcce.common.library.TCCEInfo;
import tcce.common.library.TCCEItemIDs;
import tcce.common.library.TCCERegistry;
import train.common.Traincraft;

public class TCCEItems {

    public static void init() {
        loadItems();
        registerItems();
    }

    private static void loadItems() {

        TCCEItemIDs.recipeBook.item = new ItemRecipeBook();
    }

    private static void registerItems() {
        for (TCCEItemIDs itemId : TCCEItemIDs.values()) {
            if (itemId.item != null) {
                if (itemId.className != null) {
                    TCCERegistry.registerItem(itemId.item, TCCEInfo.modID, itemId.name(), Traincraft.tcCommunityTab);

                }



            }
        }
    }
}
