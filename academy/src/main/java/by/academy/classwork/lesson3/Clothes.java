package by.academy.classwork.lesson3;

public class Clothes {
	String type;
	String gender;
	String size;
	String color;
	int count;
	String deliveryAddres;
	
	public Clothes(String type, String gender, String size, String color, int count, String deliveryAddres) {
		this.type = type;
		this.gender = gender;
		this.size = size;
		this.color = color;
		this.count = count;
		this.deliveryAddres = deliveryAddres;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getDeliveryAddres() {
		return deliveryAddres;
	}

	public void setDeliveryAddres(String deliveryAddres) {
		this.deliveryAddres = deliveryAddres;
	}
	
	public void info() {
		System.out.println("Ваш заказ оформлен.");
		System.out.println("Вы выбрали: "+ type + ". Цвет: " + color + ". Количество: " + count + " шт." );
		System.out.println("Адрес доставки: " + deliveryAddres + ". Через 3 дня ваш заказ будет у вас!");
		System.out.println();
		
	}

}
