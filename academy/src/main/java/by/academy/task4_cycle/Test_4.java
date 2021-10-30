package by.academy.task4_cycle;

import java.util.Scanner;

public class Test_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите сколько будет чисел:");
		int count = sc.nextInt();
		int plus = 0;
		int minus = 0;
		int zero = 0;

		for (int i = 1; i <= count; i++) {
			System.out.println("Вводи свои числа для проверки: ");
			int number = sc.nextInt();
			if (number > 0) {
				plus++;
			} else if (number < 0) {
				minus++;
			} else {
				zero++;
			}

		}

		System.out.println("Количество положительных чисел: " + plus);
		System.out.println("Количество отрицательных чисел: " + minus);
		System.out.println("Количество чисел равных нулю: " + zero);
		
		sc.close();

	}

}
