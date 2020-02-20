package com.sourceit.fredor.lessons.les7io;

import java.io.File;
import java.util.Arrays;

public class FilesCounter {

	private int counter;
	private int nestingLevel;

	public int countExtensionsInDir(File dir, String extension) {
		
//	if (!dir.isDirectory() || dir == null || extension == null) return -1;
		if (dir.listFiles().length == 0) return 0;
		nestingLevel++;
		File[] files = dir.listFiles();
		Arrays.stream(files).forEach(obj -> {
			if(obj.isDirectory()) {				
				countExtensionsInDir(obj, extension);
			}
			if (obj.getName().endsWith(extension)) counter++;
			
		});
		return counter;
	}

}
