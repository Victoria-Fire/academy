package by.academy.task4_cycle;

import java.util.Scanner;

public class Test_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Положи деньги в кассу:");
		double money = sc.nextInt();
		System.out.println("Через сколько лет посмотрим результат?");
		int years = sc.nextInt();
		
		for(int i = 1; i <= years; i++) {
			money = money + (money * 0.03);
		}
		
		System.out.println("У тебя будет: " + money);
		
		sc.close();
		

	}

}
