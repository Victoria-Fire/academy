package by.academy.task4_arrays;

import java.util.Random;

public class Test_5 {

	public static void main(String[] args) {
		int[] array1 = new int[5];
		int[] array2 = new int[5];
		int sum1 = 0;
		int sum2 = 0;
		double average1;
		double average2;
		int min = 0;
		int max = 5;
		int dif = max - min;
		Random random = new Random();
		
		for (int i = 0; i < array1.length; i++) {
			array1[i] = random.nextInt(dif + 1);
		}
		
		for (int i = 0; i < array2.length; i++) {	
			array2[i] = random.nextInt(dif + 1);
		}
		
		System.out.println("Выводим первый массив:");
		for (int i : array1) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Выводим второй массив:");
		for (int i : array2) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println();
		
		for (int i : array1) {
			sum1 = sum1 + i;
		}
		
		for (int i : array2) {
			sum2 = sum2 + i;
		}
		
		average1 = (double) sum1 / array1.length;
		average2 = (double) sum2 / array2.length;
		
		if (average1 > average2) {
			System.out.println("Среднее арифметическое первого массива больше второго: " + average1 + " > " + average2);
		} else if(average2 > average1) {
			System.out.println("Среднее арифметическое второго массива больше первого: " + average2 + " > " + average1);
		} else {
			System.out.println("Среднее арифметическое обоих массивов равны: " + average2 + " = " + average1);
		}

	}

}