package jfcraft.recipe;

/** Makes bow.
 *
 * @author vivan doshi
 *
 * Created : Dec 23, 2020
 */

import jfcraft.item.*;
import jfcraft.data.*;

public class RecipeBow extends Recipe {
  public RecipeBow() {
    super(3,3);
  }

  public Item make(Item items[]) {
    if (items[0].id == Blocks.AIR) {
//      if (items[0].id != Blocks.AIR) return null;
      if (items[1].id != Items.STICK) return null;
      if (items[2].id != Items.STRING) return null;

      if (items[3].id != Items.STICK) return null;
      if (items[4].id != Blocks.AIR) return null;
      if (items[5].id != Items.STRING) return null;

      if (items[6].id != Blocks.AIR) return null;
      if (items[7].id != Items.STICK) return null;
      if (items[8].id != Items.STRING) return null;
    } else {
      if (items[0].id != Items.STRING) return null;
      if (items[1].id != Items.STICK) return null;
      if (items[2].id != Blocks.AIR) return null;

      if (items[3].id != Items.STRING) return null;
      if (items[4].id != Blocks.AIR) return null;
      if (items[5].id != Items.STICK) return null;

      if (items[6].id != Items.STRING) return null;
      if (items[7].id != Items.STICK) return null;
      if (items[8].id != Blocks.AIR) return null;
    }

    return new Item(Items.BOW);
  }
}
