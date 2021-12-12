package jfcraft.recipe;

/** Makes lever
 *
 * @author vivan doshi
 *
 * Created : Nov 6, 2020
 */

import jfcraft.item.*;
import jfcraft.data.*;

public class RecipeLever extends Recipe {
  public RecipeLever() {
    super(1,2);
  }

  public Item make(Item items[]) {
    if (items[0].id != Items.STICK) return null;
    if (items[1].id != Blocks.COBBLESTONE) return null;
    return new Item(Blocks.LEVER);
  }
}
