package com.fredor.products.travel_agency.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.fredor.products.travel_agency.DBConnector;
import com.fredor.products.travel_agency.Hotel;
import com.fredor.products.travel_agency.Role;
import com.fredor.products.travel_agency.User;

public class HotelDAOImpl implements HotelDAO{

	private static final String SELECT_HOTEL_BY_ID = "SELECT * FROM hotels WHERE id = ?";

	@Override
	public Hotel getHotelById(int id) {
		
		Hotel hotel = new Hotel();
		try (Connection connection = new DBConnector().getConnection();
				PreparedStatement ps = connection.prepareStatement(SELECT_HOTEL_BY_ID);) {

			ps.setInt(1, id);

			ResultSet resultSet = ps.executeQuery();

			while (resultSet.next()) {
				hotel.setId(resultSet.getInt("id"));
				hotel.setName(resultSet.getString("name"));
				hotel.setCountry(resultSet.getString("country"));
				hotel.setPostalCode(resultSet.getInt("postal_code"));
				hotel.setAdress(resultSet.getString("adress"));
				hotel.setPhoneNumber(resultSet.getString("phone"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return hotel;
	}
	
	
}
