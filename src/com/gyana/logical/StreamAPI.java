package com.gyana.logical;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamAPI {

	public static void main(String[] args) {

		String str = "I am a java developer";

		Map<Character, Long> mapObs = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		mapObs.entrySet().forEach(x -> System.out.println(x));

	}

}
