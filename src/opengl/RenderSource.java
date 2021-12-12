package jfcraft.opengl;

/**
 *
 * @author vivan doshi
 *
 * Created : Dec 29, 2020
 */

import javaforce.gl.*;

public interface RenderSource {
  public void buildBuffers(RenderDest dest, RenderData data);
  public void bindTexture();
  public void render();
}
