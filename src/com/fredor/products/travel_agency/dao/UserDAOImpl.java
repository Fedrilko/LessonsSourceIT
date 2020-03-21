package com.fredor.products.travel_agency.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.fredor.products.travel_agency.DBConnector;
import com.fredor.products.travel_agency.Role;
import com.fredor.products.travel_agency.User;
import com.fredor.products.travel_agency.dao.UserDAO;

public class UserDAOImpl implements UserDAO {

	private static final String SELECT_USER_BY_ID = "SELECT * FROM users WHERE id = ?";
	private static final String ADD_USER = 
			"INSERT INTO users (first_name, last_name, date_of_birth, email, password, role_id) " + 
	        "VALUES (?,?,?,?,?,?)";

	@Override
	public User getUserByID(int id) {

		User user = new User();
		try (Connection connection = new DBConnector().getConnection();
				PreparedStatement ps = connection.prepareStatement(SELECT_USER_BY_ID);) {

			ps.setInt(1, id);
			
			ResultSet resultSet = ps.executeQuery();

			while (resultSet.next()) {
				user.setId(resultSet.getInt("id"));
				user.setFirstName(resultSet.getString("first_name"));
				user.setLastName(resultSet.getString("last_name"));
				user.setDateOfBirth(resultSet.getDate("date_of_birth"));
				user.setEmail(resultSet.getString("email"));
				user.setPhoneNumber(resultSet.getString("phone_number"));
				user.setRole(Role.getRoleById(resultSet.getInt("role_id")));
				user.setBonusAccount(resultSet.getDouble("account"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return user;
	}

	@Override
	public void addUser(User user) {
		
		try (Connection connection = new DBConnector().getConnection();
				PreparedStatement ps = connection.prepareStatement(ADD_USER);) {

			ps.setString(1, user.getFirstName());
			ps.setString(2, user.getLastName());
			ps.setDate(3, user.getDateOfBirth());
			ps.setString(4, user.getEmail());
			ps.setString(5, user.getPassword());
			ps.setInt(6, Role.getRoleIndex(Role.ADMIN));
			ps.execute();	
				

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public User updateUser(User user) {
		return null;
	}

}