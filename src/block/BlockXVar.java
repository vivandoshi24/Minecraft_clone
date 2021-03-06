package jfcraft.block;

/** Block with X pattern (flowers, etc.)
 *
 * @author vivan doshi
 *
 * Created : Nov 25, 2020
 */

import jfcraft.data.*;
import jfcraft.opengl.*;

public class BlockXVar extends BlockX {
  public BlockXVar(String id, String names[], String images[]) {
    super(id, names, images);
    isOpaque = false;
    isAlpha = false;
    isVar = true;
    isComplex = true;
    isSolid = false;
    resetBoxes(Type.BOTH);
  }
}
