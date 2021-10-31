package by.academy.homework.hw1;

import java.util.Scanner;

public class Task_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите тип данных:");
		String type = sc.next();

		switch (type) {
		case ("int"):
			System.out.println("Введите переменную:");
			int myInt = sc.nextInt();
			myInt = myInt % 2;
			System.out.println("Ответ: " + myInt);
			break;
		case ("double"):
			System.out.println("Введите переменную:");
			double myDouble = sc.nextDouble();
			myDouble = myDouble * 0.7;
			System.out.println("Ответ: " + myDouble);
			break;
		case ("float"):
			System.out.println("Введите переменную:");
			float myFloat = sc.nextFloat();
			myFloat = myFloat * myFloat;
			System.out.println("Ответ: " + myFloat);
			break;
		case ("char"):
			System.out.println("Введите переменную:");
			char myChar = sc.next().charAt(0);
			int result = (int) myChar;
			System.out.println("Ответ: " + result);
			break;
		case ("String"):
			System.out.println("Введите переменную:");
			String myString = sc.next();
			System.out.println("Hello " + myString);
			break;
		default:
			System.out.println("Unsupported type");
		}

		sc.close();

	}

}
