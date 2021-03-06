package jfcraft.packet;

/** Packet with 1 Int + 1 Float
 *
 * @author vivan doshi
 */

import jfcraft.client.*;
import jfcraft.data.*;
import jfcraft.entity.*;

public class PacketAir extends Packet {
  public int i1;
  public float f1;

  public PacketAir() {}

  public PacketAir(byte cmd) {
    super(cmd);
  }

  public PacketAir(byte cmd, int i1, float f1) {
    super(cmd);
    this.i1 = i1;
    this.f1 = f1;
  }

  //process on client side
  public void process(Client client) {
    int uid = i1;
    float air = f1;
    CreatureBase e;
    if (uid == client.getUID()) {
      e = client.player;
    } else {
      e = (CreatureBase)client.world.getEntity(uid);
    }
    if (e == null) return;
    e.air = air;
  }

  @Override
  public boolean write(SerialBuffer buffer, boolean file) {
    super.write(buffer, file);
    buffer.writeInt(i1);
    buffer.writeFloat(f1);
    return true;
  }

  @Override
  public boolean read(SerialBuffer buffer, boolean file) {
    super.read(buffer, file);
    i1 = buffer.readInt();
    f1 = buffer.readFloat();
    return true;
  }
}
