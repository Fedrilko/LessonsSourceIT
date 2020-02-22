package com.sourceit.fredor.lessons.les7io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilesCounter {

	private int counter;
	private int depth;
	private StringBuilder namesList = new StringBuilder();
	private List<String> parentFolders = new ArrayList<>();
	

	public int countExtensionsInDir(File dir, String extension) {
		
		if (!dir.isDirectory() || dir == null || extension == null) return -1;
		depth++;
		if (dir.listFiles().length == 0) return 0;
	
		Arrays.stream(dir.listFiles()).forEach(obj -> {
			if (obj.isDirectory()) {
				
				countExtensionsInDir(obj, extension);
			}
			if (obj.getName().endsWith(extension))
				counter++;

		});
		
		return counter;
	}
	
	public int countExtensionsInDir(String path, String extension, int depth) throws IOException {
		
		Path dir = Paths.get(path);
		Files.walk(dir, depth)
		     .filter(p -> Files.isDirectory(p))
		     .forEach(p -> {
		    	 File[] files = new File(p.toString()).listFiles();
		    	 for (File file : files) {
					if(file.isFile()) {
						if(file.getName().endsWith(extension)) {
							counter++;
							namesList.append(file.getName().split("\\.")[0] + "\n");
							
						}
					}
				}
		     });
		
		return counter;
	}

	
	
	//STOP! Constructions goes here.
	public int countExtensionsInDir(File dir, String extension, int depth) {
		if (!dir.isDirectory() || dir == null || extension == null) return -1;		
		if (dir.listFiles().length == 0 || depth < 1) return 0;
		this.depth++;

		File[] files = dir.listFiles();		
//		hashCodes.add(files.hashCode());
		
		Arrays.stream(files).forEach(obj -> {
			if (obj.isDirectory()) {	
				
				countExtensionsInDir(obj, extension, depth);
				
			}
			if (obj.getName().endsWith(extension)) {
//				System.out.println(obj.getName());
//				System.out.println(obj.getName().split("\\.").length);
				namesList.append(obj.getName().split("\\.")[0] + "\n");
				counter++;				

			}

		});
		
//		if (this.depth == depth) return counter;

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
