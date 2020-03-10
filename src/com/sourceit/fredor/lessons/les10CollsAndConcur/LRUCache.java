package com.sourceit.fredor.lessons.les10CollsAndConcur;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LRUCache{

	private int capacity;
	private HashMap<Integer, Integer> table = new HashMap<>();
	private List<Integer> buffer = new ArrayList<>();
	
	public LRUCache(int capacity) {
//		super(capacity, 1.0f);
		this.capacity = capacity;
	}

	public static void main(String[] args) {
		
	}
	

	public int get(int key) {
		int val = getIndex(key);
		if (val == -1)
			return -1;
		else {
			buffer.add(0, val);
			buffer.remove(val + 1);
		}
		return table.get(key);
	}

	public void put(int key, int value) {
		Integer returnedValue = table.put(key, value);
		addToBuffer(key);
		
	}
	
	private void addToBuffer(int key) {
		
		buffer.add(0, key);
	}
	
	private Integer getIndex(int key) {
		for (int i = 0; i < buffer.size(); i++) {
			if (buffer.get(i).equals(key)) return i;
		}
		return -1;
	}
}
