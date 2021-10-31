package by.academy.homework.hw1;

import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите сумму:");
		double sum = sc.nextDouble();
		System.out.println("Введите свой возраст:");
		int age = sc.nextInt();

		System.out.println();
		if (age > 0) {
			if ((sum > 0) && (sum < 100)) {
				sum = sum - (sum * 0.05);
				System.out.println("Ваша сумма с 5% скидкой будет: " + sum);
			} else if ((sum >= 100) && (sum < 200)) {
				sum = sum - (sum * 0.07);
				System.out.println("Ваша сумма с 7% скидкой будет: " + sum);
			} else if ((sum >= 200) && (sum < 300)) {
				if (age > 18) {
					sum = sum - (sum * (0.12 + 0.04));
					System.out.println("Ваша сумма сo специальной скидкой будет: " + sum);
				} else {
					sum = sum - (sum * (0.12 - 0.03));
					System.out.println("Ваша сумма с небольшой скидкой будет: " + sum);
				}
			} else if ((sum >= 300) && (sum < 400)) {
				sum = sum - (sum * 0.15);
				System.out.println("Ваша сумма с 15% скидкой будет: " + sum);
			} else if (sum >= 400) {
				sum = sum - (sum * 0.2);
				System.out.println("Ваша сумма с 20% скидкой будет: " + sum);
			} else {
				System.out.println("ДЕРЖИТЕ ГРАБИТЕЛЯ !!!");
			}
		} else {
			System.out.println("Не правильно набран возраст");
		}

		sc.close();

	}

}
