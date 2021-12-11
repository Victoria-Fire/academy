package by.academy.task14.lambda;

import java.util.function.Consumer;

public class Test_6 {

	class HeavyBox {
		int weight;

		public HeavyBox() {
			super();
		}

		public HeavyBox(int weight) {
			this.weight = weight;
		}

		public int getWeight() {
			return weight;
		}

		public void setWeight(int weight) {
			this.weight = weight;
		}
	}

	public static void main(String[] args) {

		Consumer<HeavyBox> consumer1 = str -> System.out.println("Отгрузили ящик с весом " + str.getWeight());
		Consumer<HeavyBox> consumer2 = str -> System.out.println("Отправляем ящик с весом " + str.getWeight());
		consumer1.andThen(consumer2).accept(new Test_6().new HeavyBox(15));
	}
}

//Написать лямбда выражение, которое принимает на вход объект типа HeavyBox и выводит на консоль сообщение 
//“Отгрузили ящик с весом n”. “Отправляем ящик с весом n” Используем функциональный интерфейс Consumer и метод по умолчанию andThen.