package com.gyana.logical;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamAPI {

	public static void main(String[] args) {

		String str = "I am a java developer";

		Map<Character, Long> mapObs = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		mapObs.entrySet().forEach(x -> System.out.println(x));

		// Find Duplicates from ArrayList

		List<Integer> listNo = Arrays.asList(5, 10, 4, 5, 22, 35, 99, 10);

		Set<Integer> uniqueList = new HashSet<>();

		listNo.stream().filter(x -> !uniqueList.add(x)).collect(Collectors.toSet()).forEach(System.out::println);

	}

}
