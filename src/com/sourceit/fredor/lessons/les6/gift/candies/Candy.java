package com.sourceit.fredor.lessons.les6.gift.candies;

import java.util.Date;

import com.sourceit.fredor.lessons.les6.gift.Sweetness;

public abstract class Candy extends Sweetness implements Comparable<Candy> {
	
	private CandyTypes type;
	
	public Candy(double weight, double sugarLevel, Date dateOfManufacturing, int shelfLife, String name, CandyTypes type, double price) {
		super(weight, sugarLevel, dateOfManufacturing, shelfLife, name, price);
		this.type = type;
	}
	
	@Override
	public int compareTo(Candy obj) {		
		
		return this.type.compareTo(obj.getType());

	}

	public CandyTypes getType() {
		return type;
	}

	
	@Override
	public String toString() {		
		return (getName() + ", weight: " + getWeight() + " g, sugar level: " + getSugarLevel()*100 + "%, price: " + getPrice() + " UAH, kind: " + type + ".");
	}
	
		
}
