package by.academy.classwork.lesson3;

public class Main {

	public static void main(String[] args) {
		Product product = new Product("Калькулятор", 2021);
		product.info();
		System.out.println(product.getName());
		product.setName("Компьютер");
		System.out.println(product.getName());
		product.info();

	}

}
