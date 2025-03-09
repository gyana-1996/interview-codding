package com.javainterview;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CoddingTestTechM {

	public static void main(String[] args) {

//		String str = "abac";
//		List<Character> trackList;
//		List<Character> arrayList = str.chars().mapToObj(x -> (char) x).collect(Collectors.toList());
//
//		Map<Character, Long> newObj = arrayList.stream()
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//		List<Characters> hbdj = newObj.entrySet().stream().filter(x ->
//
//		{
//
//			for (Character ch : arrayList) {
//
//				if (ch.equals(x.getKey().charValue()) && x.getValue() == 1) {
//
//					trackList.add(x.getKey().charValue());
//
//				}
//			}
//		}).collect(Collectors.toList());
//

		String input = "swiss";

		Character firstNonRepeating = input.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey).findFirst()
				.orElse(null);

		System.out.println("First non-repeating character: " + firstNonRepeating);

	}
}
