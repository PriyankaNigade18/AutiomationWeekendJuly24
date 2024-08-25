package com.CoreJava.Array_String;

public class StringDemo {

	public static void main(String[] args) {
		/*
		 * String is collection of characters
		 * String is class in java
		 * String is immutable class in Java
		 * 
		 * Ways
		 * ===============
		 * 1.String using literal
		 * ===========================
		 * String objects creates inside jvm heap-->SCP(String constant pool)
		 * SCP  will not allowed duplicate objects
		 * 
		 * 2.String using new keyword
		 * ===========================
		 * It will create two object one inside heap area and one inside SCP
		 * 
		 * 
		 */
		
		
		String s1="Hello";
		
		String s2=new String("Hello");
		
		System.out.println(s1==s2);//false
		
		
		String s3="Hello";
		System.out.println(s1==s3);//true
		
		//String is Immutable
		
		s1=s1+"All";
		
		System.out.println(s1==s3);//false
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
