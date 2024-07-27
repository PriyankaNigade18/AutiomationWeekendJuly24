package com.CoreJava;

public class StaticBlockDemo {

	static String bankName;
	
	static
	{
		System.out.println("Static block is calling....");
		bankName="HDFC";
		System.out.println("Bank for all the users: "+bankName);
	}
	
	
	public static void main(String[] args) {

		System.out.println("This is main() calling......");

	}

}
