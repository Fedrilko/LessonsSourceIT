package com.sourceit.fredor.lessons.les5.car;

public class CarDemo {

	public static void main(String[] args) {
		
		Wheel[] wheels = new Wheel[4];
		for (Wheel wheel : wheels) {
			wheel =  new Wheel(16, "Toyo");
		}
		
		Car car = new Car(new Engine(3.0,EngineType.GASOLINE), wheels, "DeLorean DMC-12", 50, 10);
		
		car.printMark();
		car.ride(390);
		car.ride(100);
		car.refill();
		car.ride(175);
		car.refill();
		car.replaceWheel();

	}

}
