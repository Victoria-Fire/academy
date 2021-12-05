package by.academy.homework.hw4.task_3;

public class MyArray<T> implements MyIterable<T> {
	private T[] array;
	private int index;

	public MyArray() {
		super();
	}

	public MyArray(T[] array) {
		super();
		this.array = array;
	}
	
	@Override
	public MyIterator<T> myIterator() {
		return new ArrayIterator();
	}
	
	class ArrayIterator implements MyIterator<T> {

		@Override
		public boolean hasNext() {
			if (index < array.length) {
				return true;
			}
			return false;
		}

		@Override
		public T next() {
			return array[index++];
		}		
	}	
}
