package com.CoreJava;

public class VariableDemo 
{
	String name="Sarang";//instance 
	int id=101;//instance 
	static String cname="AISSPMS";
	
	
	public void show()
	{
		int marks=80;//local variable to show
		System.out.println("College name is: "+cname);
		System.out.println("Student name: "+name);
		System.out.println("marks from show(): "+marks);
	
	}
	
	public void display()
	{
		int marks=70;//local to display
		System.out.println("Marks from display():"+marks);
	}
	

	public static void main(String[] args) 
	{

		System.out.println("College name is: "+cname);
		int marks=100;//local variable to main
		System.out.println("Marks from main():"+marks);


		
		VariableDemo v1=new VariableDemo();
		
		System.out.println("Student name: "+v1.name);
		System.out.println("Student id : "+v1.id);
		v1.show();
		v1.display();
		
		
		
		
		
		
		
	}

}
