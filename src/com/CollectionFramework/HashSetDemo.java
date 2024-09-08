package com.CollectionFramework;

import java.util.HashSet;

public class HashSetDemo {

	/*
	 * HashSet is class implements Set interface
	 * Underline data structure is Hashtable
	 * Initial Capacity is 16 virtual segments
	 * Unordered collection
	 * Duplicates element not allowed
	 * 
	 * HashTable maintain data based on HashingMechnism
	 * Hash() get calculated
	 * Hashcode and Key= index
	 * 
	 * null element hashcode is always 0
	 * internally it maintains mode structure
	 * |key|hashcode|data|next element address|
	 */
	public static void main(String[] args)
	{

		HashSet<Integer> hs=new HashSet<Integer>();
		System.out.println("Is set is empty?: "+hs.isEmpty());
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(20);
		hs.add(null);
		

		System.out.println(hs);
		System.out.println("Total Elements: "+hs.size());
		System.out.println("Search for 50?: "+hs.contains(50));
		
		hs.remove(null);
		
		System.out.println(hs);
		
		
		
		
		
		
		

	}

}
