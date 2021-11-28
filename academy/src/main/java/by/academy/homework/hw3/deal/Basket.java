package by.academy.homework.hw3.deal;

public class Basket {
	private Product[] basket;
	private int size;

	public Basket() {
		super();
		this.basket = new Product[10];
	}

	public Basket(int capacity) {
		super();
		this.basket = new Product[capacity];
	}

	public Product[] getBasket() {
		return basket;
	}

	public void setBasket(Product[] basket) {
		this.basket = basket;
	}

	public int size() {
		return size;
	}

	public Product get(int index) {
		if (index < 0 || index > basket.length - 1) {
			System.err.println("Index of bound exception");
			return null;
		}
		return basket[index];
	}

	public void remove(int index) {
		if (index < 0 || index > basket.length - 1) {
			System.err.println("Index of bound exception");
			return;
		}
		if (basket[0] == null) {
			System.out.println("Корзина пуста :(");
			return;
		}
		System.arraycopy(basket, index + 1, basket, index, size - index);
		basket[--size] = null;
	}

	public void add(Product baskett) {
		if (size + 1 >= basket.length) {
			grow();
		}
		try {
			basket[size++] = baskett.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

	public void basketQuantity(int index, int quantity) {
		basket[index].setQuantity(quantity);
	}

	private void grow() {
		Product[] newBasket = new Product[basket.length * 2 + 1];
		System.arraycopy(basket, 0, newBasket, 0, basket.length);
		basket = newBasket;
	}
}
