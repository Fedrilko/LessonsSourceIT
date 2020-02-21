package com.sourceit.fredor.lessons.les7io;

import java.io.File;

public class FilesCounterDemo {

	public static void main(String[] args) {
		FilesCounter fc = new FilesCounter();
		int qtyOfFiles = fc.countExtensionsInDir(new File(new DirectoryPathReader().getPath()), ".java");
		
//		System.out.println(new FilesCounter().countExtensionsInDir(new File(new DirectoryPathReader().getPath()), ".txt"));
		System.out.println(qtyOfFiles);


	}

}
