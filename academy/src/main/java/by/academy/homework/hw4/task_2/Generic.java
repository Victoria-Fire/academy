package by.academy.homework.hw4.task_2;

import java.util.Arrays;

public class Generic<T> {
	private T[] array;
	private int size;

	@SuppressWarnings("unchecked")
	public Generic() {
		super();
		this.array = (T[]) new Object[16];
	}

	@SuppressWarnings("unchecked")
	public Generic(int capacity) {
		super();
		this.array = (T[]) new Object[capacity];
	}

	public T[] getArray() {
		return array;
	}

	public void setArray(T[] array) {
		this.array = array;
	}

	public int size() {
		return size;
	}

	public void add(T obj) {
		if (size + 1 >= array.length) {
			array = Arrays.copyOf(array, array.length * 2 + 1);
		}
		array[size++] = obj;
	}

	public T get(int i) {
		if (i < 0 || i > array.length - 1) {
			System.err.println("Index of bound exception");
			return null;
		}
		return array[i];
	}

	public T getLast() {
		return array[size - 1];
	}

	public T getFirst() {
		return array[0];
	}

	public int lengthArray() {
		return array.length;
	}

	public int indexLastFilledElement() {
		return size;
	}

	public void removeInd(int i) {
		if (i < 0 || i > array.length - 1) {
			System.err.println("Index of bound exception");
			return;
		}
		System.arraycopy(array, i + 1, array, i, size - i);
		array[--size] = null;
	}

	public void removeObj(T obj) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] != null) {
				if (array[i].equals(obj)) {
					removeInd(i);
				}
			}
		}
	}
}
