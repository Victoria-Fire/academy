package by.academy.task5_strings_classwork;

import java.util.Scanner;

public class Test_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите слово:");
		String str = sc.next();
		int number;
		
		if(str.length() % 2 == 0) {
			number = str.length() / 2;
			System.out.println(str.substring(number - 1, number + 1));
		} else {
			System.out.println("Ошибка! Длина - нечетное число");
		}

		sc.close();
	}

}