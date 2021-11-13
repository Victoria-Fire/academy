package by.academy.task7and8_OOP.Test_2;

public class Person {
	private String fullName;
	private int age;

	public Person() {

	}

	public Person(String fullName, int age) {
		this.fullName = fullName;
		this.age = age;
	}

	public void move() {

	}

	public void talk() {

		System.out.println(fullName + " говорит, что ему " + age + " лет.");
	}
}
