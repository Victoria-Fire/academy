package by.academy.homework.hw4.task_1;

import java.util.Scanner;

public class DateDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите дату между 01.01.1900 и 31.12.2099:");
		String dateIn = sc.next();
		System.out.println();
		
		Date date1 = new Date(dateIn);
		System.out.println("Дата введеная с консоли:");
		date1.printLeapYear();
		date1.printdateDifference();
		date1.printDayOfWeek();
		
		System.out.println();
		System.out.println("=============================");
		System.out.println();
		System.out.println("Дата введеная другим способом:");
		Date.Day day = new Date().new Day("12");
		Date.Month month = new Date().new Month("12");
		Date.Year year = new Date().new Year("2012");
		Date date2 = new Date(day, month, year);
		date2.printLeapYear();
		date2.printdateDifference();
		date2.printDayOfWeek();
		
		sc.close();
	}
}
