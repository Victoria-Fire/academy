package by.academy.task4_cycle;

import java.util.Scanner;

public class Test_16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("Введите сколько у нас сенокосилок:");
		int mower = sc.nextInt();
		System.out.println("Сколько часов работала первая сенокосилка:");
		int hoursStart = sc.nextInt();
		int hours = hoursStart * 60;
		int result = hoursStart * 60;
		int timeMin;
		int timeHours;
		
		for (int i = 1; i <= mower - 1; i++) {
			result = result + (hours + i * 10);
		}
		
		timeMin = result % 60;
		timeHours = (result - timeMin) / 60;
		
		System.out.println("Бригада проработала " + timeHours + " часов " + timeMin + " минут");	

	}

}
