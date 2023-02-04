package com.java8.map_Vs_flatMap;

import java.util.List;
import java.util.stream.Collectors;

import com.java8.entity.Customer;
import com.java8.entity.CustomerDao;

public class MapVsFlatMap {
	public static void main(String[] args) {
		
		List<Customer> listOfCustomers = CustomerDao.getAllCustomer();
		
//		List<Customer> ---> converted to ---> List<String> ---> Data Transformation
//      mapping : customer ---> customer.getEmail() ---> one to one mapping
		List<String> emails = listOfCustomers.stream().map(Customer::getEmail).collect(Collectors.toList());
		System.out.println(emails);
		System.out.println("----------------------------------------------------------------------------");

//		customer ---> customer.getPhoneNumbers() ---> one to many mapping
//		it returns list of lists
		List<List<String>> phoneNumbersList = listOfCustomers.stream().map(Customer::getPhoneNumbers).collect(Collectors.toList());
		System.out.println(phoneNumbersList);
		System.out.println("----------------------------------------------------------------------------");

//		List<Customer> ---> converted to ---> List<String> ---> Data Transformation
//      customer ---> customer.getPhoneNumbers() ---> one to many mapping
//		it return list of phone numbers
		List<String> listOfPhoneNumbers = listOfCustomers.stream().flatMap(customer -> customer.getPhoneNumbers().stream()).collect(Collectors.toList());
		System.out.println(listOfPhoneNumbers);
		System.out.println("----------------------------------------------------------------------------");

	}
	
}

	/**
	 *		Differences between Java 8 Map() Vs flatMap() :
	 *
	 *							map()											flatMap()
	 *
	 *		1) It processes stream of values.						1) It processes stream of stream of values.
	 *		2) It does only mapping.								2) It performs mapping as well as flattening.
	 *		3) It’s mapper function produces single value			3) It’s mapper function produces multiple values
	 *		   for each input value.								   for each input value.
	 *		4) It is a One-To-One mapping.							4) It is a One-To-Many mapping.
	 *		5) Data Transformation : From Stream<Stream> to			5) Data Transformation : From Stream<Stream> to
	 *		   								Stream<Stream>												Stream
	 * 
	 * **/


