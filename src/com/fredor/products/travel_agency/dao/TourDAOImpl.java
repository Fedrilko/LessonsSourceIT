package com.fredor.products.travel_agency.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.fredor.products.travel_agency.DBConnector;
import com.fredor.products.travel_agency.Tour;

public class TourDAOImpl implements TourDAO{

	private static final String SELECT_TOUR_BY_ID = "SELECT * FROM tours WHERE id = ?";
	
	@Override
	public Tour getTourById(int id) {
		Tour tour = new Tour();
		try (Connection connection = new DBConnector().getConnection();
				PreparedStatement ps = connection.prepareStatement(SELECT_TOUR_BY_ID);) {

			ps.setInt(1, id);

			ResultSet resultSet = ps.executeQuery();

			while (resultSet.next()) {
				tour.setId(resultSet.getInt("id"));
				tour.setTitle(resultSet.getString("title"));
				tour.setDescription(resultSet.getString("description"));
				tour.setCountry(resultSet.getString("country"));
				tour.setPrice(resultSet.getDouble("price"));
				tour.setDateOfDepature(resultSet.getDate("date_of_depature"));
				tour.setDuration(resultSet.getInt("duration"));
				
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return tour;
	}

}
