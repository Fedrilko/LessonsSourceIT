package com.fredor.products.TestProject;

import java.util.List;

public class Order {
	
	private int id;
	private User orderInitiator;
	private List<Tour> tours; 
	private double totalPrice;
	private Status orderStatus;
	
	
	public List<Tour> getTours() {
		return tours;
	}


	public double getTotalPrice() {
		return totalPrice;
	}
	
	
	
	
	
}
