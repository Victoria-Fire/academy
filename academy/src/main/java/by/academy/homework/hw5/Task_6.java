package by.academy.homework.hw5;

public class Task_6 {

	public static void main(String[] args) {
		int[] number = new int[8];
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(number[i] = i);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Array is to small, expand the array");
		}
	}
}
