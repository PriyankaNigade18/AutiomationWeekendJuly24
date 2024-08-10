package com.CoreJava.Day4;

import java.util.Scanner;

public class ReturnKeywrodDemo 
{
	
	public String info(String name)
	{
		//System.out.println("Hello "+name);
		return name;
	}
	

	public static void main(String[] args)
	{
		System.out.println("Main is calling.......");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name!");
		String name=sc.nextLine();
		
		ReturnKeywrodDemo r1=new ReturnKeywrodDemo();
		//String res=r1.info("Priyanka");
		String res=r1.info(name);
		System.out.println("Hello "+res);
		


	}

}
