package com.CoreJava.ControlFlowStatements;

import java.util.Scanner;

public class LoopDemo2 {

	public static void main(String[] args)
	{
		/*
		 * sum of digits logic
		 * 
		 * num=123 |1234 |12345
		 * 1+2+3=6
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number for Sum of digits");
		
		int num=sc.nextInt();
		int r,sum=0;
		while(num>0)
		{
			r=num%10;
			num=num/10;
			sum=sum+r;
		}
		
		
		System.out.println("Sum of digits are: "+sum);
		
		//how to reverse a number
		
		System.out.println("**********************");
		int n=123,rem,res=0;
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			res=res*10+rem;
		}
		
		System.out.println("Reverse number is: "+res);
		
		
		System.out.println("*************************");
		
		int i=1;
		do
		{
			System.out.println("Hello All!");
			i++;
		}while(i==5);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
