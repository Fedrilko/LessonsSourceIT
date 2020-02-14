package com.sourceit.fredor.lessons.les5.car;

public class Engine {
	
	private double volume;
	private EngineType engineType;
	
	public Engine(double volume, EngineType engineType) {

		this.volume = volume;
		this.engineType = engineType;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public EngineType getEngineType() {
		return engineType;
	}

	public void setEngineType(EngineType engineType) {
		this.engineType = engineType;
	}
	
}
