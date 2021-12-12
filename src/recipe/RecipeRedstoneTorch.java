package jfcraft.recipe;

/** Makes red stone torch
 *
 * @author vivan doshi
 *
 * Created : Nov 6, 2020
 */

import jfcraft.item.*;
import jfcraft.data.*;

public class RecipeRedstoneTorch extends Recipe {
  public RecipeRedstoneTorch() {
    super(1,2);
  }

  public Item make(Item items[]) {
    if (items[0].id != Items.RED_STONE_ITEM) return null;
    if (items[1].id != Items.STICK) return null;
    return new Item(Blocks.REDSTONE_TORCH);
  }
}
