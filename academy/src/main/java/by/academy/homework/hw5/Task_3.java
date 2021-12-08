package by.academy.homework.hw5;

public class Task_3 {

	public static void main(String[] args) {
		String[][] str = { { "Жираф", "Носорог", "Слон", "Зебра", "Бегемот" }, { "Акула", "Пиранья", "Щука", "Окунь" },
				{ "Пингвин", "Тюлень", "Морж" } };
		Integer[][] number = { { 3, 7, 89 }, { 344, 1, 13, 49 }, { 75, 123 }, { 44, 37, 15, 25, 256, 4 } };

		MyIterator<String> iterator1 = new MyIterator<>(str);
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}

		System.out.println();

		MyIterator<Integer> iterator2 = new MyIterator<>(number);
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
	}
}
