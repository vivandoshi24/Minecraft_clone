package jfcraft.data;

/**
 *
 * @author vivan doshi
 */

public interface SerialClass {
  public boolean write(SerialBuffer buffer, boolean file);
  public boolean read(SerialBuffer buffer, boolean file);
}
