package com.fredor.products.travel_agency;

import java.sql.Date;
import java.util.List;

public class User {

	private int id;

	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private String phoneNumber;
	private String email;
	private String password;
	private List<Order> orders;
	private Role role;


	private String referer;
	private double bonusAccount;

	public User() {

	}

	public User(int id, String firstName, String lastName, Date dateOfBirth, String phoneNumber, String email,
			String password) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getBonusAccount() {
		return bonusAccount;
	}

	public void setBonusAccount(double bonusAccount) {
		this.bonusAccount = bonusAccount;
	}
	
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public int getToursQty() {
		int toursQty = 0;
		for (Order order : orders) {
			toursQty += toursQty + order.getTours().size();
		}
		return toursQty;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth
				+ ", phoneNumber=" + phoneNumber + ", email=" + email + ", password=" + password + "]";
	}

}
