package com.sourceit.fredor.lessons.les6.gift.candies;

import java.util.Date;

public class ChupaChupsCandy extends Candy {
	
	public static final double WEIGHT = 6;
	public static final double SUGAR_LEVEL = 0.95;
	public static final int SHELF_LIFE = 24;

	public ChupaChupsCandy(Date dateOfManufacturing) {
		super(WEIGHT, SUGAR_LEVEL, dateOfManufacturing, SHELF_LIFE, "Chupa Chups", CandyTypes.LOLLIPOP, 4);
	}
}