package com.Stream;

import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

public class ForEachDemo {
	public static void main(String[] args) {
	
		HashSet<String> set = new HashSet<>();
		set.add("Sanket");
		set.add("Prathamesh");
		set.add("Kiran");
		set.add("Mahesh");
		set.add("Omkar");
		set.add("Shubham");
		set.add("Vighnesh");
		set.add("Rohit");

		System.out.println("____________Demo on collection object_____________");
		set.forEach((t) -> System.out.println(t.toLowerCase()));
		//forEach() method of Iterable interface accepts ConsumerInterface object
		
		
		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
		
		map.put(1, "sanket");
		map.put(2, "prathamesh");
		map.put(3, "mahesh");
		map.put(4, "kiran");
		map.put(5, "omkar");
		map.put(6, "shubham");
		map.put(7, "vighnesh");
		map.put(8, "rohit");
		
		System.out.println("____________Demo on Map object_____________");
		map.forEach((k, v) -> System.out.println("\t"+k+" : "+v));
		//forEach() method of Map interface accepts BiConsumerInterface object
	}
}
