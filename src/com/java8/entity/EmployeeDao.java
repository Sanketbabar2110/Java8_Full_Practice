package com.java8.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class EmployeeDao {

	public static List<Employee> getListOfEmployees(){
		
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(10, "Ram", "Social", 60000));
		list.add(new Employee(19, "Sham", "Civil", 90000));
		list.add(new Employee(11, "Laxman", "Defence", 50000));
		list.add(new Employee(14, "Sita", "Core", 40000));
		list.add(new Employee(16, "Vaali", "Mech", 30000));
		list.add(new Employee(20, "Ravan", "IT", 100000));
		
		return list;
	}
	
	public static Map<Employee, Integer> getMapOfEmployees(){
		
		Map<Employee, Integer> map = new TreeMap<>((o1, o2) -> o2.getSalary() - o1.getSalary());
		map.put(new Employee(10, "Ram", "Social", 60000), 60);
		map.put(new Employee(19, "Sham", "Civil", 90000), 90);
		map.put(new Employee(11, "Laxman", "Defence", 50000), 50);
		map.put(new Employee(14, "Sita", "Core", 40000), 40);
		map.put(new Employee(16, "Vaali", "Mech", 30000), 30);
		map.put(new Employee(20, "Ravan", "IT", 100000), 100);
		
		return map;
	}
}
