package com.cnts.employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOfMaleAndFemale {
	public static void main(String[] args) {
		EmployeeMainClass employeeMainClass=new EmployeeMainClass();
		List<Employee> employeeList=employeeMainClass.employeeDisplay();
		Map<String, Long> count=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println(count);
	}

}
