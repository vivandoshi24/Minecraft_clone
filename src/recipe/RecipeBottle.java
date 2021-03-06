package jfcraft.recipe;

/** Makes a bottle.
 *
 * @author vivan doshi
 *
 * Created : Nov 6, 2020
 */

import jfcraft.data.*;
import jfcraft.item.*;

public class RecipeBottle extends Recipe {
  public RecipeBottle() {
    super(3,2);
  }

  public Item make(Item items[]) {
    if (items[0].id != Blocks.GLASSBLOCK) return null;
    if (items[1].id != Blocks.AIR) return null;
    if (items[2].id != Blocks.GLASSBLOCK) return null;

    if (items[3].id != Blocks.AIR) return null;
    if (items[4].id != Blocks.GLASSBLOCK) return null;
    if (items[5].id != Blocks.AIR) return null;

    return new Item(Items.BOTTLE, (byte)0, (byte)3);
  }
}
