package by.academy.lesson9.enums;

public class CoffeeSizeDemo3 {
	public static void main(String[] args) {

		CoffeeSize coffeeSize = CoffeeSize.valueOf("BIG");
		System.out.println("Переменная coffeeSize содержит " + coffeeSize);
	}
}