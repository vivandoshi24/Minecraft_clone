package jfcraft.recipe;

/** Makes crafting table from 4 planks.
 *
 * @author vivan doshi
 *
 * Created : Nov 6, 2020
 */

import jfcraft.item.*;
import jfcraft.data.*;

public class RecipeBrickBlock extends Recipe {
  public RecipeBrickBlock() {
    super(2,2);
  }

  public Item make(Item items[]) {
    for(int a=0;a<4;a++) {
      if (items[a].id != Items.BRICK_ITEM) return null;
    }
    return new Item(Blocks.BRICK);
  }
}
