package com.jspider.oops;

import java.util.ArrayList;
import java.util.List;

public class PayRollSystem {
	
	private List<Employee> employeeList;
	
	public PayRollSystem() {
		employeeList=new ArrayList<>();
	}
	
	//to add employee in arrayList
	public void addEmployee(Employee employee) {
		employeeList.add(employee);
	}
	//remove employee from an ArrayList
	public void removeEmployee(int id) {
		Employee employeeRemove=null;
		for(Employee employee:employeeList ){
			if(employee.getId()==id) {
				employeeRemove=employee;
				break;
			}
		}
		if(employeeRemove !=null) {
			employeeList.remove(employeeRemove);
		}else {
			System.out.println("Employee not exist");
		}
		
		
		
	}
	//to display all the employees
	public void displayEmployee() {
		for(Employee employee:employeeList) {
			System.out.println(employee);
		}
	}

}
