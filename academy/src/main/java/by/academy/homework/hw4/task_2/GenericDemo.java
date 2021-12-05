package by.academy.homework.hw4.task_2;

public class GenericDemo {

	public static void main(String[] args) {
		Generic<Integer> testInt = new Generic<>();
		Generic<Double> testDouble = new Generic<>(1);
		Generic<String> testString = new Generic<>(10);

		// 1) добавления в наш массив объекта типа T - add(T obj)
		testInt.add(134);
		testInt.add(18);
		testInt.add(55);
		testInt.add(20);
		testInt.add(7);

		testDouble.add(0.1);
		testDouble.add(7.19);
		testDouble.add(13.13);
		testDouble.add(0.25);
		testDouble.add(51.15);
		testDouble.add(30.11);

		testString.add("Жираф");
		testString.add("Слон");
		testString.add("Обезьяна");
		testString.add("Тигр");
		testString.add("Носорог");
		testString.add("Бегемот");
		testString.add("Зебра");

		System.out.println("2) взятие по индексу get(int i)");
		System.out.println(testInt.get(2));
		System.out.println(testDouble.get(4));
		System.out.println(testString.get(3));
		System.out.println();

		System.out.println("3) взятие последнего элемента getLast()");
		System.out.println(testInt.getLast());
		System.out.println(testDouble.getLast());
		System.out.println(testString.getLast());
		System.out.println();

		System.out.println("4) взятие первого элемента getFirst()");
		System.out.println(testInt.getFirst());
		System.out.println(testDouble.getFirst());
		System.out.println(testString.getFirst());
		System.out.println();

		System.out.println("5) вывод размера массива");
		System.out.println(testInt.lengthArray());
		System.out.println(testDouble.lengthArray());
		System.out.println(testString.lengthArray());
		System.out.println();

		System.out.println("6) вывод индекса последнего заполненого элемента");
		System.out.println(testInt.indexLastFilledElement());
		System.out.println(testDouble.indexLastFilledElement());
		System.out.println(testString.indexLastFilledElement());
		System.out.println();

		System.out.println("7) удаление элемента по индексу remove(int i)");
		testInt.removeInd(2);
		for (int i = 0; i < testInt.size(); i++) {
			System.out.print(testInt.get(i) + " ");
		}
		System.out.println();

		testDouble.removeInd(2);
		for (int i = 0; i < testDouble.size(); i++) {
			System.out.print(testDouble.get(i) + " ");
		}
		System.out.println();

		testString.removeInd(2);
		for (int i = 0; i < testString.size(); i++) {
			System.out.print(testString.get(i) + " ");
		}
		System.out.println();
		System.out.println();

		System.out.println("8) удаление элемента по значению remove(T obj)");
		testInt.removeObj(20);
		for (int i = 0; i < testInt.size(); i++) {
			System.out.print(testInt.get(i) + " ");
		}
		System.out.println();

		testDouble.removeObj(51.15);
		for (int i = 0; i < testDouble.size(); i++) {
			System.out.print(testDouble.get(i) + " ");
		}
		System.out.println();

		testString.removeObj("Жираф");
		for (int i = 0; i < testString.size(); i++) {
			System.out.print(testString.get(i) + " ");
		}
		System.out.println();
	}
}
