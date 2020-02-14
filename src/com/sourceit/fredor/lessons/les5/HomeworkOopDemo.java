package com.sourceit.fredor.lessons.les5;

import java.util.Arrays;

public class HomeworkOopDemo {
	
	public static void main(String[] args) {

		Book book1 = new Book("Java Complete Reference", new String[] { "Schildt" }, "McGrowHill", 1997, 1057, 35,
				BindingTypes.CASE);
		Book book2 = new Book("Java Programming Methods", new String[] { "Blinov", "Romanchik" }, "Four dicks", 2013, 897, 10.5,
				BindingTypes.SPIRAL);
		Book book3 = new Book("Introduction to Java", new String[] { "Schildt" }, "McGrowHill", 2015, 619, 12,
				BindingTypes.CASE);
		
		Book[] booksArray = {book1, book2, book3};

		FriendlyUserOutputAdapter.printBooksByAuthor(Book.getBooksByAuthor(booksArray, "Schildt"));
		FriendlyUserOutputAdapter.printBooksByAuthor(Book.getBooksByPublisher(booksArray, "Four dicks"));
		FriendlyUserOutputAdapter.printBooksPublishedLater(Book.getBooksAfterYearIndicated(booksArray, 1989));
		

//		System.out.println(Arrays.toString(Book.getBooksByPublisher(booksArray, "McGrowHill")));
//		System.out.println(Arrays.toString(Book.getBooksAfterYearIndicated(booksArray, 1994)));
//     	System.out.println(Arrays.toString(Book.getBooksByAuthor(booksArray, "Schildt")));


	}

}
