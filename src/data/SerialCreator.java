package jfcraft.data;

/** Serialized object creator
 *
 * @author vivan doshi
 */

public interface SerialCreator {
  public SerialClass create(SerialBuffer buffer);
}
