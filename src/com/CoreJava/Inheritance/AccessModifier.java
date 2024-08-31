package com.CoreJava.Inheritance;

public class AccessModifier 
{
	int id=101;
	public String name="Sarang";
	private long phno=8776555544L;
	protected int acno=998889;
	

	public static void main(String[] args) 
	{
		System.out.println("Same class");
		
		AccessModifier a1=new AccessModifier();
		System.out.println(a1.id);
		System.out.println(a1.name);
		System.out.println(a1.phno);
		System.out.println(a1.acno);
	}

}
