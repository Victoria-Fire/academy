package by.academy.homework.hw5;

import java.util.Iterator;

public class MyIterator<T> implements Iterator<T> {
	private T[][] array;
	private int i;
	private int j;

	public MyIterator() {
		super();
	}

	public MyIterator(T[][] array) {
		super();
		this.array = array;
	}

	@Override
	public boolean hasNext() {
		return ((i < array.length) && (j < array[i].length));
	}

	@Override
	public T next() {
		T result = array[i][j++];
		if (j >= array[i].length) {
			i++;
			j = 0;
		}
		return result;
	}
}
