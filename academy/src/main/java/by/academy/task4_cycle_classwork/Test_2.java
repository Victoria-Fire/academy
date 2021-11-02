package by.academy.task4_cycle_classwork;

public class Test_2 {

	public static void main(String[] args) {
		int week = Integer.parseInt(args[0].substring(0, 1));
		if (week == 1) {
			System.out.println("Понедельник");
		} else if (week == 2) {
			System.out.println("Вторник");
		} else if (week == 3) {
			System.out.println("Среда");
		} else if (week == 4) {
			System.out.println("Четверг");
		} else if (week == 5) {
			System.out.println("Пятница");
		} else if (week == 6) {
			System.out.println("Выходной");
		} else if (week == 7) {
			System.out.println("Выходной");
		}
	}

}