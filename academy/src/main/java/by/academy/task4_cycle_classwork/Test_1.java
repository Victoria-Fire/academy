package by.academy.task4_cycle_classwork;

import java.util.Scanner;

public class Test_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число:");
		int number = sc.nextInt();
		if ((number > 0) && (number < 10)) {
			System.out.println("Положительное число меньше 10");
		} else {
			System.out.println("Положительное число больше 10 или отрицательное");

		}

		sc.close();

	}
}