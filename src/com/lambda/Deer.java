package com.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Deer {

	public static void main(String[] args) {

		// Object of interface by using inline implementation using anonymous inner
		// class

		Jungle j1 = new Jungle() {

			@Override
			public void getJungleNme() {
				System.out.println("Inside Jungle class getJungleName method\n" + name);
			}
		};

		j1.getJungleNme();
		
		System.out.println("________________________________________________________________________");

		// Object of interface using lambda expression

		Jungle j2 = () -> {
			System.out.println("Inside Jungle class getJungleName method");
		};

		j2.getJungleNme();
		System.out.println(j2.name);

		j2.animalCount();
		Jungle.birdsCount();

		System.out.println("________________________________________________________________________");
		
		// using forEach method

		List<Integer> list = new ArrayList<>();

		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}

		list.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer I) {
				System.out.println("\t" + I);
			}
		});

		System.out.println("________________________________________________________________________");
		
		list.forEach((s) -> System.out.println("\t" + s));
		
		System.out.println("________________________________________________________________________");

		// using stream API

		Stream<Integer> s1 = list.stream();
		System.out.println("\t" +s1.count());

		System.out.println("________________________________________________________________________");
		
		Stream<Integer> s2 = list.stream();
		Stream<Integer> s3 = s2.filter(num -> num>=8);
		
		s3.forEach((num) -> System.out.println("\t" +num));
		
		System.out.println("________________________________________________________________________");
		
		Stream<Integer> s4 = list.parallelStream();
		Stream<Integer> s5 = s4.sorted();
		s5.forEach((num) -> System.out.println("\t" +num));
		
		System.out.println("________________________________________________________________________");
		
	}
}
