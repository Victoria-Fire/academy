package by.academy.homework.hw3.deal;

public class Handbags extends Product {
	private String color;

	public Handbags() {
		super();
	}

	public Handbags(String type, String name, String color, double price, int quantity) {
		super(type, name, price, quantity);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	protected double getDiscount() {
		if (color == "розовый") {
			return 0.7;
		}
		return 1;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(type + " ");
		builder.append("\"" + name + "\":");
		builder.append(", цвет - " + color);
		builder.append(", цена - " + price + " $");
		return builder.toString();
	}
}