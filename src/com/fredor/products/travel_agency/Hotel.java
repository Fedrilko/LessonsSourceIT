package com.fredor.products.travel_agency;

public class Hotel {

	private int id;
	private String name;
	private String country;
	private int postalCode;
	private String adress;
	private String phoneNumber;
	
	public Hotel() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phone) {
		this.phoneNumber = phone;
	}

	@Override
	public String toString() {
		return "Hotel [id=" + id + ", name=" + name + ", country=" + country + ", postalCode=" + postalCode
				+ ", adress=" + adress + ", phone=" + phoneNumber + "]";
	}
	
	
	
	
}
