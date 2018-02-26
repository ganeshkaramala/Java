package com.java.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class HashCodeEqual {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.setId(1);
		Employee emp2 = new Employee();
		emp2.setId(2);
		System.out.println("Employee 1 & 2: "+(emp1.equals(emp2)?"Equal":"Not Equal"));
		System.out.println(emp1+" "+emp2);
		
		Employee emp3 = new Employee();
		emp3.setName("Ganesh");
		emp3.setId(3);
		System.out.println("Employee 2 & 3: "+(emp2.equals(emp3)?"Equal":"Not Equal"));
		System.out.println(emp3+" "+emp3);
		
		Map<Employee,Integer> employeeMap = new HashMap<>();
		employeeMap.put(emp1, 1);
		employeeMap.put(emp2, 2);
		employeeMap.put(emp3, 3);
		
	    List<Employee> empList = new ArrayList<>();
	    empList.add(emp3);
	    empList.add(emp2);
	    empList.add(emp1);
	    
	    System.out.println("Before Sort");
	    empList.forEach(System.out::println);
	    
	    //Collections.sort(empList);
	    
	    Comparator<Employee> empIdComparator = new Comparator<Employee>() {

			@Override
			public int compare(Employee emp1, Employee emp2) {
				return emp1.compareTo(emp2);
			}
		};
		Collections.sort(empList, empIdComparator);
	    
	    System.out.println("After Sort");
	    empList.forEach(System.out::println);
		
		for( Entry<Employee, Integer> empSet :employeeMap.entrySet()) {
			System.out.println(empSet.getKey() +":"+empSet.getValue());
		}
	}

}
