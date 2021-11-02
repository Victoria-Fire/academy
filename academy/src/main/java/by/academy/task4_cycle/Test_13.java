package by.academy.task4_cycle;

public class Test_13 {

	public static void main(String[] args) {
		int sum = 0;
		int number;

		for (int i = 100; i <= 200; i++) {
			number = i;
			if (number % 17 == 0) {
				sum += number;
			}

		}

		System.out.println("Сумма чисел от 100 до 200 кратных 17 равна: " + sum);

	}

}