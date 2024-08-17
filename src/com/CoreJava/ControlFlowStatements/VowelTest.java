package com.CoreJava.ControlFlowStatements;

import java.util.Scanner;

public class VowelTest
{

	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
//		String data=sc.nextLine();
//		char ch=data.charAt(0);
		
		char ch=sc.nextLine().charAt(0);
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='u'||ch=='o')
		{
			System.out.println(ch+" is a vowel!");
		}else
		{
			System.out.println(ch+" is a aplphabet!");
		}
		
		/*
		//ladder if
		if(ch=='a')
		{
			System.out.println(ch+" is a vowel!");
		}else if(ch=='e')
		{
			System.out.println(ch+" is a vowel!");
		}else if(ch=='i')
		{
			System.out.println(ch+" is a vowel!");
		}else if(ch=='u')
		{
			System.out.println(ch+" is a vowel!");
		}else if(ch=='o')
		{
			System.out.println(ch+" is a vowel!");
		}else 
		{
			System.out.println(ch+" is a alphabet!");
		}
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
