package by.academy.lesson14;

public class StackOverflowErrorExample {
	public static void main(String[] args) {
		System.out.println("1");
		main(args);
	}
}