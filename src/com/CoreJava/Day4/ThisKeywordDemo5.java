package com.CoreJava.Day4;

public class ThisKeywordDemo5 
{
	/*
	 * this can be used to return the current class instance from the method.

	 */

	public ThisKeywordDemo5  startApp()
	{
		System.out.println("Application started!");
		return this;
	}
	
	public void stopApp()
	{
		System.out.println("Application ended!");

	}
	public static void main(String[] args)
	{
		ThisKeywordDemo5  t1=new ThisKeywordDemo5 ();
		t1.startApp().stopApp();



	}

}
