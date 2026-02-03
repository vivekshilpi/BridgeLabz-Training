package com.employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeMain {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "Amit", 25, "Male", "IT", 2018, 55000.0));
		list.add(new Employee(2, "Rashi", 23, "Female", "HR", 2020, 21000.0));
		list.add(new Employee(3, "Rahul", 30, "Male", "Finance", 2015, 75000.0));
		list.add(new Employee(4, "Neha", 28, "Female", "IT", 2017, 68000.0));
		list.add(new Employee(5, "Vikas", 35, "Male", "Infrastructure", 2012, 90000.0));
		list.add(new Employee(6, "Pooja", 26, "Female", "Marketing", 2019, 48000.0));
		list.add(new Employee(7, "Arjun", 32, "Male", "Finance", 2014, 82000.0));
		list.add(new Employee(8, "Sneha", 24, "Female", "HR", 2021, 40000.0));
		list.add(new Employee(9, "Karan", 29, "Male", "IT", 2016, 23000.0));
		list.add(new Employee(10, "Meera", 27, "Female", "Infrastructure", 2018, 15000.0));
		
		// How many male and female employees are there in the organization ?
		Map<String, Long> map1 = list.stream()
				                     .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(map1);
		System.out.println("----------------------");
		
		// Print the name of all departments in the organization ?
		list.stream()
		    .map(Employee::getDepartment)
		    .distinct()
		    .forEach(n -> System.out.println(n));
		System.out.println("----------------------");
		
		// What is the average age of male and female employees ?
		Map<String, Double> map2 = list.stream()
									   .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println(map2);
		System.out.println("----------------------");
		
		// Get the details of highest paid employee in the organization ?
		Optional<Employee> maxSalary = list.stream()
				                           .collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		maxSalary.ifPresent(System.out::println);
		System.out.println("----------------------");
		
		// Get the names of all employees who have joined after 2015 ?
		list.stream()
		    .filter(e -> e.year>2015)
		    .map(e -> e.name)
		    .forEach(System.out::println);
		
		// Count the number of employees in each department ?
		Map<String, Long> map3 = list.stream()
				                     .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(map3);
		System.out.println("----------------------");
		
		// What is the average salary of each department ?
		Map<String, Double> map4 = list.stream()
				                       .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(map4);
		System.out.println("----------------------");
		
		// Get the details of youngest male employee in the IT department ?
		Optional<Employee> minAge = list.stream()
				                        .filter(i -> (i.department.equals("IT") && i.gender.equals("Male")))
				                        .collect(Collectors.minBy(Comparator.comparing(Employee::getAge)));
		minAge.ifPresent(System.out::println);
		System.out.println("----------------------");
		
		// Who has the most working experience in the organization?
		Optional<Employee> maxYear = list.stream()
                .collect(Collectors.minBy(Comparator.comparing(Employee::getYear)));
		maxYear.ifPresent(System.out::println);
		System.out.println("----------------------");
		
		// How many male and female employees are there in the IT department?
		Map<String, Long> ITCount = list.stream()
				                     .filter(i -> i.department.equals("IT"))
                					 .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(ITCount);
		System.out.println("----------------------");
		
		// What is the average salary of male and female employees ?
		Map<String, Double> avgSalary = list.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(avgSalary);
		System.out.println("----------------------");
		
		// List down the names of all employees in each department ?
		Map<String, List<String>> namesList = list.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));
		System.out.println(namesList);
		System.out.println("----------------------");
		
		// What is the average salary and total salary of the whole organization?
		Double AvgSalary = list.stream()
                                    .collect(Collectors.averagingDouble(Employee::getSalary));
		Double totalSalary = list.stream()
								 .collect(Collectors.summingDouble(Employee::getSalary));
		System.out.println("AvgSalary : " + AvgSalary + " TotalSalary : " + totalSalary);
		System.out.println("----------------------");
		
		// Get the employee whose salary are more than 25k.
		list.stream().filter(e -> e.salary>25000.0).forEach(System.out::println);
		System.out.println("----------------------");
		
		// Who is the highest paid employee in the organization?
		Optional<Employee> highestPaid = list.stream()
                                             .collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
	    highestPaid.ifPresent(System.out::println);
	    System.out.println("----------------------");
	    
	    // Who is the second highest paid employee in the organization?
	    Optional<Employee> secondHighestPaid = list.stream()
                                                    .sorted(Comparator.comparing(Employee::getSalary).reversed())
                                                    .skip(1)
                                                    .findFirst();
	    secondHighestPaid.ifPresent(System.out::println);
	    System.out.println("----------------------");
	    
	    // Who is the third highest paid employee in the organization?
	    Optional<Employee> thirdHighestPaid = list.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(2)
                .findFirst();
	    thirdHighestPaid.ifPresent(System.out::println);
	    System.out.println("----------------------");
	    
	    // Who is the lowest paid employee in the organization?
	    Optional<Employee> lowestPaid = list.stream()
                .collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));
	    lowestPaid.ifPresent(System.out::println);
	    System.out.println("----------------------");
	    
	    // Who is the second lowest paid employee in the organization?
	    Optional<Employee> secondLowestPaid = list.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .skip(1)
                .findFirst();
	    secondLowestPaid.ifPresent(System.out::println);
	    System.out.println("----------------------");
	    
	    // Get the first five lowest paid employee in the organization?
	    List<Employee> firstFiveLowest =
	            list.stream()
	                .sorted(Comparator.comparing(Employee::getSalary))
	                .limit(5)
	                .collect(Collectors.toList());
	    firstFiveLowest.forEach(System.out::println);
	    System.out.println("----------------------");
	    
	    // Get the first five highest paid employee in the organization?
	    List<Employee> firstFiveHighest =
	            list.stream()
	                .sorted(Comparator.comparing(Employee::getSalary).reversed())
	                .limit(5)
	                .collect(Collectors.toList());
	    firstFiveHighest.forEach(System.out::println);
	}
}
