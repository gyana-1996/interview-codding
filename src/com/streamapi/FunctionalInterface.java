package com.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalInterface {

	public static void main(String[] args) {
		
		

		String str="I am a java developer";
		List<String> strWords=Arrays.asList(str.split(" "));
		
		List<String> sortedWords = strWords.stream().sorted().collect(Collectors.toList());
		
		List<String>  reversedWords =sortedWords.stream().map(x-> new StringBuffer(x).reverse().toString()).collect(Collectors.toList());
		
		String results=String.join(" ", reversedWords);
		System.out.println(results.toString());

		
//		
//		String str="I am a java developer";
//		
//		String[] listWords = str.split("");
//		List<String>  strWord=new ArrayList<>();
//		
//		for (String s:listWords) {
//			strWord.add(s);
//		}
//		
//		strWord.stream().map(x -> {
//			StringBuffer strBuff=new StringBuffer(x);
//			strBuff.reverse();
//			
//		}).sorted().collect(Collectors.toList());
		
		
	}

}
