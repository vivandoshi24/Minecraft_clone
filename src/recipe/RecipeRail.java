package jfcraft.recipe;

/** Makes rail
 *
 * @author vivan doshi
 *
 * Created : Nov 6, 2020
 */

import jfcraft.item.*;
import jfcraft.data.*;

public class RecipeRail extends Recipe {
  public RecipeRail() {
    super(3,3);
  }

  public Item make(Item items[]) {
    if (items[0].id != Items.IRON_INGOT) return null;
    if (items[1].id != Blocks.AIR) return null;
    if (items[2].id != Items.IRON_INGOT) return null;

    if (items[3].id != Items.IRON_INGOT) return null;
    if (items[4].id != Items.STICK) return null;
    if (items[5].id != Items.IRON_INGOT) return null;

    if (items[6].id != Items.IRON_INGOT) return null;
    if (items[7].id != Blocks.AIR) return null;
    if (items[8].id != Items.IRON_INGOT) return null;

    return new Item(Blocks.RAIL, (byte)0, (byte)16);
  }
}
