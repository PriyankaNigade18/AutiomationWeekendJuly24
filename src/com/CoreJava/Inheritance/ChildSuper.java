package com.CoreJava.Inheritance;

public class ChildSuper extends ParentSuper
{
	int cid=201;
	
	public void childIncome()
	{
		System.out.println("Parent id is: "+super.pid);
		super.parentIncome();
		System.out.println("child id  is: "+cid);
		System.out.println("Child Income is $15000");
	}
	ChildSuper()
	{
		super();
		System.out.println("Child constructor is Calling!");
	}
	

	public static void main(String[] args) {

		ChildSuper c1=new ChildSuper();
		c1.childIncome();

	}

}
