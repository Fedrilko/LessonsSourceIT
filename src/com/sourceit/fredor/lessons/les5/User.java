package com.sourceit.fredor.lessons.les5;

public class User implements Comparable<User> {

	private String name;
	
	
	
	public User(String name) {
		this.name = name;
	}



	public String getName() {
		return name;
	}



	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}



	@Override
	public int compareTo(User obj) {

		int x = (this.name.compareTo(obj.name)>0 ? 1 : this.name.compareTo(obj.name)<0 ? -1 : 0);		
		return x;
	}
	
	
	
}
