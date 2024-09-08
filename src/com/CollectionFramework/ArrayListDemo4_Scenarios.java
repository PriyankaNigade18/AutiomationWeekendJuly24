package com.CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo4_Scenarios {

	/*
	 * ArrayList is class implements List interface
	 * ArrayList base data structure is Dynamic array
	 * ArrayList is order collection and duplicates elements allowed
	 * ArrayList internally creates 10 virtual segment
	 * ArrayList is not synchronize(We can handle multiple processes at a time)
	 * ArrayList is best suitable for data retrieval
	 * 
	 * Iterate
	 * -----------------
	 * 1.for loop
	 * 2.Enhanced for loop
	 * 3.iterator()
	 * 
	 */
	public static void main(String[] args)
	{

		
		ArrayList<Integer> l2=new ArrayList<Integer>();
		l2.add(40);
		l2.add(50);
		l2.add(60);
		System.out.println(l2);
		
		ArrayList<Integer> l3=new ArrayList<Integer>();
		l3.add(70);
		l3.add(80);
		
		
		
		List<Integer> l1=new ArrayList<Integer>(l3);
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.addAll(l2);
		
		System.out.println(l1);
		
		
		
		
		
		
		


	}

}
