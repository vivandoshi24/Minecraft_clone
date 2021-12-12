package jfcraft.block;

/** Block Solid with Variations
 * ie: planks, wood, etc.
 *
 * @author vivan doshi
 *
 * Created : Nov 29, 2020
 */

public class BlockOpaqueVar extends BlockOpaque {
  public BlockOpaqueVar(String id, String names[], String images[]) {
    super(id, names, images);
    isVar = true;
  }
}
