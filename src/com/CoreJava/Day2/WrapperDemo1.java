package com.CoreJava.Day2;

public class WrapperDemo1 {

	public static void main(String[] args) 
	{

		/* primitive --->Object =Autoboxing
		 * Object---->Primitive =Unboxing
		 * 
		 */

		
		int x=90;
		Integer obj1=Integer.valueOf(x);
		System.out.println(obj1);
		System.out.println("Value of object as int:"+obj1.intValue());
		
		double d1=67.88;
		Double obj2=Double.valueOf(d1);
		System.out.println(obj2);
		
		//Object to primitive
		
		Integer i=100;
		int a=i.intValue();
		System.out.println("Object to primitive: "+a);
		
		
		Float f1=78.67F;
		float f2=f1.floatValue();
		System.out.println(f2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
