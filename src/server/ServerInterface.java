package jfcraft.server;

/**
 *
 * @author vivan doshi
 */

public interface ServerInterface {
  public void clientAdded(String name);
  public void clientDropped(String name);
  public void log(String msg);
  public void ready();
}
