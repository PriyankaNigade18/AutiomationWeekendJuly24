package com.CoreJava.Inheritance;

public class Car extends Vehical
{
	public void start()
	{
		System.out.println("Car....start()");
	}
	
	public void refule()
	{
		System.out.println("Car....refule()");
	}
	
	public void stop()
	{
		System.out.println("Car....stop()");
	}
	
	@Override
	public void price()
	{
		System.out.println("Car.....1L");
	}

}
