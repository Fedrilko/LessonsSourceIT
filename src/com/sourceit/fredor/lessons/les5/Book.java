package com.sourceit.fredor.lessons.les5;

import java.util.Arrays;

public class Book {

	public static int idCounter = 0;

	private int id;
	private String name;
	private String[] authors;
	private String publisher;
	private int yearOfPublication;
	private int pagesQty;
	private double price;
	private BindingTypes bindingType;
	
	

	public Book(String name, String[] authors, String publisher, int yearOfPublication, int pagesQty, double price,
			BindingTypes bindingType) {
		id = ++idCounter;
		this.name = name;
		this.authors = authors;
		this.publisher = publisher;
		this.yearOfPublication = yearOfPublication;
		this.pagesQty = pagesQty;
		this.price = price;
		this.bindingType = bindingType;
	}


	public Book() {
		id = ++idCounter;
	}
	
	public static Book[] getBooksByAuthor(Book[] listOfBooks, String author) {
		
		Book[] selectedBooks = Arrays.stream(listOfBooks).
				filter(book -> {

					for (String bookAuthor : book.authors) {
						
						if(bookAuthor.equals(author)) return true;
						
					}					
	
					return false;
				})
				.toArray(Book[]::new);
		return selectedBooks;
	}
	
	
	public static Book[] getBooksByPublisher(Book[] listOfBooks, String publisher) {
		
		Book[] selectedBooks = Arrays.stream(listOfBooks)
				.filter(book -> 
				book.publisher.equals(publisher)).toArray(Book[]::new);
		return selectedBooks;
	}
	
	public static Book[] getBooksAfterYearIndicated(Book[] listOfBooks, int year) {

		Book[] selectedBooks = Arrays.stream(listOfBooks).filter(book -> book.yearOfPublication>year)
				.toArray(Book[]::new);
		return selectedBooks;
	}
	
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", authors=" + Arrays.toString(authors) + ", publisher="
				+ publisher + ", yearOfPublication=" + yearOfPublication + ", pagesQty=" + pagesQty + ", price=" + price
				+ ", bindingType=" + bindingType + "]";
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String[] getAuthors() {
		return authors;
	}


	public void setAuthors(String[] authors) {
		this.authors = authors;
	}


	public String getPublisher() {
		return publisher;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	public int getYearOfPublication() {
		return yearOfPublication;
	}


	public void setYearOfPublication(int yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}


	public int getPagesQty() {
		return pagesQty;
	}


	public void setPagesQty(int pagesQty) {
		this.pagesQty = pagesQty;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}



	public BindingTypes getBindingType() {
		return bindingType;
	}


	public void setBindingType(BindingTypes bindingType) {
		this.bindingType = bindingType;
	}






}
