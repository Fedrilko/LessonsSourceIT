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
		
//		for (String string : content) {
//			
//			sb.append(string + "\n");
//		}
		return getStingFromList(content);
	}
	
	public void writeToFile() throws IOException {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		
		while(true) {
			String str = sc.nextLine();
			if (str.equals("exit")) 
				break;
			if (str.equals("clear")) {
				list = null;
				break;
			}
			list.add(str);
		}
		
		if (list == null) {
			Files.write(path, "".getBytes());
		} else if (list.size() != 0) {
			if (getFileContent().isEmpty()) {
				Files.write(path, (getStingFromList(list)).getBytes());
			} else
				Files.write(path, ("\n" + getStingFromList(list)).getBytes(), StandardOpenOption.APPEND);
		}
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
		if (text == null || text.isEmpty()) 
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
		for (String line : arr) {
			for (String word : line.split(" ")) {
				if (!line.isBlank())
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
	
	private String getStingFromList(List<String> list) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < list.size(); i++) {
			if (i == list.size() - 1)
				sb.append(list.get(i));
			else
				sb.append(list.get(i) + "\n");
		}
		return sb.toString();
	}
	
}
