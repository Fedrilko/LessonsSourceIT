package com.sourceit.fredor.lessons.les10CollsAndConcur;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.sourceit.fredor.lessons.les9collections.DefaultMyList;
import com.sourceit.fredor.lessons.les9collections.MyList;

public class Test {

	public static void main(String[] args) {
		MyList list = new DefaultMyList(); 
		list.add("Hello");
		list.add("World");
		list.add("!");

		
		Iterator<Object> it = list.iterator();
		while(it.hasNext()) {
			it.next();
			it.remove();
		}
		System.out.println(list.size());
//		it.next();
//		it.next();
//		it.remove();
//		for (Object object : list) {
//			System.out.println(object);
//		}
		
//		System.out.println(list.size());
		
//		List<String> list = new ArrayList<>();
//		list.add("element1");
//		list.add("element2");
//		list.add("element3");
//		
//		Iterator<String> it = list.iterator();
//		it.next();
//		it.next();
//		it.next();
//		it.remove();
//		it.remove();
		
	}

}
