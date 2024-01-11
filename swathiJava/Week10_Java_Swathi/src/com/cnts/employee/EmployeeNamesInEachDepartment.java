package com.cnts.employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeNamesInEachDepartment {
	public static void main(String[] args) {
		EmployeeMainClass employeeMainClass=new EmployeeMainClass();
		List<Employee> employeeList=employeeMainClass.employeeDisplay();
		Map<String, List<Employee>> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		for (Map.Entry<String, List<Employee>> entry : collect.entrySet()) {
			String key = entry.getKey();
			List<Employee> val = entry.getValue();
			System.out.println(key+""+val.getClass().getName());
		}

//		.entrySet().
//		forEach(e->{System.out.println(e.getKey()+""+ e.getValue().forEach(e->System.out.println(e.getName())};
	}

}
