package jfcraft.packet;

/** Packet with 1 Int
 *
 * @author vivan doshi
 */

import jfcraft.client.Client;
import jfcraft.data.*;

public class PacketGenSpawnArea extends Packet {
  public int i1;

  public PacketGenSpawnArea() {}

  public PacketGenSpawnArea(byte cmd) {
    super(cmd);
  }

  public PacketGenSpawnArea(byte cmd, int i1) {
    super(cmd);
    this.i1 = i1;
  }

  //process on client side
  public void process(Client client) {
    client.spawnAreaDonePercent = i1;
  }

  @Override
  public boolean write(SerialBuffer buffer, boolean file) {
    super.write(buffer, file);
    buffer.writeInt(i1);
    return true;
  }

  @Override
  public boolean read(SerialBuffer buffer, boolean file) {
    super.read(buffer, file);
    i1 = buffer.readInt();
    return true;
  }
}