package com.CollectionFramework;

import java.util.ArrayList;

public class ArrayListDemo5_Employee {

	public static void main(String[] args)
	{

		//list of employees 
		Employee e1=new Employee(101,"Rohit");
		Employee e2=new Employee(102,"Shruti");
		Employee e3=new Employee(103,"Sumit");
		Employee e4=new Employee(104,"Vibha");
		
		
		ArrayList<Employee> emp=new ArrayList<Employee>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		
		System.out.println(emp);
		
		for(Employee i:emp)
		{
			System.out.println(i.empId+" : "+i.name);
			
		}

	}

}
