package by.academy.task4_cycle_classwork;

public class Test_3 {

	public static void main(String[] args) {
		int week = Integer.parseInt(args[0].substring(0, 1));
		
		switch(week) {
		case 1:
			System.out.println("Понедельник");
			break;
		case 2:
			System.out.println("Вторник");
			break;
		case 3:
			System.out.println("Среда");
			break;
		case 4:
			System.out.println("Четверг");
			break;
		case 5:
			System.out.println("Пятница");
			break;
		case 6:
			System.out.println("Выходной");
			break;
		case 7:
			System.out.println("Выходной");
			break;
		}
		
	}

}
