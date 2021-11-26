package by.academy.task10_generics.test_6;

import by.academy.classwork.lesson7.Bmw;
import by.academy.classwork.lesson7.Car;

public class SolutionDemo {

	public static void main(String[] args) {
		Solution<String, Car, Integer> object = new Solution<>("Hello, World", new Bmw(), 123);
		object.printObjectClasses();
	}
}
