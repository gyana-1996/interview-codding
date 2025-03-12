package com.javainterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CapgeminiL1 {
	public static void main(String[] args) {

		/*
		 * Write a Java program that takes a list of numeric strings, converts them into
		 * integers, squares each integer, and prints the squared values using Java
		 * Streams and Lambda expressions.
		 */
		List<String> strings = Arrays.asList("12", "8", "13", "24", "15");

		List<Integer> listInts = strings.stream().map(x -> Integer.parseInt(x)).collect(Collectors.toList());

		/*
		 * Or
		 * List<Integer> listInts =
		 * strings.stream().map(Integer::parseInt).collect(Collectors.toList());
		 */

		listInts.stream().map(x -> x * x).collect(Collectors.toList()).forEach(y -> System.out.println(y));

	}

}
