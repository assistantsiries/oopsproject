package com.jspider.oops;

public class EmployeePayRollSystemMain {
	public static void main(String[] args) {
		PayRollSystem payRollSystem=new PayRollSystem();
		FullTimeEmployee fullTimeEmployee=new FullTimeEmployee("Gita",101,50000.00);
		PartTimeEmployee partTimeEmployee=new PartTimeEmployee("Akansha",102, 6, 270);
		FullTimeEmployee fullTimeEmployee1=new FullTimeEmployee("Rohit",103,23000.00);
		FullTimeEmployee fullTimeEmployee2=new FullTimeEmployee("Sujit",104,26000.00);
		FullTimeEmployee fullTimeEmployee3=new FullTimeEmployee("Mayuri",105,80000.00);
		PartTimeEmployee partTimeEmployee1=new PartTimeEmployee("Priyanka",106, 4, 350);
		payRollSystem.addEmployee(fullTimeEmployee);
		payRollSystem.addEmployee(partTimeEmployee);
		payRollSystem.addEmployee(fullTimeEmployee1);
		payRollSystem.addEmployee(fullTimeEmployee2);
		payRollSystem.addEmployee(fullTimeEmployee3);
		payRollSystem.addEmployee(partTimeEmployee1);
		//fullTimeEmployee.calculateVacations(15);
		System.out.println("!!..Initial Employees Details..!!");
		payRollSystem.displayEmployee();
		System.out.println("!!..Removing Employee..!!");
		payRollSystem.removeEmployee(105);
		System.out.println("!!..Remaining Employee Detais..!!");
		payRollSystem.displayEmployee();
		
	}

}
