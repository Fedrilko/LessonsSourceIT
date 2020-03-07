package com.sourceit.fredor.lessons.les11Concurrency;

public class Buffer {
	
	private StringBuilder buffer = new StringBuilder();
	
		
	public void write(String text) {
		buffer.append(text + "\n");
	}
	
	
	public String read() {
		return buffer.toString();
	}
	
}
