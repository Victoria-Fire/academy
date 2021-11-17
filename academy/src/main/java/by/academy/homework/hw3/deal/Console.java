package by.academy.homework.hw3.deal;

import java.util.Scanner;

public class Console {
	Scanner sc = new Scanner(System.in);

	public Console() {
		super();
	}

	public void createUsers(User user) {
		createNameUser(user);
		createDateOfBirth(user);
		createTelNumber(user);
		createEmail(user);
		createMoneyUser(user);
	}

	public void createNameUser(User user) {
		System.out.println("Введите имя:");
		while (true) {
			String nameCreate = sc.next();
			if (nameCreate == null || nameCreate.trim().length() == 0) {
				System.out.println("Не правильно введено имя. Повторите еще раз!");
			} else {
				user.setName(nameCreate);
				break;
			}
		}
	}

	public void createDateOfBirth(User user) {
		System.out.println("Введите дату рождения:");
		while (true) {
			String dateOfBirthCtreate = sc.next();
			DateApp date = new DateApp();
			if (!date.checkDate(dateOfBirthCtreate)) {
				System.out.println("Не правильно введена дата. Повторите еще раз!");
			} else {
				user.setDateOfBirth(dateOfBirthCtreate);
				break;
			}
		}
	}

	public void createTelNumber(User user) {
		System.out.println("Введите номер телефона: +375...");
		while (true) {
			String telNumberCreate = sc.next();
			BelarusPhoneValidator phone = new BelarusPhoneValidator();
			if (!phone.validate(telNumberCreate)) {
				System.out.println("Не правильно введен номер. Повторите еще раз!");
			} else {
				user.setPhone(telNumberCreate);
				break;
			}
		}
	}

	public void createEmail(User user) {
		System.out.println("Введите адрес элетронной почты:");
		while (true) {
			String emailCreate = sc.next();
			EmailValidator email = new EmailValidator();
			if (!email.validate(emailCreate)) {
				System.out.println("Не правильно введен адрес электронной почты. Повторите еще раз!");
			} else {
				user.setEmail(emailCreate);
				break;
			}
		}
	}

	public void createMoneyUser(User user) {
		System.out.println("Введите сумму для зачисления на баланс:");
		while (true) {
			int moneyCreate = sc.nextInt();
			if (moneyCreate < 0) {
				System.out.println("Отрицательный баланс. Повторите ввод еще раз!");
			} else {
				user.setMoney(moneyCreate);
				break;
			}
		}
	}
}
