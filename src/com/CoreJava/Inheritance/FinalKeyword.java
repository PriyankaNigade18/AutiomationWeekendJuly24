package com.CoreJava.Inheritance;

//final class Demo
class Demo
{
	final int id=101;
	
	public final void play()
	{
		System.out.println("Students can play");
	}
}

public class FinalKeyword extends Demo
{
//	@Override
//	public void play()
//	{
//		System.out.println("Students can play video games");
//	}

	public static void main(String[] args) 
	{

		FinalKeyword f1=new FinalKeyword();
		//f1.id=201;
		System.out.println(f1.id);
		
		f1.play();

	}

}
