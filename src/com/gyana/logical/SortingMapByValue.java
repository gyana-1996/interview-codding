package com.gyana.logical;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/*Write a Java program to sort a given HashMap<String, Integer> by its values in ascending order using a separate comparator class.
\The program should ensure that the order of elements is maintained after sorting.*/

public class SortingMapByValue {
	public static void main(String[] args) {
		Map<String, Integer> unsortMap = new HashMap<>();
		unsortMap.put("z", 10);
		unsortMap.put("b", 5);
		unsortMap.put("a", 6);
		unsortMap.put("c", 20);
		unsortMap.put("d", 1);
		unsortMap.put("e", 7);
		unsortMap.put("y", 8);
		unsortMap.put("n", 99);
		unsortMap.put("g", 50);
		unsortMap.put("m", 2);
		unsortMap.put("f", 9);

		// Sorting by value in ascending order
		Map<String, Integer> sortedMap = unsortMap.entrySet().stream().sorted(Map.Entry.comparingByValue()) // Sorting
																											// by value
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue,
						LinkedHashMap::new)); // Preserve order

		// Printing the sorted map
		sortedMap.forEach((key, value) -> System.out.println(key + "=" + value));
	}
}
