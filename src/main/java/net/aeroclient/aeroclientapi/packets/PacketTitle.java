package net.aeroclient.aeroclientapi.packets;

import net.aeroclient.aeroclientapi.enums.TitleType;
import net.aeroclient.aeroclientapi.utils.ClientPacket;


import net.aeroclient.aeroclientapi.enums.TitleType;
import net.aeroclient.aeroclientapi.utils.ClientPacket;
import java.beans.ConstructorProperties;

public class PacketTitle extends ClientPacket {
  private TitleType type;

  private String message;

  private float scale;

  private long displayTimeMs;

  private long fadeInTimeMs;

  private long fadeOutTimeMs;


  @ConstructorProperties({"type", "message", "scale", "displayTimeMs", "fadeInTimeMs", "fadeOutTimeMs"})
  public PacketTitle(TitleType type, String message, float scale, long displayTimeMs, long fadeInTimeMs, long fadeOutTimeMs) {
    this.type = type;
    this.message = message;
    this.scale = scale;
    this.displayTimeMs = displayTimeMs;
    this.fadeInTimeMs = fadeInTimeMs;
    this.fadeOutTimeMs = fadeOutTimeMs;
  }


  @Override
  public void getData() {
    int id = getClient().getChannel().equals("AC-Client") ? 12 : 14;
    this.wrapper.writeVarInt(id);
    this.wrapper.writeString(this.type.getType());
    this.wrapper.writeString(this.message);
    this.wrapper.buf().writeFloat(this.scale);
    this.wrapper.buf().writeLong(this.displayTimeMs);
    this.wrapper.buf().writeLong(this.fadeInTimeMs);
    this.wrapper.buf().writeLong(this.fadeOutTimeMs);
  }
}
