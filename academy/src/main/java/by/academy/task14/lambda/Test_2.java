package by.academy.task14.lambda;

import java.util.function.Predicate;

public class Test_2 {

	public static void main(String[] args) {
		Predicate<String> predicate = str -> str != null;
		System.out.println(predicate.test(null));
		System.out.println(predicate.test("Привет =)"));
	}
}

//Создать лямбда выражение, которое возвращает значение true, если строка не null, используя функциональный интерфейс Predicate.