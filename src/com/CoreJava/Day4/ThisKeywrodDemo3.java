package com.CoreJava.Day4;



public class ThisKeywrodDemo3 {

	/*
	 * this() can be used to invoke current class constructor.

	 */
	
	public ThisKeywrodDemo3()
	{
		//this("Welcome to learn Java!");
		
		System.out.println("This is default constructor");
	}
	
	public ThisKeywrodDemo3(String data)
	{
		//this();//this constructor
		System.out.println("This is Parameterized constructor : "+data);
		
	}
	
	public ThisKeywrodDemo3(ThisKeywrodDemo3 t)
	{
		//this();//this constructor
		System.out.println("This is Parameterized constructor : ");
		t.display();
		
	}
	
//	public ThisKeywrodDemo3()
//	{
//		A a1=new A(this);
//	}
	
	public void display()
	{
		System.out.println("Display() is calling");
		
	}
	public void show(ThisKeywrodDemo3 t)
	{
		System.out.println("show is Method calling!");
		
	}
	public static void main(String[] args)
	{
		ThisKeywrodDemo3 t1=new ThisKeywrodDemo3();
		t1.show(t1);
		
		ThisKeywrodDemo3 t2=new ThisKeywrodDemo3(t1);
		
		

	}

}
