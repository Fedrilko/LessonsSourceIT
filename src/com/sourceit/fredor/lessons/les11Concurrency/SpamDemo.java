package com.sourceit.fredor.lessons.les11Concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpamDemo {

	public static void main(String[] args) {
		List<TimeMessagePair> list = new ArrayList<>();
		list.add(new TimeMessagePair(500, "AC/DC"));
		list.add(new TimeMessagePair(100, "Metallica"));
		list.add(new TimeMessagePair(600, "Slayer"));
		list.add(new TimeMessagePair(150, "Cradle of filth"));
		list.add(new TimeMessagePair(1000, "Rotting Christ"));
		list.add(new TimeMessagePair(800, "Sepultura"));
		
		Spam spam = new Spam(list);

		Thread t1 = new Thread(spam);
		t1.start();
		
		new Scanner(System.in).nextLine();				
		System.exit(1);
	}

}
