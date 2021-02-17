package by.academy.lesson11.generics;

public class CatBox {
	Cat item;

	public CatBox() {
		super();
	}

	public CatBox(Cat item) {
		this.item = item;
	}

	public Cat getItem() {
		return item;
	}

	public void setItem(Cat item) {
		this.item = item;
	}

}
