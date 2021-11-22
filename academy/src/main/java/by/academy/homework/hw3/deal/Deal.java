package by.academy.homework.hw3.deal;

import java.time.LocalDate;

public class Deal {
	private User seller;
	private User buyer;
	private Product[] products;
	private Product[] basket;
	private LocalDate deadline = LocalDate.now();
	private int size;

	public Deal() {
		super();
	}

	public Deal(User seller, User buyer, Product[] products, Product[] basket) {
		super();
		this.seller = seller;
		this.buyer = buyer;
		this.products = products;
		this.basket = basket;
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

	public Product[] getBasket() {
		return basket;
	}

	public void setBasket(Product[] basket) {
		this.basket = basket;
	}

	public void getProductsList() {
		for (int i = 0; i < products.length; i++) {
			System.out.println((i + 1) + " => " + products[i]);
		}
	}

	public void getBasketList() {
		if (basket[0] == null) {
			System.out.println("Корзина пуста :(");
			return;
		}
		for (int i = 0; i < basket.length; i++) {
			if (basket[i] != null) {
				System.out.printf(
						(i + 1) + " => " + basket[i].getType() + " \"" + basket[i].getName() + "\": "
								+ basket[i].getQuantity() + " шт." + " x " + basket[i].getPrice() + "$" + " = %.2f$ \n",
						basket[i].getProductsPrice());
			}
		}
		System.out.printf("К оплате: %.2f$ \n", getFullPrice());
	}

	public void remove(int index) {
		if (index < 0 || index > basket.length - 1) {
			System.out.println("Index of bound exception");
			return;
		}
		if (basket[0] == null) {
			System.out.println("Корзина пуста :(");
			return;
		}
		System.arraycopy(basket, index + 1, basket, index, size - index);
		basket[--size] = null;
	}

	public void add(Product products) {
		if (size + 1 >= basket.length) {
			grow();
		}
		basket[size++] = products;
	}

	private void grow() {
		Product[] newBasket = new Product[basket.length * 2 + 1];
		System.arraycopy(basket, 0, newBasket, 0, basket.length);
		basket = newBasket;
	}

	public double getFullPrice() {
		double sum = 0;
		for (int i = 0; i < basket.length; i++) {
			if (basket[i] != null) {
				sum += basket[i].getProductsPrice();
			}
		}
		return sum;
	}

	public void printBill() {
		System.out.println("xXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXx");
		for (int i = 0; i < basket.length; i++) {
			if (basket[i] != null) {
				System.out.printf(basket[i].getType() + " \"" + basket[i].getName() + "\": " + basket[i].getQuantity()
						+ " шт." + " x " + basket[i].getPrice() + "$" + " = %.2f$ \n", basket[i].getProductsPrice());
			}
		}
		System.out.println("---------------------------------------");
		System.out.printf("Итого: %.2f$ \n", getFullPrice());
		System.out.println("xXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXx");
	}

	public void paymentConfirmationForBuyer() {
		if ((buyer.getMoney() - getFullPrice()) > 0) {
			dealForBuyer();
		} else {
			System.out.println("У вас недостаточно денег! Пополните счет...");
		}
	}

	public void paymentConfirmationForSeller() {
		if ((buyer.getMoney() - getFullPrice()) > 0) {
			dealForSeller();
		} else {
			System.out.println("Платеж не прошел! У покупателя недостаточно денег.");
		}
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
		System.out.printf("Ваш баланс: %.2f$ \n", (buyer.getMoney() - getFullPrice()));
		System.out.println("xXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXx");
	}

	public void dealForSeller() {
		System.out.println(deadline);
		System.out.printf("Вам зачислено:  %.2f$ \n", getFullPrice());
		System.out.printf("Ваш баланс: %.2f$ \n", (seller.getMoney() + getFullPrice()));
		System.out.println("xXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXxXx");
	}
}