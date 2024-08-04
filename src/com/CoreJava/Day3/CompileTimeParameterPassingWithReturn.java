package com.CoreJava.Day3;

public class CompileTimeParameterPassingWithReturn 
{
	/*
	 * return keyword
	 * ------------------
	 * when we need to return any result/data from the method 
	 * we use return keyword
	 * 1. when you return change return type of method
	 * 2.return always return the result to calling function
	 * 3. At a time only one type info you can return 
	 */

	public void start()//0 parameter 
	{
		System.out.println("Start the application!");
	}
	
	public int add(int a,int b)//a=100 b=10000
	{
	
		return a+b;
		
	}
	public String info(String msg)
	{
		return msg;
	}
	
//	public int  testData(String un,int id,long phno)
//	{
//		return un;
//		return id;
//		
//	}
	
	public String testData(String un,String psw)
	{
		
		String data="User Name is: "+un+"\n"+"Password is: "+psw;
		return data;
//		return un;
//		return psw;
		
	}
	
	public static void main(String[] args)
	{
		
	CompileTimeParameterPassingWithReturn c1=new CompileTimeParameterPassingWithReturn();
	c1.start();
	int result=c1.add(100,10000);//calling function
	System.out.println(result);
	
	
	String msg=c1.info("Hello All!");
	System.out.println(msg);
	
	String data=c1.testData("Priyanaka","test123");
	System.out.println(data);

	}

}
