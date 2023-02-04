package com.java8.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.java8.entity.Employee;
import com.java8.entity.EmployeeDao;

public class SortListDemo {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(12);
		list.add(8);
		list.add(10);
		list.add(5);
		list.add(9);

//		1st Approach
		Collections.sort(list);
		System.out.println(list);
		System.out.println("----------------------------------------------------------------------------");

//		2nd Approach
		Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		System.out.println(list);
		System.out.println("----------------------------------------------------------------------------");


//		3rd Approach
		Collections.sort(list, (o1, o2) -> o2 - o1);
		System.out.println(list);
		System.out.println("----------------------------------------------------------------------------");

//		4th Approach
		list.stream().sorted().forEach(System.out::println);
		System.out.println("----------------------------------------------------------------------------");

//		5th Approach
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");


// ****************************************************************************************** //		

		List<Employee> empList = EmployeeDao.getListOfEmployees();

//		1st Approach
		Collections.sort(empList, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getSalary() - o2.getSalary();
			}
		});
		System.out.println(empList);
		System.out.println("----------------------------------------------------------------------------");

//		2nd Approach
		Collections.sort(empList, (o1, o2) -> o1.getSalary() - o2.getSalary());
		System.out.println(empList);
		System.out.println("----------------------------------------------------------------------------");

//		3rd Approach
		Collections.sort(empList, (o1, o2) -> o1.getSalary() - o2.getSalary());
		Collections.reverse(empList);
		System.out.println(empList);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

//		4th Approach
		empList.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);
		System.out.println("----------------------------------------------------------------------------");

//		5th Approach
		empList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);
		System.out.println("----------------------------------------------------------------------------");

	}
}
