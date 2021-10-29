package by.academy.task3_operators;

public class Test_4 {

	public static void main(String[] args) {
		int s = 370_000_000;
		int sec;
		int m;
		int min;
		int h;
		int hour;
		int d;
		int day;
		int w;
		int week;
		int mo;
		int month;
		int year;

		sec = s % 60;
		m = (s - sec) / 60;
		min = m % 60;
		h = (m - min) / 60;
		hour = h % 24;
		d = (h - hour) / 24;
		day = d % 7;
		w = (d - day) / 7;
		week = w % 4;
		mo = (w - week) / 4;
		month = mo % 12;
		year = (mo - month) / 12;
		 
		System.out.println(year + " лет " + month + " месяцев " + week + " недель " + day + " дней " 
		+ hour + " часов " + min + " минут " + sec + " секунд");

	}

}
