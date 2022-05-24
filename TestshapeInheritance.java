package com.Inheritance.examples;

public class TestshapeInheritance {

	public static void main(String[] args) 
	{
		shapeInheritance objshape = new shapeInheritance();
        objshape.print_shape();
        
        rectangle objrec = new rectangle();
        objrec.print_rect();
        
        circle objcir = new circle();
        objcir.print_circle();
        
        square objsq = new square();
        objsq.print_square();

	}

}
