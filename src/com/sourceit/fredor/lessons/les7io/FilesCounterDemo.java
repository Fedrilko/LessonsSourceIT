package com.sourceit.fredor.lessons.les7io;

import java.io.File;

public class FilesCounterDemo {

	public static void main(String[] args) {
		
		System.out.println(new FilesCounter().countExtensionsInDir(new File(new DirectoryPathReader().getPath()), ".txt"));
		new FilesCounter().countExtensionsInDir(new File(new DirectoryPathReader().getPath()), ".bat");

	}

}
