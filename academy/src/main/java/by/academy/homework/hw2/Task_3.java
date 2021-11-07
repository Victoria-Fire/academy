package by.academy.homework.hw2;

import java.util.Scanner;

public class Task_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите первое слово:");
		String str1 = sc.nextLine();
		System.out.println("Введите второе слово:");
		String str2 = sc.nextLine();
		String res = "";
		String ult = "";
		String result;

		if (str1.length() % 2 == 0) {
			res = str1.substring(0, str1.length() / 2);
		} else {
			System.out.println("Слово состоит из нечетного числа букв.");
		}
		if (str2.length() % 2 == 0) {
			ult = str2.substring(str2.length() / 2);
		} else {
			System.out.println("Слово состоит из нечетного числа букв.");
		}
		System.out.println();
		if ((res != "") && (ult != "")) {
			System.out.println("Cлово состоящее из первой половины первого слова и второй половины второго слова - это:");
			result = res + ult;
			System.out.println(result);
		}
		sc.close();
	}
}