package jfcraft.opengl;

/** Holds a series of faces.
 *
 * Faces should be centered around 0,0,0.
 *
 * @author vivan doshi
 */

import javaforce.*;
import javaforce.gl.*;

import static jfcraft.data.Direction.*;

public class Faces {
  public float xyz[];
  public float uv[];
//  public float uv2[];  //not needed?
  public int idx[];
  private float rotate, rotate2;

  private static GLMatrix mat = new GLMatrix();
  private static GLVector3 vec = new GLVector3();

  private void rotate(float rx, float ry, float rz) {
    mat.setIdentity();
    if (rx != 0.0f) mat.addRotate(rx, 1, 0, 0);
    if (ry != 0.0f) mat.addRotate(ry, 0, 1, 0);
    if (rz != 0.0f) mat.addRotate(rz, 0, 0, 1);
    for(int a=0;a<xyz.length;a+=3) {
      vec.set(xyz[a+0], xyz[a+1], xyz[a+2]);
      mat.mult(vec);
      xyz[a+0] = vec.v[0];
      xyz[a+1] = vec.v[1];
      xyz[a+2] = vec.v[2];
    }
  }

  private void rotateAB() {
    rotate(0, 0, rotate * 2.0f);
  }

  private void rotateAN() {
    //this requires two rotates
    rotate(rotate, 0, rotate2 * 2.0f);
  }

  private void rotateAE() {
    //this requires two rotates
    rotate(0, -rotate2, rotate);
  }

  private void rotateAS() {
    rotate(-rotate, 0, 0);
  }

  private void rotateAW() {
    //this requires two rotates
    rotate(0, rotate2, -rotate);
  }

  private void rotateNE() {
    rotate(0, rotate, 0);
  }

  private void rotateNS() {
    rotate(0, rotate * 2.0f, 0);
  }

  private void rotateNW() {
    rotate(0, -rotate, 0);
  }

  /** Rotates the faces and then translates into position. */
  public void rotate(RenderData data) {
    rotate = data.rotate;
    rotate2 = data.rotate2;
    if (data.translate_pre != null) {
      for(int a=0;a<xyz.length;) {
        xyz[a++] += data.translate_pre[0];
        xyz[a++] += data.translate_pre[1];
        xyz[a++] += data.translate_pre[2];
      }
    }
    if (data.yrotate) {
      rotate(0,data.rotate,0);
    } else if (data.isDir && !data.norotate) {
      if (!data.isDirXZ) {
        switch (data.dir[X]) {
          case A:
            //default
            break;
          case B:
            //rotate A to B
            rotateAB();
            break;
          case N:
            //rotate A to N
            rotateAN();
            break;
          case E:
            //rotate A to E
            rotateAE();
            break;
          case S:
            //rotate A to S
            rotateAS();
            break;
          case W:
            //rotate A to W
            rotateAW();
            break;
        }
      } else {
        switch (data.dir[X]) {
          case N:
            //default
            break;
          case E:
            //rotate N to E
            rotateNE();
            break;
          case S:
            //rotate N to S
            rotateNS();
            break;
          case W:
            //rotate N to W
            rotateNW();
            break;
        }
      }
    }
    if (data.translate_pst != null) {
      for(int a=0;a<xyz.length;) {
        xyz[a++] += data.translate_pst[0];
        xyz[a++] += data.translate_pst[1];
        xyz[a++] += data.translate_pst[2];
      }
    }
    float tx = data.x + 0.5f;
    float ty = data.y + 0.5f;
    float tz = data.z + 0.5f;
    for(int a=0;a<xyz.length;) {
      xyz[a++] += tx;
      xyz[a++] += ty;
      xyz[a++] += tz;
    }
  }
}
