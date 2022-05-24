package com.Inheritance.examples;

public class MultilevelInheritance 
{
	public void vehicleType()
	{
		System.out.println("Class Car");
		System.out.println("Vehicle Type: Car");
	}
}
class Maruti extends MultilevelInheritance
{
	public Maruti()
	{
		System.out.println("Class Maruti");
	}
	public void brand()
	{
		System.out.println("Brand: Maruti");
	}
	public void speed()
	{
		System.out.println("Max: 90Kmph");
	}
}
class Maruti800 extends Maruti
{
	   public Maruti800()
	   {
		System.out.println("Maruti Model: 800");
	   }
	   public void speed()
	   {
		System.out.println("Max: 80Kmph");
	   }
}