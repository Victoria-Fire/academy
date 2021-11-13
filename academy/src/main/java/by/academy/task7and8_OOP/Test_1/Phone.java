package by.academy.task7and8_OOP.Test_1;

public class Phone {
	private int number;
	private String model;
	private int weight;
	
	public Phone() {
		
	}
	
	public Phone (int number, String model) {
		this.number = number;
		this.model = model;
	}
	
	public Phone (int number, String model, int weight) {
		this(number, model);
		this.weight = weight;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void receiveCall(String userName) {
		System.out.println("Звонит " + userName);
	}
	
	public void receiveCall(String userName, int userNumber) {
		System.out.println("Звонит " + userName + ", номер " + userNumber);
	}
	
	public void sendMessage(int... number) {
		for(int i = 0; i < number.length; i++) {
		System.out.println(number[i] + " вам поступило сообщение");
		}
	}
	
	public String toString() {
		return "Номер: " + number + ", модель: " + model + ", вес: " + weight + " гр.";
	}

}
