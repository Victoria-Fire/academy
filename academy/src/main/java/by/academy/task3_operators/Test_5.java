package by.academy.task3_operators;

import java.util.Scanner;

public class Test_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число a:");
		int a = sc.nextInt();
		System.out.println("Введите число b:");
		int b = sc.nextInt();
		double c = (double) (a + b) / 2;
		
		if(a > b) {
			System.out.println("Число " + a + " больше числа " + b);
		} else if(a < b) {
			System.out.println("Число " + a + " меньше числа " + b);
		} else {
			System.out.println("Опаньки! Наши числа равны)");
		}
		
		System.out.println("Среднее арифметическое равно: " + c);
				
		sc.close();	

	}

}
