package com.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2_Iteration {

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
	public static void main(String[] args) {

		ArrayList<Integer> id=new ArrayList<Integer>();
		id.add(101);
		id.add(201);
		id.add(301);
		
		System.out.println("Total id's are: "+id.size());
		
		System.out.println("****Iterate List using simple for loop*****");
		
		for(int i=0;i<id.size();i++)
		{
			System.out.println(id.get(i));
		}
		
		
		
		System.out.println("****Iterate List using simple for-each loop*****");

		for(Integer i:id)
		{
			System.out.println(i);
		}
		
		System.out.println("****Iterate List using simple iterator()****");
		/*
		 * iterator() returns Iterator interface object
		 * hasNext():Returns true if the iteration has more elements
		 * next():Returns the next element in the iteration.
		 * 
		 */
		
		Iterator<Integer> ir=id.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		

	}

}
