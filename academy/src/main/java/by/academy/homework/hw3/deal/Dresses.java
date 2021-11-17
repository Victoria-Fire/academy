package by.academy.homework.hw3.deal;

public class Dresses extends Product{
	private String fabric;
	
	public Dresses() {
		super();
	}

	public Dresses(String type, String name, double price, int quantity, String fabric) {
		super("Одежда", "Платье", 5.00, quantity);
		this.fabric = fabric;
	}

	@Override
	protected double getDiscount() {
		if(fabric == "cotton") {
			return 0.9;
		}
		return 1;
	}
	
	
}
