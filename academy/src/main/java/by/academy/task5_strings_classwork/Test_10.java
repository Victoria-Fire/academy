package by.academy.task5_strings_classwork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test_10 {
	private static final String str = "Java\\s+\\d+";
	private static final Pattern pattern = Pattern.compile(str);

	public static void main(String[] args) {
		String text = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";
		Matcher matcher = pattern.matcher(text);
		
		while(matcher.find()) {
			int start = matcher.start();
			int end = matcher.end();
			
			System.out.println(text.substring(start, end));
		}
		
	}

}
//Дана строка “Versions: Java  5, Java 6, Java   7, Java 8, Java 12.”  
//Найти все подстроки "Java <X>" и распечатать их.