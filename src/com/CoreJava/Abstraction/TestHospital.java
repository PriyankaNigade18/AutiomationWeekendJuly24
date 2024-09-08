package com.CoreJava.Abstraction;

public class TestHospital {

	public static void main(String[] args)
	{

		//chil class ref and child class object
		NobelHs n1=new NobelHs();
		n1.cardio();//inherited abstract method
		n1.physio();//inherited abstract method
		n1.medical();//individual
		n1.dental();//inherited abstract method
		n1.nero();//inherited abstract method
		n1.covid19Test();
		
		System.out.println("***************************");
		
		//parent class ref and child class object
		IMA i1=new NobelHs();
		i1.cardio();
		i1.physio();
		i1.covid19Test();
		
		System.out.println("***************************");

		USMA u1=new NobelHs();
		u1.nero();
		u1.dental();
		u1.covid19Test();
		
		
		
		
		

	}

}
