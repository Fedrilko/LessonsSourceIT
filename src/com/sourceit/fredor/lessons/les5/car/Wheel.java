package com.sourceit.fredor.lessons.les5.car;

public class Wheel {
	
	private double radius;
	private String manufacturer;
	
	public Wheel(double radius, String manufacturer) {		
		this.radius = radius;
		this.manufacturer = manufacturer;
	}

	public double getRadius() {
		return radius;
	}

	public String getManufacturer() {
		return manufacturer;
	}
	
	
}
