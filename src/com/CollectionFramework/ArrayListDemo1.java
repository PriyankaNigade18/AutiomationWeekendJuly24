package com.CollectionFramework;

import java.util.ArrayList;

public class ArrayListDemo1
{
	/*
	 * ArrayList is class implements List interface
	 * ArrayList base data structure is Dynamic array
	 * ArrayList is order collection and duplicates elements allowed
	 * ArrayList internally creates 10 virtual segment
	 * 
	 */

	public static void main(String[] args)
	{

		ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.println("Initially list is empty? : "+al.isEmpty());
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(null);
		al.add(20);
		
		System.out.println("After element inserted list is empty? : "+al.isEmpty());

		System.out.println(al);
		
		al.add(0,100);
		
		System.out.println(al);
	 System.out.println("Total Elements are: "+al.size());
	 System.out.println("test for 50?: "+al.contains(50));//false
	 System.out.println("test for 30?: "+al.contains(30));//true
	 
	 //remove
	 al.remove(5);
	 
	 System.out.println(al);
	 
	 //clear the list
	 al.clear();
	 System.out.println(al);//[]
	 System.out.println(al.size());//int 0
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
		
		
		
		
		
		
		
		
		
		


	}

}
