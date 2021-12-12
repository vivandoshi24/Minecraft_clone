package jfcraft.block;

/** Thin blocks (carpet, etc.)
 *
 * @author vivan doshi
 *
 * Created : Nov 31, 2020
 */

import javaforce.gl.*;

import jfcraft.data.*;
import jfcraft.opengl.*;

public class BlockCarpet extends BlockBase {
  private static GLModel model;
  public BlockCarpet(String name, String names[], String images[]) {
    super(name, names, images);
    isOpaque = false;
    isAlpha = false;
    isComplex = true;
    isSolid = false;
    resetBoxes(Type.BOTH);
    addBox(0,0,0, 16,1,16,Type.SELECTION);
    if (model == null) {
      model = Assets.getModel("carpet").model;
    }
  }

  public void buildBuffers(RenderDest dest, RenderData data) {
    RenderBuffers buf = dest.getBuffers(buffersIdx);
    buildBuffers(model.getObject("CARPET"), buf, data, getTexture(data));
  }
}
