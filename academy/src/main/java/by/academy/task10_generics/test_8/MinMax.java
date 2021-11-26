package by.academy.task10_generics.test_8;

public class MinMax<T extends Number> {
	private T[] array;

	public MinMax() {
		super();
	}

	public MinMax(T[] array) {
		super();
		this.array = array;
	}

	public T[] getArray() {
		return array;
	}

	public T minValue() {
		T min = array[0];
		for (T value : array) {
			if (value.doubleValue() < min.doubleValue()) {
				min = value;
			}
		}
		return min;
	}
	
	public T maxValue() {
		T max = array[0];
		for (T value : array) {
			if (value.doubleValue() > max.doubleValue()) {
				max = value;
			}
		}
		return max;
	}
}

//Написать обобщенный класс MinMax, который содержит методы для нахождения минимального и
//максимального элемента массива. Массив является переменной класса. Массив должен передаваться 
//в класс через конструктор.
