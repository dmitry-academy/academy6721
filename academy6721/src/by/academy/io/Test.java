package by.academy.io;

import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<>();
		String str = "I love to walk with my puppies on MY ENEMIES CORPSES!!";

		for (Character k : str.toCharArray()) {
			if (map.putIfAbsent(k, 1) == null) {
				continue;
			}
			map.put(k, map.get(k) + 1);
		}
		System.out.println(map);
	}
}
