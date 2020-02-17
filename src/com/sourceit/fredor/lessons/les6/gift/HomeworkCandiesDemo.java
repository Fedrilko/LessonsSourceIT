package com.sourceit.fredor.lessons.les6.gift;

import java.util.Date;

import com.sourceit.fredor.lessons.les6.gift.candies.ManufactDateGenerator;
import com.sourceit.fredor.lessons.les6.gift.candies.MarsCandy;

public class HomeworkCandiesDemo {

	public static void main(String[] args) {

		
		MarsCandy candy1 = new MarsCandy(new Date(ManufactDateGenerator.generateDate()));
		System.out.println(candy1.toString());
		System.out.println(candy1.getDateOfManufacturing());
		
//		List<Candy> listOfCandies = new ArrayList<Candy>();
//		Candy candy1 = new  MarsCandy(new Date(2019-1900, 10, 15));
//		System.out.println(candy1.toString());
//		Candy candy1 = new  Candy(80, 30, new Date(2019-1900, 10, 15), 90, "Mars", CandyTypes.CHOCOLATE);
//		Candy candy2 = new  Candy(40, 30, new Date(2019-1900, 11, 22), 90, "Blackey Dickey", CandyTypes.LOLLIPOP);
//		Candy candy3 = new  Candy(40, 30, new Date(2020-1900, 2, 21), 90, "Mars", CandyTypes.CHOCOLATE);
//		Candy candy4 = new  Candy(40, 30, new Date(2020-1900, 2, 1), 90, "Snikers", CandyTypes.CHOCOLATE);
//		listOfCandies.add(candy1);
//		listOfCandies.add(candy2);
//		listOfCandies.add(candy3);
//		listOfCandies.add(candy4);
		
//		System.out.println(listOfCandies.get(0).getType());
//		System.out.println(listOfCandies.get(1).getType());
//		System.out.println(listOfCandies.get(2).getType());
//		System.out.println(listOfCandies.get(3).getType());
//		System.out.println("After sorting");
//		
//		listOfCandies.sort((c1, c2) -> {
//			return c1.compareTo(c2);
//		});
//		
//		System.out.println(listOfCandies.get(0).getType());
//		System.out.println(listOfCandies.get(1).getType());
//		System.out.println(listOfCandies.get(2).getType());
//		System.out.println(listOfCandies.get(3).getType());

		
	}

}
