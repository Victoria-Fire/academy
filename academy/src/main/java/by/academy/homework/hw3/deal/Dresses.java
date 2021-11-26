package by.academy.homework.hw3.deal;

public class Dresses extends Product {
	private String material;
	private String color;
	private String size;

	public Dresses() {
		super();
	}

	public Dresses(String type, String name, String material, String color, String size, double price, int quantity) {
		super(type, name, price, quantity);
		this.material = material;
		this.color = color;
		this.size = size;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	protected double getDiscount() {
		if (material == "хлопок") {
			return 0.9;
		}
		return 1;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(type + " ");
		builder.append("\"" + name + "\":");
		builder.append(" материал - " + material);
		builder.append(", цвет - " + color);
		builder.append(", размер - " + size);
		builder.append(", цена - " + price + " $");
		builder.append(", количество - " + quantity + " шт.");
		return builder.toString();
	}
}