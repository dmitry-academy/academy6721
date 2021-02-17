package by.academy.lesson11.generics;

public class Box<T> {
	T item;

	public Box() {
		super();
	}

	public Box(T item) {
		this.item = item;
	}

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

}
