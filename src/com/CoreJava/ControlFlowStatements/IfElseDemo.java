package com.CoreJava.ControlFlowStatements;

import java.util.Scanner;

public class IfElseDemo
{

	public static void main(String[] args) 
	{
		//Scenario: Validate valid/invalid age for voting
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age!");
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("Valid Age!");
		}
		else
		{
			System.out.println("Invalid age!");
		}

	}

}
