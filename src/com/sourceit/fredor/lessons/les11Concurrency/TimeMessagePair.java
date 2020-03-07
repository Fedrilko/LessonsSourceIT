package com.sourceit.fredor.lessons.les11Concurrency;

public class TimeMessagePair {
	

	private int time;
	private String message;
	
	public TimeMessagePair(int time, String message) {
		this.time = time;
		this.message = message;		
	}

	public int getTime() {
		return time;
	}

	public String getMessage() {
		return message;
	}

		
}
