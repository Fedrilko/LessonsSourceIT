package com.sourceit.fredor.lessons.les8io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//Class functionality: 

public class TextEditor {
	
	private Path path = Paths.get("res\\hw8\\default_file.txt");	

	public String getFileContent() throws IOException {
		List<String> content = Files.readAllLines(path);
		StringBuilder sb = new StringBuilder();
		for (String string : content) {
			sb.append(string + "\n");
		}
		return sb.toString();
	}
	
	public void writeToFile() throws IOException {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		while(true) {
			String str = sc.nextLine();
			if (str.equals("exit")) 
				break;
			if (str.equals("clear")) {
				sb = new StringBuilder("");
				break;
			}
			sb.append(str + "\n");
		}
		
		if (sb.toString().equals(""))
			Files.write(path, sb.toString().getBytes());
		else
			Files.write(path, sb.toString().getBytes(), StandardOpenOption.APPEND);
		sc.close();
		
	}
	
	public int getQtyOfSymbols(String text) {
		if (text == null)
			return -1;
		if (text.isBlank() || text.isEmpty()) 
			return 0;
		int qty = 0;
		byte[] arr = text.getBytes();
		for (byte b : arr) {
			if (b == 10 || b == 32)
				continue;
			qty++;
		}
		return qty; //excluding spaces
	}
	
	public int getMaxVowelLineNumber (String text) {
		if (text == null) 
			return -1;
		char[] vowelLetters = {'a', 'e', 'i', 'o', 'u'};
		List<String> lines = text.lines().collect(Collectors.toList());
		int qtyOfVowels = 0;
		List<Integer> qtyOfVowelsPerLine = new ArrayList<>();
		for (int i = 0; i < lines.size(); i++) {
			for (char sym : lines.get(i).toLowerCase().toCharArray()) {
				for (char vowelSym : vowelLetters) {
					if (sym == vowelSym) {
						qtyOfVowels++;
						break;
					}						
				}
			}
			qtyOfVowelsPerLine.add(qtyOfVowels);
			qtyOfVowels = 0;
		}
		
		Integer maxVal = Collections.max(qtyOfVowelsPerLine);
		if (maxVal == 0)
			return -1;
		return qtyOfVowelsPerLine.indexOf(maxVal) + 1;
		
//		text.lines().forEach(line -> {
//		int qtyOfVowels =0 ;
//		for (char sym : line.toLowerCase().toCharArray()) {
//			for (char vowelSym : vowelLetters) {
//				if(sym == vowelSym) {
//					qtyOfVowels++;
//					break;
//				}
//			}				
//		}
//		list.add(qtyOfVowels);
//	});
	}
	
	
	public int getQtyOfWords(String text) {
		if (text == null) return -1;
		if (text.isBlank() || text.isEmpty()) 
			return 0;
		int qtyOfWords = 0;
		String[] arr = text.split("\n");
		for (String string : arr) {
			for (String str : string.split(" ")) {
				if (!string.isBlank())
					qtyOfWords++;
			}
		}
		
		return qtyOfWords;
	}
		
	public void printFileStatistic(String text) throws IOException {
		System.out.println("Content of the file:");
		System.out.println(getFileContent());
		System.out.print("Quantity of symbols, exluding spaces: ");
		System.out.println(getQtyOfSymbols(getFileContent()));
		System.out.print("Number of line with the largest quantity of vowels: ");
		System.out.println(getMaxVowelLineNumber(getFileContent()));
		System.out.print("Quantiry of words: ");
		System.out.println(getQtyOfWords(getFileContent()));
		
	}
	
}
