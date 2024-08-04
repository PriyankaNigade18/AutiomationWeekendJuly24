package com.CoreJava.Day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class WaysToAcceptInputFromUser
{

	public static void main(String[] args) throws IOException
	{
		
		/*
		 * Scanner class
		 * int --->nextInt()
		 * string---->nextLine()
		 * boolean-----nextBoolean()
		 */
		
		System.out.println("Enter your name");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		System.out.println("Enter your id");
		int id=sc.nextInt();		
		System.out.println("Hello: " +name);
		System.out.println("Your id is: "+id);
		sc.close();
		
		
		
		
		
		
		
		
		
		
		/*
		 * BufferedReader class
		 * 
		
		
		System.out.println("Enter your age:");
		
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		String data=br.readLine();
		//string ----int
		int age=Integer.parseInt(data);
		System.out.println(age);
		*/
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * System.in input stream
		 * 
		 * this method reads single character and return its integer value
		
		
		System.out.println("Enter you age:");
		int age=System.in.read();
		System.out.println((char)age);
		
		 	*/
	}

}
