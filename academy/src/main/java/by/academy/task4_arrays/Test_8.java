package by.academy.task4_arrays;

import java.util.Random;

public class Test_8 {

	public static void main(String[] args) {
		int[] array = new int[12];
		int min = -15;
		int max = 15;
		int dif = max - min;
		int valueMax = 0;
		int index = 0;
		Random random = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(dif + 1) + min;
		}

		System.out.println("Наш массив:");
		for (int i : array) {
			System.out.print(i + " ");
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] >= valueMax) {
				valueMax = array[i];
				index = i;
			}

		}
		System.out.println();
		System.out.println();

		System.out.println("Максимальное значение: " + valueMax);
		System.out.println("Индекс последнего вхождения: " + index);

	}

}