package by.academy.task4_arrays;

import java.util.Random;

public class Test_10 {

	public static void main(String[] args) {
		int[] array = new int[11];
		int min = -1;
		int max = 1;
		int dif = max - min;
		int countMinus = 0;
		int countZero = 0;
		int countPlus = 0;
		Random random = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(dif + 1) + min;
		}

		System.out.println("Наш массив:");
		for (int i : array) {
			System.out.print(i + " ");
		}

		System.out.println();
		System.out.println();

		for (int i = 0; i < array.length; i++) {
			if (array[i] == -1) {
				countMinus++;
			} else if (array[i] == 0) {
				countZero++;
			} else {
				countPlus++;
			}
		}

		if ((countMinus > countZero) && (countMinus > countPlus)) {
			System.out.println("Элемент -1 встречается чаще всего в массиве: " + countMinus + " раз");
		} else if ((countPlus > countZero) && (countPlus > countMinus)) {
			System.out.println("Элемент 1 встречается чаще всего в массиве: " + countPlus + " раз");
		} else if (((countZero > countMinus) && (countZero > countPlus))) {
			System.out.println("Элемент 0 встречается чаще всего в массиве: " + countZero + " раз");
		}

	}

}