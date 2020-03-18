package com.fredor.products.TestProject;

import java.sql.SQLException;
import java.sql.Statement;

public class MyDBDemo {

	public static void main(String[] args) {
		
		DBConnector connector = new DBConnector();
		try {
			Statement statement = connector.getConnection().createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
