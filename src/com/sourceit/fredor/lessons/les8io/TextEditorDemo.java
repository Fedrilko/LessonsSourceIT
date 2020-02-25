package com.sourceit.fredor.lessons.les8io;


import java.io.IOException;

public class TextEditorDemo {

	public static void main(String[] args)  {

		TextEditor editor = new TextEditor();	
		System.out.println("WELCOME TO OUR BRAND NEW NOTEPAD FOR DOUCHEBAGS!\n(Type \"exit\" on the new line to finish input).");
		

		String str;
		try {
			editor.writeToFile();
			str = editor.getFileContent();
			if (!editor.getFileContent().isEmpty())
				editor.printFileStatistic(str);
			else System.out.println("File is empty.");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
			
	}

}
