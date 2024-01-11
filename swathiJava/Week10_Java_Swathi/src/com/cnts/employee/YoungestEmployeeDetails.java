package com.cnts.employee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class YoungestEmployeeDetails {
	public static void main(String[] args) {
		EmployeeMainClass employeeMainClass=new EmployeeMainClass();
		List<Employee> employeeList=employeeMainClass.employeeDisplay();
		employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.minBy(Comparator.comparingInt(Employee::getAge)))).entrySet().
		forEach(e->System.out.println(e.getKey()+" "+e.getValue()));
		
	}
	

}
