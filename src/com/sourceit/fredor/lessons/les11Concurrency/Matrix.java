package com.sourceit.fredor.lessons.les11Concurrency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.sourceit.fredor.lessons.les9collections.PishovDoDupyException;

public class Matrix {

	private int[][] matrix;
	
	public int[] getRow(int rowNumber) {
		return matrix[rowNumber];
	}
	
	public int getNumberOfRows() {
		return matrix.length;
	}


	public Matrix(int row, int columns) {
		matrix = new int[row][columns];
		fillMatrix();
	}

	
	private void fillMatrix() {
		Random r = new Random();
		Arrays.stream(matrix).forEach(row -> {
			for (int i = 0; i < row.length; i++) {
				row[i] = r.nextInt(1000);
			}
		});
	}
	
	public void printMatrix() {
		for (int[] row : matrix) {
			System.out.println(Arrays.toString(row));
		}
	}
	
	public int getMaxValInRow(int row) {
		if(row < 0 || row >= matrix.length) {
			throw new PishovDoDupyException();
		}
		return Arrays.stream(matrix[row]).max().getAsInt();
	}
	
	public int getMatrixMaxVal() {
		List<Integer> values = new ArrayList<>();
		for (int i = 0; i < matrix.length; i++) {
			values.add(getMaxValInRow(i));
		}
		return Collections.max(values);
	}
		

}

class MaxValueFinder extends Thread {
	
	private int[] row;
	private int maxValue;
	
	public MaxValueFinder(int[] row) {
		this.row = row;
	}
	
	public int getMaxValue() {
		return maxValue;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		maxValue = Arrays.stream(row).max().getAsInt();	
	}
		
	
}
