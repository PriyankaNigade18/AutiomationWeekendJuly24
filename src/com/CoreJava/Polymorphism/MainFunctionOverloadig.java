package com.CoreJava.Polymorphism;

public class MainFunctionOverloadig {

	public static void main(String[] args)
	{

		System.out.println("Main() with string array arguments");

		main(89);
		int arr[]= {10,20,30};
		main(arr);

	}
	
	public static void main(int args)
	{

		System.out.println("Main() with int argument");


	}
	
	public static void main(int[] args)
	{

		System.out.println("Main() with int array argument");

	}

}
