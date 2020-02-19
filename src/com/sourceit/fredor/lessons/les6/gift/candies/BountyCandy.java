package com.sourceit.fredor.lessons.les6.gift.candies;

import java.util.Date;

public class BountyCandy extends Candy {

	public static final double WEIGHT = 57;
	public static final double SUGAR_LEVEL = 0.58;
	public static final int SHELF_LIFE = 12;
	
	public BountyCandy(Date dateOfManufacturing) {
		super(WEIGHT, SUGAR_LEVEL, dateOfManufacturing, SHELF_LIFE, "Bounty", CandyTypes.CHOCOLATE, 13);

	}
}
