package com.Inheritance.examples;

public class HierarchicalInheritance 
{
	double salary = 40000;
	public void displaySalary()
	{
		System.out.println(salary);
	}
	
}

class EmployeeIncrement extends HierarchicalInheritance
{
	double hike = 0.8;
	public void increment()
	{
		salary = salary+(salary*hike);
	}
}

class InternEmployee extends HierarchicalInheritance
{
	double hike = 0.5;
	public void salaryIncrement()
	{
		salary = salary+(salary*hike);
	}
}