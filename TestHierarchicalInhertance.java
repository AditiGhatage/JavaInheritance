package com.Inheritance.examples;

public class TestHierarchicalInhertance {

	public static void main(String[] args) 
	{
		EmployeeIncrement objemp = new EmployeeIncrement();
		InternEmployee objint = new InternEmployee();
		
		System.out.println("Salary of an Employee is: ");
		objemp.displaySalary();
		
		System.out.println("Salary of an intern is: ");
		objint.displaySalary();
		
		objemp.increment();
		objint.salaryIncrement();
		
		System.out.println("Salary of an employee after incrementing:");
		objemp.displaySalary();
		 
		System.out.println("Salary of an intern after incrementing:");
		objint.displaySalary();

	}

}
