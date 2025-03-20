package com.javainterview;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeSorting {

	public static void main(String[] args) {

		Map<String, Integer> unsortMap = new HashMap<String, Integer>();
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

		// output:- {d=1, m=2, b=5, a=6, e=7, y=8, f=9, z=10, c=20, g=50, n=99}

		Map<String, Integer> sortedMap = unsortMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		System.out.println(sortedMap);
//			 
//			 .collect(Collectors.toMap());
//	 
//	 sortedMap.forEach(System.out::println);

	}

}
