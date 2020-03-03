package com.sourceit.fredor.lessons.les10CollsAndConcur;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import com.sourceit.fredor.lessons.les9collections.DefaultMyList;
import com.sourceit.fredor.lessons.les9collections.MyList;

public class Test {

	public static void main(String[] args) {
//		MyList list = new DefaultMyList(); 
//		list.add("Hello");
//		list.add("World");
//		list.add("!");
//
//		
//		Iterator<Object> it = list.iterator();
//		while(it.hasNext()) {
//			it.next();
//			it.remove();
//		}
//		System.out.println(list.size());
		
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		ListIterator<Integer> it = list.listIterator();
		it.next();
		it.next();
		it.next();
		it.next();
		it.next();
		it.previous();
		it.remove();
		System.out.println(list);
//		it.remove();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		
//		while (it.hasPrevious()) {
//			System.out.println(it.previous());
//		}
	
		
	}

}
