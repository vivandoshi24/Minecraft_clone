package jfcraft.recipe;

/** Makes bread from 3 wheat.
 *
 * @author vivan doshi
 *
 * Created : Nov 6, 2020
 */

import jfcraft.data.*;
import jfcraft.item.*;

public class RecipeBread extends Recipe {
  public RecipeBread() {
    super(3,1);
  }

  public Item make(Item items[]) {
    for(int a=0;a<3;a++) {
      if (items[a].id != Items.WHEAT_ITEM) return null;
    }
    return new Item(Items.BREAD);
  }
}
