package by.academy.homework.hw1;

import java.util.Scanner;

public class Task_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число:");
		int number = sc.nextInt();
		int result;

		if ((number > 0) && (number <= 10)) {
			System.out.println();
			System.out.println("Считаем:");
			for (int i = 1; i <= 10; i++) {
				result = number * i;
				System.out.println(number + " * " + i + " = " + result);
			}
		} else {
			System.out.println("Введи число полегче :) Я не умею такие большие считать!");
		}

		sc.close();

	}

}
