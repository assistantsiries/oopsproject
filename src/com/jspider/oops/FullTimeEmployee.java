package com.jspider.oops;

public class FullTimeEmployee extends Employee{
	
	private double monthlySalary;
	private int vacationDaysTaken;

	public FullTimeEmployee(String name,int id,double salary) {
		super(name,id);
		this.monthlySalary=salary;
		this.vacationDaysTaken=0;
	}
	
	@Override
	double calculateSalary() {
	double adjustedSalary=monthlySalary - (vacationDaysTaken * (monthlySalary / 30));
		return adjustedSalary;
	}
	
	public void calculateVacations(int day) {
		vacationDaysTaken = vacationDaysTaken + day;
	}
}
