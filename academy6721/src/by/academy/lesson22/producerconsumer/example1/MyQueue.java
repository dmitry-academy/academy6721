package by.academy.lesson22.producerconsumer.example1;

public class MyQueue {
	private int n;
	boolean valueSet = false;

	public synchronized int get() {
		while (!valueSet) {
			try {
				Thread.currentThread().sleep(500);
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Пoлyчeнo: " + n);
		valueSet = false;
		notify();
		return n;
	}

	public synchronized void put(int n) throws InterruptedException {
		while (valueSet) {
			Thread.currentThread().sleep(500);
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		valueSet = true;
		this.n = n;
		System.out.println("Oтпpaвлeнo: " + n);
		notify();
	}
}
