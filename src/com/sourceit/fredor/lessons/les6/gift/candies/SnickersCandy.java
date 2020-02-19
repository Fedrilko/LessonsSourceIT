package com.sourceit.fredor.lessons.les6.gift.candies;

import java.util.Date;

public class SnickersCandy extends Candy {

	public static final double WEIGHT = 57;
	public static final double SUGAR_LEVEL = 0.55;
	public static final int SHELF_LIFE = 12;
	
	public SnickersCandy(Date dateOfManufacturing) {
		super(WEIGHT, SUGAR_LEVEL, dateOfManufacturing, SHELF_LIFE, "Snickers", CandyTypes.CHOCOLATE, 12);

	}
}
