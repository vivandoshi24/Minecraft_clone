package jfcraft.recipe;

/** Makes sticky piston
 *
 * @author vivan doshi
 *
 * Created : Nov 6, 2020
 */

import jfcraft.item.*;
import jfcraft.data.*;

public class RecipePistonSticky extends Recipe {
  public RecipePistonSticky() {
    super(1,2);
  }

  public Item make(Item items[]) {
    if (items[0].id != Items.SLIME_BALL) return null;
    if (items[1].id != Blocks.PISTON) return null;
    return new Item(Blocks.PISTON_STICKY);
  }
}
