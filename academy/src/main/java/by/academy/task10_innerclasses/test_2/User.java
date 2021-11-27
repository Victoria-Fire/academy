package by.academy.task10_innerclasses.test_2;

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
	
	public void createQuery() {
		class Query {
			
			public void printToLog() {
				System.out.println("Пользователь с логином " + login + " и паролем " + password + " отправил запрос");
			}
		}
		
		Query query = new Query();
		System.out.println("query");
		query.printToLog();
	}

	public static void main(String[] args) {
		User user = new User("User1", "Password1");
		user.createQuery();

	}

}
