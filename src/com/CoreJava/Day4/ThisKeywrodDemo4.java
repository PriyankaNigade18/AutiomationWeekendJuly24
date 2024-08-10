package com.CoreJava.Day4;


class A
{
	public A(ThisKeywrodDemo4 t)
	{
		System.out.println("Id is:"+t.id);
	}
}
public class ThisKeywrodDemo4 {

	/*
	 * this can be passed as argument in the constructor call.

	 */
	
	int id=101;
	
	public ThisKeywrodDemo4()
	{System.out.println("Crating object of A to call that constructor");
		A a1=new A(this);
	}
	public static void main(String[] args)
	{
		ThisKeywrodDemo4 t1=new ThisKeywrodDemo4();
		


	}

}
