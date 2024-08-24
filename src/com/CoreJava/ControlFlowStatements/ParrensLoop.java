package com.CoreJava.ControlFlowStatements;

public class ParrensLoop {

	public static void main(String[] args) 
	{

		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		System.out.println("*********************");
		
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
				
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		
		
		
System.out.println("*********************");
		
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
				
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
System.out.println("*********************");
		
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
				
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		System.out.println("**************************");
		
		int k=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
		
		System.out.println("**************************");
		
		
		for(int i=1;i<=10;i++)
		{
			if(i>=5)
			{
				System.out.print(i);
			}else
			{
				System.out.println(i);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
