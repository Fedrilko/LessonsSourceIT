package com.sourceit.fredor.lessons.les11Concurrency;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MatrixDemo {
	public static void main(String[] args) throws InterruptedException {
		
		Matrix matrix = new Matrix(4, 100);
//		matrix.printMatrix();
		
		List<MaxValueFinder> threads = new ArrayList<>();
		List<Integer> values = new ArrayList<>();
		for (int i = 0; i < matrix.getNumberOfRows(); i++) {
			threads.add(new MaxValueFinder(matrix.getRow(i)));	
		}
		
		long initTime1 = System.currentTimeMillis();
		for (MaxValueFinder t : threads) {
			t.start();		
		}
		Thread.sleep(1000);
		for (MaxValueFinder t : threads) {
			values.add(t.getMaxValue());		
		}
		long delta1 = System.currentTimeMillis() - initTime1 - 1000;
		
		System.out.println("Multiple threads: max value: " +  Collections.max(values) + ", calculation time: " + delta1 + "ms.");
		
	
		Thread.sleep(1000);
		long initTime2 = System.currentTimeMillis();
		int maxVal = matrix.getMatrixMaxVal();		
		long delta2 = System.currentTimeMillis() - initTime2;
		System.out.println("Single thread: max value: " +  maxVal + ", calculation time: " + delta2 + "ms.");
	}
}
