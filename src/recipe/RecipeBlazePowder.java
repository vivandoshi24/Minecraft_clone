package jfcraft.recipe;

/** Makes blaze powder
 *
 * @author vivan doshi
 *
 * Created : Nov 6, 2020
 */

import jfcraft.item.*;
import jfcraft.data.*;

public class RecipeBlazePowder extends Recipe {
  public RecipeBlazePowder() {
    super(1,1);
  }

  public Item make(Item items[]) {
    if (items[0].id != Items.BLAZE_ROD) return null;
    return new Item(Items.BLAZE_POWDER, (byte)0, (byte)4);
  }
}
