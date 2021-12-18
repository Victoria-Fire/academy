package by.academy.classwork.lesson19;

public class Chicken extends Thread {

	@Override
	public void run() {
		for (int i = 1; i < 13; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("Chicken - " + i);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
}
