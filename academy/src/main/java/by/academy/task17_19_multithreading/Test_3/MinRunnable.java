package by.academy.task17_19_multithreading.Test_3;

import java.util.Arrays;

public class MinRunnable implements Runnable {

	private int[] array;

	public MinRunnable() {
		super();
	}

	public MinRunnable(int[] array) {
		super();
		this.array = array;
	}

	@Override
	public void run() {
		System.out.println("Минимальное значение - " + Arrays.stream(array).min());
	}
}
