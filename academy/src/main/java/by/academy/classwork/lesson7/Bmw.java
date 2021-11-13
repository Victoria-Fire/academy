package by.academy.classwork.lesson7;

public class Bmw extends Car {
	
	public Bmw() {
		super();
	}
	
	public Bmw(int day, double cost) {
		super(day, cost);
		
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bmw [day=");
		builder.append(getDay());
		builder.append(", cost=");
		builder.append(getCost());
		builder.append("]");
		return builder.toString();
	}

}
