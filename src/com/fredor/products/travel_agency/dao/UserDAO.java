package com.fredor.products.travel_agency.dao;

import com.fredor.products.travel_agency.User;

public interface UserDAO {

	User getUserByID(int id);
	void addUser(User user);
	User updateUser(User user);
	
}
