package jfcraft.recipe;

/** Makes torch.
 *
 * @author vivan doshi
 *
 * Created : Nov 6, 2020
 */

import jfcraft.item.*;
import jfcraft.data.*;

public class RecipeTorch extends Recipe {
  public RecipeTorch() {
    super(1,2);
  }

  public Item make(Item items[]) {
    if (items[0].id != Items.COAL) return null;
    if (items[1].id != Items.STICK) return null;
    return new Item(Blocks.TORCH, (byte)0, (byte)4);
  }
}
