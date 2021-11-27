package by.academy.task10_innerclasses.test_3;

public class User {

	private static String login;
	private static String password;

	public User() {
		super();
	}

	public static class Query {

		public void printToLog() {
			System.out.println("Пользователь с логином " + login + " и паролем " + password + " отправил запрос");
		}
	}

	public static void initialize(String login, String password) {
		User.login = login;
		User.password = password;
	}

	public void createQuery() {
		Query query1 = new Query();
		System.out.println("query1");
		query1.printToLog();
	}

	public static void main(String[] args) {
		initialize("User1", "Password1");

		User.Query query = new User.Query();
		System.out.println("query");
		query.printToLog();

	}
}
