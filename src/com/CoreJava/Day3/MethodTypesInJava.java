package com.CoreJava.Day3;

public class MethodTypesInJava
{
	
	public void accept()//0 parameter method
	{
		System.out.println("This is instance method calling!");
	}
	
	public static void display()//0 parameter method
	{
		System.out.println("This is static method calling!");
	}

	public static void main(String[] args)
	{

		
		display();
		MethodTypesInJava.display();
		MethodTypesInJava m1=new MethodTypesInJava();
		m1.accept();
		//MethodTypesInJava should be accessed in a static way
		m1.display();
		

	}

}
