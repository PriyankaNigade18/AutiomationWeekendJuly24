package com.CoreJava;

public class DataTypesDemo {

	public static void main(String[] args)
	{
		//boolean 1bit true/false
		boolean status=true;
		System.out.println("boolean Status is: "+status);
		
		status=false;
		System.out.println("Updated boolean status is: "+status);
		
		System.out.println("******************************");
		
		//Primitive-->Numeric===>char
		/*
		 * char is used to store single character
		 * char 2byte 
		 * 1.single character
		 * 2.special character
		 * 3.ASCII value of a character
		 * 
		 * A-Z =65 to 90
		 * a-z =97 to 122
		 * 0 to 9= 48 to 57
		 * 
		 */
		
		char ch='A';
		System.out.println("Character is : "+ch);
		
		char ch2='#';
		System.out.println("special character: "+ch2);
		
		char ch3=90;//character for ascii it will store
		System.out.println("character for ASCII 90: "+ch3);
		
		char ch4=98;
		System.out.println("character for ascii 98: "+ch4);//b
		
		
		System.out.println("*********************************");
		//Primitive-->Numeric--->integral
		/*
		 * byte 
		 * short
		 * int: By default any number is int type
		 * long
		 * 
		 */
		//byte 1byte -128 to 127
		byte b1=125;
		System.out.println("byte data is: "+b1);
		//Type mismatch: cannot convert from int to byte
		//byte b2=130;
		
		byte b2=-127;
		System.out.println("byte data is: "+b2);
		
		//short 2byte -32768 t0 32767
		
		short s1=32767;
		System.out.println("short data is: "+s1);
		
		short s2=-32768;
		System.out.println("short data is: "+s2);
		
		//int 4byte
		int i1=50000;
		System.out.println("int data is: "+i1);
		
		int i2=977655443;
		System.out.println("int data is: "+i2);
		
		//The literal 9999999999 of type int is out of range 
		//int i3=9999999999;
		
		//long 8byte
		
		long l1=9999999999L;
		System.out.println("Long number: "+l1);
		
		System.out.println("***********************");
		
		/*
		 * Floating point 
		 * 
		 * float 4byte
		 * 
		 * double -  8 byte by default any decimal number is double
		 */
		
		float f1=56.67F;
		System.out.println("float number is: "+f1);
		
		
		double d1=98.6787899900;
		System.out.println("double number is: "+d1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
