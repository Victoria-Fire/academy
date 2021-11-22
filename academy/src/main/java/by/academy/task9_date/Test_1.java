package by.academy.task9_date;

import java.time.LocalDate;

public class Test_1 {

	public static void main(String[] args) {
		LocalDate myDate = LocalDate.of(1988, 12, 07);
		System.out.println("День недели " + myDate.getDayOfWeek());
		System.out.println("День в году " + myDate.getDayOfYear());
		System.out.println("Месяц: " + myDate.getMonthValue());
		System.out.println("Число: " + myDate.getDayOfMonth());
		
		LocalDate date = LocalDate.now();
		
		System.out.println(date.isAfter(myDate));
		System.out.println(date.isBefore(myDate));

	}

}
