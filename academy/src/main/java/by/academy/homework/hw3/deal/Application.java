package by.academy.homework.hw3.deal;

import java.text.ParseException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws ParseException {
//		Scanner sc = new Scanner(System.in);
		
		
		int numberOfProducts = 3;
		Product[] products = new Product[numberOfProducts];

	
		products[0] = new Dresses("", "", 2, 3, "");
		products[1] = new Handbags("Проды", "Молоко", 4, 2, "красный");
		products[2] = new Sandals("Проды", "Кетчуп", 3, 4, 39);
		
		
		Console console = new Console();
		System.out.println("<СОЗДАЕМ АККАУНТ ПРОДАВЦА>");
		User seller = new User();
		console.createUsers(seller);
		System.out.println();
		System.out.println("<СОЗДАЕМ АККАУНТ ПОКУПАТЕЛЯ>");
		User buyer = new User();
		console.createUsers(buyer);
		
		Deal deal = new Deal(seller, buyer, products);			
		Info info = new Info();
		info.getInfoUser(buyer);
		deal.dealForBuyer();
		info.getInfoUser(seller);
		deal.dealForSeller();		
		
//		sc.close();

	}

}
