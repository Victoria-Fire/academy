package by.academy.task14.lambda;

import java.util.function.Predicate;

public class Test_4 {

	public static void main(String[] args) {
		Predicate<String> predicate1 = str -> str != null;
		Predicate<String> predicate2 = str -> !str.isEmpty();
		System.out.println(predicate1.and(predicate2).test(null));
		System.out.println(predicate1.and(predicate2).test(""));
		System.out.println(predicate1.and(predicate2).test("Привет =)"));
	}
}

//Написать программу проверяющую, что строка не null и не пуста, используя метод and() функционального интерфейса Predicate.
