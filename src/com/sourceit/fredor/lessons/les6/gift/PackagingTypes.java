package com.sourceit.fredor.lessons.les6.gift;

public enum PackagingTypes {
	BOX(12.50), BAG(5.20), BUCKET(70);
	
	private double price;
	
	private PackagingTypes(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}
	

}
