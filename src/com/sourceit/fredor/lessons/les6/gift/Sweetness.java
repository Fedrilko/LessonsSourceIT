package com.sourceit.fredor.lessons.les6.gift;

import java.util.Date;

public abstract class Sweetness {

	private double weight;
	private double sugarLevel;
	private Date dateOfManufacturing;
	private int shelfLife;
	private String name;
	private double price;

	public Sweetness(double weight, double sugarLevel, Date dateOfManufacturing, int shelfLife, String name, double price) {
		this.weight = weight;
		this.sugarLevel = sugarLevel;
		this.dateOfManufacturing = dateOfManufacturing;
		this.shelfLife = shelfLife;
		this.name = name;
		this.price = price;
	}

	public boolean isExpired() {
		if (new Date().getTime() > (dateOfManufacturing.getTime() + shelfLife))
			return true;
		return false;
	}

	public double getWeight() {
		return weight;
	}

	public double getSugarLevel() {
		return sugarLevel;
	}

	public Date getDateOfManufacturing() {
		return dateOfManufacturing;
	}

	public int getShelfLife() {
		return shelfLife;
	}

	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}

}
