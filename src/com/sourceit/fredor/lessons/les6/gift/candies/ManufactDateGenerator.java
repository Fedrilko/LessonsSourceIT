package com.sourceit.fredor.lessons.les6.gift.candies;

import java.util.Date;
import java.util.Random;

public class ManufactDateGenerator {

	public static final int secondsInYear = 31536000;

		public static long generateDate() {
		Random random = new Random();
		Date curDate = new Date();
		
		return (curDate.getTime() - (long)(secondsInYear*1000) + (long)random.nextInt(secondsInYear));
	}

}
