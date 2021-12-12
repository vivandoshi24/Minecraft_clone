package jfcraft.client;

/** Loading game progress ...
 *
 * @author vivan doshi
 *
 * Created : Nov 24, 2020
 */

import javaforce.*;
import javaforce.gl.*;
import static javaforce.gl.GL.*;

import jfcraft.data.*;
import jfcraft.opengl.*;

public class Loading extends RenderScreen {
  private Texture t_back;
  private RenderBuffers o_back;

  public Loading() {
    id = Client.LOADING;
  }

  public void setup() {
    Static.log("Loading.setup()");
    new Thread() {public void run() {load();}}.start();
  }

  public void render(int width, int height) {
    glViewport(0, 0, width, height);
    glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT | GL_STENCIL_BUFFER_BIT);
    glDepthFunc(GL_ALWAYS);
    setOrtho();

    glUniformMatrix4fv(Static.uniformMatrixView, 1, GL_FALSE, identity.m);  //view matrix
    glUniformMatrix4fv(Static.uniformMatrixModel, 1, GL_FALSE, identity.m);  //model matrix

    if (t_back == null) {
      t_back = Textures.getTexture2("title.png");
    }

    if (o_back == null) {
      o_back = createMenu();
    }

    t_back.bind();
    o_back.bindBuffers();
    o_back.render();

    if (done) {
      loadGL();
      Static.video.setScreen(Static.screens.screens[Client.MAIN]);
    }
  }

  public void resize(int width, int height) {
    super.resize(width, height);
  }

  public void mousePressed(int x, int y, int button) {
  }

  public void mouseReleased(int x, int y, int button) {
  }

  public void mouseMoved(int x, int y, int button) {
  }

  public void mouseWheel(int delta) {
  }

  private boolean done = false;

  private void load() {
    Static.initClientThread("Loading", true, false);
    Static.registerAll(true);
    done = true;
  }

  private void loadGL() {
    try {
      Static.blocks.initTexture();
      Static.blocks.initBuffers();
      Static.items.initTexture();
      Static.items.initBuffers();
      Static.entities.initStatic();
      Static.entities.initStaticGL();
      RenderScreen.initStatic();
      Static.screens.init();
      Static.dims.initEnvironments();
    } catch (Exception e) {
      Static.log(e);
    }
  }
}
