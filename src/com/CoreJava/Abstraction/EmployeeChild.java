package com.CoreJava.Abstraction;

public class EmployeeChild extends EmployeeData
{
	public void info()
	{
		System.out.println("Welcome to Wipro company");
	}
	
	
	
	@Override
	public void updateProfile()
	{
		super.salary=1000000;
		System.out.println("Employee salary: "+super.salary);
		super.status="enabled";
		System.out.println("Emplyee status: "+super.status);


		
	}

	public static void main(String[] args)
	{
		//child class ref and childc class object
		EmployeeChild c1=new EmployeeChild();
		c1.empDetails();
		c1.info();
		c1.updateProfile();
		
		
		//parent class ref and parent class object-Invalid
		//EmployeeData d1=new EmployeeData();
		
		
		//parent class & child object
		
		EmployeeData d1=new EmployeeChild();
		d1.empDetails();
		d1.updateProfile();
		

	}

	

}
