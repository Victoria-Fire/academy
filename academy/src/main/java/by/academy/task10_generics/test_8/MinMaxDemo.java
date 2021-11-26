package by.academy.task10_generics.test_8;

public class MinMaxDemo {

	public static void main(String[] args) {
		Integer[] arrayInt = {2, 5, 25, 13, 17, 44};
		MinMax<Integer> array = new MinMax<>(arrayInt); 
		System.out.println(array.maxValue());
		System.out.println(array.minValue());

	}

}
