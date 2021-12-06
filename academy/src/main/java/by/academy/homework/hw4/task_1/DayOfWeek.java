package by.academy.homework.hw4.task_1;

public enum DayOfWeek {
	MONDAY("Понедельник"), TUESDAY("Вторник"), WEDNESDAY("Среда"), THURSDAY("Четверг"), FRIDAY("Пятница"),
	SATURDAY("Суббота"), SUNDAY("Воскресенье");

	private String name;

	DayOfWeek(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
