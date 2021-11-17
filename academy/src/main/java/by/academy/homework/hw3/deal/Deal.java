package by.academy.homework.hw3.deal;

import java.time.LocalDate;

public class Deal {
	private User seller;
	private User buyer;
	private Product[] products;
	private LocalDate deadline = LocalDate.now();

	public Deal() {
		super();
	}

	public Deal(User seller, User buyer, Product[] products) {
		super();
		this.seller = seller;
		this.buyer = buyer;
		this.products = products;
	}

	public User getSeller() {
		return seller;
	}

	public void setSeller(User seller) {
		this.seller = seller;
	}

	public User getBuyer() {
		return buyer;
	}

	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public void dealForBuyer() {
		System.out.println("Дата пробития чека: " + deadline);
		System.out.println();
		System.out.println("Продавец: " + seller.getName());
		System.out.println("Покупатель: " + buyer.getName());
		System.out.println("---------------------------------------");
		System.out.println("ПРОИЗВЕДЕНА ОПЛАТА");
		System.out.println("---------------------------------------");
		printBill();		
		System.out.println("50% скидка на вторую пиццу \"Додо\" при");
		System.out.println("предъявлении этого чека до " + deadline.plusDays(10));
		System.out.println("---------------------------------------");
		System.out.println("Ваш баланс:  " + (buyer.getMoney() - getFullPrice()) + "$");
		System.out.println("xXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXx");
	}
	
	public void dealForSeller() {
		System.out.println(deadline);
		System.out.println("Вам зачислено: " + getFullPrice() + "$");
		System.out.println("Ваш баланс: " + (seller.getMoney() + getFullPrice()) + "$");
		System.out.println("xXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXx");
	}

	public void printBill() {
		System.out.println("xXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXx");
		for (int i = 0; i < products.length; i++) {
			System.out.println(products[i].getName() + ": " + products[i].getQuantity() + " x " + products[i].getPrice()
					+ " = " + products[i].getProductsPrice() + "$");
		}
		System.out.println("---------------------------------------");
		System.out.printf("Итого: %.2f$ \n", getFullPrice());
		System.out.println("xXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXx");
	}

	public double getFullPrice() {
		double sum = 0;
		for (int i = 0; i < products.length; i++) {
			sum += products[i].getProductsPrice();
		}
		return sum;
	}

}