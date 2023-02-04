package com.java8.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerDao {

	public static List<Customer> getAllCustomer() {
		List<Customer> list = new ArrayList<>();
			list.add(new Customer(101, "Ram", "ram@gmail.com", Arrays.asList("397937955", "21654725")));
			list.add(new Customer(102, "Sham", "sham@gmail.com", Arrays.asList("89563865", "2487238947")));
			list.add(new Customer(103, "Laxman", "laxman@gmail.com", Arrays.asList("38946328654", "3286487236")));
			list.add(new Customer(104, "Sita", "sita@gmail.com", Arrays.asList("389246829364", "948609467")));
		return list;
	}
}
