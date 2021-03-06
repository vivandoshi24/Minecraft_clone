package jfcraft.recipe;

/** Makes minecart w/ furnace
 *
 * @author vivan doshi
 *
 * Created : Nov 6, 2020
 */

import jfcraft.item.*;
import jfcraft.data.*;

public class RecipeMinecartFurnace extends Recipe {
  public RecipeMinecartFurnace() {
    super(1,2);
  }

  public Item make(Item items[]) {
    if (items[0].id != Items.MINECART) return null;
    if (items[1].id != Blocks.FURNACE) return null;
    return new Item(Items.MINECART_FURNACE);
  }
}
