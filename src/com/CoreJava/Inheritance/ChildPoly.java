package com.CoreJava.Inheritance;

public class ChildPoly extends ParentPoly
{
	@Override
	public void color()
	{
		System.out.println("Blue!");
	}

	public static void main(String[] args)
	{
		System.out.println("Child class ref and child class Object");
		ChildPoly c1=new ChildPoly();
		c1.color();//blue
		
		System.out.println("Parent class ref and Parent class Object");

		ParentPoly p1=new ParentPoly();
		p1.color();//yellow
		
		System.out.println("Parent class ref and child class Object");
		ParentPoly p2=new ChildPoly();
		p2.color();//blue
		
		
		
		
		
		
		
	}

}
