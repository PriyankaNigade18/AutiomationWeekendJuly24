package com.CoreJava.ControlFlowStatements;

import java.util.Scanner;

public class NestedLoopDemo {

	public static void main(String[] args)
	{
			
		for(int num=1;num<=10;num++)
		{
			for(int i=1;i<=10;i++)
			{
				System.out.print(num*i+"\t");
			}
			System.out.println();
		}
		
		System.out.println("******************************");
		
		//row-->cell-->value
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		System.out.println("******************************");

		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		
		
		
		/*
	

		//Print table of number (2)
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(num*i);
		}
		*/

	}

}
