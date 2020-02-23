package com.sourceit.fredor.lessons.les8io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TextEditorDemo {

	public static void main(String[] args) throws IOException {

		File dir = new File("D:\\Java Projects\\LessonsSourceIT");
		Path path = Paths.get(dir.getPath());
		System.out.println(path.getFileName().toString());
		
		File[] array = dir.listFiles((fileObj, fileName) -> fileName.endsWith("gitignore"));
		System.out.println(array.length);
		for (File file : array) {
			System.out.println(file.getAbsolutePath());
		}
		
		Files.walk(path, 7)
				.filter(pathObj -> pathObj.getFileName().toString().endsWith("java"))
				.forEach(pathObj -> System.out.println(pathObj.getFileName().toString()));

		Files.find(path, 3, (pathObj, fileAttribute) -> {
			
			return true;
		});
	}

}
