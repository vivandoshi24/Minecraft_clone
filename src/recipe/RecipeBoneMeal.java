package jfcraft.recipe;

/** Makes bone meal
 *
 * @author vivan doshi
 *
 * Created : Nov 6, 2020
 */

import jfcraft.item.*;
import jfcraft.data.*;
import static jfcraft.data.Types.*;

public class RecipeBoneMeal extends Recipe {
  public RecipeBoneMeal() {
    super(1,1);
  }

  public Item make(Item items[]) {
    if (items[0].id != Items.BONE) return null;
    return new Item(Items.COLOR, (byte)Items.VAR_BONEMEAL, 4);
  }
}
