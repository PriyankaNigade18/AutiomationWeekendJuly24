package com.CoreJava.Day4;

public class ThisKeywordDemo1
{
	/*
	 * This keyword always point to current class varibale and methos
	 */
	int id;
	String name;
	
	//constructor
	public ThisKeywordDemo1(int id,String name)//id=101, name="Ram"
	{
		//id=id;
//		name=name;
		this.id=id;
		this.name=name;
		//instance=local
	}
	
	//method
	public void show()
	{
		System.out.println("Id is: "+id);
		System.out.println("Name is: "+name);
	}

	public static void main(String[] args)
	{
		ThisKeywordDemo1 t1=new ThisKeywordDemo1(101,"Ram");
		t1.show();
		

	}

}
