package com.sourceit.fredor.lessons.les6.gift.candies;

import java.util.Date;

public class MarsCandy extends Candy{

	public static final double WEIGHT = 51;
	public static final double SUGAR_LEVEL = 0.68;
	public static final int SHELF_LIFE = 12;
	
	public MarsCandy(Date dateOfManufacturing) {
		super(WEIGHT, SUGAR_LEVEL, dateOfManufacturing, SHELF_LIFE, "Mars", CandyTypes.CHOCOLATE, 13);

	}
	

}
