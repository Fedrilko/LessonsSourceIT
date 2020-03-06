package com.sourceit.fredor.lessons.les11Concurrency;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(() ->  {
			while(true) {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		t1.start();
		Thread.sleep(5000);
		t1.stop();
		
	}

}
