package by.academy.lesson20.threads;

public class ThreadExtendsDemo {

	public static void main(String[] args) throws InterruptedException {

		ExtendedThread thread = new ExtendedThread();
		thread.start();

		System.out.println("Main thread finished...");
	}
}
