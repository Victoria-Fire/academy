package by.academy.task4_arrays;

public class Test_7 {

	public static void main(String[] args) {
		int[] array = new int[20];
		array[0] = 0;
		array[1] = 1;
		
		for (int i = 2; i < array.length; i++) {
			array[i] = array[i - 2] + array [i - 1];
		}
		
		System.out.println("Наш массив из 20-ти первых чисел Фибоначчи:");
		for (int i : array) {
			System.out.print(i + " ");
		}

	}

}