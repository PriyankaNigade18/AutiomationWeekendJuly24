package com.CoreJava.Array_String;

public class MultiDArrayDemo {

	public static void main(String[] args)
	{

		//using new keyword
		int id[][]=new int[3][2];
		
		id[0][0]=10;
		id[0][1]=20;
				
		id[1][0]=30;
		id[1][1]=40;
		
		id[2][0]=50;
		id[2][1]=60;
		
		System.out.println("Number of rows: "+id.length);
		
		//row--->cell-->value
		System.out.println("Number of cells: "+id[0].length);
		
		System.out.println("Single data: "+id[2][1]);//60
		//System.out.println(id[3][0]);//AIOBE
		
		//row
		for(int i=0;i<id.length;i++)
		{
			//cell
			for(int j=0;j<id[i].length;j++)
			{
				System.out.print(id[i][j]+"  ");
			}
			System.out.println();
			
		}
		
		System.out.println("Iteration using for each loop");
		
		
		for(int i[]:id)
		{
			for(int j:i)
			{
				System.out.print(j+"  ");
			}
			System.out.println();
		}
		
		
	System.out.println("***********************************************");	
		
	Object credentials[][]= {{"Username","password"},{"Admin","admin123"},{"Pooja","test123"},{"Amit","test123"},{"Kiran","test123"}};
	
	System.out.println("Number of rows are: "+credentials.length);
	System.out.println("Number of columns are: "+credentials[0].length);
	
	
	for(Object i[]:credentials)
	{
		for(Object j:i)
		{
			System.out.print(j+"    ");
		}
		System.out.println();
	}
	
	
	System.out.println("************Skip the heading!*****************");
	
	for(int i=1;i<credentials.length;i++)
	{
			
		for(int j=0;j<credentials[i].length;j++)
		{
			System.out.print(credentials[i][j]+"      ");
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
