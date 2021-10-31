package by.academy.task4_cycle;

public class Test_10 {

	public static void main(String[] args) {
		int number;
		int result = 0;

		for (int i = 1; i <= 50; i++) {
			number = i;

			if ((number % 5 == 0) || (number % 7 == 0)) {
				result = result + number;
			}

		}
		
		System.out.println("Сумма равна: " + result);

	}

}