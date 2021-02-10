package by.academy.lesson7.oop.classwork.deal;

import by.academy.lesson7.oop.deal.Meat;
import by.academy.lesson7.oop.deal.Milk;
import by.academy.lesson7.oop.deal.Vine;

public class ApplicationDemo {
	public static void main(String... args) {
		Person seller = new Person("Vasya", 200.00);
		Person buyer = new Person("Petya", 300.00);

		Deal deal = new Deal("21-11-2020", seller, buyer);

		deal.addProduct(new Meat(15.00, "1", "Academy Bel", 7));
		deal.addProduct(new Vine(7.00, "2", "peach", 7));
		deal.addProduct(new Milk(3.00, "3", "banana", 15, "black"));

		deal.deal();
	}
}
