package by.academy.task17_19_multithreading.Test_3;

import java.util.Arrays;

public class AverageRunnable implements Runnable {

	private int[] array;

	public AverageRunnable() {
		super();
	}

	public AverageRunnable(int[] array) {
		super();
		this.array = array;
	}

	@Override
	public void run() {
		System.out.println("Cреднее значение - " + Arrays.stream(array).average());
	}
}
