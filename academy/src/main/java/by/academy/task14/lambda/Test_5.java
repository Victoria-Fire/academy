package by.academy.task14.lambda;

import java.util.function.Predicate;

public class Test_5 {

	public static void main(String[] args) {

		Predicate<String> predicate = str -> str != null
				&& ((str.startsWith("J") || str.startsWith("N")) && str.endsWith("A"));
		System.out.println(predicate.test("JERINA"));
		System.out.println(predicate.test("NERINA"));
		System.out.println(predicate.test("JERINE"));
		System.out.println(predicate.test("gERINE"));
	}
}

//Написать программу, которая проверяет, что строка начинается буквой “J”или “N” и заканчивается “A”. 
//Используем функциональный интерфейс Predicate.