package jfcraft.recipe;

/** Makes button
 *
 * @author vivan doshi
 *
 * Created : Nov 6, 2020
 */

import jfcraft.item.*;
import jfcraft.data.*;

public class RecipeButton extends Recipe {
  public RecipeButton() {
    super(1,1);
  }

  public Item make(Item items[]) {
    if (items[0].id == Blocks.COBBLESTONE) return new Item(Blocks.BUTTON, (byte)1);
    if (items[0].id == Blocks.STONE) return new Item(Blocks.BUTTON, (byte)1);
    if (items[0].id == Blocks.PLANKS) return new Item(Blocks.BUTTON);
    return null;
  }
}
