package com.sourceit.fredor.lessons.les9collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DefaultMyList implements MyList {

	private Object[] array = new Object[10];
	private int size; // represents qty of objects in array

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
		for (int i = 0; i < size; i++) {
			if (array[i] == o) {
				if (i == size - 1)
					array[i] = null;
				else
					array = squeezeArray(i);
				size--;
				return true;
			}
		}
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
		for (int i = 0; i < size; i++) {
			if (array[i] == o) {
				
				return true;
			}
				
		}
		return false;
	}

	@Override
	public boolean containsAll(MyList c) {
		int counter = 0;
		Object[] arr = c.toArray();
		for (int i = 0; i < c.size(); i++) {
			for (int j = 0; j < size; j++) {
				if (arr[i] == array[j]) {
					counter++;
				}

			}
		}
		if (counter == c.size()) return true;
		return false;
	}
	
	private Object[] squeezeArray(int index) {
		Object[] newArray = new Object[array.length];
		for (int i = 0; i < index; i++) {
			newArray[i] = array[i];
		}
		for (int i = index; i < size; i++) {
			newArray[i] = array[i + 1];
		}
		return newArray;
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

//	@Override
//	public Object get(int index) {
//		if (index >= size) return null;
//		return array[index];
//	}

}
