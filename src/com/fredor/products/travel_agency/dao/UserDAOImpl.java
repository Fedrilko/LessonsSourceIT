package com.fredor.products.travel_agency.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.fredor.products.travel_agency.DBConnector;
import com.fredor.products.travel_agency.Role;
import com.fredor.products.travel_agency.User;

public class UserDAOImpl implements UserDAO{

	private static final String SELECT_USER_BY_ID = "SELECT * FROM users WHERE id = ?";
	
	@Override
	public User getUserByID(int id) {
		
		User user = null;
		try(Connection connection = new DBConnector().getConnection();
				PreparedStatement ps = connection.prepareStatement(SELECT_USER_BY_ID);) {
			
			ps.setInt(1, id);
			
			ResultSet resultSet = ps.executeQuery(SELECT_USER_BY_ID);
			
			while(resultSet.next()) {
				user.setId(resultSet.getInt("id"));
				user.setFirstName(resultSet.getString("first_name"));
				user.setLastName(resultSet.getString("last_name"));
				user.setDateOfBirth(resultSet.getDate("date_of_birth"));
				user.setEmail(resultSet.getString("email"));
				user.setPhoneNumber(resultSet.getString("phone_number"));
				user.setRole(Role.getRoleById(resultSet.getInt("role_id")));
				
			}
			
		} catch(SQLException e) {
			
		}
		
	
		
		
		return user;
	}
		
}
