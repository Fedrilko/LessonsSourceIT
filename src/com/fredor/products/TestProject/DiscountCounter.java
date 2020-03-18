package com.fredor.products.TestProject;

public class DiscountCounter {

	public static double calculateDiscount(User user, Order order) {
		if (order.getTours().size() > 1 && user.getToursQty() >= 10) {
			return order.getTotalPrice() * 0.12;
		} else if (order.getTours().size() > 1) {
			return order.getTotalPrice() * 0.10;
		} 		
		return 0;
	}
	
}
