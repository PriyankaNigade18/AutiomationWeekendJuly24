package com.CoreJava.ControlFlowStatements;

public class LoopDemo {

	public static void main(String[] args) 
	{
		// for
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
		}

		System.out.println("********************");
		//Print 1 to 10 numbers
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		
		
		System.out.println("********************");
		//print numbers from 10 to 1
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}
		
		System.out.println("********************");

		//print sum of 100 natural numbers
		//1+2+3+4+.....+100=5050
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			sum=sum+i;
		}
		
		System.out.println(sum);
		
		System.out.println("***********************");
		//While loop
		
		int i=1;
		while(i<=5)
		{
			System.out.println("Welcome");
			i++;
			
		}
		
		System.out.println("******************************");
//		for(;;)//by default condition is true
//		{
//			System.out.println("Hi");
//		}
		
		//what is dead code-interview question
		if(true)
		{
			System.out.println("True statement");
		}else //dead code
		{
			System.out.println("False statement");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
