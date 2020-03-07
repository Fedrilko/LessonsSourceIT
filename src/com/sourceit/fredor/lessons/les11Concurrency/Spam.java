package com.sourceit.fredor.lessons.les11Concurrency;

import java.util.List;

public class Spam implements Runnable{
	
	private List<TimeMessagePair> list;
	
	public Spam(List<TimeMessagePair> list) {
		this.list = list;
	}

	public static void main(String[] args) throws InterruptedException {

	}

	@Override
	public void run() {
		while(true) {
		  for (int i = 0; i < list.size(); i++) {
			  System.out.println(list.get(i).getMessage());
			  try {
				Thread.sleep(list.get(i).getTime());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		  }
		}
	}
	
	
}
