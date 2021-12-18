package by.academy.classwork.lesson19;

public class ThreadDemo {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName());
		System.out.println(mainThread.getPriority());
		System.out.println(mainThread.getId());
		System.out.println(mainThread.isDaemon());
		System.out.println("==============");

		Thread daemonThread = new MyDaemon();
		daemonThread.setDaemon(true);
		daemonThread.start();

		Runnable myRun = new MyRunnable();
		Thread thread1 = new Thread(myRun);

		MyThread thread2 = new MyThread();

		Runnable runnableLambda = () -> {
			for (int i = 1; i < 26; i++) {
				try {
					Thread.sleep(1);
					System.out.println("((Третий поток))" + i);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}
		};
		
		Thread thread3 = new Thread(runnableLambda);
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
