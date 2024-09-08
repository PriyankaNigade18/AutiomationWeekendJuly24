package com.CollectionFramework;

import java.util.ArrayList;

public class ArrayList_Demo3 
{
	/*
	 * ArrayList is class implements List interface
	 * ArrayList base data structure is Dynamic array
	 * ArrayList is order collection and duplicates elements allowed
	 * ArrayList internally creates 10 virtual segment
	 * 
	 * Iterate
	 * -----------------
	 * 1.for loop
	 * 2.Enhanced for loop
	 * 3.iterator()
	 * 
	 */
	public static void main(String args[])
	{
		ArrayList<String> loc=new ArrayList<String>();
		loc.add("Pune");
		loc.add("Mumbai");
		loc.add("Delhi");
		
		System.out.println("Total Loctaions: "+loc.size());
		for(String i:loc)
		{
			System.out.println(i);
		}
		
		System.out.println("*****************************");
		
		ArrayList<Double> marks=new ArrayList<Double>();
		marks.add(89.66);
		marks.add(67.77);
		
		for(Double i:marks)
		{
			System.out.println(i);
		}
		
		System.out.println("*****************************");
		
		ArrayList<Object> empdata=new ArrayList<Object>();
		empdata.add("Sarang");
		empdata.add("Pune");
		empdata.add(30);
		empdata.add('M');
		empdata.add(876655443L);
		
		
		
		for(Object i:empdata)
		{
			System.out.println(i);
		}
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
