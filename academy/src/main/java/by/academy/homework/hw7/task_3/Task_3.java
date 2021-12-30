package by.academy.homework.hw7.task_3;

public class Task_3 {
	public static int getFactorial(int number) {
		int result = 1;
		for (int i = 1; i < number + 1; i++) {
			result = result * i;
		}
		return result;
	}

	public static int getDegreeOfNumber(int number, int degree) {
		int result = number;
		for (int i = 1; i < degree; i++) {
			result = result * number;
		}
		return result;
	}

	public static double getPercentageOfNumber(int number, int percent) {
		return number * percent / 100;
	}
}
