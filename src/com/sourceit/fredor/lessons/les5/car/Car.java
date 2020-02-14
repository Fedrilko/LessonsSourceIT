package com.sourceit.fredor.lessons.les5.car;

public class Car {
	
	private Engine engine;
	private Wheel[] wheels;
	private String mark;
	private int tankVolume;
	private int fuelConsumption;
		
	private int totalDistanceCounter;
	public int kilometersLeft;
	private double fuelLeft;
	
	public Car(Engine engine, Wheel[] wheels, String mark, int tankVolume, int fuelConsumption) {
		fuelLeft = tankVolume;
		kilometersLeft = (tankVolume*100)/fuelConsumption;
		this.engine = engine;
		this.wheels = wheels;
		this.mark = mark;
		this.tankVolume = tankVolume;
		this.fuelConsumption = fuelConsumption;
	}
	
	
	public void ride(int distance) {
		if(kilometersLeft<distance) {
			System.out.println("You don't have enough fuel to ride this distance. You ride " + kilometersLeft + " km. Refill your tank.");
			totalDistanceCounter=+kilometersLeft;
			fuelLeft = kilometersLeft = 0;
		} else if(fuelLeft==0) {
			System.out.println("You're empty of fuel. Refill your car.");
		} else {
			System.out.println("You ride " + distance + " km.");
			kilometersLeft=-distance;
			fuelLeft=-(distance/fuelConsumption);
			totalDistanceCounter=+distance;
		}
		
	}
	


	public void refill() {
		double amountOfFuelRefilled = tankVolume - fuelLeft;
		System.out.println("Refilled " + amountOfFuelRefilled + " liters of fuel in total.");
	}
	
	public void replaceWheel() {
		
	}
	
	public void printMark() {
		System.out.println("Mark of this car is: " + mark);
	}
}

