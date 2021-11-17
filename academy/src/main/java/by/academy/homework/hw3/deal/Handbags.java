package by.academy.homework.hw3.deal;

public class Handbags extends Product {
	private String color;
	
	public Handbags() {
		super();
	}

	public Handbags(String type, String name, double price, int quantity, String color) {
		super("Аксессуар", "Сумка", 2.70, quantity);
		this.color = color;
	}

	@Override
	protected double getDiscount() {
		if(color == "красный") {
			return 0.7;
		}
		return 1;
	}

	
}