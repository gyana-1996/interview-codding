package com.javainterview;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Given a list of decimal numbers in string format,
the task is to convert them into BigDecimal objects, sort them in ascending order,
and return the sorted list in string format.*/

public class CapgeminiL2 {
	public static void main(String[] args) {

		List<String> listDecimals = Arrays.asList("2.2", "1.1", "3.3", "5.5");

		// Convert Strings to BigDecimal
		List<BigDecimal> listData = listDecimals.stream().map(BigDecimal::new).collect(Collectors.toList());

//		List<String> convertedAfterSorting = listData.stream().sorted().map(x -> x.toString()).collect(Collectors.toList());

		// Sort and convert back to String
		List<String> convertedAfterSorting = listData.stream().sorted().map(BigDecimal::toString)
				.collect(Collectors.toList());

		// Print the sorted list
		System.out.println(convertedAfterSorting);

	}

}
