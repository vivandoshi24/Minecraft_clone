package jfcraft.server;

/**
 *
 * @author vivan doshi
 */

import javaforce.voip.*;

public class VoIPCallDetails extends CallDetailsServer {
  public boolean invited, connected;
  public VoIPRTPRelay audioRelay;
  public VoIPConference.Member confmember;
}
