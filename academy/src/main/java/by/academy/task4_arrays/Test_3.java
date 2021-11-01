package by.academy.task4_arrays;

import java.util.Random;

public class Test_3 {

	public static void main(String[] args) {
		int[] array = new int[15];
		Random random = new Random();
		int min = 0;
		int max = 9;
		int dif = max - min;
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(dif + 1);
		}

		System.out.println("Выводим массив:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		for (int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 0) {
				count++;
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Чётных элементов в нашем массиве - " + count + " шт.");

	}

}
