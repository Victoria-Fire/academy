package by.academy.classwork.lesson19;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i < 26; i++) {
			try {
				Thread.sleep(1);
				System.out.println("Первый поток: " + i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
