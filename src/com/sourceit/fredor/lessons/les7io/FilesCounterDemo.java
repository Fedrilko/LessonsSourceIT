package com.sourceit.fredor.lessons.les7io;

import java.io.File;
import java.io.IOException;

public class FilesCounterDemo {

	public static void main(String[] args) {
		FilesCounter fc = new FilesCounter();
		int qtyOfFiles = 0;
		try {
			qtyOfFiles = fc.countExtensionsInDir("C:\\Users\\Fredor\\Desktop\\Test", "txt", 1);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(qtyOfFiles);
		System.out.println(fc.getNamesList());
//		System.out.println(fc.getNamesList());
//		System.out.println(qtyOfFiles);


//		System.out.println(new FilesCounter().countExtensionsInDir(new File(new DirectoryPathReader().getPath()), "txt"));



	}

}
