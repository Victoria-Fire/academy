package by.academy.homework.hw3.deal;

public class Sandals extends Product {
	private String material;
	private String color;
	private int size;

	public Sandals() {
		super();
	}

	public Sandals(String type, String name, String material, String color, int size, double price, int quantity) {
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

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	protected double getDiscount() {
		if (size >= 39) {
			return 0.8;
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