package com.CoreJava.Day2;

public class WrapperDemo2 {

	public static void main(String[] args)
	{
		// Object(String) to primitive
		
		//NumberFormatException - if the string does not contain aparsable integer.
		String s1="300";
		System.out.println(s1+200);//100200
		//int
		int num=Integer.parseInt(s1);
		System.out.println(num+200);//300
		
		System.out.println("**********************");
		
		String s2="78.55F";
		System.out.println(s2+11.11F);
		float f1=Float.parseFloat(s2);
		System.out.println(f1+11.11F);
		
		
		String s3="Zero";
		char ch=s3.charAt(2);
		System.out.println(ch);
		
		//int --->String
		
		int x=90;
		System.out.println(x+10);//100
		String ss1=String.valueOf(x);
		System.out.println(ss1+10);//9010
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
