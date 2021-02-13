package by.academy.lesson10.classwork;

public class Box<T> {

	private T item;

	public T getItems() {
		return item;
	}

	public void setItems(T item) {
		this.item = item;
	}

	public void someMethod() {
		System.out.println("do some functionality");
	}
}
