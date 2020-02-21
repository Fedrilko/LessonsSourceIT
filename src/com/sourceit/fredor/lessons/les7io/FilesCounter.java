package com.sourceit.fredor.lessons.les7io;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilesCounter {

	private int counter;
	private int depth;
	private StringBuilder namesList = new StringBuilder();

	private List<Integer> hashCodes = new ArrayList<>();

	public int countExtensionsInDir(File dir, String extension) {
		
		if (!dir.isDirectory() || dir == null || extension == null) return -1;
		depth++;
		if (dir.listFiles().length == 0) return 0;
				
		File[] files = dir.listFiles();
		Arrays.stream(files).forEach(obj -> {
			if (obj.isDirectory()) {
			
				countExtensionsInDir(obj, extension);
			}
			if (obj.getName().endsWith(extension))
				counter++;

		});
		
		return counter;
	}

	public int countExtensionsInDir(File dir, String extension, int depth) {
		if (!dir.isDirectory() || dir == null || extension == null) return -1;
		depth++;
		if (dir.listFiles().length == 0 || depth < 1) return 0;
		if (this.depth == depth) return counter;
		
		File[] files = dir.listFiles();
		Arrays.stream(files).forEach(obj -> {
			if (obj.isDirectory()) {			    
				countExtensionsInDir(obj, extension);
			}
			if (obj.getName().endsWith(extension)) {
				counter++;
				System.out.println(obj.getName());
				namesList.append(obj.getName().split(".")[0] + "\n");
			}

		});
		
		if (this.depth == depth) return counter;

		return counter;

	}
	
	public StringBuilder getNamesList() {
		return namesList;
	}

	
	
//	public void inputValidation(File dir, String extension) {
//		if (!dir.isDirectory() || dir == null || extension == null) {
//			System.out.println("Input is not valid.");
//			return;
//		} 
//		
//		countExtensionsInDir(dir, extension);
//		
//	}
	
	
	
}
