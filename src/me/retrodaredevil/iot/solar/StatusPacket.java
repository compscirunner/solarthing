package me.retrodaredevil.iot.solar;

import me.retrodaredevil.iot.packets.Packet;

public interface StatusPacket extends Packet {
	/**
	 * Should be serialized as "packetType"
	 * @return The packet type
	 */
	PacketType getPacketType();

	/**
	 * Should be serialized as "address"
	 * @return [1..10] The address of the port that the device that sent this packet is plugged in to
	 */
	int getAddress();
}