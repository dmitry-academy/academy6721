package by.academy.lesson10.enums;

public class CoffeeSizeDemo3 {
	public static void main(String[] args) {

		CoffeeSize coffeeSize = CoffeeSize.valueOf("BIG");
		System.out.println("Переменная coffeeSize содержит " + coffeeSize);
	}
}