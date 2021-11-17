package by.academy.homework.hw3.deal;

public class Product {
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	protected double getProductsPrice() {
		return price * quantity * getDiscount();
	}

	protected double getDiscount() {
		return 1;
	}

}