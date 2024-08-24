package com.CoreJava.Array_String;

public class Array1DDemo {

	public static void main(String[] args)
	{

		int sid[]=new int[5];
		sid[0]=101;
		sid[1]=102;
		sid[3]=103;
		sid[4]=104;
		
		System.out.println("Total Elements in array: "+sid.length);
		
		System.out.println(sid[1]);//102

		System.out.println(sid[2]);//0
		
		//System.out.println(sid[5]);//ArrayIndexOutOfBoundsException
		
		//System.out.println(sid[1]+sid[3]);//205
		
		//all id in console
		
		System.out.println("**********Iteration using for loop********");
		
		
		for(int i=0;i<sid.length;i++)
		{
			System.out.println(sid[i]);
		}
		
		System.out.println("**********Iteration using for each loop********");

		
		for(int i:sid)
		{
			System.out.println(i);
		}
		
		System.out.println("**************************************");
		
		//using literal
		String loc[]= {"Pune","Mumbai","Satara","Delhi"};
		System.out.println("Total Locations: "+loc.length);
		System.out.println(loc[2]);
		System.out.println("***********Iterate***********");
		
		for(String i:loc)
		{
			System.out.println(i);
		}
		
		System.out.println("**************************************");
		
		double marks[]= {67.77,89.77,46.88};
		
		System.out.println("Total marks of students: "+marks.length);
		System.out.println("Array elements: ");
		for(double i:marks)
		{
			System.out.println(i);
		}
		System.out.println("Average of arrays: ");
		double sum=0;
		for(double i:marks)
		{
			sum=sum+i;
		}
		
		System.out.println("Sum : "+sum);
		double avg=sum/marks.length;
		System.out.println(avg);
		
		System.out.println("******************************");
		
		
		Object empdata[]= {"Sarang","Pune",30,'M',987666556L};
		System.out.println("Total info for employee: "+empdata.length);
		
		System.out.println(empdata[3]);//'M'
		System.out.println("Iteratio");
		for(Object i:empdata)
		{
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
