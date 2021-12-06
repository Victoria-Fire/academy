package by.academy.homework.hw4.task_1;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZonedDateTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Date {
	private Day day;
	private Month month;
	private Year year;

	public Date() {
		super();
	}

	public Date(String checkDate) {
		super();
		Pattern pattern = Pattern.compile("(0?[1-9]|[12][0-9]|3[01])-(0[1-9]|1[012])-(19|20)[0-9]{2}");
		Matcher matcher = pattern.matcher(checkDate);

		if (matcher.matches() == true) {			
			String[] str = checkDate.split("-");

			day = new Day(str[0]);
			month = new Month(str[1]);
			year = new Year(str[2]);

		} else {
			System.out.println("Не правильно введена дата :(");
			System.exit(1);
		}
	}

	public Date(Day day, Month month, Year year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public boolean leapYear() {
		if ((Integer.parseInt(year.getYear()) % 4 == 0)
				&& (Integer.parseInt(year.getYear()) % 100 != 0 || (Integer.parseInt(year.getYear()) % 400 == 0))) {
			return true;
		}
		return false;
	}

	public void printLeapYear() {
		if (leapYear() == true) {
			System.out.println("Год високосный!");
		} else {
			System.out.println("Год не високосный!");
		}
	}

	public void printdateDifference() {
		ZonedDateTime now = ZonedDateTime.now();
		int nowDay = now.getDayOfMonth();
		int nowMonth = now.getMonthValue();
		int nowYear = now.getYear();
		String printEnteredDate = day.getDay() + "." + month.getMonth() + "." + year.getYear();
		String printNowDate = nowDay + "." + nowMonth + "." + nowYear;

		LocalDate enteredDate = LocalDate.of(Integer.parseInt(year.getYear()), Integer.parseInt(month.getMonth()),
				Integer.parseInt(day.getDay()));
		LocalDate nowDate = LocalDate.of(nowYear, nowMonth, nowDay);

		if (nowDate.isAfter(enteredDate)) {
			Period dif = Period.between(enteredDate, nowDate);
			System.out.println("С даты " + printEnteredDate + " до " + printNowDate + " прошло: " + dif.getYears()
					+ " лет, " + dif.getMonths() + " месяцев, " + dif.getDays() + " дней");
		} else {
			Period dif = Period.between(nowDate, enteredDate);
			System.out.println("С даты " + printNowDate + " до " + printEnteredDate + " пройдет: " + dif.getYears()
					+ " лет, " + dif.getMonths() + " месяцев, " + dif.getDays() + " дней");
		}
	}

	public void printDayOfWeek() {
		int WeekCode = ((Integer.parseInt(day.getDay()) + getMonthCode() + getYearCode()) % 7);
		if (leapYear() == true) {
			if ((Integer.parseInt(month.getMonth()) == 1) || (Integer.parseInt(month.getMonth()) == 2)) {
				if (WeekCode == 0) {
					WeekCode = 6;
				} else {
					WeekCode = WeekCode - 1;
				}
			}
		}

		String dayOfWeek = null;

		switch (WeekCode) {
		case 0:
			dayOfWeek = DayOfWeek.SATURDAY.getName();
			break;
		case 1:
			dayOfWeek = DayOfWeek.SUNDAY.getName();
			break;
		case 2:
			dayOfWeek = DayOfWeek.MONDAY.getName();
			break;
		case 3:
			dayOfWeek = DayOfWeek.TUESDAY.getName();
			break;
		case 4:
			dayOfWeek = DayOfWeek.WEDNESDAY.getName();
			break;
		case 5:
			dayOfWeek = DayOfWeek.THURSDAY.getName();
			break;
		case 6:
			dayOfWeek = DayOfWeek.FRIDAY.getName();
			break;
		}

		System.out.println("День недели - " + dayOfWeek);
	}

	private int getMonthCode() {
		int monthCode = 0;
		if ((Integer.parseInt(month.getMonth()) == 1) || (Integer.parseInt(month.getMonth()) == 10)) {
			monthCode = 1;
		}
		if ((Integer.parseInt(month.getMonth()) == 5)) {
			monthCode = 2;
		}
		if ((Integer.parseInt(month.getMonth()) == 8)) {
			monthCode = 3;
		}
		if ((Integer.parseInt(month.getMonth()) == 2) || (Integer.parseInt(month.getMonth()) == 3)
				|| (Integer.parseInt(month.getMonth()) == 11)) {
			monthCode = 4;
		}
		if ((Integer.parseInt(month.getMonth()) == 6)) {
			monthCode = 5;
		}
		if ((Integer.parseInt(month.getMonth()) == 12) || (Integer.parseInt(month.getMonth()) == 9)) {
			monthCode = 6;
		}
		if ((Integer.parseInt(month.getMonth()) == 4) || (Integer.parseInt(month.getMonth()) == 7)) {
			monthCode = 0;
		}
		return monthCode;
	}

	private int getYearCode() {
		int checkYear;
		int yearCode = 0;
		if (Integer.parseInt(year.getYear().substring(0, 2)) == 19) {
			checkYear = 0;
		} else {
			checkYear = 6;
		}
		yearCode = (checkYear + Integer.parseInt(year.getYear().substring(2))
				+ (Integer.parseInt(year.getYear().substring(2)) / 4)) % 7;
		return yearCode;
	}

	public class Year {
		String year;

		public Year() {
			super();
		}

		public Year(String year) {
			super();
			this.year = year;
		}

		public String getYear() {
			return year;
		}

		public void setYear(String year) {
			this.year = year;
		}
	}

	public class Month {
		String month;

		public Month() {
			super();
		}

		public Month(String month) {
			super();
			this.month = month;
		}

		public String getMonth() {
			return month;
		}

		public void setMonth(String month) {
			this.month = month;
		}
	}

	public class Day {
		String day;

		public Day() {
			super();
		}

		public Day(String day) {
			super();
			this.day = day;
		}

		public String getDay() {
			return day;
		}

		public void setDay(String day) {
			this.day = day;
		}
	}
}
