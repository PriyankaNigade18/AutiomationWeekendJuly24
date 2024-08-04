package com.CoreJava.Day3;

public class CompileTimeParameterPassing
{
	
	/*
	 * Polymorphism
	 * ================
	 * One thing in many form
	 * 
	 * purpose:
	 * Method Reusability
	 * Types
	 * ===========
	 * 1.Compile time Polymorphism(Method Overloading)
	 * 2.Run time Polymorphism(Method Overriding)
	 * 
	 * Method Reusability
	 *-----------------------
	 *In java if you declare same name method with different signature 
	 *then it is called Method overloading
	 *Rules
	 *-----
	 *1.Number of arguments
	 *2.Types of arguments
	 *3.Change the order of arguments
	 *
	 * 
	 * 
	 * 
	 */
	public void add()//0 parameter method
	{
		int a=100,b=30;//local variable
		System.out.println("Addition is: "+(a+b));
	}
	public void add(int a,int b)//2 parameter method- Local variables a=1000 b= 20000
	{
		System.out.println("Addition is : "+(a+b));
	}
	public void add(int a,int b,int c)//3 parameter method- Local variables 
	{
		System.out.println("Addition is : "+(a+b+c));
		
	} 
	
		public void info(String msg)//1 parameter method
		{
			System.out.println(msg);
		}
	public void sub(int a,int b)
	{
		System.out.println("Subtraction is: "+(a-b));
	}
	
	
	
	public static void main(String[] args)
	{
		CompileTimeParameterPassing c1=new CompileTimeParameterPassing();
		c1.add();
		/*
		 * Passing data at the time calling method called compile time parameter passing!
		 */
		c1.add(1000,20000);
		/*
		 * When you pass original data is called argument
		 * and variables which hold that data called parameter
		 */
		
		c1.add(10,2000,900);
		
		c1.info("Hello All Welcome to learn java!");
		
		c1.sub(100,80);

	}
	

}
