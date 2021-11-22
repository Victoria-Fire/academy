package by.academy.homework.hw3.deal;

public abstract class Product {
	protected String type;
	protected String name;
	protected double price;
	protected int quantity;

	public Product() {
		super();
	}

	public Product(String type, String name, double price, int quantity) {
		super();
		this.type = type;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	protected double getProductsPrice() {
		return price * quantity * getDiscount();
	}

	protected abstract double getDiscount();

	protected String getType() {
		return type;
	}

	protected void setType(String type) {
		this.type = type;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected double getPrice() {
		return price;
	}

	protected void setPrice(double price) {
		this.price = price;
	}

	protected int getQuantity() {
		return quantity;
	}

	protected void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}