package by.academy.task5_strings_classwork;

public class Test_1 {
//  a) Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
	public static void printStr (String myString) {
		System.out.println("а) " + myString);
	}
	
	public static void main(String[] args) {
		String str = "I like Java! =)";	
		printStr(str);
		
//	б) Распечатать последний символ строки. Используем метод String.charAt().
		System.out.println("б) Последний символ строки: " + str.charAt(str.length() - 1));
		
//	в) Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
		System.out.println("в) " + str.endsWith("! =)"));
		
//	г) Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith(). 
		System.out.println("г) " + str.startsWith("I like"));
		
//	д) Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
		System.out.println("д) " + str.contains("Java"));
		
//	e) Найти позицию подстроки “Java” в строке “I like Java!!!”.
		System.out.println("е) " + str.indexOf("Java"));
		
//	ж) Заменить все символы “а” на “о”. 
		System.out.println("ж) " + str.replace('a', 'o'));
		
//	з) Преобразуйте строку к верхнему регистру.
		System.out.println("з) " + str.toUpperCase());
		
//	и) Преобразуйте строку к нижнему регистру.
		System.out.println("и) " + str.toLowerCase());
		
//	к) Вырезать строку Java c помощью метода String.substring().
		System.out.println("к) " + str.substring(7, 11));
	}
}
