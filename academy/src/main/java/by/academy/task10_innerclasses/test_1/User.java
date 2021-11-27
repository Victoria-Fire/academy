package by.academy.task10_innerclasses.test_1;

public class User {
	
	private String login;
	private String password;
	
	public User() {
		super();
	}

	public User(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public class Query {
		
		public void printToLog() {
			System.out.println("Пользователь с логином " + login + " и паролем " + password + " отправил запрос");
		}
	}
	
	public void createQuery() {
		Query query1 = new Query();
		System.out.println("query1");
		query1.printToLog();
	}

	public static void main(String[] args) {
		User user = new User("User1", "Password1");
		user.createQuery();
		
		User.Query query2 = user.new Query();
		System.out.println("query2");
		query2.printToLog();
		
		User.Query query3 = new User("User2", "Password2").new Query();
		System.out.println("query3");
		query3.printToLog();

	}

}
