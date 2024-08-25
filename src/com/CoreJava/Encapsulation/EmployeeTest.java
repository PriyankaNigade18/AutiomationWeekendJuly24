package com.CoreJava.Encapsulation;


class Employee
{
	//Encapsulation=private data +Public method
	//data 
	private int id=101;
	private String name="Sarang";
	private int salary=70000;
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
}

public class EmployeeTest {

	public static void main(String[] args) 
	{

		Employee e1=new Employee();
		e1.setSalary(900000);
		System.out.println(e1.getSalary());
		
		
		
		
		
		
		
		
//		e1.salary=90000;
//		
//		System.out.println(e1.salary);
//		

	}

}
