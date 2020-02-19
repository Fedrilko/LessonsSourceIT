package com.sourceit.fredor.lessons.les6.gift;

import java.util.ArrayList;
import java.util.Collections;
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
			weight += obj.getWeight();
		});

		return weight + typeOfpackaging.getWeight();
	}

	public double getPrice() {
		listOfCandies.forEach(obj -> {
			price += obj.getPrice();
		});
		return price + typeOfpackaging.getPrice();
	}

	public List<Candy> findCandiesBySugarLevel (double lowerLimit, double upperLimit){
		List<Candy> list = new ArrayList<Candy>();
		listOfCandies.forEach(obj -> {
			if(obj.getSugarLevel()>=lowerLimit && obj.getSugarLevel()<=upperLimit) list.add(obj);
		});
		if(list.size()==0) System.out.println("There is no candy with indicated sugal level in this gift.");
		else {
			System.out.println("\nBelow are candies that correspond to sugar level indicated:");
			list.forEach(c -> {
				System.out.println(c.toString());
			});
		}
		return list;
	}
	
	public void sortCandiesByType() {
		listOfCandies.sort((c1, c2) -> {
			return c1.compareTo(c2);
		});
	}

	public void printGiftContent() {
		System.out.println("\nLet's see what's inside:");
		for (Candy candy : listOfCandies) {
			System.out.println(candy.toString());
		}
	}

	public int getQtyOfCandies() {
		return listOfCandies.size();
	}

	public List<Candy> getListOfCandies() {
		return listOfCandies;
	}

}
