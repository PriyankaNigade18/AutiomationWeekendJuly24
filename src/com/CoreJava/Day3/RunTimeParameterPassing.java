package com.CoreJava.Day3;

import java.util.Scanner;

public class RunTimeParameterPassing
{

	public void add(int a,int b)
	{
		System.out.println("Addition is: "+(a+b));
	}
	public static void main(String[] args) 
	{
		RunTimeParameterPassing r1=new RunTimeParameterPassing();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		
		r1.add(num1,num2);
		
		
		
	}

}
