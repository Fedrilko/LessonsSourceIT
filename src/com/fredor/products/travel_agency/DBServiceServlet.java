package com.fredor.products.travel_agency;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fredor.products.travel_agency.dao.UserDAOImpl;


public class DBServiceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UserDAOImpl userDao = new UserDAOImpl();
		
		User user = userDao.getUserByID(Integer.valueOf(request.getParameter("id")));
		System.out.println(user);
				
	}

}
