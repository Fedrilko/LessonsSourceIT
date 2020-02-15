package com.sourceit.fredor.lessons.les5.car;

import java.util.Random;

public class Car {
	
	private Engine engine;
	private Wheel[] wheels;
	private String mark;
	private int tankVolume;
	private int fuelConsumption;
		
	private int totalDistanceCounter;
	private int kilometersLeft;
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
			totalDistanceCounter+=kilometersLeft;
			fuelLeft = kilometersLeft = 0;
		} else if(fuelLeft==0) {
			System.out.println("You're empty of fuel. Refill your car.");
		} else {
			System.out.println("You ride " + distance + " km.");
			kilometersLeft-=distance;
			fuelLeft-=((double)distance/fuelConsumption);
			totalDistanceCounter+=distance;
		}
		
	}
	

	public void refill() {
		double amountOfFuelRefilled = tankVolume - fuelLeft;
		System.out.println("Refilled " + amountOfFuelRefilled + " liters of fuel in total.");
		fuelLeft = tankVolume;
		kilometersLeft = (tankVolume*100)/fuelConsumption;
	}
	
	public void replaceWheel() {
		Random random = new Random();
		int wheelIndex = random.nextInt(4);
		switch (wheelIndex) {
		case 0:
			System.out.println("Front right wheel replaced.");
			wheels[0] = new Wheel(16, "Toyo");
			break;
		case 1:
			System.out.println("Front left wheel replaced.");
			wheels[1] = new Wheel(16, "Toyo");
			break;
		case 2:
			System.out.println("Aft right wheel replaced.");
			wheels[2] = new Wheel(16, "Toyo");
			break;
		case 3:
			System.out.println("Aft left wheel replaced.");
			wheels[3] = new Wheel(16, "Toyo");
			break;

		}
	}
	
	
	public void printMark() {
		System.out.println("Mark of this car is: " + mark);
	}


	public int getTotalDistanceCounter() {
		return totalDistanceCounter;
	}


	public int getKilometersLeft() {
		return kilometersLeft;
	}


	public double getFuelLeft() {
		return fuelLeft;
	}
	
	
}

