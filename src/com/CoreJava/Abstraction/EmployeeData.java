package com.CoreJava.Abstraction;

public abstract class EmployeeData
{
	
	int eid=101;
	int salary=90000;
	String name="Sarang";
	String status="enabled";
	String address="Pune";
	long phno=8877665557L;
	

	public void empDetails()
	{
		System.out.println("Employee name: "+name);
		System.out.println("Employee id: "+eid);
		System.out.println("Employee current status: "+status);
	}
	
	public abstract void updateProfile();
	
	

//	public static void main(String args[])
//	{
//		EmployeeData e1=new EmployeeData();
//	}
}
