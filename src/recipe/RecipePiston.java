package jfcraft.recipe;

/** Makes piston
 *
 * @author vivan doshi
 *
 * Created : Nov 6, 2020
 */

import jfcraft.item.*;
import jfcraft.data.*;

public class RecipePiston extends Recipe {
  public RecipePiston() {
    super(3,3);
  }

  public Item make(Item items[]) {
    if (items[0].id != Blocks.PLANKS) return null;
    if (items[1].id != Blocks.PLANKS) return null;
    if (items[2].id != Blocks.PLANKS) return null;

    if (items[3].id != Blocks.COBBLESTONE) return null;
    if (items[4].id != Items.IRON_INGOT) return null;
    if (items[5].id != Blocks.COBBLESTONE) return null;

    if (items[6].id != Blocks.COBBLESTONE) return null;
    if (items[7].id != Items.RED_STONE_ITEM) return null;
    if (items[8].id != Blocks.COBBLESTONE) return null;

    return new Item(Blocks.PISTON);
  }
}
