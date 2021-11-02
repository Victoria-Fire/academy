package by.academy.task4_cycle;

import java.util.Scanner;

public class Test_17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите сколько учащихся в классе:");
		int count = sc.nextInt();
		int height;
		int sum = 0;
		int mistake = 0;
		double average;

		for (int i = 1; i <= count; i++) {
			System.out.println("Введите рост:");
			height = sc.nextInt();
			if ((height > 100) && (height < 210)) {
				sum += height;
			} else {
				System.out.println("Не правильно введен рост! Повторите попытку.");
				count++;
				mistake--;
			}
		}

		average = (double) sum / (count + mistake);

		System.out.printf("Cредний рост учащихся класса: %.2f см", average);

		sc.close();

	}

}
