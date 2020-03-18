package com.fredor.products.TestProject;

import java.sql.Date;

public class Tour {

	private int id;
	private String title;
	private String description;
	private String country;
	private double price;
	private Date dateOfDepature;
	private int duration;
	
	public Tour() {
		
	}
	
	public Tour(int id, String title, String description, String country, double price, Date dateOfDepature,
			int duration) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.country = country;
		this.price = price;
		this.dateOfDepature = dateOfDepature;
		this.duration = duration;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getDateOfDepature() {
		return dateOfDepature;
	}

	public void setDateOfDepature(Date dateOfDepature) {
		this.dateOfDepature = dateOfDepature;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Tour [id=" + id + ", title=" + title + ", description=" + description + ", country=" + country
				+ ", price=" + price + ", dateOfDepature=" + dateOfDepature + ", duration=" + duration + "]";
	}


}
