package by.academy.task4_arrays;

import java.util.Random;

public class Test_6 {

	public static void main(String[] args) {
		int[] array = new int[4];
		int min = 10;
		int max = 99;
		int dif = max - min;
		boolean flag = true;
		Random random = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(dif + 1) + min;
		}

		System.out.println("Наш массив:");
		for (int i : array) {
			System.out.print(i + " ");
		}

		for (int i = 1; i < array.length; i++) {
			if (array[i - 1] >= array[i]) {
				flag = false;
				break;
			}
		}

		System.out.println();
		System.out.println();

		if (flag == true) {
			System.out.println("Массив ЯВЛЯЕТСЯ строго возрастающей последовательностью");
		} else {
			System.out.println("Массив НЕ является строго возрастающей последовательностью");
		}

	}

}