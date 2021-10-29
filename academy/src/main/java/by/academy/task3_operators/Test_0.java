package by.academy.task3_operators;

import java.util.Scanner;

public class Test_0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите любой месяц:");
		String month = sc.nextLine();

		switch (month) {
		case "Январь":
			System.out.println("Ваш месяц под номером - " + 1);
			break;
		case "Февраль":
			System.out.println("Ваш месяц под номером - " + 2);
			break;
		case "Март":
			System.out.println("Ваш месяц под номером - " + 3);
			break;
		case "Апрель":
			System.out.println("Ваш месяц под номером - " + 4);
			break;
		case "Май":
			System.out.println("Ваш месяц под номером - " + 5);
			break;
		case "Июнь":
			System.out.println("Ваш месяц под номером - " + 6);
			break;
		case "Июль":
			System.out.println("Ваш месяц под номером - " + 7);
			break;
		case "Август":
			System.out.println("Ваш месяц под номером - " + 8);
			break;
		case "Сентябрь":
			System.out.println("Ваш месяц под номером - " + 9);
			break;
		case "Октябрь":
			System.out.println("Ваш месяц под номером - " + 10);
			break;
		case "Ноябрь":
			System.out.println("Ваш месяц под номером - " + 11);
			break;
		case "Декабрь":
			System.out.println("Ваш месяц под номером - " + 12);
			break;
		default:
			System.out.println("Упс! Такого месяца не существует =)");

		}
		
		sc.close();

	}

}
