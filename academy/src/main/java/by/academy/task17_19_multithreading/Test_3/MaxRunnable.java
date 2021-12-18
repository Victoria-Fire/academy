package by.academy.task17_19_multithreading.Test_3;

import java.util.Arrays;

public class MaxRunnable implements Runnable {

	private int[] array;

	public MaxRunnable() {
		super();
	}

	public MaxRunnable(int[] array) {
		super();
		this.array = array;
	}

	@Override
	public void run() {
		System.out.println("Максимальное значение - " + Arrays.stream(array).max());
	}
}
