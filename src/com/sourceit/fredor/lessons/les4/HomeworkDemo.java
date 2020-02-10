package com.sourceit.fredor.lessons.les4;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkDemo {
	
	static Scanner sc;
	
	public static void main(String[] args) {
		//Task 1
		sc = new Scanner(System.in);
		System.out.println("Enter heigth and width of rectange separated by space:");
		Homework.drawRect(sc.nextInt(), sc.nextInt());
		//Task 2
		Homework.getMaxValueOfArray();
		//Task3
		sc = new Scanner(System.in);
		System.out.println("Enter some text with repetitive words:");
		Homework.setArray(sc.nextLine().split(" "));
		System.out.println(Homework.findWord("lol"));
		//Task 4
		sc = new Scanner(System.in);
		System.out.println("Enter some text:");
		System.out.println(Arrays.toString(Homework.formArrOfString(sc.nextLine().split(" "))));
		
		
	}

}
