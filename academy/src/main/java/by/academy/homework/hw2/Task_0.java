package by.academy.homework.hw2;

import java.io.IOException;
import java.util.Scanner;

public class Task_0 {

	// Complete the pairs function below.
	static int pairs(int k, int[] arr) {
		int pairsCount = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] - arr[i] == k) {
					pairsCount++;
				}
			}
		}

		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] - arr[i] == k) {
					pairsCount++;
				}
			}
		}

		return pairsCount;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		System.out.println("Введите размер массива arr и target значение через пробел:");
		String[] nk = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nk[0]);
		if ((n >= 2) && (n <= Math.pow(10, 5))) {
			int k = Integer.parseInt(nk[1]);
			if ((k > 0) && (k < Math.pow(10, 9))) {

				int[] arr = new int[n];

				System.out.println("Введите " + n + " уникальных значений массива через пробел:");
				String[] arrItems = scanner.nextLine().split(" ");

				for (int i = 0; i < n; i++) {
					arr[i] = Integer.parseInt(arrItems[i]);
				}

				for (int i = 0; i < n; i++) {
					if (arr[i] > 0) {
						for (int j = i + 1; j < n; j++) {
							if (arr[i] == arr[j]) {
								System.out.println("Ошибка! Такое значение уже существует. Значения должны быть уникальными!");
								System.exit(1);
							}
						}
					} else {
						System.out.println("Ошибка! Неправильно введено значение массива.");
						System.exit(1);
					}

				}

				System.out.println();
				System.out.println("Наш массив:");
				for (int x : arr) {
					System.out.print(x + " ");
				}

				System.out.println();
				int result = pairs(k, arr);
				System.out.println("Найдено " + result + " пар(ы), разность которых равна \"" + k + "\"");
			} else {
				System.out.println("Ошибка! Неправильно введено target значение.");
			}

		} else {
			System.out.println("Ошибка! Неправильно введен размер массива.");
		}
		scanner.close();
	}
}
