package com.sourceit.fredor.lessons.les10CollsAndConcur;

import java.util.concurrent.TimeUnit;

public class Counters implements Runnable {

	private int counter1;
	private int counter2;
	
	public static void main(String[] args) throws InterruptedException {
		
		Counters c = new Counters();
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		Thread t3 = new Thread(c);
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}
	
	public int getCounter1() {
		return counter1;
	}

	public int getCounter2() {
		return counter2;
	}	
	
	public synchronized void incrCounter1() {		
		counter1++;
	}
	
	public synchronized void incrCounter2() {
		counter2++;
	}

	@Override
	public void run() {
		System.out.println("Counters are " + ((counter1 == counter2) ? "equal." : "not equal."));
		incrCounter1();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		incrCounter2();
		
	}

}
