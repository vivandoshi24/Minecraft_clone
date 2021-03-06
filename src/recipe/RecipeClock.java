package jfcraft.recipe;

/** Makes clock
 *
 * @author vivan doshi
 *
 * Created : Nov 6, 2020
 */

import jfcraft.item.*;
import jfcraft.data.*;

public class RecipeClock extends Recipe {
  public RecipeClock() {
    super(3,3);
  }

  public Item make(Item items[]) {
    if (items[0].id != Blocks.AIR) return null;
    if (items[1].id != Items.GOLD_INGOT) return null;
    if (items[2].id != Blocks.AIR) return null;

    if (items[3].id != Items.GOLD_INGOT) return null;
    if (items[4].id != Items.RED_STONE_ITEM) return null;
    if (items[5].id != Items.GOLD_INGOT) return null;

    if (items[6].id != Blocks.AIR) return null;
    if (items[7].id != Items.GOLD_INGOT) return null;
    if (items[8].id != Blocks.AIR) return null;

    return new Item(Items.CLOCK);
  }
}
