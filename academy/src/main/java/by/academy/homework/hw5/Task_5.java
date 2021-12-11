package by.academy.homework.hw5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите текст:");
		String myText = sc.nextLine();
		String text = ("На побережье Гудзонова залива есть небольшой канадский городок под названием Черчилл. "
				+ "Он знаменит на весь мир тем, что здесь очень много белых медведей. С одной стороны, это обстоятельство "
				+ "сделало город чрезвычайно популярным среди туристов, но с другой, стало настоящим бедствием для жителей "
				+ "города. Звери настолько замучили жителей небольшого городка, что их решили перевоспитать и создали здесь "
				+ "единственную в мире тюрьму для белых медведей.");
		Map<Character, Integer> dictionary1 = new HashMap<>();
		Map<Character, Integer> dictionary2 = new HashMap<>();
		int[] charCounter = new int[1105];
		char[] allCharsMyText = myText.toCharArray();
		char[] allCharsText = text.toCharArray();

		for (int i = 0; i < allCharsMyText.length; i++) {
			char ch = allCharsMyText[i];
			charCounter[ch]++;
			dictionary1.put(ch, charCounter[ch]);
		}

		System.out.println("Выводим частотный словарь для текста с консоли:");
		for (Map.Entry<Character, Integer> entry : dictionary1.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}

		for (int i = 0; i < allCharsText.length; i++) {
			char ch = allCharsText[i];
			charCounter[ch]++;
			dictionary2.put(ch, charCounter[ch]);
		}

		System.out.println();
		System.out.println("Выводим частотный словарь для текста не с консоли:");
		for (Map.Entry<Character, Integer> entry : dictionary2.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}

		sc.close();
	}
}
