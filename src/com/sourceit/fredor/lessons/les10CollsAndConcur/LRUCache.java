package com.sourceit.fredor.lessons.les10CollsAndConcur;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LRUCache{

	private int capacity;
	private HashMap<Integer, Integer> table = new HashMap<>();
	private List<Integer> buffer = new ArrayList<>();
	
	public LRUCache(int capacity) {
		this.capacity = capacity;
	}

	public static void main(String[] args) {
		LRUCache cache = new LRUCache(2);
		cache.put(1, 1);
		cache.put(2, 2);
		System.out.println(cache.get(1));
		cache.put(3, 3);
		System.out.println(cache.get(2));
		cache.put(4, 4);
		System.out.println(cache.get(1));
		System.out.println(cache.get(3));
		System.out.println(cache.get(4));		
	}
	

	public int get(int key) {
		int index = getIndex(key);
		if (index == -1)
			return index;
		else { //If key already presented in buffer shift element to the beginning
			buffer.add(0, index);
			buffer.remove(index + 1);
		}
		return table.get(key);
	}

	public void put(int key, int value) {
		Integer returnedValue = table.put(key, value);
		int index = getIndex(key); //Intention of declaring this variable is to check the presence of key in the buffer
		if (returnedValue == null || index == -1)
			addToBuffer(key);
		else { //In case, when such key already exists in buffer put it in the beginning
			buffer.remove(index);
			buffer.add(0, key);
		}
	}
	
	//Method adds key to buffer
	private void addToBuffer(int key) {		
		buffer.add(0, key);
		if (buffer.size() > capacity) 
			buffer.remove(capacity);
		
	}
	
	//Returns index of requested key in the buffer if it's presented there
	private Integer getIndex(int key) {
		for (int i = 0; i < buffer.size(); i++) {
			if (buffer.get(i).equals(key)) return i;
		}
		return -1;
	}
}
