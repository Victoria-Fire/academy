package by.academy.homework.hw3.deal;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Console console = new Console();
		System.out.println("<СОЗДАЕМ АККАУНТ ПРОДАВЦА>");
		User seller = new User();
		console.createUsers(seller);
		System.out.println();
		System.out.println("<СОЗДАЕМ АККАУНТ ПОКУПАТЕЛЯ>");
		User buyer = new User();
		console.createUsers(buyer);

		Product[] products = new Product[10];
		Basket basket = new Basket(1);

		products[0] = new Dresses("Платье", "Футляр", "хлопок", "красный", "L", 25.33, 50);
		products[1] = new Dresses("Платье", "Рубашка", "хлопок", "желтый", "M", 33.50, 50);
		products[2] = new Dresses("Платье", "Туника", "нейлон", "белый", "L", 23.66, 50);
		products[3] = new Dresses("Платье", "Шемиз", "нейлон", "черный", "S", 40.75, 50);
		products[4] = new Sandals("Сандали", "Римлянки", "кожа", "белый", 41, 17.84, 50);
		products[5] = new Sandals("Сандали", "Вьетнамки", "хлопок", "черный", 37, 15.60, 50);
		products[6] = new Sandals("Сандали", "Босоножки", "лен", "голубой", 39, 19.95, 50);
		products[7] = new Handbags("Сумка", "Шоппер", "черный", 10.48, 50);
		products[8] = new Handbags("Сумка", "Хобо", "красный", 15.35, 50);
		products[9] = new Handbags("Сумка", "Клатч", "розовый", 12.80, 50);

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
				System.out.println();
				System.out.println("<ПРОСМОТР ТОВАРА>");
				deal.getProductsList();
				System.out.println();
				break;
			case 2:
				System.out.println();
				System.out.println("<ДОБАВИТЬ В КОРЗИНУ>");
				do {
					System.out.println("Введите номер товара, который хотите приобрести:");
					System.out.println("0 => Вернуться в меню");
					int number = sc.nextInt();
					if (number == 0) {
						System.out.println();
						break;
					}
					if (number <= products.length) {
						System.out.println("Введите количество:");
						int bq = sc.nextInt();
						if ((products[number - 1].getQuantity() - bq) >= 0) {
							basket.add(products[number - 1]);
							basket.basketQuantity(basket.size() - 1, bq);
							deal.changeQuantityProductsMinus(products[number - 1], bq);
						} else {
							System.out.println("У продавца нет такого количества товара :(");
							System.out.println("На складе осталось - " + products[number - 1].getQuantity() + " шт.");
							System.out.println("Введите количество товара еще раз.");
							System.out.println();
						}
					} else {
						System.out.println("Нет такого номера... Повторите попытку");
					}
				} while (true);
				break;
			case 3:
				System.out.println();
				System.out.println("<ПРОСМОТР КОРЗИНЫ>");
				deal.getBasketList();
				System.out.println();
				break;
			case 4:
				System.out.println();
				System.out.println("<УДАЛЕНИЕ ИЗ КОРЗИНЫ>");
				do {
					deal.getBasketList();
					System.out.println("Введите номер товара, который хотите удалить:");
					System.out.println("0 => Вернуться в меню");
					int number = sc.nextInt();
					if (number == 0) {
						System.out.println();
						break;
					}
					if (number <= basket.size()) {
						deal.changeQuantityProductsPlus(number);
						basket.remove(number - 1);
					} else {
						System.out.println("Нет такого номера... Повторите попытку");
						System.out.println();
					}
				} while (true);
				break;
			case 5:
				System.out.println();
				System.out.println("<ОПЛАТА ТОВАРА>");
				if (deal.checkDeal()) {
					System.out.println();
					System.out.println("Инфо для покупателя:");
					info.getInfoUser(buyer);
					deal.paymentConfirmationForBuyer();
					System.out.println();
					System.out.println("Инфо для продавца:");
					info.getInfoUser(seller);
					deal.paymentConfirmationForSeller();
				} else {
					System.out.println("Ваша корзина пуста. Оплата не будет произведена.");
					System.out.println("Добавьте товар в вашу корзину.");
					System.out.println();
					break;
				}
				sc.close();
				return;
			default:
				System.out.println("Такой менюшки у нас нет.");
				System.out.println();
			}
		} while (true);
	}
}
