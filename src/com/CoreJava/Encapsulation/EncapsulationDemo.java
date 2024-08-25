package com.CoreJava.Encapsulation;


class Book
{
	private int pageno;
	
	//getter and setter method
	public void setPageNo(int pgno)
	{
		if(pgno>0)
		{
			this.pageno=pgno;
		}else
		{
			System.out.println("Please give valid page number");
		}
		
	}
	
	public int getPageNo()
	{
		System.out.println("Book Page is return for page Number:");
		return pageno;
	}
}



public class EncapsulationDemo 
{

	public static void main(String[] args)
	{

		Book b1=new Book();
		
		b1.setPageNo(-44);
		System.out.println(b1.getPageNo());
		


		//b1.pageno=40;
		//	System.out.println(b1.pageno);

	}

}
