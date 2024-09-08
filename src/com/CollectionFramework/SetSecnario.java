package com.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetSecnario {

	public static void main(String[] args) 
	{

		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(10);
		al.add(30);
		al.add(40);
		al.add(20);
		
		System.out.println(al);

		//To remove duplicate elements
		//list--->set
		
		Set<Integer> s1=new HashSet<Integer>();
		s1.addAll(al);
		
		System.out.println(s1);//duplicate elements removed
		
		//set to list
		List<Integer> l2=new ArrayList<Integer>(s1);
		
		//sort order
		Collections.sort(l2);
		
		System.out.println(l2);
		
		
		
		
		
		
	}

}
