package by.academy.task4_cycle;

import java.util.Scanner;

public class Test_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число:");
		int number = sc.nextInt();
		int mult = 1;
		
		for (int i = 1; i <= number; i++) {
			mult *= i;
		}
		
		System.out.println(mult);
		
		sc.close();

	}

}
