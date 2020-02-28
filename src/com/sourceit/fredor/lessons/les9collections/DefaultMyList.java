package com.sourceit.fredor.lessons.les9collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DefaultMyList implements MyList {

	private Object[] array = new Object[10];
	private int size; // represents qty of objects in array

	public static void main(String[] args) {
		DefaultMyList list = new DefaultMyList();
		
		String str1 = new String("Dima");
		String str2 = new String("Anna");
		String str3 = new String("Fedor");
		
		list.add(str1);
		list.add(str2);
		list.add(str3);

		
		DefaultMyList list1 = new DefaultMyList();

//		list1.add("ds");

		list1.add(str3);		
		list1.add(str1);
		list1.add(str2);
//		list1.add("ds");

		
//		System.out.println(list.size());
//		System.out.println(list1.size());
//		
		System.out.println(list.containsAll(list1));
//		System.out.println(list1.get(0));
//		System.out.println(list1.get(1));
//		System.out.println(list1.get(2));


	}

	@Override
	public void add(Object e) {
		if (size == array.length) {
			expandArray();
		}
		array[size] = e;
		size++;
	}

	private Object[] expandArray() {
		System.out.println("Expanded");
		if (array.length + 10 < 0)
			throw new PishovDoDupyException();
		array = Arrays.copyOf(array, array.length + 10);
		return array;
	}

	@Override
	public void clear() {
		array = new Object[10];
		size = 0;
	}

	@Override
	public boolean remove(Object o) {
		return false;
	}

	@Override
	public Object[] toArray() {
		return array;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean contains(Object o) {
		for(int i = 0; i < size; i++) {
			if (array[i] == o)
				return true;
		}
		return false;
	}

	@Override
	public boolean containsAll(MyList c) {
		
		boolean flag = false;
		
		for(int i = 0; i < c.size(); i++) {
			
			if (i > 0 && flag == false)
				return false;
			for(int j = 0; j < size; j++ ) {
				if(c.get(i) == array[j]) {
					flag = true;
					continue;
				} else flag = false;
			}
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		int i = 0;

		for (Object item : array) {
			if (i == size - 1) {
				sb.append("[" + item.toString() + "]");
				break;
			}

			else
				sb.append("[" + item.toString() + "], ");
			i++;
		}
		return "{" + sb.toString() + "}";
	}
	
	@Override
	public Object get(int index) {
//		if (index >= size) return null;
		return array[index];
	}

}
