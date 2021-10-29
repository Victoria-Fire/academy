package by.academy.task3_operators;

import java.util.Scanner;

public class Test_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число:");
		int number = sc.nextInt();
		
		if(number % 2 == 0) {
			System.out.println("Ваше число " + number + " - чётное =)");
		} else {
			System.out.println("Ваше число " + number + " - нечётное =(");
		}
		
		sc.close();

	}

}
