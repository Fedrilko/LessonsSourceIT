package com.sourceit.fredor.lessons.les6.gift;

import java.util.ArrayList;
import java.util.List;
import com.sourceit.fredor.lessons.les6.gift.candies.Candy;


public class Gift {
	
	private PackagingTypes typeOfpackaging;
	private double weight;
	private double price;
	private List<Candy> listOfCandies = new ArrayList<Candy>();
	
	public Gift(PackagingTypes typeOfBox) {
		this.typeOfpackaging = typeOfBox;
	}
	
	
	public void addCandy(Candy candy) {
		listOfCandies.add(candy);
	}
	
	
	public double getGiftWeight() {
		listOfCandies.forEach(obj -> {
			weight=+obj.getWeight();
		});
		return weight;
	}
	


	public double getPrice() {
		listOfCandies.forEach(obj -> {
			price=+obj.getPrice();
		});
		return price + PackagingTypes.getPrice(typeOfpackaging);
	}
	
	
}
