package by.academy.task4_arrays;

import java.util.Random;

public class Test_4 {

	public static void main(String[] args) {
		int[] array = new int[8];
		int min = 1;
		int max = 10;
		int dif = max - min;
		Random random = new Random();
		
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(dif + 1) + min;
		}
		
		System.out.println("Массив начальный:");
		for (int i : array) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println();
		
		for (int i = 1; i < array.length; i = i+2) {
			array[i] = 0;
		}
		
		System.out.println("Массив измененный:");
		for (int i : array) {
			System.out.print(i + " ");
		}
		
	}

}