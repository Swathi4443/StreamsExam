package com.cnts.employee;

import java.util.List;

public class NamesOfEmployeesAfter2015 {
	public static void main(String[] args) {
		EmployeeMainClass employeeMainClass=new EmployeeMainClass();
		List<Employee> employeeList=employeeMainClass.employeeDisplay();
		employeeList.stream().filter(e->e.getYearOfJoining()>2015).map(Employee::getName).forEach(e->System.out.println("Name of employees who joined afetr 2015: "+e));
		
		
	}
	
	
	

}
