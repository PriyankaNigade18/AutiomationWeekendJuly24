package com.CoreJava.Day3;

public class AccessModifiers 
{
	int id=101;//default
	public String name="Kiran";
	private long phno=9552671595L;	
	protected int acno=9877666;
	public static void main(String[] args) 
	{

		//same class
		AccessModifiers a1=new AccessModifiers();
		System.out.println(a1.id);
		System.out.println(a1.name);
		System.out.println(a1.phno);
		System.out.println(a1.acno);

	}

}
