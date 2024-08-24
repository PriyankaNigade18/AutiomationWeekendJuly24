package com.CoreJava.ControlFlowStatements;

public class Branchingstatement {

	
	
	public String test(String data)
	{
	return data;	
	}
	
	
	
	public static void main(String[] args) 
	{
		
//		if(true)
//		{
//			break;
//		}

		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				break;//exit from loop
			}
			else
			{
				System.out.println(i);
			}
		}
		
		System.out.println("***************************");
		
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue;//skip certain part of the code
			}else
			{
				System.out.println(i);
			}
		}
		
		System.out.println("*******************************");
		
		for(int i=1;i<=10;i++)
		{
			if(i%2!=0)
			{
				continue;
			}else
			{
				System.out.println(i);
			}
		}
		
		
		Branchingstatement b1=new Branchingstatement ();
		String res=b1.test("This is fisrt test case!");
		System.out.println(res);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
