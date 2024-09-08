package com.CollectionFramework;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args)
	{
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(10);
		ts.add(1);
		ts.add(15);
		ts.add(8);
		ts.add(7);
		ts.add(2);
		ts.add(9);
		ts.add(12);
		ts.add(6);
		
		System.out.println(ts.isEmpty());

		System.out.println(ts.size());
		
		System.out.println(ts);
		
		System.out.println(ts.descendingSet());
		
		System.out.println(ts.headSet(9));//all less than 9 element
		System.out.println(ts.tailSet(9));//greater and equal element
		System.out.println(ts.subSet(6, 12));
	}

}
