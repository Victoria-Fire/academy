package by.academy.task14.lambda;

import java.util.function.Predicate;

public class Test_3 {

	public static void main(String[] args) {
		Predicate<String> predicate = str -> !str.isEmpty();
		System.out.println(predicate.test(""));
		System.out.println(predicate.test("Привет =)"));
	}
}

//Создать лямбда выражение, которое проверяет, что строка не пуста, используя функциональный интерфейс Predicate.