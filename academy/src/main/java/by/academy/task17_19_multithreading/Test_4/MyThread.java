package by.academy.task17_19_multithreading.Test_4;

public class MyThread extends Thread {
	StringBuilder sb;

	public MyThread() {
		super();
	}

	public MyThread(StringBuilder sb) {
		super();
		this.sb = sb;
	}

	@Override
	public void run() {
		synchronized (sb) {
			for (int i = 0; i < 100; i++) {
				System.out.print(sb);
			}

			char ch = sb.charAt(0);
			sb.setCharAt(0, ++ch);
			System.out.println();
		}
	}
}