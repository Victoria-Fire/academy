package by.academy.homework.hw1;

public class Task_4 {

	public static void main(String[] args) {
		int number = 2;
		int count = 1;

		System.out.println("Считаем:");
		while (number <= 1_000_000) {
			number *= 2;
			count++;
			System.out.println("2 в степени " + count + " = " + number);
		}
	}
}
