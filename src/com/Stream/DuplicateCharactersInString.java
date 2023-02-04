package com.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharactersInString {
	public static void main(String[] args) {

		System.out.println(countDuplicate("India is my Country!!!"));
	}

	public static Map<Character, Long> countDuplicate(String str){
		
		char[] ch = str.toCharArray();

		List<Character> list = new ArrayList<>();
		for(char c : ch) {
			list.add(c);
		}
		return list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	}
}
