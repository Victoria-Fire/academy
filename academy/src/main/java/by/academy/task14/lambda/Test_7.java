package by.academy.task14.lambda;

import java.util.function.Function;

public class Test_7 {

	public static void main(String[] args) {
		Function<Integer, String> function = str -> {
			String result = "Ноль";
			if (str > 0) {
				result = "Положительное число";
			} else if (str < 0) {
				result = "Отрицательное число";
			}
			return result;
		};

		System.out.println(function.apply(10));
		System.out.println(function.apply(0));
		System.out.println(function.apply(-10));
	}
}

//Написать лямбда выражение, которое принимает на вход число и возвращает значение “Положительное число”,
//“Отрицательное число” или  “Ноль”. Используем функциональный интерфейс Function.