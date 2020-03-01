package com.sourceit.fredor.lessons.les9collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class DefaultMyList implements MyList {

	private Object[] array = new Object[10];
	private int size; // represents qty of objects in array

	@Override
	public void add(Object e) {
		if (size == array.length) {
			expandArray();
		}
		array[size] = e;
		size++;
	}

	private Object[] expandArray() {
		if (array.length + 10 < 0)
			throw new PishovDoDupyException();
		array = Arrays.copyOf(array, array.length + 10);
		return array;
	}

	@Override
	public void clear() {
		array = new Object[10];
		size = 0;
	}

	@Override
	public boolean remove(Object o) {
		for (int i = 0; i < size; i++) {
			if (array[i] == o) {
				if (i == size - 1)
					array[i] = null;
				else
					array = squeezeArray(i);
				size--;
				return true;
			}
		}
		return false;
	}

	@Override
	public Object[] toArray() {
		return array;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean contains(Object o) {
		for (int i = 0; i < size; i++) {
			if (array[i] == o) {
				
				return true;
			}
				
		}
		return false;
	}

	@Override
	public boolean containsAll(MyList c) {
		int counter = 0;
		Object[] arr = c.toArray();
		for (int i = 0; i < c.size(); i++) {
			for (int j = 0; j < size; j++) {
				if (arr[i] == array[j]) {
					counter++;
				}

			}
		}
		if (counter == c.size()) return true;
		return false;
	}
	
	private Object[] squeezeArray(int index) {
		Object[] newArray = new Object[array.length];
		for (int i = 0; i < index; i++) {
			newArray[i] = array[i];
		}
		for (int i = index; i < size - 1; i++) {
			newArray[i] = array[i + 1];
		}
		return newArray;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		int i = 0;

		for (Object item : array) {
			if (i == size - 1) {
				sb.append("[" + item.toString() + "]");
				break;
			}

			else
				sb.append("[" + item.toString() + "], ");
			i++;
		}
		return "{" + sb.toString() + "}";
	}
	
	@Override
	public Iterator<Object> iterator() {
		return new IteratorMyImpl();
	}
	

	
	
///////////////////////////////borrowed methods////////////////////////////////////
	
//    public Object removeForIterator(int index) {
//        Objects.checkIndex(index, size);
//        final Object[] es = array;
//
//        Object oldValue = (Object) es[index];
//        fastRemove(es, index);
//
//        return oldValue;
//    }
//    
//    private void fastRemove(Object[] es, int i) {
//        final int newSize;
//        if ((newSize = size - 1) > i)
//            System.arraycopy(es, i + 1, es, i, newSize - i);
//        es[size = newSize] = null;
//    }

//	@Override
//	public Object get(int index) {
//		if (index >= size) return null;
//		return array[index];
//	}
	
	
//	private class IteratorImpl implements Iterator<Object> {
//		
//	    int cursor;
//        int lastRet = -1; 
//       
//        public boolean hasNext() {
//            return cursor != size;
//        }
//
//        public Object next() {
//            
//            int i = cursor;
//            if (i >= size)
//                throw new NoSuchElementException();
//            Object[] elementData = DefaultMyList.this.array;
//            if (i >= elementData.length)
//                throw new ConcurrentModificationException();
//            cursor = i + 1;
//            return (Object) elementData[lastRet = i];
//        }
//
//        public void remove() {
//            if (lastRet < 0)
//                throw new IllegalStateException();
//
//            try {
//                DefaultMyList.this.removeForIterator(lastRet);
//                cursor = lastRet;
//                lastRet = -1;
//            } catch (IndexOutOfBoundsException ex) {
//                throw new ConcurrentModificationException();
//            }
//        }		
//	}
	
	private class IteratorMyImpl implements Iterator<Object>{
		
		int iteratorPosition = 0;
		boolean hasElementToRemove = false;
		
		
		@Override
		public boolean hasNext() {
			if (iteratorPosition == size) return false;			
			return true;
		}

		@Override
		public Object next() {
			if (iteratorPosition == size) {
				throw new NoSuchElementException();
			}
			hasElementToRemove = true;
			return array[iteratorPosition++];
		}
		
		public void remove() {			
			
			if (!hasElementToRemove) throw new IllegalStateException();
			array = squeezeArray(iteratorPosition - 1);
			iteratorPosition--;
			size--;
			hasElementToRemove = false;
			
		}
	}
	
//	private class ListIteratorImpls extends IteratorMyImpl implements ListIterator {
//
//	}
		
}


