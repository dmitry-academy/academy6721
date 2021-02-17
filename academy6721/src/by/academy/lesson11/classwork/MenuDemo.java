package by.academy.lesson11.classwork;

import java.util.Scanner;

public class MenuDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		manageDeal(sc);
		sc.close();
	}

	private static void manageDeal(Scanner sc) {
		printMenu();
		String command = sc.next();

		enterProduct: {
			while (!"Exit".equals(command)) {
				switch (command) {
				case "1":
					System.out.println("View product list");
					break;
				case "2":
					System.out.println("Insert product");
					break;
				case "3":
					System.out.println("Remove product");
					break;
				case "4":
					System.out.println("View product by index");
					break;
				case "5":
					System.out.println("Execute deal");
					break;
				case "6":
					System.out.println("Print bill");
					break;
				case "Exit":
					System.out.println("Выходим из программы!");
					break enterProduct;
				default:
					System.out.println("Invalid input, please enter command again:");
				}
				printMenu();
				command = sc.next();
			}
		}
	}

	private static void printMenu() {
		System.out.println("Enter command: ");
		System.out.println("1. View product list");
		System.out.println("2. Insert product");
		System.out.println("3. Remove product");
		System.out.println("4. View product by index");
		System.out.println("5. Execute deal");
		System.out.println("6. Print bill");
		System.out.println("Exit. Exit");
	}

}
