package com.Stream;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class SecondHighestSalary {

	public static void main(String[] args) {

		Employee e1 = new Employee("Sanket", 10000);
		Employee e2 = new Employee("Prathmesh", 20000);
		Employee e3 = new Employee("Omkar", 25000);
		Employee e4 = new Employee("Kiran", 15000);
		Employee e5 = new Employee("Mahesh", 30000);
		Employee e6 = new Employee("Rohit", 25000);
		Employee e7 = new Employee("Vighnesh", 28000);
		Employee e8 = new Employee("Shubham", 20000);

		HashMap<Integer, Employee> map = new HashMap<>();
		
		map.put(1, e1);
		map.put(2, e2);
		map.put(3, e3);
		map.put(4, e4);
		map.put(5, e5);
		map.put(6, e6);
		map.put(7, e7);
		map.put(8, e8);

		System.out.println(map);
		System.out.println("__________________________________________________________________________________________________________________________________");
						
		Optional<Integer> salary = map.entrySet().stream()
					  .map(x -> x.getValue().getSalary())
					  .sorted(Comparator.reverseOrder())
					  .limit(2)
					  .skip(1)
					  .findFirst();
		
		System.out.println(salary.get());
		
		Map<Integer, Long> collect = map.entrySet().stream().collect(Collectors.groupingBy(x -> x.getValue().getSalary(), Collectors.counting()));
		System.out.println(collect);
	}
}




class Employee {

	private String name;
	private int salary;

	public Employee() {
		super();
	}

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}