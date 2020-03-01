package com.sourceit.fredor.lessons.les9collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CollectionsSpeedTest {

	public static void main(String[] args) {
		
		List<String> al = new ArrayList<>();	
		List<String> ll = new LinkedList<>();	
		fillList(al, 1000000);
		fillList(ll, 1000000);
	
		
		System.out.println("Timings format: [begin, middle, end]");
		System.out.println("Array list:");
		printStatistic(al);
		
		System.out.println("Linked list:");
		printStatistic(ll);
		
	}
	
	public static List<String> fillList(List<String> list, int size) {
		
		for (int i = 0; i < size; i++) {
			list.add(new String("Object"));
		}
		return list;
	}
	
	public static long[] getAdditionTimings(List<String> list, int qty) {	
		return new long[] {add(list, 0, qty), add(list, list.size()/2, qty), add(list, list.size(), qty)};
	}
	
	public static long add(List<String> list, int index, int qty) {
		long milliSec = System.currentTimeMillis();
		for (int i = 0; i < qty; i++) {
			list.add(index, "Hello");
		}		
		long delta = System.currentTimeMillis() - milliSec;
		return delta;
	}
	
	public static long[] getRemovalTimings(List<String> list, int qty) {	
			return new long[] {remove(list, 0, qty), remove(list, list.size()/2, qty), remove(list, list.size()-1, qty)};
	}
	
	public static long remove(List<String> list, int index, int qty) {
		
		long milliSec = System.currentTimeMillis();
		for (int i = 0; i < qty; i++) {
			list.remove(index);
		}
		long delta = System.currentTimeMillis() - milliSec;
		return delta;
	}

	public static void printStatistic(List<String> list) {
		System.out.println("Addition timings for 100 elements: " + Arrays.toString(getAdditionTimings(list, 100)));
		System.out.println("Addition timings for 10000 elements: " + Arrays.toString(getAdditionTimings(list, 10000)));
		System.out.println("Addition timings for 1000000 elements: " + Arrays.toString(getAdditionTimings(list, 1000000)));
		System.out.println("Removal timings for 100 elements: " + Arrays.toString(getRemovalTimings(list, 100)));
		System.out.println("Removal timings for 10000 elements: " + Arrays.toString(getRemovalTimings(list, 10000)));
		System.out.println("Removal timings for 1000000 elements: " + Arrays.toString(getRemovalTimings(list, 1000000)));
	}
}
