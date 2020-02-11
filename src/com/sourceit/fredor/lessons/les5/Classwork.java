package com.sourceit.fredor.lessons.les5;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
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

//		Comparator<String> comparator = (a, b) -> a.length() - b.length();
		String str = "sds fgfdg asdds fgdfgfdgdf sdfdsffifoi f ff Ff";
		String[] arr = str.split(" ");
//		Arrays.sort(arr, comparator);
//		Arrays.sort(arr, (str1, str2) -> str2.length() - str1.length());

//		System.out.println(Arrays.toString(arr));

//		Arrays.sort(arr, (str1, str2) -> str1.length()-str2.length());
//		System.out.println(Arrays.toString(arr));
		


		
		Stream<String> stream = Arrays.stream(arr);
		List<String> list = new ArrayList<>();
		
		stream.forEach(element -> {
			if(element.length()<4) {list.add(element);
				System.out.println(element);
			};
			
		});
//		
		
//		String[] newArr = stream.filter(item -> item.length()>3).toArray(String[]::new);
//		System.out.println(Arrays.toString(newArr));
		
//		stream.forEach((element)-> {
//			if(element.length()>4) System.out.println(element);
//		});
		

		
//		MathAction c = (a, b) -> a + b;
//		int result = c.sum(5, 5);
//		System.out.println(result);
		
		
//		List<Integer> arrL = new ArrayList<>();
//		arrL.add(5);
//		arrL.add(10);
//		arrL.add(234);
//		
//		arrL.forEach(num -> {
//			num = num * 2;
//			System.out.println(num);
//		});
		

	}

}

