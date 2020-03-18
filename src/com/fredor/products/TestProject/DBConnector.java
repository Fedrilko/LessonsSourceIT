package com.fredor.products.TestProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

	private static final String URL = "jdbc:mysql://localhost:3306/travel_agency";
	private static final String USER = "root";
	private static final String PASSWORD = "root";
	
	private Connection connection;

	public DBConnector() {
		try {
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public Connection getConnection() {
		return connection;
	}

	
}
