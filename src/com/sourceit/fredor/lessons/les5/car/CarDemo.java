package com.sourceit.fredor.lessons.les5.car;

public class CarDemo {

	public static void main(String[] args) {
		
		Car car = new Car(new Engine(), new Wheel[4], "DeLorean DMC-12", 50, 10);
		
		car.ride(15);
		car.ride(35);
	}

}
