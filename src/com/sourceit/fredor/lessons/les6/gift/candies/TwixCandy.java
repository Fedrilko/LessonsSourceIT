package com.sourceit.fredor.lessons.les6.gift.candies;

import java.util.Date;

public class TwixCandy extends Candy {

	public static final double WEIGHT = 55;
	public static final double SUGAR_LEVEL = 0.64;
	public static final int SHELF_LIFE = 12;

	public TwixCandy(Date dateOfManufacturing) {
		super(WEIGHT, SUGAR_LEVEL, dateOfManufacturing, SHELF_LIFE, "Twix", CandyTypes.TOFFEE, 11.50);

	}

}