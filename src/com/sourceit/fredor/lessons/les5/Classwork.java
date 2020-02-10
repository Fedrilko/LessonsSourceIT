package com.sourceit.fredor.lessons.les5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Classwork {

	public static void main(String[] args) {
		
//		String filteredStrings = filterStringsByCharacter(3, "String", "abc", "c")
//	}
//
//	private static String filterStringsByCharacter(int i, String...arr) {
//
//		return Arrays.stream(arr)
//			.filter((s) -> s.length() >3)
//			.toArrays(String::new);
//			return null;
		
//		Scanner sc = new Scanner(System.in);
//		String s = sc.nextLine();
//		System.out.println(s);
//		String s2 = sc.nextLine();
//		System.out.println(s2);
//		int a = (int a, int b) -> {return a+b};
		
		String str = "sds fgfdg asdds fgdfgfdgdf sdfdsffifoi f ff Ff";
		String[] arr =  str.split(" ");
//		Arrays.sort(arr, (str1, str2) -> str2.length() - str1.length());
//		Arrays.sort(arr, (str1, str2) -> str1.length()-str2.length());
//		System.out.println(Arrays.toString(arr));
		
		Stream stream = Arrays.stream(arr);

	}
	
}



