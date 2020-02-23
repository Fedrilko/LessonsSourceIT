package com.sourceit.fredor.lessons.les8io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilesPractice {

	public static void main(String[] args) throws IOException {

		List<String> list = new ArrayList<>();
		
		list.add("Ivan");
		list.add("Artem");
		list.add("Fedor");
		list.add("Alexandr");
		list.add("Sergey");
		list.add("Anna");
		list.add("Ama");
		System.out.println(list.size());
		Stream<String> stream = list.stream();

		List<String> filteredList = stream.filter(new Predicate<String>() {

			@Override
			public boolean test(String t) {
				if (t.length() > 5)
					return false;
				else
					return true;

			}
		}).filter(obj -> {
			if (obj.charAt(0) == 'A')
				return true;
			else
				return false;
		}).sorted((s1, s2) -> {
			return s1.compareToIgnoreCase(s2);
		}).collect(Collectors.toList());

//		System.out.println(stream.filter(new PredicateObj()).count());
//		for (String string : filteredList) {
//			System.out.println(string);
//		}
		
		list = list.stream().filter(obj -> obj.length() <= 5).map(obj -> obj.toLowerCase()).collect(Collectors.toList());
		
		for (String string : list) {
			System.out.println(string);
		}
		
		System.out.println(list.size());
		
		
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

class PredicateObj implements Predicate<String> {

	@Override
	public boolean test(String t) {
		if (t.length() > 4)
			return false;
		else
			return true;

	}

}