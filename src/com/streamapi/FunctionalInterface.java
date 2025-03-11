package com.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalInterface {

	public static void main(String[] args) {
		
		
		String str="I am a java developer";
		
		String[] listWords = str.split("");
		List<String>  strWord=new ArrayList<>();
		
		for (String s:listWords) {
			strWord.add(s);
		}
		
		strWord.stream().map(x -> {
			StringBuffer strBuff=new StringBuffer(x);
			strBuff.reverse();
			
		}).sorted().collect(Collectors.toList());
		
		
		
		//List<Character> listChars = str.chars().mapToObj(x->(char)x).collect(Collectors.toList());
		
		//listChars.stream().sorted(x->)
	}

}
