package com.jspider.oops;

 abstract class Employee {
	 private String name;
	 private int id;
	 
	 public Employee(String name,int id) {
		 this.name=name;
		 this.id=id;
	 }
	 //for geting name of employee
	  public String getName() {
		 return name;
	 }
	  //for geting id of employee
	  public int getId() {
		 return id;
	 }
	  
	  abstract double calculateSalary();
	  @Override
	  public String toString() {
		  return "Employee[name="+name+", id="+id+", Salary="+calculateSalary()+"]";
	  }

}
