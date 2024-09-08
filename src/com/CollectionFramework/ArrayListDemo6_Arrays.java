package com.CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo6_Arrays {

	public static void main(String[] args)
	{
		/*
		 * Arrays is class inside Object class
		 * 
		 * 
		 */
		
		List<Integer> l1=Arrays.asList(10,20,30);
		System.out.println(l1);

		List<Integer> l2=Arrays.asList(40,50,60);
		System.out.println(l2);

		List<Integer> l3=Arrays.asList(70,80,90);
		System.out.println(l3);
		
		//Arrays.asList("Ram","Kavita");
		
		List<List<Integer>> finalList=new ArrayList<List<Integer>>();
		finalList.add(l1);
		finalList.add(l2);
		finalList.add(l3);
		
		System.out.println(finalList);
		
		

	}

}
