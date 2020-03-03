package com.sourceit.fredor.lessons.les10CollsAndConcur;

import java.util.Iterator;

public interface MyListIterator extends Iterator<Object> {

	boolean hasPrevious();

	Object previous();

	void set(Object e);

	void remove();
	
}