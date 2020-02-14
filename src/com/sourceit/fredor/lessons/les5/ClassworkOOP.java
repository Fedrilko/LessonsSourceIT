package com.sourceit.fredor.lessons.les5;

public class ClassworkOOP {

	public static void main(String[] args) {
		
		Thread t = new Thread(new myThread());
		t.start();
	}

}

class myThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("lol");
	}
	

}