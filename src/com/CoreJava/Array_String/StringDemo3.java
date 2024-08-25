package com.CoreJava.Array_String;

public class StringDemo3 {

	public static void main(String[] args)
	{
		/*
		 * StringBuilder,StringBuffer class  and String class
		 * 
		 * ------------------------------------------------
		 * How to reverse a string using method?
		 * 
		 * How to reverse a string without method?
		 * 
		 */
		
		//String s1="Hello All";
		
		StringBuilder br=new StringBuilder("Hello All");
		br.append(" Participants");
		System.out.println(br);
		
		br.reverse();
		
		System.out.println(br);
		
		System.out.println("*******************");
		
		
		String ss1="Java selenium";
		String res="";
		
		for(int i=ss1.length()-1;i>=0;i--)
		{
			res=res+ss1.charAt(i);
		}
		
		System.out.println(res);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
