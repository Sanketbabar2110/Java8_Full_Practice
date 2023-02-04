package com.java8.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.java8.entity.Employee;
import com.java8.entity.EmployeeDao;

public class SortMapDemo {
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		
		map.put("eight", 8);
		map.put("ten", 10);
		map.put("six", 6);
		map.put("one", 1);
		map.put("two", 2);
		map.put("five", 5);
		
		ArrayList<Entry<String,Integer>> entries = new ArrayList<>(map.entrySet());
		
//		1st Approach
		Collections.sort(entries, new Comparator<Entry<String,Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getKey().compareTo(o2.getKey());
			}
		});
		System.out.println(entries);
		System.out.println("----------------------------------------------------------------------------");

//		2nd Approach
		Collections.sort(entries, new Comparator<Entry<String,Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		System.out.println(entries);
		System.out.println("----------------------------------------------------------------------------");

//		3rd Approach
		Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
		System.out.println(entries);
		System.out.println("----------------------------------------------------------------------------");

//		4th Approach
		Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
		System.out.println(entries);
		System.out.println("----------------------------------------------------------------------------");

//		5th Approach
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("----------------------------------------------------------------------------");

//		6th Approach
		map.entrySet().stream().sorted((o1, o2) -> o1.getKey().compareTo(o2.getKey())).forEach(System.out::println);
		System.out.println("----------------------------------------------------------------------------");

//		7th Approach
		map.entrySet().stream().sorted((o1, o2) -> o2.getKey().compareTo(o1.getKey())).forEach(System.out::println);
		System.out.println("----------------------------------------------------------------------------");

//		8th Approach
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		System.out.println("----------------------------------------------------------------------------");

//		9th Approach
		map.entrySet().stream().sorted((o1, o2) -> o1.getValue().compareTo(o2.getValue())).forEach(System.out::println);
		System.out.println("----------------------------------------------------------------------------");

//		10th Approach
		map.entrySet().stream().sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue())).forEach(System.out::println);
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

		Map<Employee, Integer> mapOfEmployees = EmployeeDao.getMapOfEmployees();
				
//		1st Approach
		mapOfEmployees.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary))).forEach(System.out::println);
		System.out.println("----------------------------------------------------------------------------");

//		2nd Approach
		mapOfEmployees.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getId))).forEach(System.out::println);
		System.out.println("----------------------------------------------------------------------------");

//		3rd Approach
		mapOfEmployees.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName))).forEach(System.out::println);
		System.out.println("----------------------------------------------------------------------------");

//		4th Approach
		mapOfEmployees.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed())).forEach(System.out::println);
		System.out.println("----------------------------------------------------------------------------");

//		2nd Approach
		mapOfEmployees.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getId).reversed())).forEach(System.out::println);
		System.out.println("----------------------------------------------------------------------------");

//		3rd Approach
		mapOfEmployees.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName).reversed())).forEach(System.out::println);
		System.out.println("----------------------------------------------------------------------------");

	}
}
