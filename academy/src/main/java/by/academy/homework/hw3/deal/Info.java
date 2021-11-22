package by.academy.homework.hw3.deal;

public class Info {

	public Info() {
	}

	public void getInfoUser(User user) {
		System.out.println();
		System.out.println("xXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXx");
		System.out.println("xXxXx ЛИЧНЫЙ КАБИНЕТ ПОЛЬЗОВАТЕЛЯ xXxXx");
		System.out.println("xXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXx");
		DateApp date = new DateApp();
		System.out.println("(Имя:) " + user.getName());
		System.out.println("---------------------------------------");
		System.out.println("(Дата рождения:)");
		date.parseDate(user.getDateOfBirth());
		System.out.println("---------------------------------------");
		System.out.println("(Телефон:) " + user.getPhone());
		System.out.println("---------------------------------------");
		System.out.println("(Адрес электронной почты:) ");
		System.out.println(user.getEmail());
		System.out.println("---------------------------------------");
		System.out.println("(Баланс:) " + user.getMoney() + "$");
		System.out.println("xXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXx");
	}
}