package com.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {

	public static void main(String[] args)
	{

		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(109);
		al.add(20);
		al.add(300);
		al.add(10);
		al.add(80);
		al.add(11);
		
		System.out.println(al);
		
		Collections.sort(al);
		
		System.out.println(al);

		System.out.println("Min Element:" +Collections.min(al));
		
		System.out.println("Max Element: "+Collections.max(al));
		
		
		
	}

}
