package com.CoreJava.Polymorphism;

public class CompileTimePoly 
{
	/*
	 * Method can be overload if it is declare with same same in same class
	 * multiple time with different signature
	 */
	public void add()
	{
		int a=100,b=288;
		System.out.println("Addition is: "+(a+b));
	}
	//1.number of arguments
	public void add(int a,int b)
	{
		System.out.println("Addition is: "+(a+b));
	
	}
	public void add(int a,int b,int c)
	{
		System.out.println("Addition is: "+(a+b+c));

	}
	//2.change type of argument
	public void add(double a,int b)
	{
		System.out.println("Addition is: "+(a+b));
	
	}
	//3.change the order of argument
	public void add(int a,double b)
	{
		System.out.println("Addition is: "+(a+b));
	
	}
	
	
	

	public static void main(String[] args) 
	{
		CompileTimePoly c1=new CompileTimePoly();
		
		c1.add();
		c1.add(100.22,1000);
		c1.add(500,89.660);
		c1.add(67,890);
		c1.add(45,78,990);
		
		
		
		
		
		
		
		
		

	}

}
