package net.aeroclient.aeroclientapi.packets.voice.client;

import net.aeroclient.aeroclientapi.utils.ByteBufWrapper;
import net.aeroclient.aeroclientapi.utils.ClientPacket;

public class PacketClientVoice extends ClientPacket {
  private byte[] data;
  

  public PacketClientVoice(byte[] data) {
    this.data = data;
  }
  
  public void write(ByteBufWrapper b) {
    int id = getClient().getChannel().equals("AC-Client") ? 15 : 0;
    b.writeVarInt(id);
    writeBlob(b, this.data);
  }


  @Override
  public void getData() {
    write(this.wrapper);
  }
  protected void writeBlob(ByteBufWrapper b, byte[] bytes) {
    b.buf().writeShort(bytes.length);
    b.buf().writeBytes(bytes);
  }
}
