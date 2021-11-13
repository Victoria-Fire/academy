package by.academy.classwork.lesson7;

public class Car {
	private int day;
	private double cost;

	public Car() {
	}

	public Car(int day, double cost) {
		this.day = day;
		this.cost = cost;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void carRental() {
		System.out.println("Cумма аренды на " + day + " равна: " + (day * cost) + " $");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Car [day=");
		builder.append(day);
		builder.append(", cost=");
		builder.append(cost);
		builder.append("]");
		return builder.toString();
	}

}
