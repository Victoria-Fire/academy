package by.academy.homework.hw3.deal;

import java.util.Scanner;

public class Application {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		Console console = new Console();
		System.out.println("<СОЗДАЕМ АККАУНТ ПРОДАВЦА>");
		User seller = new User();
		console.createUsers(seller);
		System.out.println();
		System.out.println("<СОЗДАЕМ АККАУНТ ПОКУПАТЕЛЯ>");
		User buyer = new User();
		console.createUsers(buyer);

		int numberOfProducts = 10;
		Product[] products = new Product[numberOfProducts];
		Product[] basket = new Product[25];

		products[0] = new Dresses("Платье", "Футляр", "хлопок", "красный", "L", 25.33, 1);
		products[1] = new Dresses("Платье", "Рубашка", "хлопок", "желтый", "M", 33.50, 1);
		products[2] = new Dresses("Платье", "Туника", "нейлон", "белый", "L", 23.66, 1);
		products[3] = new Dresses("Платье", "Шемиз", "нейлон", "черный", "S", 40.75, 1);
		products[4] = new Sandals("Сандали", "Римлянки", "кожа", "белый", 41, 17.84, 1);
		products[5] = new Sandals("Сандали", "Вьетнамки", "хлопок", "черный", 37, 15.60, 1);
		products[6] = new Sandals("Сандали", "Босоножки", "лен", "голубой", 39, 19.95, 1);
		products[7] = new Handbags("Сумка", "Шоппер", "черный", 10.48, 1);
		products[8] = new Handbags("Сумка", "Хобо", "красный", 15.35, 1);
		products[9] = new Handbags("Сумка", "Клатч", "розовый", 12.80, 1);

		Deal deal = new Deal(seller, buyer, products, basket);
		Info info = new Info();

		System.out.println();
		System.out.println("xXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXx");
		System.out.println("\"ЗИЛ\" Зимой и летом - ходи красиво одетой");
		System.out.println("xXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXx");
		do {
			System.out.println("<МЕНЮ>");
			System.out.println("1 => Просмотр товара");
			System.out.println("2 => Добавить в корзину");
			System.out.println("3 => Просмотр корзины");
			System.out.println("4 => Удаление из корзины");
			System.out.println("5 => Оплата");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("<ПРОСМОТР ТОВАРА>");
				deal.getProductsList();
				break;
			case 2:
				System.out.println("<ДОБАВИТЬ В КОРЗИНУ>");
				do {
					System.out.println("Введите номер товара, который хотите приобрести:");
					System.out.println("0 => Вернуться в меню");
					int number = sc.nextInt();
					if (number == 0) {
						break;
					}
					if (number <= products.length) {
						deal.add(products[number - 1]);
					} else {
						System.out.println("Нет такого номера... Повторите попытку");
					}
				} while (true);
				break;
			case 3:
				System.out.println("<ПРОСМОТР КОРЗИНЫ>");
				deal.getBasketList();
				break;
			case 4:
				System.out.println("<УДАЛЕНИЕ ИЗ КОРЗИНЫ>");
				do {
					deal.getBasketList();
					System.out.println("Введите номер товара, который хотите удалить:");
					System.out.println("0 => Вернуться в меню");
					int number = sc.nextInt();
					if (number == 0) {
						break;
					}
					if (number < basket.length) {
						deal.remove(number - 1);
					} else {
						System.out.println("Нет такого номера... Повторите попытку");
					}
				} while (true);
				break;
			case 5:
				System.out.println("<ОПЛАТА ТОВАРА>");
				System.out.println("Инфо для покупателя:");
				info.getInfoUser(buyer);
				deal.paymentConfirmationForBuyer();
				System.out.println();
				System.out.println("Инфо для продавца:");
				info.getInfoUser(seller);
				deal.paymentConfirmationForSeller();
				return;
			default:
				System.out.println("Такой менюшки у нас нет.");
			}
		} while (true);
//		sc.close();
	}
}