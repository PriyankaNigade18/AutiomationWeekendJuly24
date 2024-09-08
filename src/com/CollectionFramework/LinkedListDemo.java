package com.CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
	/*
	 * LinkedList is class implements List interface
	 * Underline data structure is DoublyLinkedList
	 * Frequent operation is data insertion and deletion
	 * LinkedList is non synchronize
	 * allowed duplication
	 * Ordered collection
	 */
	public static void main(String[] args)
	{
			LinkedList<Integer> l1=new LinkedList<Integer>();
			if(l1.isEmpty())
			{
				l1.add(10);
				l1.add(20);
				l1.add(30);
				l1.add(40);
				l1.add(50);
				
			}
			
			System.out.println("Total Elements : "+l1.size());
			System.out.println(l1);
			System.out.println("Search of 50?: "+l1.contains(50));//true
			l1.addFirst(100);
			l1.addLast(200);
			
			System.out.println(l1);
			System.out.println(l1.getFirst());
			System.out.println(l1.getLast());
			
			System.out.println("*********************");
			for(int i=0;i<l1.size();i++)
			{
				System.out.println(l1.get(i));
			}
			
			System.out.println("*********************");

			for(Integer i:l1)
			{
				System.out.println(i);
			}
			
			System.out.println("*********************");
			Iterator<Integer> ir=l1.iterator();
			while(ir.hasNext())
			{
				System.out.println(ir.next());
			}
			System.out.println("*********************");
			ListIterator<Integer> lr=l1.listIterator();
//
//			for(int i=l1.size()-1;i>=0;i--)
//			{
//				System.out.println(lr.next());
//				
//			}
//			
			
			while(lr.hasPrevious())
			{
				System.out.println(lr.previous());
			}
			
			

	}

}
