package com.CoreJava.Day3;

import java.util.Scanner;

public class LiveTask {

	public void details(String fn,String ln,char gen,String em,int age,long phno)
	{
		System.out.println("First name is: "+fn);
		System.out.println("Last name is: "+ln);
		System.out.println("Gender is: "+gen);
		System.out.println("Email is: "+em);
		System.out.println("Age  is: "+age);
		System.out.println("phone number is: "+phno);
	}
	
	public static void main(String[] args)
	{
		//Read data from User
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your firstName");
		String fn=sc.nextLine();
		System.out.println("Enter your last name");
		String ln=sc.nextLine();	
		System.out.println("Enter your gender(m/f)");
		String data=sc.nextLine();
		char gen=data.charAt(0);
		System.out.println("Enter your email");
		String em=sc.nextLine();
		System.out.println("Enter your age");
		int age=sc.nextInt();
		System.out.println("Eneter your phno");
		long phno=sc.nextLong();
		
		LiveTask l1=new LiveTask();
		l1.details(fn, ln, gen, em, age, phno);
		
		
		
		
		
		
		

	}

}
