package com.sourceit.fredor.lessons.les7io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DirectoryPathReader implements PathReader {


	//Method return String representation of path or null, if reading is unsuccessful
	
	@Override
	public String getPath() {

		String path = null;
		BufferedReader reader = null;

		try {
			reader = new BufferedReader(new FileReader(new File("res\\Path_to_directory.txt")));
			path = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader!=null) reader.close();				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return path;
	}
}
