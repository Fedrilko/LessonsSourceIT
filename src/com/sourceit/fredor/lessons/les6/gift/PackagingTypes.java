package com.sourceit.fredor.lessons.les6.gift;

public enum PackagingTypes {
	BOX(12.50, 20), BAG(5.20, 5), BUCKET(70, 150);
	
	private double price;
	private double weight;


	private PackagingTypes(double price, double weight) {
		this.price = price;
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}
	
	public double getWeight() {
		return weight;
	}

	

}
