package com.sourceit.fredor.lessons.les5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Practice: Collections, Comparator, Comparable, Stream API, Sorting

public class Practice {

	static int i=4;

	public static void main(String[] args) {

//		List<User> users = new ArrayList<>();
//		users.add(new User("Boroda"));
//		users.add(new User("Lusha"));
//		users.add(new User("Gela"));
//		users.add(new User("Masik"));
//		users.add(new User("Fredor"));
//		Collections.sort(users);
//		System.out.println(users);
		
//		int n = 100;
//		long fibNum = fibonacciAlgorithm(n);
//		System.out.println("Fibonacci number for n=" + n +" is: " + fibNum);
		
		factorial(i);
		System.out.println(i);
	}

	public static void factorial(int num) {
		System.out.println(num);
		if(i==0) return;
		i--;
		num=num*i;
	
		factorial(num);
		
	}
	
	public static long fibonacciAlgorithm(int n) {
		List<Long> list = new ArrayList<>();
		//long fibonacciNumber = 0;
		list.add(0l);
		list.add(1l);

		if (n == 1)
			return 1;
		if (n > 1) {
			int i;
			for (i=2; i < n+1; i++) {
				list.add(list.get(i - 1) + list.get(i - 2));
//				System.out.println(list.get(i - 1) + list.get(i - 2));
			}
			return list.get(i-1);
		}
		return 0;
	}


}
