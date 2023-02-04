package com.lambda;

public class Notes {

	/**
	 * 		JAVA 5 FEATURES :
	 * 
	 * 	1.	for-each loop
	 * 
	 * 	2.	Enum ---->	- It is an group of named constants
	 * 					  by default parent is java.lang.Enum
	 * 					- it is used in switch case as a condition  
	 * 
	 * 	3.	Auto-boxing and Auto-Unboxing
	 * 
	 * 	4. 	VAR-arg methods ---->	before 1.5 version we have to write separate methods with
	 * 								same logic for different arguments which is result in 
	 * 								lengthy code, readability is decreases to overcome this 
	 * 								Problem sun people introduced var-arg methods in 1.5
	 * 								version
	 * 
	 *  5.	static imports  ---->	Drawback :	if the methods and variables with same name 
	 *  										then it creates confusion
	 *  
	 *  6.	Generic
	 *  
	 *  7.	Co-varient return type
	 *  
	 *  8.	String Builder
	 *  
	 *  9.	Queue
	 *  
	 *  10.	Annotations
	 * 
	 * **/
	
	
	/**
	 * 			JAVA 8 FEATURES : 
	 * 
	 * 	1.	lambda expression	---->	Symbol : " -> "	Meaning : 'such-that'
	 * 			
	 * 			- lambda expression is used to create object of interface
	 * 			- limitation : 
	 * 					1. It is useful only for functional interface
	 * 			  		2. if interface has more then one abstract method then we can not use lambda
	 * 			 		   expression we have to go for inline implementation 
	 * 									
	 * 	2.	Interface changes in interface
	 * 
	 * 			functional Interface :	- The interface which has Only one ABSTRACT method is 
	 * 									  called as functional interface
	 * 									- It can have default and static methods
	 * 			
	 * 			Default and static methods :
	 * 
	 * 					from 1.8 version on-wards we can give body to the methods inside 
	 * 					interface by using default and static keywords
	 * 
	 * 			why default methods
	 * 
	 * 			-->	when we have to add new functionality using abstract method in interface then it affects 
	 * 				all child classes to resolve this issue in Java 1.8 default methods are provided
	 * 
	 * 			why static methods
	 * 
	 * 			-->	when we add some new functionality in interface but we not allow to change that logic 
	 * 				in its implementation classes then we go for static methods
	 * 
	 * 			Object creation in Interface :
	 * 
	 *  				we can create object of interface by two ways -->
	 *  
	 *  					1. by using lambda expression
	 *  					2. by inline implementation using anonymous inner class(the 
	 *  					   class have not any name)  
	 *
	 *	3.	forEach() : - this method is present in Iterable interface present in java.lang package
	 *					- it is the parent interface of collection framework
	 *
	 *	4.	Stream API : 
	 *		
	 *		Stream interface : - it is child interface of BaseStream Interface
	 * 
	 * **/
	public static void main(String[] args) {

	}
}
