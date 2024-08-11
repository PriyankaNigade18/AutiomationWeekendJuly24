package com.CoreJava.ControlFlowStatements;

import java.util.Scanner;

public class LadderIf {

	public static void main(String[] args)
	{
		int a=100,b=200;
		if(a>b)
		{
			System.out.println(a+" is greater than "+b);
		}else
		{
			System.out.println(b+" is greater than "+a);
		}
		
		
		System.out.println("****************************");
		
		int x=100,y=200,z=300;
		if(x>y && x>z)
		{
			System.out.println(x+" is greater than "+y+" & "+z);
		}else if(y>x && y>z)
		{
			System.out.println(y+" is greater than "+x+" & "+z);
		}else
		{
			System.out.println(z+" is greater than "+x+" & "+y);
		}
		
		System.out.println("****************************");

//		
		/*
		 * any primitive int,byte,char,float===>operator
		 * a==b
		 * String is class in Java
		 * To equality between string
		 * ==============================
		 * 1.equals(): exact matching and it is case sensitive
		 * 
		 * 2.equalsIgnoreCase(): exact matching but it is not case sensitive
		 
		
		
		String s1="Hello All";
		String s2="hello all";
		
		System.out.println(s1.equals(s2));//true-->false
		System.out.println(s1.equalsIgnoreCase(s2));//true-->true
		*/
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter browser name");
		String bname=sc.nextLine();
		
		if(bname.equals("chrome"))
		{
			System.out.println("Test case is running on "+bname);
			
		}else if(bname.equals("edge"))
		{
			System.out.println("Test case is running on "+bname);

		}else if(bname.equals("firefox"))
		{
			System.out.println("Test case is running on "+bname);

		}else
		{
			System.out.println("Please enter valid browser name");

		}
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
