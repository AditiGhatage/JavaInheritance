package com.Inheritance.examples;

public class shapeInheritance 
{
	    public void print_shape()
	    {
	        System.out.println("This is a shape!");
	    }
}	    
	    
class rectangle extends shapeInheritance
	{
	        public void print_rect()
	        {
	            System.out.println("This is rectangle! ");
	        }
	}
class circle extends shapeInheritance
	{
	        public void print_circle()
	       {
	            System.out.println("This is circle! ");
	        }
	}
class square extends rectangle
	{
	        public  void print_square()
	        {
	            System.out.println("Square is a rectangle.");
	        }
	    }

