package com.sourceit.fredor.lessons.les10CollsAndConcur;

import java.util.HashMap;

public class LRUCache extends HashMap{

	private int capacity;
	
	public LRUCache(int capacity) {
		super(capacity, 1.0f);
		this.capacity = capacity;
	}

	public static void main(String[] args) {
		
	}
	

	public int get(int key) {
		return -1;
	}
	
	public void out(int key, int value) {
		
	}
}
