package me.retrodaredevil.iot.solar.mxfm;

import me.retrodaredevil.iot.packets.BitmaskMode;

public enum MXFMErrorMode implements BitmaskMode {
	SHORTED_BATTERY_SENSOR(32, "Shorted Battery Sensor"),
	TOO_HOT(64, "Too Hot"),
	HIGH_VOC(128, "High VOC");

	private final int value;
	private final String name;

	MXFMErrorMode(int value, String name){
		this.value = value;
		this.name = name;
	}

	@Override
	public int getMaskValue() {
        return value;
	}

	@Override
	public String getModeName() {
        return name;
	}

	@Override
	public String toString() {
		return name;
	}

}
