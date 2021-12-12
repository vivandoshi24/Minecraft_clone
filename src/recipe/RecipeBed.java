package jfcraft.recipe;

/** Makes bed
 *
 * @author vivan doshi
 *
 * Created : Nov 6, 2020
 */

import jfcraft.item.*;
import jfcraft.data.*;

public class RecipeBed extends Recipe {
  public RecipeBed() {
    super(3,2);
  }

  public Item make(Item items[]) {
    if (items[0].id != Blocks.WOOL) return null;
    if (items[1].id != Blocks.WOOL) return null;
    if (items[2].id != Blocks.WOOL) return null;

    if (items[3].id != Blocks.PLANKS) return null;
    if (items[4].id != Blocks.PLANKS) return null;
    if (items[5].id != Blocks.PLANKS) return null;

    return new Item(Items.BED_ITEM);
  }
}
