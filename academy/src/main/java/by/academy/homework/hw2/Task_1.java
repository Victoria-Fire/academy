package by.academy.homework.hw2;

import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите первую строку:");
		String str1 = sc.nextLine().trim();
		System.out.println("Введите вторую строку:");
		String str2 = sc.nextLine().trim();
		int count1 = 0;
		int count2 = 0;

		sc.close();

		System.out.println();
		System.out.println("Сравниваем " + "\"" + str1 + "\"" + " и " + "\"" + str2 + "\"");
		if ((str1 != null) && (str2 != null)) {
			if (str1.length() == str2.length()) {
				for (int i = 0; i < str1.length(); i++) {
					char check = str1.charAt(i);
					for (int j = 0; j < str1.length(); j++) {
						if (str1.charAt(j) == check) {
							count1++;
						}
						if (str2.charAt(j) == check) {
							count2++;
						}
					}
					if (count1 != count2) {
						System.out.println("Разные строки - " + false);
						return;
					}
				}
				System.out.println("Вторая строка является перестановкой символов первой строки - " + true);
			} else {
				System.out.println("Строки не равны по длине! Разные строки - " + false);
			}
		} else {
			System.out.println("Строка или строки null!");
		}
	}
}