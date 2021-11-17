package by.academy.homework.hw3.deal;

public class Sandals extends Product {
	private int size;

	public Sandals() {
		super();
	}

	public Sandals(String type, String name, double price, int quantity, int size) {
		super("Обувь", "Сандалии", 6.35, quantity);
		this.size = size;
	}

	@Override
	protected double getDiscount() {
		if (size >= 40) {
			return 0.8;
		}
		return 1;
	}

}