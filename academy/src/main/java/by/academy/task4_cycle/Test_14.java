package by.academy.task4_cycle;

import java.util.Scanner;

public class Test_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число до которого считаем:");
		int limit = sc.nextInt();
		int number;
		int sum = 0;

		for (int i = 1; i <= limit; i++) {
			number = (int) Math.pow(i, 2);
			sum += number;
		}

		System.out.println("Cумма квадратов чисел от 1 до " + limit + " равна: " + sum);

		sc.close();

	}

}
