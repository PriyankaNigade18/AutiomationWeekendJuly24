package com.CoreJava;

public class MethodsInJava 
{
	
	public void play()
	{
		System.out.println("Play is instance method");
	}
	
	public static void run()
	{
		System.out.println("Run is static method");
	}

	public static void main(String[] args)
	{

		run();
		MethodsInJava.run();
		
		MethodsInJava m1=new MethodsInJava();
		m1.play();
		//The static method run() from the type MethodsInJava should be accessed in a static way
		//m1.run();
		
		
		
		
		

	}

}
