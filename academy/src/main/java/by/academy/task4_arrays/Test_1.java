package by.academy.task4_arrays;

public class Test_1 {

	public static void main(String[] args) {
		int[] array = new int[10];
		int number = 1;

		for (int i = 0; i < array.length; i++) {
			array[i] = number * 2;
			number++;
		}

		System.out.println("Выводим в строку наш массив:");
		for (int i : array) {
			System.out.print(i + " ");
		}

		System.out.println();
		System.out.println();

		System.out.println("Выводим в столбец наш массив:");
		for (int i : array) {
			System.out.println(i + "\n");
		}

	}

}