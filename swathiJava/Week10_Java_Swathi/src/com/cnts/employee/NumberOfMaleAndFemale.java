package com.cnts.employee;

import java.util.List;
import java.util.stream.Collectors;

public class NumberOfMaleAndFemale {
	public static void main(String[] args) {
		EmployeeMainClass employeeMainClass=new EmployeeMainClass();
		List<Employee> employeeList=employeeMainClass.employeeDisplay();
		employeeList.stream().filter(e->e.getDepartment().equals("Sales")||e.getDepartment().equals("Marketing")).
		collect(Collectors.groupingBy(Employee::getDepartment,Collectors.groupingBy(Employee::getGender,Collectors.counting()))).entrySet().
		forEach(e->System.out.println(e.getKey()+" :"+e.getValue()));
		
	}

}
