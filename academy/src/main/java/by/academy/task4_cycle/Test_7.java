package by.academy.task4_cycle;

import java.util.Scanner;

public class Test_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array1 = new int[10];
		int[] array2 = new int[10];

		for (int i = 0; i < 10; i++) {
			System.out.println("Введите число а:");
			array1[i] = sc.nextInt();
			System.out.println("Введите число b:");
			array2[i] = sc.nextInt();
			System.out.println("_________________");

		}
		for (int i = 0; i < 10; i++) {
			if (array1[i] > array2[i]) {
				System.out.println("Сравниваем числа " + array1[i] + " и " + array2[i]);
				System.out.println("Число " + array1[i] + " большее в этой паре");
				System.out.println();
			} else if (array1[i] < array2[i]) {
				System.out.println("Сравниваем числа " + array1[i] + " и " + array2[i]);
				System.out.println("Число " + array2[i] + " большее в этой паре");
				System.out.println();
			} else {
				System.out.println("Сравниваем числа " + array1[i] + " и " + array2[i]);
				System.out.println("Числа равны!");
				System.out.println();
			}
		}

		sc.close();
	}
}
