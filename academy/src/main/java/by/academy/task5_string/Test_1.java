package by.academy.task5_string;

import java.util.Scanner;

public class Test_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите сколько будет строк:");
		int number = sc.nextInt();
		String lengthMax = "";
		String lengthMin = null;
		int max = 0;
		int min = 0;

		System.out.println("Введите " + number + " строк:");
		for (int i = 0; i < number; i++) {
			String str = sc.next();
			if (str.length() > lengthMax.length()) {
				lengthMax = str;
				max = lengthMax.length();
			}
			if ((lengthMin == null) || (str.length() < lengthMin.length())) {
				lengthMin = str;
				min = lengthMin.length();
			}
		}

		System.out.println("Самая длинная строка: " + "\"" + lengthMax + "\"" + " и равна: " + max);
		System.out.println("Самая короткая строка: " + "\"" + lengthMin + "\"" + " и равна: " + min);

		sc.close();
	}

}