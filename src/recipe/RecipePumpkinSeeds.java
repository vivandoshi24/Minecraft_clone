package jfcraft.recipe;

/** Makes pumpkin seeds
 *
 * @author vivan doshi
 *
 * Created : Nov 6, 2020
 */

import jfcraft.item.*;
import jfcraft.data.*;

public class RecipePumpkinSeeds extends Recipe {
  public RecipePumpkinSeeds() {
    super(1,1);
  }

  public Item make(Item items[]) {
    if (items[0].id != Blocks.PUMPKIN) return null;
    return new Item(Items.PUMPKIN_SEEDS, (byte)0, (byte)4);
  }
}
