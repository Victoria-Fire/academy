package by.academy.classwork.lesson7;

public class Application {

	public static void main(String[] args) {
		Car c1 = new Car(20, 35.5);
		System.out.println(c1.getDay());
		System.out.println(c1.getCost());
		System.out.println(c1);
		c1.carRental();
		
		Bmw b1 = new Bmw(17, 40);
		System.out.println(b1.getDay());
		System.out.println(b1.getCost());
		System.out.println(b1);
		b1.carRental();
		
		Car m1 = new Mersedes(3, 77.4);
		System.out.println(m1.getDay());
		System.out.println(m1.getCost());
		System.out.println(m1);
		m1.carRental();

	}

}
