package com.sourceit.fredor.lessons.les3controlstatements;

import java.io.Console;
import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Homework {

	static Scanner sc = new Scanner(System.in);
	static String str;

	public static void printInColumn() {
		System.out.println("Enter some string:");

		str = sc.next();
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}

	}

	public static void sortArray() {

		System.out.println("Enter seven words separated with space:");

		str = sc.nextLine();
		String[] arr = str.split(" ");
		
//		System.out.println(Arrays.toString(arr)); //debug output
		
		Arrays.sort(arr, (str1, str2) -> str1.compareToIgnoreCase(str2));
		
//		System.out.println(Arrays.toString(arr)); //debug output
		
		String first, second;
		for (int i=0; i<arr.length-1; i++) {
			if(arr[i].compareToIgnoreCase(arr[i+1])==0) {
				first = arr[i+1];
				second = arr[i];
				arr[i] = first;
				arr[i+1] = second;
			}
		
		}
		System.out.println(Arrays.toString(arr));
		
//----------------------------Below is optional realisation----------------------		
//		System.out.println("arr length: " + nonSortedArr.length);//debug output

		// next array stores length of each string in line
		
//		int[] wordsLengthArr = new int[nonSortedArr.length];
//		for (int i = 0; i < nonSortedArr.length; i++) {
//			wordsLengthArr[i] = nonSortedArr[i].length();
//		}
//		Arrays.sort(wordsLengthArr);

//		System.out.println(Arrays.toString(wordsLengthArr));//debug output

//		String[] sortedArray = new String[nonSortedArr.length];
//		int counter = 0;
//		for (int i = 0; i < nonSortedArr.length; i++) {
//			for (int j = 0; j < nonSortedArr.length; j++) {
//
//				if (wordsLengthArr[counter] == nonSortedArr[j].length()) {
//					sortedArray[counter] = nonSortedArr[j];
//					nonSortedArr[j] = "";
//					break;
//
//				}
//
//			}
//			System.out.println(sortedArray[counter]);
//			counter++;
//		}
//
//		System.out.println(Arrays.toString(sortedArray));
//------------------------------------------------------------------------------
	}

	public static void buildPyramid() {
		System.out.println("Enter height of the pyramid (value s/b integer):");
		int height = sc.nextInt();
		int qtyOfStars = 1;
		int width = (height * 2) - 1;
		System.out.println(width);
		for (int i = 0; i < width; i++) {
			// Next circle form line of stars
			for (int j = 0; j < qtyOfStars; j++) {
				System.out.print("*");
			}
			if (i < width / 2)
				qtyOfStars++;
			else
				qtyOfStars--;

			System.out.println();
		}
	}

	public static void generateRandomArray() {
		int[] randomArr = new int[10];
		Random r = new Random();
		for (int i = 0; i < randomArr.length; i++) {
			randomArr[i] = r.nextInt(40);
		}
		System.out.println(Arrays.toString(randomArr));// debug output
		int[] arr = new int[20];
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i == 10) k = 0;
			
			if (i < 10)
				arr[i] = randomArr[k];
			else
				arr[i] = randomArr[k] * 2;
			k++;

		}
		System.out.println(Arrays.toString(arr));// debug output
//		Arrays.toString(randomArr);
	}
	
	public static void createMatrix() {
		double[][] defMatrix = {{1.1,1.2,1.3,1.4,1.5},
				                {2.1,2.2,2.3,2.4,2.5},
				                {3.1,3.2,3.3,3.4,3.5},
				                {4.1,4.2,4.3,4.4,4.5},
				                {5.1,5.2,5.3,5.4,5.5},
				                };
		double[][] rotatedMatrix = new double[5][5];
		System.out.println("Hey, bitches! Here is our initial matrix:");
		printMatrix(defMatrix);
		System.out.println("\nHow much do you want to rotate matrix?\n"
				+ "- Press 1 to rotate matrix to 90 degrees\n"
				+ "- Press 2 to rotate matrix to 180 degrees\n"
				+ "- Press 3 to rotate matrix to 270 degrees\n"
				);

		int num = parseInput();

		if(num>3||num<1) {
			
			do {				
				System.out.println("User input s/b an integer value in range from 1 to 3. Enter a number again.");
				num = parseInput();
			} while(num>3||num<1);
			
		} else if (num==1) {
			int row=4, column=0;
			System.out.println("Here is your matrix rotated 90 deg:");
			for (int i = 0; i < defMatrix.length; i++) {
				for (int j = 0; j < defMatrix[i].length; j++) {
					
					rotatedMatrix[i][j]=defMatrix[row--][column];
					
				}
				column++;
				row=4;
			}
			printMatrix(rotatedMatrix);
		} else if (num==2) {
			int row=4, column=4;
			System.out.println("Here is your matrix rotated 180 deg:");
			for (int i = 0; i < defMatrix.length; i++) {
				for (int j = 0; j < defMatrix[i].length; j++) {
					rotatedMatrix[i][j]=defMatrix[row][column--];
				}
				column=4;
				row--;				
			}
			
			printMatrix(rotatedMatrix);
			
		} else if (num==3) {
			int row=0, column=4;
			System.out.println("Here is your matrix rotated 270 deg:");
			for (int i = 0; i < defMatrix.length; i++) {
				for (int j = 0; j < defMatrix[i].length; j++) {
					rotatedMatrix[i][j]=defMatrix[row++][column];
				}				
				column--;	
				row=0;
		}
			printMatrix(rotatedMatrix);
		}
		
	}
	
	private static void printMatrix(double[][] matrix) {
		for(int i=0; i<matrix.length; i++) {
			
			for(int j=0; j<matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();			
		}
	}
	
	public static int parseInput() {
		Scanner scanner = new Scanner(System.in);
		try {
			int val = scanner.nextInt();
		
			return val;

		} catch (InputMismatchException e) {
			
			return 0;
		} 

	}

}
