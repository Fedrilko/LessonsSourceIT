package com.sourceit.fredor.lessons.les3controlstatements;

import java.util.Arrays;

public class Classwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//			byte b=0;
//			while(b>=0) {
//				b++;
//				System.out.println(b);
//			}

//		int[][] matrix = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8, 9 } };
//
//		for (int i = 0; i < matrix.length; i++) {
//			for (int j = 0; j < matrix[i].length; j++) {
//				System.out.print(matrix[i][j] + " ");
//			}
//			System.out.println();
//		}

//		for (int i:arr) {
//			int b=i+;
//			if(b%2==0) {
//				
//			}
//		}
		
//		String str = "     ";
//		System.out.println("Is str empty: " + str.isEmpty() + "\nIs string blank: "+ str.isBlank());
		
//		String[] arr = {"pidr", "loh","Loh","mrazilia", "Pidr"};
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
//		Arrays.sort(arr, (str1, str2) -> str1.compareToIgnoreCase(str2));
//		System.out.println(Arrays.toString(arr));
		
		String[] arr = {"Elki","Palki","Elki","Palki","Elki","Palki"};
		String first, second;
		for (int i=0; i<arr.length-1; i++) {
			first = arr[i+1];
			second = arr[i];
			arr[i] = first;
			arr[i+1] = second;
		}
		System.out.println(Arrays.toString(arr));


		
	}

}
