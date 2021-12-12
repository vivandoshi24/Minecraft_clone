package jfcraft.recipe;

/** Makes glass pane
 *
 * @author vivan doshi
 *
 * Created : Nov 6, 2020
 */

import jfcraft.item.*;
import jfcraft.data.*;

public class RecipeGlassPane extends Recipe {
  public RecipeGlassPane() {
    super(3,2);
  }

  public Item make(Item items[]) {
    for(int a=0;a<6;a++) {
      if (items[a].id != Blocks.GLASSBLOCK) return null;
    }

    return new Item(Blocks.GLASS_PANE);
  }
}
