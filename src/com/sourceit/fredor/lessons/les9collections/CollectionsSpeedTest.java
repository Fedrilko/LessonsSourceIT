package com.sourceit.fredor.lessons.les9collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CollectionsSpeedTest {

	public static void main(String[] args) {
		
		List<String> alHundred = new ArrayList<>();	
		List<String> alTenThousands = new ArrayList<>();	
		List<String> alMillion = new ArrayList<>();	
		
		List<String> llHundred = new LinkedList<>();	
		List<String> llTenThousands = new LinkedList<>();	
		List<String> llMillion = new LinkedList<>();
		
		fillList(alHundred, 100);
		fillList(alTenThousands, 10000);
		fillList(alMillion, 1000000);
		
		fillList(llHundred, 100);
		fillList(llTenThousands, 10000);
		fillList(llMillion, 1000000);
		
		System.out.println("Timings format: [begin, middle, end]");
		System.out.println("Array lists:");
		printStatistic(alHundred);
		printStatistic(alTenThousands);
		printStatistic(alMillion);
		
		System.out.println("Linked lists:");
		printStatistic(llHundred);
		printStatistic(llTenThousands);
		printStatistic(llMillion);
		
//		System.out.println(System.currentTimeMillis());
//		alMillion.add(500000,"Hello");
//		System.out.println(System.currentTimeMillis());
	}
	
	public static List<String> fillList(List<String> list, int size) {
		
		for (int i = 0; i < size; i++) {
			list.add(new String("Object"));
		}
		return list;
	}
	
	public static long[] getAdditionTimings(List<String> list) {	
		return new long[] {add(list, 0), add(list, list.size()/2), add(list, list.size())};
	}
	
	public static long add(List<String> list, int index) {
		long milliSec = System.currentTimeMillis();
		list.add(index, "Hello");
		long delta = System.currentTimeMillis() - milliSec;
		return delta;
	}
	
	public static long[] getRemovalTimings(List<String> list) {	
		return new long[] {remove(list, 0), remove(list, list.size()/2), remove(list, list.size()-1)};
	}
	
	public static long remove(List<String> list, int index) {
		long milliSec = System.currentTimeMillis();
		list.remove(index);
		long delta = System.currentTimeMillis() - milliSec;
		return delta;
	}

	public static void printStatistic(List<String> list) {
		System.out.println("Addition timings for " + list.size() + " elements list: " + Arrays.toString(getAdditionTimings(list)));
		System.out.println("Removal timings for " + (list.size() - 3) + " list: " + Arrays.toString(getRemovalTimings(list)));
	}
}
