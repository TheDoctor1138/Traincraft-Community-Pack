/** *****************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 *
 * @name TrainCraft
 * @author Mrbrutal
 *****************************************************************************
 */
package tcce.common.items;

import cpw.mods.fml.common.registry.GameRegistry;
import tcce.common.TCCE;
import tcce.common.library.TCCEInfo;
import tcce.common.library.TCCEItemIDs;
import train.common.items.ItemRollingStock;

public class TCCEItems {

    public static void init() {
        loadItems();
        registerItems();
    }

    private static void loadItems() {
        for (TCCEItemIDs items : TCCEItemIDs.values()) {
            if (items.className != null) {
                if (items.className.equals("ItemRollingStock")) {
                    items.item = new ItemRollingStock(TCCEInfo.modID.toLowerCase() + ":trains/" + items.iconName, TCCE.TCCETab);
                }
            }
        }



    }

    private static void registerItems() {
        for (TCCEItemIDs itemId : TCCEItemIDs.values()) {
            if (itemId.item != null) {
                itemId.item.setUnlocalizedName(TCCEInfo.modID + ":" + itemId.name());
                GameRegistry.registerItem(itemId.item, itemId.name());
            }
        }
    }
}
