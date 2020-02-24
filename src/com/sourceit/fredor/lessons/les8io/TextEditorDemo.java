package com.sourceit.fredor.lessons.les8io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TextEditorDemo {

	public static void main(String[] args) throws IOException {

		TextEditor editor = new TextEditor();		
		editor.writeToFile();
//		String str;
//		try {
//			str = editor.getFileContent();
//			editor.printFileStatistic(str);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
//		String s = editor.getFileContent();		
//		System.out.println(editor.getQtyOfWords(s));
		
	}

}
