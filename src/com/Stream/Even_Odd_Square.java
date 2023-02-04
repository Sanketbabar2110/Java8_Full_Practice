package com.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Even_Odd_Square {
	public static void main(String[] args) {
	
 		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
 		
 		System.out.println(evenNumbers(list));
 		System.out.println(oddNumbers(list));
 		System.out.println(square(list));
 		System.out.println(total(list));
 		System.out.println(multiply(list));
	}

	//Create a method to filter even numbers from List
	public static List<Integer> evenNumbers(List<Integer> list) {
		return list.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
	}
	
	//Create a method to filter even numbers from List
	public static List<Integer> oddNumbers(List<Integer> list) {
		return list.stream().filter(num -> !(num % 2 == 0)).collect(Collectors.toList());
	}
	
	//Create a method to calculate Square of elements of list
	public static List<Integer> square(List<Integer> list) {
		return list.stream().map(num -> num*num).collect(Collectors.toList());
	}
	
	public static int total(List<Integer> list) {
		return list.stream().reduce(0, Integer::sum);
	}
	
	public static Integer multiply(List<Integer> list) {
		return list.stream().reduce(1, (a, b) -> a*b);		
	}
}
