package jfcraft.recipe;

/** Makes bread from 3 wheat.
 *
 * @author vivan doshi
 *
 * Created : Nov 6, 2020
 */

import jfcraft.data.*;
import jfcraft.item.*;

public class RecipePaper extends Recipe {
  public RecipePaper() {
    super(3,1);
  }

  public Item make(Item items[]) {
    for(int a=0;a<3;a++) {
      if (items[a].id != Items.SUGAR_CANE) return null;
    }
    return new Item(Items.PAPER, (byte)0, (byte)3);
  }
}
