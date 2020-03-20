package com.fredor.products.travel_agency;

public enum Role {
	ADMIN, CONTENT_MANAGER, CUSTOMER;

	public static Role getRoleById(int roleID) {
		switch (roleID) {
		case 0:
			return Role.ADMIN;
		case 1:
			return Role.CONTENT_MANAGER;
		case 2:
			return Role.CUSTOMER;
		}
		return null;

	}
}
