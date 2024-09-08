package com.CollectionFramework;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	/*
	 * LinkedHashSet is class extends HashSet class
	 * Underline data structure is List+Set(HashTable +doublyLinkedList)
	 * It is order collection
	 * Never allowed duplication
	 * 
	 */
	public static void main(String[] args)
	{
		 
		LinkedHashSet<Integer> ls=new LinkedHashSet<Integer>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(20);
		ls.add(40);
		ls.add(50);
		System.out.println("Total Elements: "+ls.size());
		System.out.println(ls);
		System.out.println("search 100?: "+ls.contains(100));//false
		ls.remove(50);
		System.out.println(ls);
		
		
		//Interview question: remove duplicate characters
		String s1="aabbccddee";
		LinkedHashSet<Character> l1=new LinkedHashSet<Character>();
		for(int i=0;i<s1.length();i++)
		{
		l1.add(s1.charAt(i));
		}
		
		System.out.println(l1);
		


	}

}
