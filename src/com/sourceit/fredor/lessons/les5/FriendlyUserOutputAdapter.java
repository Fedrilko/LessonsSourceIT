package com.sourceit.fredor.lessons.les5;

public class FriendlyUserOutputAdapter {
	
	public static void printBooksByAuthor (Book[] books) {
		System.out.println("Below is a list of books of indicated author:");
		for (Book book : books) {
			System.out.println("\""+book.getName()+"\"");
		}
	}
	
	public static void printBooksByPublisher (Book[] books) {
		System.out.println("Below is a list of books of indicated publisher:");
		for (Book book : books) {
			System.out.println("\""+book.getName()+"\"");
		}
	}
	
	public static void printBooksPublishedLater (Book[] books) {
		System.out.println("Below is a list of books published after year indicated:");
		for (Book book : books) {
			System.out.println("\""+book.getName()+"\"");
		}
	}
	
}
