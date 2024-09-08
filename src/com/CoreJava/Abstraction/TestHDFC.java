package com.CoreJava.Abstraction;

public class TestHDFC {

	public static void main(String[] args)
	{
		//child class ref & child class object
		HDFC h1=new HDFC();
		h1.custDetails();//individual
		h1.deposit();
		h1.withdraw();
		h1.rateOfInterest();
		
		//parent ref & parent object-Invalid
		//RBI r1=new RBI();
		
		//Parent class ref and child class object
		RBI r1=new HDFC();
		r1.withdraw();
		r1.deposit();
		r1.rateOfInterest();
		
		

	}

}
