package com.CoreJava.Polymorphism;

public class ConstructorOverloading
{

	
	public ConstructorOverloading()
	{
		System.out.println("This is default constructor");
		
	}
	
	public ConstructorOverloading(String msg)
	{
		System.out.println("This is parameterized constructor : "+msg);
		
	}
	
	public ConstructorOverloading(int number)
	{
		System.out.println("This is parameterized constructor : "+number);
		
	}
	public static void main(String[] args)
	{
		ConstructorOverloading c1=new ConstructorOverloading();
		
		ConstructorOverloading c2=new ConstructorOverloading(90);
		ConstructorOverloading c3=new ConstructorOverloading("Hello All");

	}

}
