package com.Inheritance.examples;

public class TestCalculations {

	public static void main(String[] args) 
	{
		int intad=4, intbs=1;
		My_Calculation objcalculations = new My_Calculation();
		//objcalculations.calculation();
		objcalculations.multiplication(intad, intbs);
		objcalculations.addition(intad, intbs);
		objcalculations.subtraction(intad, intbs);

	}

}
