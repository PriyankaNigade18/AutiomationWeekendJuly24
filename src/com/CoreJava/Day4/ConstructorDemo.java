package com.CoreJava.Day4;

public class ConstructorDemo
{
	/*
	 * Constructor used to initialize object
	 * constructor must not have any return type
	 * constructor name must be same like class
	 * Constructor call is always with Object
	 * Constructor Overloading is possible but overriding not possible
	 *
	 * Type
	 * =======
	 * 1.default(always get executed by JVM)
	 * 2.parameterize
	 * 
	 */
	
	int id;
	String name;
	
	public ConstructorDemo()//default constructor
	{
		System.out.println("Default constructor is calling!");
		id=101;
		name="Sarang";
	}
	
	//Parameterized constructor
	public ConstructorDemo(int i,String n)//2 parameters i, n are local variable
	{
		System.out.println("Parameterized constructor is calling!");
		//instance=local
		id=i;
		name=n;
		System.out.println(id);
		System.out.println(name);
	}

	public static void main(String[] args)
	{
		ConstructorDemo c1=new ConstructorDemo();
		System.out.println(c1.id);
		System.out.println(c1.name);
		
		ConstructorDemo c2=new ConstructorDemo(201,"Jay");
		

	}

}
