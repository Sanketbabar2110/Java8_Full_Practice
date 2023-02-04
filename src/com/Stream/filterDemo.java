package com.Stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class filterDemo {
	public static void main(String[] args) {

		//Find String which is Start with 'S'
		String[] str = { "Sanket", "Sheetal", "Prathamesh", "Mahesh", "Sushant", "Sandeep" };
		Arrays.stream(str).filter(x -> x.startsWith("S")).forEach(System.out::println);
		
		System.out.println();
		
		//Given a list of integers, find out all the numbers starting with 1
		Integer[] in = {10, 28, 18, 30, 112, 89, 67, 111, 38};
		Arrays.stream(in).map(x -> x.toString()).filter(x -> x.startsWith("1")).forEach(System.out::println);
		
		System.out.println();
		
		//How to find duplicate elements in a given integers list in java
		List<Integer> list = Arrays.asList(8, 10, 15, 20, 15, 8, 30, 20, 25, 32);
		HashSet<Integer> set = new HashSet<>();
		list.stream().filter(n -> !set.add(n)).forEach(System.out::println);
		
		System.out.println();
		
		// Given a list of integers, find the total number of elements present in the list
		long count = list.stream().count();
		System.out.println(count);
		
		System.out.println();
		
		//Given a list of integers, find the maximum value element present in it
		int I = list.stream().max(Integer::compare).get();
		System.out.println(I);
		
		
	}

}
