package jfcraft.recipe;

/** Makes a bucket.
 *
 * @author vivan doshi
 *
 * Created : Nov 6, 2020
 */

import jfcraft.data.*;
import jfcraft.item.*;

public class RecipeMinecart extends Recipe {
  public RecipeMinecart() {
    super(3,2);
  }

  public Item make(Item items[]) {
    if (items[0].id != Items.IRON_INGOT) return null;
    if (items[1].id != Blocks.AIR) return null;
    if (items[2].id != Items.IRON_INGOT) return null;

    if (items[3].id != Items.IRON_INGOT) return null;
    if (items[4].id != Items.IRON_INGOT) return null;
    if (items[5].id != Items.IRON_INGOT) return null;

    return new Item(Items.MINECART);
  }
}
