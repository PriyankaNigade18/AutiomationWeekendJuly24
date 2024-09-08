package com.CoreJava.Abstraction;

public class HDFC implements RBI
{
	
	public void custDetails()
	{
		System.out.println("HDFC.....customer Details()");
	}

	@Override
	public void withdraw() {
		System.out.println("HDFC.....Withdraw()");
		
	}

	@Override
	public void deposit() {
		System.out.println("HDFC.....deposit()");
		
	}

	@Override
	public void rateOfInterest() {
		System.out.println("HDFC.....8% rate of interest()");
		
	}

}
