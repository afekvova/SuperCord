package ru.leymooo.ycore;

import java.util.Random;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import net.md_5.bungee.protocol.DefinedPacket;
import net.md_5.bungee.protocol.ProtocolConstants;
import net.md_5.bungee.protocol.packet.Login;
import net.md_5.bungee.protocol.packet.extra.ChunkPacket;
import net.md_5.bungee.protocol.packet.extra.PlayerAbilities;
import net.md_5.bungee.protocol.packet.extra.PlayerPositionRotation;
import net.md_5.bungee.protocol.packet.extra.SetSlot;
import net.md_5.bungee.protocol.packet.extra.SpawnPosition;

public class Connection {

    public static ByteBuf[] maps1_8;
    public static ByteBuf[] maps1_9;
    public static final Login login = new Login(-1, (short) 0, 0, (short) 0, (short) 100, "flat", false);
    public static final SpawnPosition spawnPosition = new SpawnPosition(5, 60, 5);
    public static final PlayerPositionRotation playerPosition = new PlayerPositionRotation(5.0D, 500.0D, 5.0D, 90.0F, 90.0F, new Random().nextInt(125));
    public static final SetSlot setSlot = new SetSlot(0, 36, 358, 0);
    public static final ChunkPacket chunk1_9 = new ChunkPacket(0, 0);
    public static final PlayerAbilities abilities1_9 = new PlayerAbilities((byte) 6, 0.0F, 0.0F);

    public static ByteBuf getCaptcha(int captcha, int protocol) {
        return protocol > 47 ? Connection.maps1_9[captcha] : Connection.maps1_8[captcha];
    }
    public static int getTeleportId() {
        return playerPosition.getTeleportId();
    }
    public static ByteBuf getBytes(DefinedPacket packet, int id, int protocol) throws Exception {
        ByteBuf buffer = ByteBufAllocator.DEFAULT.buffer();
        DefinedPacket.writeVarInt(id, buffer);
        packet.write(buffer, ProtocolConstants.Direction.TO_CLIENT, protocol);
        return buffer;
    }
}