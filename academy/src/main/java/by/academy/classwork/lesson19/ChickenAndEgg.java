package by.academy.classwork.lesson19;

public class ChickenAndEgg {

	public static void main(String[] args) {
		Thread thread1 = new Egg();
		Thread thread2 = new Chicken();
		thread1.start();
		thread2.start();
	}
}
