package com.CoreJava.Polymorphism;

public class AmazonSearchTest {

	public static void main(String[] args) 
	{

		AmazonSearch a1=new AmazonSearch();
		a1.search("Iphone");
		a1.search(60000);
		a1.search(80000, "watch");
		a1.search("laptop", 80000);
		a1.search("bag","Zara");
		a1.search("mobile",70000,"Iphone");

	}

}
