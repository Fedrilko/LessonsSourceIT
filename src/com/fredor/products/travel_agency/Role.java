package com.fredor.products.travel_agency;

public enum Role {
	ADMIN, CONTENT_MANAGER, CUSTOMER;
	
	
	public static int getRoleIndex(Role role) {
		return role.ordinal();
	}
	
	public static Role getRoleById(int roleID) {	
		
		switch (roleID) {
		case 1:
			return Role.ADMIN;
		case 2:
			return Role.CONTENT_MANAGER;
		case 3:
			return Role.CUSTOMER;
		}
		return null;

	}
}
