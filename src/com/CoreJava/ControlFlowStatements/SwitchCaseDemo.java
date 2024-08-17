package com.CoreJava.ControlFlowStatements;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a browser name");
		String bname=sc.nextLine();
		switch(bname.toLowerCase())
		{
		case "chrome":
			System.out.println("Test is executing on chrome!");
			break;
		case "firefox":
			System.out.println("Test is executing on firefox!");
			break;
		case "edge":
			System.out.println("Test is executing on edge!");
			break;
			
			default:
				System.out.println("Please enter valid browser name!");
		
		}
		
		
		
		
		
		
		
		
		
		
		
		/*
		System.out.println("Enter numbers between 0 to 5");
		
		int num=sc.nextInt();
		
		switch (num)
		{
		case 0:
			System.out.println("zero");
			break;//exit from switch/loop
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		default:

			System.out.println("Wrong Number!");
		}
		
		
		
	*/	
		
		
		
		System.out.println("Done!");
		
		
		
		
		
		
		
		
		
		

	}

}
