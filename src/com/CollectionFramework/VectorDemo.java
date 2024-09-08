package com.CollectionFramework;

import java.util.Vector;

public class VectorDemo {

	/*
	 * Vector is class implements List interface
	 * Vector is based on Dynamic Array
	 * Vector is synchronize and thread safe
	 * Vector performance is slow
	 * It is ordered collection
	 * Duplication allowed
	 * 
	 */
	public static void main(String[] args)
	{
		Vector<Integer> v1=new Vector<Integer>();
		System.out.println("Is vector is Empty?: "+v1.isEmpty());
		v1.add(100);
		v1.add(200);
		v1.add(300);
		v1.add(200);
		
		System.out.println(v1.size());
		System.out.println(v1);
		
		
		for(Integer i:v1)
		{
			System.out.println(i);
		}


	}

}
