package com.sourceit.fredor.lessons.les10CollsAndConcur;

import com.sourceit.fredor.lessons.les9collections.DefaultMyList;

public class MyCollectionDemo {

	public static void main(String[] args) {

		DefaultMyList list = new DefaultMyList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		
		MyListIterator it = list.listIterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		while(it.hasPrevious()) {
		System.out.println(it.previous());
	}
		
		System.out.println(String.format("Hello %.3f",1.5431));
		
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.previous());
//
//		System.out.println(it.previous());
//		System.out.println(it.hasPrevious());
		
//		it.remove();
//		System.out.println(it.previous());
//		System.out.println(list);
	}

}
