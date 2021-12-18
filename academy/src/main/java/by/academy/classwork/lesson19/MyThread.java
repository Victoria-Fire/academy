package by.academy.classwork.lesson19;

public class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 1; i < 26; i++) {
			try {
				Thread.sleep(1);
				System.out.println("<Второй поток:> " + i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
