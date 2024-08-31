package com.CoreJava.Polymorphism;

public class AmazonSearch 
{
	public void search(String pname)
	{
		System.out.println("Search Product by Product name: "+pname);
	}
	public void search(int price)
	{
		System.out.println("Search Product by Product price: "+price);
	}
	
	public void search(String pname,String brandname)
	{
		System.out.println("Search Product by Product name: "+pname+" & By its brand name: "+brandname );
	}
	
	public void search(String pname,int price)
	{
		System.out.println("Search Product by Product name: "+pname+" & By its price: "+price);
	
		}
	
	public void search(int price,String pname)
	{
		System.out.println("Search Product by Product name: "+pname+" & By its price: "+price);
	
	}
	public void search(String pname,int price,String bname)
	{
		System.out.println("Search Product by Product name: "+pname+" & By its price: "+price+" & search by its brandname: "+bname);
	
		}
	
	

}
