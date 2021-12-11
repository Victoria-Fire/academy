package by.academy.task14.lambda;

import java.util.Random;
import java.util.function.Supplier;

public class Test_8 {

	public static void main(String[] args) {
		Supplier<Integer> random = () -> {
			Random rand = new Random();
			return rand.nextInt(11);
		};

		for (int i = 0; i < 100; i++) {
			System.out.println(random.get());
		}
	}
}

//Написать лямбда выражение, которое возвращает случайное число от 0 до 10. Используем функциональный интерфейс Supplier.