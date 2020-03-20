package com.fredor.products.travel_agency;

//import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import com.mysql.cj.jdbc.JdbcConnection;

public class JDBCTest {

	private static final String URL = "jdbc:mysql://localhost:3306/travel_agency";
	private static final String USER = "root";
	private static final String PASSWORD = "root";
	private static final String QUERY = "INSERT INTO users (first_name, last_name, date_of_birth, email, password, phone_number, role_id) VALUES ('Ivan', 'Lykhosherst', '1952-10-07', 'ivan@global.com', '33', '911', 3);";
	private static final String QUERY_2 = "SELECT * FROM users";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		Class.forName("com.mysql.cj.jdbc.Driver");
		var connection = DriverManager.getConnection(URL, USER, PASSWORD);
		System.out.println("Connection established");
		Statement st = connection.createStatement();
//		st.executeUpdate(QUERY);
		ResultSet rs = st.executeQuery(QUERY_2);
	}
		
}
