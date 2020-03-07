package com.sourceit.fredor.lessons.les11Concurrency;

import java.util.Random;

public class ReaderWriterDemo {

	public static void main(String[] args) {
		
		StringBuilder buffer = new StringBuilder();
		
	}
	
}

class Writer {
	
	private Random r = new Random();
	
	public void write(StringBuilder sb) {
		sb.append("Some text: " + r.nextInt(1000) + "\n");
	}
	
}

class  Reader implements Runnable{
	
	private StringBuilder buffer;
	
	public Reader(StringBuilder buffer) {
		this.buffer = buffer;
	}

	public void readAndPrint() {
		System.out.println(buffer);
	}

	@Override
	public void run() {
		
	}
	
}