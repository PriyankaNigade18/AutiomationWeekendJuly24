package com.CoreJava.ControlFlowStatements;

import java.util.Scanner;

public class SimpleIFDemo {

	public static void main(String[] args)
	{

		//Scenario: Validate valid age of user age>=18
		System.out.println("Program started......");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		
		
		if(age>=18)
		{
			System.out.println("Valid Age!");
		}
		
		System.out.println("Program Ended......!");

	}

}
