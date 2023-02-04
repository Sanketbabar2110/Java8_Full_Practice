package com.lambda;

@FunctionalInterface
public interface Jungle {
	
		String name = "DAJIPUR";
		
	//functional interface has only one abstract method

		void getJungleNme();
	
	//giving body to the method using default keyword
		
		default void animalCount() {
			System.out.println("Inside Jungle Interface animalCount method");
		}
	
	//giving body to the method using static keyword
	
		static void birdsCount() {
			System.out.println("Inside Jungle Interface birdsCount method");
		}
}
