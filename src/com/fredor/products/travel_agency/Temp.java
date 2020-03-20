package com.fredor.products.travel_agency;

import com.fredor.products.travel_agency.dao.UserDAOImpl;

public class Temp {

	public static void main(String[] args) {
		
		UserDAOImpl instance = new UserDAOImpl();
		System.out.println(instance.getUserByID(1).toString());
	}

}
