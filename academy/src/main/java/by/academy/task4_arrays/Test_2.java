package by.academy.task4_arrays;

public class Test_2 {

	public static void main(String[] args) {
		int[] array = new int[50];
		int number = -1;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = number + 2;
			number += 2;
		}
		
		System.out.println("Выводим массив в обычном порядке:");
		for (int i : array) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Выводим массив в обратном порядке:");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}

	}

}