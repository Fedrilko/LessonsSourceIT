package com.sourceit.fredor.lessons.les6.gift;

public enum PackagingTypes {
	BOX, BAG, BUCKET;

	public static double getPrice(PackagingTypes type) {
		
		switch(type) {
		case BOX: return 12.0;
		case BAG: return 5.0;
		case BUCKET: return 70;
		default: return 0;
		    
		}

	}
}
