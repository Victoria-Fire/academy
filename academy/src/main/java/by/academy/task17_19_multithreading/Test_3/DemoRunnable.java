package by.academy.task17_19_multithreading.Test_3;

public class DemoRunnable {

	public static void main(String[] args) {
		int[] array = { 5, 7, 2, 14, 89, 56, 25, 47};

		MinRunnable minRunnable = new MinRunnable(array);
		Thread thread1 = new Thread(minRunnable);
		thread1.start();
		try {
			thread1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		MaxRunnable maxRunnable = new MaxRunnable(array);
		Thread thread2 = new Thread(maxRunnable);
		thread2.start();
		try {
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		AverageRunnable averageRunnable = new AverageRunnable(array);
		Thread thread3 = new Thread(averageRunnable);
		thread3.start();
		try {
			thread3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("minRunnable закончил выполнение в главном потоке: " + thread1.getState());
		System.out.println("maxRunnable закончил выполнение в главном потоке: " + thread2.getState());
		System.out.println("averageRunnable закончил выполнение в главном потоке: " + thread3.getState());
		System.out.println("===========================");
		System.out.println("Привет из Главного потока");
	}
}
