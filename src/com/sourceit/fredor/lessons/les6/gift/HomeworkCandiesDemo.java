package com.sourceit.fredor.lessons.les6.gift;

import java.util.Date;
import java.util.Scanner;

import com.sourceit.fredor.lessons.les6.gift.candies.BountyCandy;
import com.sourceit.fredor.lessons.les6.gift.candies.ChupaChupsCandy;
import com.sourceit.fredor.lessons.les6.gift.candies.ManufactDateGenerator;
import com.sourceit.fredor.lessons.les6.gift.candies.MarsCandy;
import com.sourceit.fredor.lessons.les6.gift.candies.SnickersCandy;
import com.sourceit.fredor.lessons.les6.gift.candies.TwixCandy;

public class HomeworkCandiesDemo {

	private static Gift gift = new Gift(PackagingTypes.BOX);
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		

		
		//Compose selection menu
		System.out.println("Select candies to put in the gift:\n(just input number and hit Enter)");
		System.out.println("  1. Put Snickers");
		System.out.println("  2. Put Mars");
		System.out.println("  3. Put Bounty");
		System.out.println("  4. Put Twiks");
		System.out.println("  5. Put Chupa Chups");
		System.out.println("  0. Finish packaging");

		do {
			int selectedNum;
			sc = new Scanner(System.in);

			try {
				selectedNum = sc.nextInt();
			} catch (java.util.InputMismatchException e) {
				System.out.println("Input has to be integer value! Enter a number again:");
				sc.nextLine();				
				continue;
			}

			if (selectedNum < 0 || selectedNum > 5) {
				System.out.println("Entered number is not suitable. Enter a number again:");
				continue;
			} else if (selectedNum == 0)
				break;
			else
				parseInput(selectedNum);

		} while (true);
		
		sc.close();
		System.out.println("Quantity of candies in the gift: " + gift.getQtyOfCandies());
		System.out.println("Gift price: " + gift.getPrice() + " UAH");
		System.out.println("Gift weight: " + gift.getGiftWeight() + " g");
		gift.sortCandiesByType();
		gift.printGiftContent();
		gift.findCandiesBySugarLevel(0.60, 0.99);

		
	}
	
	public static void parseInput(int value) {
		
		switch (value) {
		case 1:
			gift.addCandy(new SnickersCandy(new Date(ManufactDateGenerator.generateDate())));
			break;
		case 2:
			gift.addCandy(new MarsCandy(new Date(ManufactDateGenerator.generateDate())));
			break;
		case 3:
			gift.addCandy(new BountyCandy(new Date(ManufactDateGenerator.generateDate())));
			break;
		case 4:
			gift.addCandy(new TwixCandy(new Date(ManufactDateGenerator.generateDate())));
			break;
		case 5:
			gift.addCandy(new ChupaChupsCandy(new Date(ManufactDateGenerator.generateDate())));
			break;
		}
		
	}
	

}

