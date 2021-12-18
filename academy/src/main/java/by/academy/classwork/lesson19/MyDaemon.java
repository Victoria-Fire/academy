package by.academy.classwork.lesson19;

public class MyDaemon extends Thread {

	@Override
	public void run() {
		for (;;) {
			try {
				Thread.sleep(5);
				System.out.println("------------------ Я поток демон!");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
