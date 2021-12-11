package by.academy.classwork.lesson15;

public class Bird {

	String name;

	public Bird() {
		super();
	}

	public Bird(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {

		Flyable flyable = f -> System.out.println(f.getName() + " летает по всему городу");
		flyable.fly(new Bird("Воробей"));
	}
}
