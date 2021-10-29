package by.academy.classwork.lesson3;

public class Test {

	public static void main(String[] args) {
		Clothes clothes1 = new Clothes("Рубашка", "мужской", "XL", "белый", 5, "Минск");
		clothes1.info();

		Clothes clothes2 = new Clothes("Брюки", "мужской", "XXL", "черный", 1, "Москва");
		clothes2.info();
		
		Clothes clothes3 = new Clothes("Юбка", "женский", "M", "красный", 50, "Прага");
		clothes3.info();

	}

}
