package com.sourceit.fredor.lessons.les9collections;

import java.util.Arrays;
import java.util.Iterator;

public class MyCollectionDemo {
	public static void main(String[] args) {
		
		DefaultMyList list1 = new DefaultMyList();
		DefaultMyList list2 = new DefaultMyList();

		String str1 = new String("Dima");
		String str2 = new String("Anna");
		String str3 = new String("Fedor");
		
		list1.add(str1);
		list1.add(str2);
		list1.add(str3);
		
		list2.add(str3);
		list2.add(str1);
		list2.add(1);
		
		System.out.println("Size of list1: " + list1.size());
		System.out.println("Size of list2: " + list2.size());
		
		System.out.println("List1 contains: " + list1);
		System.out.println("List2 contains: " + list2);
		
		System.out.println(list1.contains(str2));
		System.out.println(list1.containsAll(list2));
		
		list2.remove(1);
		System.out.println(Arrays.toString(list2.toArray()));
//		list2.clear();
		
		Iterator<Object> it1 = list1.iterator();
		it1.next();
		it1.remove();
		System.out.println(list1.toString());
		
		Iterator<Object> it2 = list2.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		for (Object object : list2) {
			System.out.println(it2.next());
		}
		
	}

}
