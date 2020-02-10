package com.sourceit.fredor.lessons.les4;

import java.util.Arrays;
import java.util.Scanner;

public class Homework {

	static Scanner sc = new Scanner(System.in);
	// Next field is used for task 3 of this homework
	private static String[] array;

	public static void getMaxValueOfArray() {

		System.out.println("Enter integer numbers separated by space:");
		String[] inputArr = sc.nextLine().split(" ");

		System.out.println("Max value in array is: " + getMaxValOfArray(inputArr));

	}

	private static int getMaxValOfArray(String[] arr) {
		int[] parsedArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			parsedArr[i] = Integer.parseInt(arr[i]);
		}
		Arrays.parallelSort(parsedArr);
		return parsedArr[parsedArr.length - 1];
	}

	public static void drawRect(int height, int width) {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (i == 0 || i == height - 1)
					System.out.print("+");
				else {
					if (j == 0 || j == width - 1)
						System.out.print("+");
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	public static int findWord(String word) {
		int wordsCount = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(word))
				wordsCount++;

		}

		return wordsCount;
	}

	public static void setArray(String[] arr) {
		array = arr;
	}

	public static String[] formArrOfString(String[] inputArr) {
		String[] arr;
		String str = "";
		for (String val : inputArr) {
			int i = 0;
			if (val.length() > 3)
				str = str + val + " ";
			i++;
		}
		arr = str.split(" ");
		return arr;
	}

}