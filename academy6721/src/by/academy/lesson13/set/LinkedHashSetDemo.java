package by.academy.lesson13.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		Set<String> linkedHashSet = new LinkedHashSet<>();

		linkedHashSet.add("Бета");
		linkedHashSet.add("Aльфa");
		linkedHashSet.add("Этa");
		linkedHashSet.add("Гaммa");
		linkedHashSet.add("Эпсилон");
		linkedHashSet.add("Oмeгa");
		linkedHashSet.add("Oмeгa");
		linkedHashSet.add("Oмeгa");
		linkedHashSet.add("Oмeгa");


		System.out.println(linkedHashSet);
	}
}