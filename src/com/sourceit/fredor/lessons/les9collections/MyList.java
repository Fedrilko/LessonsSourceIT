package com.sourceit.fredor.lessons.les9collections;

public interface MyList {

	void add(Object e);

	void clear();

	boolean remove(Object o);

	Object[] toArray();

	int size();

	boolean contains(Object o);

	boolean containsAll(MyList c);
	
//	Object get(int index);

}
